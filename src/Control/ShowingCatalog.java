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
        Hall hall1 = new Hall("hal 1", 1, 12, 20);
        Movie movie1 = new Movie("Film 11", "1:45");
        Date date = new Date(System.currentTimeMillis());
        showings.add(new Showing(hall1, movie1, date));
    }
    public void queryShowings(){
        String query = "SELECT * FROM showing, movie WHERE showing.movie = movie_id";
        try {
            DB_Connection.getCon();
            DB_Connection.setStmt(DB_Connection.getCon().createStatement());
            DB_Connection.setRs(DB_Connection.getStmt().executeQuery(query));
            
            
            ArrayList<Showing> dataList = new ArrayList<>();
            
            while (DB_Connection.getRs().next()) {
                int hallNum = DB_Connection.getRs().getInt("hall");
                int rowNo = DB_Connection.getRs().getInt("rowNo");
                int seatNo = DB_Connection.getRs().getInt("SeatNo");
                
                Hall hallItem = new Hall(hallName, hallNum, rowNo, seatNo);
                dataList.add(hallItem);
                System.out.print(rowNo + "\t");
                System.out.println(seatNo);
                //
            }
            showings = dataList;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
