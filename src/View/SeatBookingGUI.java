/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.CustomerController;
import Control.DB_Statements;
import Control.MovieCatalog;
import Control.OrderCatalog;
import Control.ShowingCatalog;
import Control.TicketCatalog;
import Model.Customer;
import Model.Showing;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import Model.Hall;
import Model.Movie;
import Model.Ticket;
import biotrio.Biotrio;

import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author Simon_
 */
public class SeatBookingGUI extends javax.swing.JFrame {

    /**
     * Creates new form SeatBookingGUI
     */
    Biotrio biotrio;
    Showing showing;
    CustomerController customerController;
    TicketCatalog ticketCatalog;
    ShowingCatalog showingCatalog;
    OrderCatalog orderCatalog;
    private int seatNo;
    private int rowNo;
    private int seatNo2;
    private int seatNo3;
    private int seatNo4;

    public SeatBookingGUI(Biotrio biotrio, Showing showing, ShowingCatalog showingCatalog) {
        this.biotrio = biotrio;
        this.showing = showing;
        this.showingCatalog = showingCatalog;
        customerController = new CustomerController();
        ticketCatalog = new TicketCatalog();
        orderCatalog = new OrderCatalog(customerController, ticketCatalog);

        System.out.println(showing.getTicketList());
        showing.getTicketList();
        ticketCatalog.queryTickets();
        initComponents();
        updateSeatTable(showing);

        setVisible(true);

    }

    public SeatBookingGUI() {

        initComponents();

        setVisible(true);

    }

    public void updateSeatTable(Showing showing) { // flyt til en controller 
        String[] colNames = new String[showing.getHall().getRows()];
        String[] rowNames = new String[showing.getHall().getCols()];
        for (int i = 0; i < showing.getHall().getCols(); i++) {

            rowNames[i] = "" + i;

        }
        for (int i = 0; i < showing.getHall().getRows(); i++) {

            colNames[i] = "" + i;
        }

        TableModel model = new DefaultTableModel(new Object[showing.getHall().getCols()][showing.getHall().getRows()], colNames);

        for (int i = 0; i < colNames.length; i++) {
            for (int j = 0; j < rowNames.length; j++) {
                model.setValueAt("0", j, i);
                // http://stackoverflow.com/questions/7181699/changing-swing-jtable-cell-colors

            }

        }
        for (Ticket ticket : showing.getTicketList()) {
            model.setValueAt("1", ticket.getRowNo() - 1, ticket.getSeatNo()); // TAKEN SEATS
        }

        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setModel(model);
        jTable1.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jNorth = new javax.swing.JPanel();
        returnButton = new javax.swing.JButton();
        statusLable = new javax.swing.JLabel();
        jSouth = new javax.swing.JPanel();
        jEast = new javax.swing.JPanel();
        jWest = new javax.swing.JPanel();
        jCenter = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        phoneTF = new javax.swing.JTextField();
        bookButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        rowNoTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        seatNoTF = new javax.swing.JTextField();
        createTicketBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        rowNoTF2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        seatNoTF2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        rowNoTF3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        seatNoTF3 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        rowNoTF4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        seatNoTF4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(557, 666));

