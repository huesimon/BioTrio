/*

* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Movie;
import java.util.ArrayList;
import Control.DB_Connection;
import java.awt.AWTEventMulticaster;
import java.sql.*;
import java.util.Arrays;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author Simon_
 */
public class MovieCatalog {

    private ArrayList<Movie> movies;
    //private ArrayList movies =  new ArrayList();
    private static String title;
    private static String length;
    //private Movie movie = new Movie(title, length);

    public MovieCatalog() {
        movies = new ArrayList<>();
        queryMovie();
        //init();
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

    private void init() {
//        movies.add(new Movie("Film 1", "1:30"));
//        movies.add(new Movie("Film 2", "1:30"));
//        movies.add(new Movie("Film 3 ", "1:30"));
    }

    public void queryMovie() {
        String query = "SELECT * FROM movie";
        try {
            DB_Connection.getCon();
            DB_Connection.setStmt(DB_Connection.getCon().createStatement());
            DB_Connection.setRs(DB_Connection.getStmt().executeQuery(query));
            //System.out.println("title\n __________________");

            ArrayList<Movie> dataList = new ArrayList<>();
//            DB_Connection.getRs().getString("length");

            //((DefaultTableModel) model).removeRow(0);
            while (DB_Connection.getRs().next()) {

                title = DB_Connection.getRs().getString("title");
                length = DB_Connection.getRs().getString("length");
                int id = DB_Connection.getRs().getInt("movie_id");
                System.out.print(title + "\t");
                System.out.println(length);
                Movie movieItem = new Movie(title, length, id);
                dataList.add(movieItem);
            }
            /*
            int i = 0;
            System.out.println("ADD TO ARRAY" + i);
            //table.setValueAt(title, i, 0);
            Object[][] data = new Object[dataList.size()][2];

            for (Movie r : dataList) {
                data[i] = new Object[]{r.getTitel(), r.getTime()};
                i++;
            }

            System.out.println("data ----> " + Arrays.toString(data));

            TableModel model = new DefaultTableModel(data, columnNames);
            table.setModel(model);
            table.repaint();*/
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
            //System.out.println("title\n __________________");

            ArrayList<Movie> dataList = new ArrayList<>();
            String[] columnNames = {"Title", "length"};

            //((DefaultTableModel) model).removeRow(0);
            while (DB_Connection.getRs().next()) {

                title = DB_Connection.getRs().getString("title");
                title = DB_Connection.getRs().getString("title");
                title = DB_Connection.getRs().getString("title");
                length = DB_Connection.getRs().getString("length");
                System.out.print(title + "\t");
                System.out.println(length);

                Movie movieItem = new Movie(title, length, 0);
                dataList.add(movieItem);
            }
            movies = dataList;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /*
    public void queryMovie() {
        String query = "select * from movie";
        try {
            DB_Connection.getCon();
            DB_Connection.setStmt(DB_Connection.getCon().createStatement());
            DB_Connection.setRs(DB_Connection.getStmt().executeQuery(query));
            System.out.println("title\n __________________");
            while (DB_Connection.getRs().next()) {
                title = DB_Connection.getRs().getString("title");
                
                length = DB_Connection.getRs().getString("length");
                System.out.print(title + "\t");
                System.out.println(length);
                movies.add(new Movie(title, length));
                
                        
                
           }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }*/
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
