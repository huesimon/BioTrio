/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Movie;
import java.util.ArrayList;
import Control.DB_Connection;
import java.sql.*;

/**
 *
 * @author Simon_
 */
public class MovieCatalog {

    private static MovieCatalog movieCatalog = new MovieCatalog();
    ArrayList<Movie> movies;

    private MovieCatalog() {
        movies = new ArrayList<>();
        init();
    }

    public static MovieCatalog getInstance() {
        return movieCatalog;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public Movie removeMovieAt(int index) {
        return movies.remove(index);
    }

    public int size() {
        return movies.size();
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    private void init() {
        movies.add(new Movie("Film 1", "1:30"));
        movies.add(new Movie("Film 2", "1:30"));
        movies.add(new Movie("Film 3 ", "1:30"));
    }

    public static void queryMovie() {
        String query = "select * from movie";
        try {
            DB_Connection.getCon();
            DB_Connection.setStmt(DB_Connection.getCon().createStatement());
            DB_Connection.setRs(DB_Connection.getStmt().executeQuery(query));
            System.out.println("title\n __________________");
            while (DB_Connection.getRs().next()) {
                String title = DB_Connection.getRs().getString("title");
                String length = DB_Connection.getRs().getString("length");
                System.out.print(title + "\t");
                System.out.println(length);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
