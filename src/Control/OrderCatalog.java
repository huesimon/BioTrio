/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Order;
import Model.Ticket;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Simon_
 */
public class OrderCatalog {

    private ArrayList<Order> orders;
    private CustomerController customerController;
    private TicketCatalog ticketCatalog;

    public OrderCatalog(CustomerController customerController, TicketCatalog ticketCatalog) {
        orders = new ArrayList<>();
        this.ticketCatalog = ticketCatalog;
        this.customerController = customerController;
        queryOrders();
    }

    public void queryOrders() {
        String query = "SELECT * FROM orders";
        try {
            DB_Connection.getCon();
            DB_Connection.setStmt(DB_Connection.getCon().createStatement());
            DB_Connection.setRs(DB_Connection.getStmt().executeQuery(query));

            ArrayList<Order> dataList = new ArrayList<>();
            while (DB_Connection.getRs().next()) {

                int order_id = DB_Connection.getRs().getInt("order_id");
                int customer_id = DB_Connection.getRs().getInt("customer");

                Order orderItem = new Order(customerController.getCustomerById(customer_id), ticketCatalog.getTicketByOrderId(order_id));
                        dataList.add(orderItem);
            }
            orders = dataList;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
