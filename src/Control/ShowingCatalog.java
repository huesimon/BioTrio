/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Hall;
import Model.Movie;
import Model.Showing;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Simon_
 */
public class ShowingCatalog {

    private ArrayList<Showing> showings;

    public ShowingCatalog() {
        showings = new ArrayList<>();
        init();
    }

    public void addShowing(Showing showing) {
        showings.add(showing);
    }
    public Showing removeShowingAt(int index){
        return showings.remove(index);
    }
    public ArrayList<Showing> getShowings(){
        return showings;
    }
    public void init(){
        Hall hall1 = new Hall("hal 1", 1, 8, 12);
        Movie movie1 = new Movie("Film 11", "1:45");
        Date date = new Date(System.currentTimeMillis());
        showings.add(new Showing(hall1, movie1, date));
    }
    public static void queryHall(){
        String query = "select * from hall";
        try {
            DB_Connection.getCon();
            DB_Connection.setStmt(DB_Connection.getCon().createStatement());
            DB_Connection.setRs(DB_Connection.getStmt().executeQuery(query));
            System.out.println("title\n __________________");
            while (DB_Connection.getRs().next()) {
                int rowNo = DB_Connection.getRs().getInt("rowNo");
                String seatNo = DB_Connection.getRs().getString("SeatNo"); //STRING 
                System.out.print(rowNo + "\t");
                System.out.println(seatNo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
