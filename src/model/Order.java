/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Simon_
 */
public class Order {

    private Ticket[] tickets;
    private Customer customer;
    private int order_id;

    public Order(Customer customer, Ticket[] tickets, int order_id) {
        this.tickets = tickets;
        this.customer = customer;
        this.order_id = order_id;
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getNumberOfTickets() {
        int result = 0;
        for (Ticket ticket : tickets) {
            if (ticket != null) {
                result++;
            }

        }
        System.out.println(result);
        return result;

    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

}
