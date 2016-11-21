/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Movie;

/**
 *
 * @author Simon_
 */
public class MovieHandler {
    private MovieCatalog movieCatalog = MovieCatalog.getInstance();
    public void createMoive(String name, String time){
        movieCatalog.addMovie(new Movie(name, time));
    }
    public Movie removeMovieAt(int index){
        return movieCatalog.removeMovieAt(index);
    }
}
