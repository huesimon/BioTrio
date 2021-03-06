/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Ticket;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Simon_
 */
public class TicketController {

    private ArrayList<Ticket> tickets;

    public TicketController() {
        queryTickets();
    }

    public void queryTickets() {
        String query = "SELECT * FROM ticket";
        try {
            DB_Connection.getCon();
            DB_Connection.setStmt(DB_Connection.getCon().createStatement());
            DB_Connection.setRs(DB_Connection.getStmt().executeQuery(query));

            ArrayList<Ticket> dataList = new ArrayList<>();
            while (DB_Connection.getRs().next()) {

                int rowNo = DB_Connection.getRs().getInt("rowNo");
                int seatNo = DB_Connection.getRs().getInt("seatNo");
                int order_id = DB_Connection.getRs().getInt("orders");
                int showing_id = DB_Connection.getRs().getInt("showing");

                Ticket ticketItem = new Ticket(rowNo, seatNo, order_id, showing_id);
                dataList.add(ticketItem);
            }
            tickets = dataList;
            DB_Connection.getRs().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void queryTicketsByOrderId(int id) {
        String query = "SELECT * FROM ticket WHERE orders = " + id;
        try {
            DB_Connection.getCon();
            DB_Connection.setStmt(DB_Connection.getCon().createStatement());
            DB_Connection.setRs(DB_Connection.getStmt().executeQuery(query));

            ArrayList<Ticket> dataList = new ArrayList<>();
            while (DB_Connection.getRs().next()) {

                int rowNo = DB_Connection.getRs().getInt("rowNo");
                int seatNo = DB_Connection.getRs().getInt("seatNo");
                int order_id = DB_Connection.getRs().getInt("orders");
                int showing_id = DB_Connection.getRs().getInt("showing");

                Ticket ticketItem = new Ticket(rowNo, seatNo, order_id, showing_id);
                dataList.add(ticketItem);
            }
            tickets = dataList;
            DB_Connection.getRs().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void createTicket(String rowNo, String seatNo, int orders, int showing) {
        String query = "insert into ticket(rowNo, seatNo, orders, showing) VALUES"
                + "('" + rowNo + "','" + seatNo + "','" + orders + "','" + showing + "')";
        try {
            DB_Connection.getCon();
            DB_Connection.getCon().createStatement();
            DB_Connection.getStmt().executeUpdate(query);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Ticket[] getTicketByOrderId(int id) {
        int count = 0;
        Ticket[] result = new Ticket[4];
        for (Ticket ticket : tickets) {
            if (id == ticket.getOrder_id()) {
                result[count++] = ticket;
            }
        }
        return result;
    }

    public ArrayList<Ticket> getTicketByShowingId(int id) {
        ArrayList<Ticket> result = new ArrayList<>();
        for (Ticket ticket : tickets) {
            if (id == ticket.getShowing_id()) {
                result.add(ticket);
            }
        }
        return result;
    }
}
