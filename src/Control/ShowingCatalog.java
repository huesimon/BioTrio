/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Hall;
import Model.Movie;
import Model.Showing;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Simon_
 */
public class ShowingCatalog {

    private HallCatalog hallCatalog;
    private MovieCatalog movieCatalog;
    private TicketCatalog ticketCatalog;
    private ArrayList<Showing> showings;

    public ShowingCatalog(HallCatalog hallCatalog, MovieCatalog movieCatalog, TicketCatalog ticketCatalog) {
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
        String query = "SELECT * FROM showing";
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

                Showing showing = new Showing(hallCatalog.getHallById(hallNum), movieCatalog.getMovieById(movie), ticketCatalog.getTicketByShowingId(showing_id), date);
                dataList.add(showing);
            }
            showings = dataList;
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
        System.out.println(data);
        return data;

    }
}
