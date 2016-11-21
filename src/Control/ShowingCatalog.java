/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Hall;
import Model.Movie;
import Model.Showing;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Simon_
 */
public class ShowingCatalog {

    private ArrayList<Showing> showings;

    public ShowingCatalog() {
        showings = new ArrayList<>();
        init();
    }

    public void addShowing(Showing showing) {
        showings.add(showing);
    }
    public Showing removeShowingAt(int index){
        return showings.remove(index);
    }
    public ArrayList<Showing> getShowings(){
        return showings;
    }
    public void init(){
        Hall hall1 = new Hall("hal 1", 1, 8, 12);
        Movie movie1 = new Movie("Film 11", "1:45");
        Date date = new Date(System.currentTimeMillis());
        showings.add(new Showing(hall1, movie1, date));
    }
}
