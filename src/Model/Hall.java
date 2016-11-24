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
    private int hallNumber;
    private int rows;
    private int cols;
    private int totalSeats;
    private int hall_id;
    
    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
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

    public Hall(String hallName, int hallNumber, int rows, int cols, int hall_id) {
        this.hallName = hallName;
        this.hallNumber = hallNumber;
        this.rows = rows;
        this.cols = cols;
        this.hall_id = hall_id;
    }
    
    }
