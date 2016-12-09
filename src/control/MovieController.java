/*

* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Movie;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Simon_
 */
public class MovieController {

    private ArrayList<Movie> movies;
    private static String title;
    private static String length;

    public MovieController() {
        movies = new ArrayList<>();
        queryMovie();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public Movie removeMovieAt(int index) {
        return movies.remove(index);
    }

    public int getSize() {
        return movies.size();
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void queryMovie() {
        String query = "SELECT * FROM movie";
        try {
            DB_Connection.getCon();
            DB_Connection.setStmt(DB_Connection.getCon().createStatement());
            DB_Connection.setRs(DB_Connection.getStmt().executeQuery(query));

            ArrayList<Movie> dataList = new ArrayList<>();

            while (DB_Connection.getRs().next()) {

                title = DB_Connection.getRs().getString("title");
                length = DB_Connection.getRs().getString("length");
                int id = DB_Connection.getRs().getInt("movie_id");
                System.out.print(title + "\t");
                Movie movieItem = new Movie(title, length, id);
                dataList.add(movieItem);
            }

            movies = dataList;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void queryShowing() {
        String query = "SELECT * FROM showing";
        try {
            DB_Connection.getCon();
            DB_Connection.setStmt(DB_Connection.getCon().createStatement());
            DB_Connection.setRs(DB_Connection.getStmt().executeQuery(query));

            ArrayList<Movie> dataList = new ArrayList<>();

            while (DB_Connection.getRs().next()) {

                title = DB_Connection.getRs().getString("title");
                title = DB_Connection.getRs().getString("title");
                title = DB_Connection.getRs().getString("title");
                length = DB_Connection.getRs().getString("length");

                Movie movieItem = new Movie(title, length, 0);
                dataList.add(movieItem);
            }
            movies = dataList;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public String getTitle() {
        return title;
    }

    public Movie getMovieById(int id) {
        Movie result = null;
        for (Movie movie : movies) {
            if (id == movie.getMovie_id()) {
                result = movie;
            }
        }
        return result;
    }
}
