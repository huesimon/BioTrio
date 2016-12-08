/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Hall;
import model.Movie;
import model.Showing;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Simon_
 */
public class ShowingController {

    private HallController hallCatalog;
    private MovieController movieCatalog;
    private TicketController ticketCatalog;
    private ArrayList<Showing> showings;

    public ShowingController(HallController hallCatalog, MovieController movieCatalog, TicketController ticketCatalog) {
        showings = new ArrayList<>();
        this.hallCatalog = hallCatalog;
        this.movieCatalog = movieCatalog;
        this.ticketCatalog = ticketCatalog;
        queryShowings();

    }

    public void addShowing(Showing showing) {
        showings.add(showing);
    }

    public Showing removeShowingAt(int index) {
        return showings.remove(index);
    }

    public ArrayList<Showing> getShowings() {
        return showings;
    }

    public void init() {
        //Hall hall1 = new Hall("hal 1", 1, 14, 20);
        //Movie movie1 = new Movie("Film 11", "1:45");
        //Date date = new Date(System.currentTimeMillis());
        //showings.add(new Showing(hall1, movie1, date));
    }

    public void queryShowings() {
        String query = "select * from showing order by date asc";
        try {
            DB_Connection.getCon();
            DB_Connection.setStmt(DB_Connection.getCon().createStatement());
            DB_Connection.setRs(DB_Connection.getStmt().executeQuery(query));

            ArrayList<Showing> dataList = new ArrayList<>();

            while (DB_Connection.getRs().next()) {
                int hallNum = DB_Connection.getRs().getInt("hall");
                int movie = DB_Connection.getRs().getInt("movie");
                int showing_id = DB_Connection.getRs().getInt("showing_id");
                String date = DB_Connection.getRs().getString("date");
//                String date = "1/1/16";

                Showing showing = new Showing(hallCatalog.getHallById(hallNum), movieCatalog.getMovieById(movie), ticketCatalog.getTicketByShowingId(showing_id), date, showing_id);
                dataList.add(showing);
                System.out.println(showing);
            }
            showings = dataList;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void editShowing(String date, int showing_id) {
        String table = "showing";
        String sql = "update showing set date = '" + date + "' where showing_id = " + showing_id + ";";
        try {
            System.out.println(sql);
            DB_Connection.getCon();
            DB_Connection.setStmt(DB_Connection.getCon().createStatement());
            DB_Connection.getStmt().executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data updated in " + table + " table");
            System.out.println("\n--Data updated in " + table + " table--");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        //DB_Connection.closeConnection();
    }

    public void removeShowing(String date, int hall) {
        String table = "showing";
        String sql = "DELETE FROM SHOWING WHERE date = '" + date + "' AND hall = " +hall;
        try {
            System.out.println(sql);
            DB_Connection.getCon();
            DB_Connection.setStmt(DB_Connection.getCon().createStatement());
            DB_Connection.getStmt().executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data updated in " + table + " table");
            System.out.println("\n--Data updated in " + table + " table--");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        //DB_Connection.closeConnection();
    }

    public ArrayList<Showing> getShowingsByMovie(Movie movie) {
        ArrayList<Showing> data = new ArrayList<>();
        for (Showing showing : showings) {
            if (movie.getMovie_id() == showing.getMovie().getMovie_id()) {
                data.add(showing);
            }
        }
        System.out.println(data);
        return data;

    }

    public Showing getShowingById(int id) {

        Showing result = null;
        for (Showing showing : showings) {
            if (id == showing.getShowing_id()) {
                result = showing;
            }
        }
        return result;
    }
}
