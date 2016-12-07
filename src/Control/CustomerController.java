/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Customer;
import Model.Ticket;
    import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;

/**
 *
 * @author Simon_
 */
public class CustomerController {

    private ArrayList<Customer> customers;

    public CustomerController() {
        queryCustomers();
    }

    public void queryCustomers() {
        String query = "SELECT * FROM customer";
        try {
            DB_Connection.getCon();
            DB_Connection.setStmt(DB_Connection.getCon().createStatement());
            DB_Connection.setRs(DB_Connection.getStmt().executeQuery(query));

            ArrayList<Customer> dataList = new ArrayList<>();
            while (DB_Connection.getRs().next()) {

                String name = DB_Connection.getRs().getString("name");
                String phonenr = DB_Connection.getRs().getString("phonenr");
                int id = DB_Connection.getRs().getInt("customer_id");

                Customer customerItem = new Customer(name, phonenr, id);
                dataList.add(customerItem);
            }
            customers = dataList;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void queryCustomerByPhone(String phone){
        String query = "SELECT * FROM customer where phonenr = '" + phone + "'" ;
        try {
            DB_Connection.getCon();
            DB_Connection.setStmt(DB_Connection.getCon().createStatement());
            DB_Connection.setRs(DB_Connection.getStmt().executeQuery(query));

            ArrayList<Customer> dataList = new ArrayList<>();
            while (DB_Connection.getRs().next()) {

                String name = DB_Connection.getRs().getString("name");
                String phonenr = DB_Connection.getRs().getString("phonenr");
                int id = DB_Connection.getRs().getInt("customer_id");

                Customer customerItem = new Customer(name, phonenr, id);
                dataList.add(customerItem);
            }
            customers = dataList;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    }

    public void insertCustomer(String name, String phone) {
        String query = "insert into customer(name, phoneNr) VALUES "
                + "('" + name + "','" + phone + "')";
        try {
            DB_Connection.getCon();
            DB_Connection.getCon().createStatement();
            DB_Connection.getStmt().executeUpdate(query);
            

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public int getSize() {
        return customers.size();
    }
    public  Customer returnLatestCustomer() {
        Customer customer = customers.get(customers.size() - 1);
        return customer;
    }
    public Customer getCustomerByPhone(String phone){
        Customer result = null;
        for (Customer customer : customers) {
            if(phone .equals(customer.getPhone())){
                result = customer;
            }
            
        }
        return result;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public Customer getCustomerById(int id) {
        Customer result = null;
        for (Customer customer : customers) {
            if (id == customer.getId()) {
                result = customer;
            }

        }
        return result;
    }
    

}