        returnButton.setText("return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        jNorth.add(returnButton);

        statusLable.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        statusLable.setForeground(new java.awt.Color(255, 0, 255));
        statusLable.setText("STATUS LABLE");
        jNorth.add(statusLable);

        getContentPane().add(jNorth, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(jSouth, java.awt.BorderLayout.PAGE_END);
        getContentPane().add(jEast, java.awt.BorderLayout.LINE_END);
        getContentPane().add(jWest, java.awt.BorderLayout.LINE_START);

        jCenter.setMaximumSize(new java.awt.Dimension(557, 666));
        jCenter.setMinimumSize(new java.awt.Dimension(557, 666));

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jTable1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1);

        jCenter.add(jPanel1);

        jLabel1.setText("Navn");
        jPanel2.add(jLabel1);

        nameTF.setPreferredSize(new java.awt.Dimension(55, 20));
        jPanel2.add(nameTF);

        jLabel2.setText("telefon");
        jPanel2.add(jLabel2);

        phoneTF.setPreferredSize(new java.awt.Dimension(55, 20));
        jPanel2.add(phoneTF);

        bookButton.setText("Create Customer");
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });
        jPanel2.add(bookButton);

        jCenter.add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(383, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1);

        jLabel3.setText("RowNo");
        jPanel3.add(jLabel3);

        rowNoTF.setPreferredSize(new java.awt.Dimension(55, 20));
        jPanel3.add(rowNoTF);

        jLabel4.setText("SeatNo");
        jLabel4.setPreferredSize(new java.awt.Dimension(45, 15));
        jPanel3.add(jLabel4);

        seatNoTF.setPreferredSize(new java.awt.Dimension(55, 20));
        jPanel3.add(seatNoTF);

        createTicketBtn.setText("Create Ticket");
        createTicketBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTicketBtnActionPerformed(evt);
            }
        });
        jPanel3.add(createTicketBtn);

        jCenter.add(jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(383, 40));

        jLabel5.setText("RowNo");
        jPanel4.add(jLabel5);

        rowNoTF2.setPreferredSize(new java.awt.Dimension(55, 20));
        jPanel4.add(rowNoTF2);

        jLabel6.setText("SeatNo");
        jPanel4.add(jLabel6);

        seatNoTF2.setPreferredSize(new java.awt.Dimension(55, 20));
        jPanel4.add(seatNoTF2);

        jCenter.add(jPanel4);

        jPanel5.setPreferredSize(new java.awt.Dimension(383, 40));

        jLabel7.setText("RowNo");
        jPanel5.add(jLabel7);

        rowNoTF3.setPreferredSize(new java.awt.Dimension(55, 20));
        jPanel5.add(rowNoTF3);

        jLabel8.setText("SeatNo");
        jPanel5.add(jLabel8);

        seatNoTF3.setPreferredSize(new java.awt.Dimension(55, 20));
        jPanel5.add(seatNoTF3);

        jCenter.add(jPanel5);

        jPanel6.setPreferredSize(new java.awt.Dimension(383, 40));

        jLabel9.setText("RowNo");
        jPanel6.add(jLabel9);

        rowNoTF4.setPreferredSize(new java.awt.Dimension(55, 20));
        jPanel6.add(rowNoTF4);

        jLabel10.setText("SeatNo");
        jPanel6.add(jLabel10);

        seatNoTF4.setPreferredSize(new java.awt.Dimension(55, 20));
        jPanel6.add(seatNoTF4);

        jCenter.add(jPanel6);

        jButton1.setText("Book Ticket");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jCenter.add(jButton1);

        getContentPane().add(jCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed

        String name = nameTF.getText();
        String phone = phoneTF.getText();
        customerController.insertCustomer(name, phone);
        customerController.queryCustomers();


    }//GEN-LAST:event_bookButtonActionPerformed

    private void createTicketBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTicketBtnActionPerformed
        // TODO add your handling code here:
        int ticketSelected = jComboBox1.getSelectedIndex();
        if (ticketSelected == 0) {
            statusLable.setText("1 Ticket picked");
            rowNo = Integer.parseInt(rowNoTF.getText());
            seatNo = Integer.parseInt(seatNoTF.getText());
        } else if (ticketSelected == 1) { // Two tickets selected 
            rowNo = Integer.parseInt(rowNoTF.getText());
            seatNo = Integer.parseInt(seatNoTF.getText());
            seatNo2 = seatNo + 1;
            String strSeat2 = "" + seatNo2;
            rowNoTF2.setText(rowNoTF.getText());
            seatNoTF2.setText(strSeat2);
            statusLable.setText("2 Ticket picked");

        } else if (ticketSelected == 2) { // Three tickets selected 
            rowNo = Integer.parseInt(rowNoTF.getText());
            seatNo = Integer.parseInt(seatNoTF.getText());
            seatNo2 = seatNo + 1;
            String strSeat2 = "" + seatNo2;
            rowNoTF2.setText(rowNoTF.getText());
            seatNoTF2.setText(strSeat2);

            seatNo3 = seatNo + 2;
            String strSeat3 = "" + seatNo3;
            rowNoTF3.setText(rowNoTF.getText());
            seatNoTF3.setText(strSeat3);
            
            statusLable.setText("3 Ticket picked");
        } else if (ticketSelected == 3) { // Four tickets selected 
            rowNo = Integer.parseInt(rowNoTF.getText());
            seatNo = Integer.parseInt(seatNoTF.getText());
            seatNo2 = seatNo + 1;
            String strSeat2 = "" + seatNo2;
            rowNoTF2.setText(rowNoTF.getText());
            seatNoTF2.setText(strSeat2);

            seatNo3 = seatNo + 2;
            String strSeat3 = "" + seatNo3;
            rowNoTF3.setText(rowNoTF.getText());
            seatNoTF3.setText(strSeat3);

            seatNo4 = seatNo + 3;
            String strSeat4 = "" + seatNo4;
            rowNoTF4.setText(rowNoTF.getText());
            seatNoTF4.setText(strSeat4);

            statusLable.setText("4 Ticket picked");
        }
        /*
        String rowNo = rowNoTF.getText();
        String seatNo = seatNoTF.getText();
        int latestId = customerController.returnLatestCustomer().getId();
        orderCatalog.insertOrder(latestId);
        orderCatalog.queryOrders();
        int id2 = orderCatalog.returnLatestOrder().getOrder_id();
        System.out.println(customerController.returnLatestCustomer());
        ticketCatalog.createTicket(rowNo, seatNo, id2, showing.getShowing_id());
        System.out.println(id2);
         */

    }//GEN-LAST:event_createTicketBtnActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int latestId = customerController.returnLatestCustomer().getId();
        orderCatalog.insertOrder(latestId);
        orderCatalog.queryOrders();
        int id2 = orderCatalog.returnLatestOrder().getOrder_id();
        int ticketSelected = jComboBox1.getSelectedIndex();
        if (ticketSelected == 0) {
            ticketCatalog.createTicket("" + rowNo, "" + seatNo, id2, showing.getShowing_id());
            statusLable.setText("1 ticket booked!");
        } else if (ticketSelected == 1) {
            ticketCatalog.createTicket("" + rowNo, "" + seatNo, id2, showing.getShowing_id());
            ticketCatalog.createTicket("" + rowNo, "" + seatNo2, id2, showing.getShowing_id());
            statusLable.setText("2 tickets booked!!");
        } else if (ticketSelected == 2) {
            ticketCatalog.createTicket("" + rowNo, "" + seatNo, id2, showing.getShowing_id());
            ticketCatalog.createTicket("" + rowNo, "" + seatNo2, id2, showing.getShowing_id());
            ticketCatalog.createTicket("" + rowNo, "" + seatNo3, id2, showing.getShowing_id());
            statusLable.setText("3 tickets bookedw!!");
        } else if (ticketSelected == 3) {
            ticketCatalog.createTicket("" + rowNo, "" + seatNo, id2, showing.getShowing_id());
            ticketCatalog.createTicket("" + rowNo, "" + seatNo2, id2, showing.getShowing_id());
            ticketCatalog.createTicket("" + rowNo, "" + seatNo3, id2, showing.getShowing_id());
            ticketCatalog.createTicket("" + rowNo, "" + seatNo4, id2, showing.getShowing_id());
            statusLable.setText("4 tickets booked!!");
        }
        biotrio.getTicketCatalog().queryTickets();
        biotrio.getShowingCatalog().queryShowings();
        showing = biotrio.getShowingCatalog().getShowingById(showing.getShowing_id());
        showing.getTicketList();
        
        updateSeatTable(showing);
        
        System.out.println(customerController.returnLatestCustomer());
        
        //ticketCatalog.createTicket(rowNo, seatNo, id2, showing.getShowing_id());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
      
        dispose();
        new ShowingGUI(biotrio, showing.getMovie()).setVisible(true);
    }//GEN-LAST:event_returnButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SeatBookingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SeatBookingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SeatBookingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SeatBookingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SeatBookingGUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookButton;
    private javax.swing.JButton createTicketBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jCenter;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jEast;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jNorth;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jSouth;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jWest;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JButton returnButton;
    private javax.swing.JTextField rowNoTF;
    private javax.swing.JTextField rowNoTF2;
    private javax.swing.JTextField rowNoTF3;
    private javax.swing.JTextField rowNoTF4;
    private javax.swing.JTextField seatNoTF;
    private javax.swing.JTextField seatNoTF2;
    private javax.swing.JTextField seatNoTF3;
    private javax.swing.JTextField seatNoTF4;
    private javax.swing.JLabel statusLable;
    // End of variables declaration//GEN-END:variables
}
