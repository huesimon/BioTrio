/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biotrio;

import Control.ShowingCatalog;
import View.SeatBookingGUI;

/**
 *
 * @author jibba_000 simon
 */
public class Biotrio {
    public static void main(String[] args) {
        ShowingCatalog showingCatalog = new ShowingCatalog();
        
        SeatBookingGUI gui = new SeatBookingGUI(showingCatalog.getShowings().get(0));
    }
    
}
