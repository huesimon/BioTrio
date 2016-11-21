/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author Simon_
 */
public class Showing {
    private Hall hall;
    private Movie movie;
    private ArrayList<Order> orderList;
    private Date date;
    
    
    public Showing(Hall hall, Movie movie, Date date){
        this.hall = hall;
        this.movie = movie;
        this.date = date;
        orderList = new ArrayList<>();
    } 

    public Showing(Hall hall, Movie movie, ArrayList<Order> orderList, Date date) {
        this.hall = hall;
        this.movie = movie;
        this.orderList = orderList;
        this.date = date;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
