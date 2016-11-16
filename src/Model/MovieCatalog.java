/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Simon_
 */
public class MovieCatalog {
    private static MovieCatalog movieCatalog = new MovieCatalog();
    ArrayList<Movie> movies;
    
    private MovieCatalog(){
        movies = new ArrayList<>();
        init();
    }
        public static MovieCatalog getInstance() {
        return movieCatalog;
        }
        public void addMovie(Movie movie){
            movies.add(movie);
        }
        public Movie removeMovieAt(int index){
            return movies.remove(index);
        }
        public int size(){
            return movies.size();
        }
        public ArrayList<Movie> getMovies(){
            return movies;
        }
        private void init(){
            movies.add(new Movie("Film 1", "1:30"));
        }
}
