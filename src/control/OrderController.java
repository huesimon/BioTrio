/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Customer;
import model.Order;
import model.Ticket;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Simon_
 */
public class OrderController {

    private ArrayList<Order> orders;
    private CustomerController customerController;
    private TicketController ticketCatalog;
    private Customer customer;

    public OrderController(CustomerController customerController, TicketController ticketCatalog) {
        ArrayList<Order> orders = new ArrayList<>();

        this.ticketCatalog = ticketCatalog;
        this.customerController = customerController;
        queryOrders();
    }

    public Order returnLatestOrder() {
        Order order = orders.get(orders.size() - 1);
        return order;
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

                Order orderItem = new Order(customerController.getCustomerById(customer_id), ticketCatalog.getTicketByOrderId(order_id), order_id);
                dataList.add(orderItem);
            }
            orders = dataList;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insertOrder(int customer_id) {

        String query = "insert into orders(customer) VALUES"
                + "('" + customer_id + "')";
        try {
            DB_Connection.getCon();
            DB_Connection.getCon().createStatement();
            DB_Connection.getStmt().executeUpdate(query);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Order getOrderByCustomer(Customer customer) {
        Order result = null;
        for (Order order : orders) {
            if (order.getCustomer().equals(customer)) {
                result = order;
            }

        }
        return result;
    }

    public Order getOrderByCustomerId(int id) {

        Order result = null;
        for (Order order : orders) {
            if (id == customer.getId()) {
                result = order;
            }

        }
        return result;

    }
}
