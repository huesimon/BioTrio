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
    private ArrayList<Ticket> ticketList;
    private String date;
    
    public Showing(Hall hall, Movie movie, String date) {
        this.hall = hall;
        this.movie = movie;
        this.date = date;
        ticketList = new ArrayList<>();
    }

    public Showing(Hall hall, Movie movie, ArrayList<Ticket> ticketList, String date) {
        this.hall = hall;
        this.movie = movie;
        this.ticketList = ticketList;
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

    public ArrayList<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(ArrayList<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return movie.getTitel();
    }

}

