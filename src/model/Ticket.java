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
public class Ticket {

    private int rowNo;
    private int seatNo;
    private int order_id;
    private int showing_id;

    public Ticket(int rowNo, int seatNo, int order_id, int showing_id) {
        this.rowNo = rowNo;
        this.seatNo = seatNo;
        this.order_id = order_id;
        this.showing_id = showing_id;
    }

    public int getRowNo() {
        return rowNo;
    }

    public void setRowNo(int rowNo) {
        this.rowNo = rowNo;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getShowing_id() {
        return showing_id;
    }

    public void setShowing_id(int showing_id) {
        this.showing_id = showing_id;
    }

    @Override
    public String toString() {
        return "" + rowNo + ", " + seatNo;
    }
}
