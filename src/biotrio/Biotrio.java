/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biotrio;

import control.CustomerController;
import control.HallController;
import control.MovieController;
import control.OrderController;
import control.ShowingController;
import control.TicketController;
import model.Customer;
import model.Movie;
import model.Order;
import view.FindCustomerGui;
import view.ConnectionGui;
import view.SeatBookingGUI;
import view.SelectMovieGUI;
import view.ShowingGUI;
import com.sun.javafx.animation.TickCalculation;
import com.sun.javafx.scene.control.skin.CustomColorDialog;

/**
 *
 * @author jibba_000 simon
 */
public class Biotrio {

    private ShowingController showingCatalog;
    private MovieController movieCatalog;
    private CustomerController customerController;
    private HallController hallCatalog;
    private OrderController orderCatalog;
    private TicketController ticketCatalog;
    
    
    
            
    public Biotrio() {
        //selectMovieGUI = new SelectMovieGUI();
        movieCatalog = new MovieController();
        System.out.println(movieCatalog.getMovies().size());
        customerController = new CustomerController();
        hallCatalog = new HallController();
        ticketCatalog = new TicketController();
        orderCatalog = new OrderController(customerController, ticketCatalog);
        showingCatalog = new ShowingController(hallCatalog, movieCatalog, ticketCatalog);
        System.out.println(showingCatalog.getShowings());
        //dbGui = new ConnectionGui();
        
        //FindCustomerGui findCustomerGui = new FindCustomerGui();
        
        // seatBookingGUI = new SeatBookingGUI(showingCatalog.getShowings().get(0));
    }
    //public static void main(String[] args) {
  
    public void movieGui(){
        SelectMovieGUI selectMovieGUI = new SelectMovieGUI(this);
    }

    public void findCustomerGUI(){
        FindCustomerGui findCustomerGUI = new FindCustomerGui(this);
    }
    
    public ShowingController getShowingCatalog() {
        return showingCatalog;
    }

    public MovieController getMovieCatalog() {
        return movieCatalog;
    }

    public CustomerController getCustomerController() {
        return customerController;
    }

    public HallController getHallCatalog() {
        return hallCatalog;
    }

    public OrderController getOrderCatalog() {
        return orderCatalog;
    }

    public TicketController getTicketCatalog() {
        return ticketCatalog;
    }

}
