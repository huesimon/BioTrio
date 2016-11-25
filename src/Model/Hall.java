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
public class Hall {
    private String hallName;
    private int hall_id;
    private int rows;
    private int cols;
    private int totalSeats;
    
    
    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public int getHallId() {
        return hall_id;
    }

    public void setHallNumber(int hall_id) {
        this.hall_id = hall_id;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

 

    public int getTotalSeats() {
        return totalSeats;
    }
    public int[][] getSeatingArray(){
        //int rowsi = Integer.parseInt(rows);   
        //int colsi = Integer.parseInt(cols);
        return new int[rows][cols];
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public Hall(String hallName, int rows, int cols, int hall_id) {
        this.hallName = hallName;
        this.rows = rows;
        this.cols = cols;
        this.hall_id = hall_id;
    }

    @Override
    public String toString() {
        return hallName;
    }
    
    }
