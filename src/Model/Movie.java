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
public class Movie {

    private String titel;
    private String time;

    public Movie(String name, String time) {
        this.titel = name;
        this.time = time;
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
}
