/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Simon_
 */
public class Customer {

    private String name;
    private String phone;
    private Ticket tickets; // Skal ikke være en int, skal bruge Ticket class!!
    
    public Customer(String name, String phone,Ticket tickets){
        this.name = name;
        this.phone = phone;
        this.tickets = tickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Ticket getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

}
