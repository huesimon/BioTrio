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
import view.FindCustomerGui;
import view.SelectMovieGUI;

/**
 *
 * @author jibba_000 simon
 */
public class Biotrio {

    private ShowingController showingController;
    private MovieController movieController;
    private CustomerController customerController;
    private HallController hallController;
    private OrderController orderController;
    private TicketController ticketController;
    
    
    
            
    public Biotrio() {
        movieController = new MovieController();
        customerController = new CustomerController();
        hallController = new HallController();
        ticketController = new TicketController();
        orderController = new OrderController(customerController, ticketController);
        showingController = new ShowingController(hallController, movieController, ticketController);
    }
  
    public void movieGui(){
        SelectMovieGUI selectMovieGUI = new SelectMovieGUI(this);
    }

    public void findCustomerGUI(){
        FindCustomerGui findCustomerGUI = new FindCustomerGui(this);
    }
    
    public ShowingController getShowingController() {
        return showingController;
    }

    public MovieController getMovieController() {
        return movieController;
    }

    public CustomerController getCustomerController() {
        return customerController;
    }

    public HallController getHallController() {
        return hallController;
    }

    public OrderController getOrderController() {
        return orderController;
    }

    public TicketController getTicketController() {
        return ticketController;
    }

}
