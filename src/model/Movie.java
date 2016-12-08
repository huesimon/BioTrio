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
public class Movie {

    private String titel;
    private String time;
    private int movie_id;

    public Movie(String name, String time, int movie_id) {
        this.titel = name;
        this.time = time;
        this.movie_id = movie_id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String name) {
        this.titel = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    @Override
    public String toString() {
        return titel;
    }
    
}
