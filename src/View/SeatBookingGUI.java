/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.CustomerController;
import Control.DB_Statements;
import Control.MovieCatalog;
import Control.ShowingCatalog;
import Control.TicketCatalog;
import Model.Showing;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import Model.Hall;
import Model.Movie;
import Model.Ticket;
import biotrio.Biotrio;
import com.sun.corba.se.impl.orbutil.ORBConstants;
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
    ShowingCatalog showingCatalog;
    

    public SeatBookingGUI(Biotrio biotrio, Showing showing, ShowingCatalog showingCatalog) {
        this.biotrio = biotrio;
        this.showing = showing;
        this.showingCatalog = showingCatalog;
        customerController = new CustomerController();
        
        System.out.println(showing.getTicketList());
        showing.getTicketList();
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
            model.setValueAt("1", ticket.getRowNo()-1, ticket.getSeatNo()); // TAKEN SEATS
        }

        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setModel(model);
        jTable1.repaint();

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jNorth = new javax.swing.JPanel();
        jSouth = new javax.swing.JPanel();
        jEast = new javax.swing.JPanel();
        jWest = new javax.swing.JPanel();
        jCenter = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        phoneTF = new javax.swing.JTextField();
        bookButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(jNorth, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(jSouth, java.awt.BorderLayout.PAGE_END);
        getContentPane().add(jEast, java.awt.BorderLayout.LINE_END);
        getContentPane().add(jWest, java.awt.BorderLayout.LINE_START);

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
        jCenter.add(jLabel1);

        nameTF.setPreferredSize(new java.awt.Dimension(55, 20));
        jCenter.add(nameTF);

        jLabel2.setText("telefon");
        jCenter.add(jLabel2);

        phoneTF.setPreferredSize(new java.awt.Dimension(55, 20));
        jCenter.add(phoneTF);

        bookButton.setText("book");
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });
        jCenter.add(bookButton);

        getContentPane().add(jCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        
        String name = nameTF.getText();
        String phone = phoneTF.getText();
        customerController.insertCustomer(name, phone);
        showingCatalog.queryShowings();
        

    }//GEN-LAST:event_bookButtonActionPerformed

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
    private javax.swing.JPanel jCenter;
    private javax.swing.JPanel jEast;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jNorth;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jSouth;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jWest;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField phoneTF;
    // End of variables declaration//GEN-END:variables
}
