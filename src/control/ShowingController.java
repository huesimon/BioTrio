/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Movie;
import model.Showing;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Simon_
 */
public class ShowingController {

    private HallController hallController;
    private MovieController movieController;
    private TicketController ticketController;
    private ArrayList<Showing> showings;

    public ShowingController(HallController hallController, MovieController movieController, TicketController ticketController) {
        showings = new ArrayList<>();
        this.hallController = hallController;
        this.movieController = movieController;
        this.ticketController = ticketController;
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

                Showing showing = new Showing(hallController.getHallById(hallNum), movieController.getMovieById(movie), ticketController.getTicketByShowingId(showing_id), date, showing_id);
                dataList.add(showing);
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
            DB_Connection.getCon();
            DB_Connection.setStmt(DB_Connection.getCon().createStatement());
            DB_Connection.getStmt().executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data updated in " + table + " table");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void removeShowing(String date, int hall) {
        String table = "showing";
        String sql = "DELETE FROM SHOWING WHERE date = '" + date + "' AND hall = " + hall;
        try {
            DB_Connection.getCon();
            DB_Connection.setStmt(DB_Connection.getCon().createStatement());
            DB_Connection.getStmt().executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data updated in " + table + " table");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Showing> getShowingsByMovie(Movie movie) {
        ArrayList<Showing> data = new ArrayList<>();
        for (Showing showing : showings) {
            if (movie.getMovie_id() == showing.getMovie().getMovie_id()) {
                data.add(showing);
            }
        }
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
