/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biotrio;

import Control.MovieCatalog;
import Control.ShowingCatalog;
import Model.Movie;
import View.SeatBookingGUI;
import View.SelectMovieGUI;

/**
 *
 * @author jibba_000 simon
 */
public class Biotrio {
    public static void main(String[] args) {
        ShowingCatalog showingCatalog = new ShowingCatalog();
        //MovieCatalog movieCatalog = new MovieCatalog();
        //SelectMovieGUI guiM = new SelectMovieGUI(movieCatalog);
        SeatBookingGUI gui = new SeatBookingGUI(showingCatalog.getShowings().get(0));
    }
    
}
