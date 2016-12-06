/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biotrio;

import Control.CustomerController;
import Control.HallCatalog;
import Control.MovieCatalog;
import Control.OrderCatalog;
import Control.ShowingCatalog;
import Control.TicketCatalog;
import Model.Customer;
import Model.Movie;
import Model.Order;
import View.FindCustomerGui;
import View.NewJFrame;
import View.SeatBookingGUI;
import View.SelectMovieGUI;
import View.ShowingGUI;
import com.sun.javafx.animation.TickCalculation;
import com.sun.javafx.scene.control.skin.CustomColorDialog;

/**
 *
 * @author jibba_000 simon
 */
public class Biotrio {

    private ShowingCatalog showingCatalog;
    private MovieCatalog movieCatalog;
    private CustomerController customerController;
    private HallCatalog hallCatalog;
    private OrderCatalog orderCatalog;
    private TicketCatalog ticketCatalog;
    
    
    
            
    public Biotrio() {
        //selectMovieGUI = new SelectMovieGUI();
        movieCatalog = new MovieCatalog();
        System.out.println(movieCatalog.getMovies().size());
        customerController = new CustomerController();
        hallCatalog = new HallCatalog();
        ticketCatalog = new TicketCatalog();
        orderCatalog = new OrderCatalog(customerController, ticketCatalog);
        showingCatalog = new ShowingCatalog(hallCatalog, movieCatalog, ticketCatalog);
        System.out.println(showingCatalog.getShowings());
        //dbGui = new NewJFrame();
        SelectMovieGUI selectMovieGUI = new SelectMovieGUI(this);
        //FindCustomerGui findCustomerGui = new FindCustomerGui();
        
        // seatBookingGUI = new SeatBookingGUI(showingCatalog.getShowings().get(0));
    }
    //public static void main(String[] args) {
  

    public ShowingCatalog getShowingCatalog() {
        return showingCatalog;
    }

    public MovieCatalog getMovieCatalog() {
        return movieCatalog;
    }

    public CustomerController getCustomerController() {
        return customerController;
    }

    public HallCatalog getHallCatalog() {
        return hallCatalog;
    }

    public OrderCatalog getOrderCatalog() {
        return orderCatalog;
    }

    public TicketCatalog getTicketCatalog() {
        return ticketCatalog;
    }

}
