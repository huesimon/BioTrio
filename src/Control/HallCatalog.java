/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Hall;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Simon_
 */
public class HallCatalog {

    private ArrayList<Hall> halls;

    public HallCatalog() {
        halls = new ArrayList<>();
        queryHall();
    }

    public void queryHall() {
        String query = "select * from hall";
        try {
            DB_Connection.getCon();
            DB_Connection.setStmt(DB_Connection.getCon().createStatement());
            DB_Connection.setRs(DB_Connection.getStmt().executeQuery(query));
            //System.out.println("title\n __________________");

            ArrayList<Hall> dataList = new ArrayList<>();
            // String[] columnNames = {"Hall", "rows", "cols", "total seats"};

            //((DefaultTableModel) model).removeRow(0);
            while (DB_Connection.getRs().next()) {

                String name = DB_Connection.getRs().getString("name");
                int rowcount = DB_Connection.getRs().getInt("rowcount");
                int rowlength = DB_Connection.getRs().getInt("rowlength");
                int totalseats = DB_Connection.getRs().getInt("totalseats");
                int hall_id = DB_Connection.getRs().getInt("hall_id");

                Hall hallItem = new Hall(name, rowlength, rowcount,hall_id);
                dataList.add(hallItem);
            }
            halls = dataList;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Hall> getHalls() {
        return halls;
    }

    public void setHalls(ArrayList<Hall> halls) {
        this.halls = halls;
    }

    public Hall getHallById(int id) {
        Hall result = null;
        for (Hall hall : halls) {
            if (id == hall.getHallId()) {
                result = hall;
            }

        }
        return result;
    }

}
