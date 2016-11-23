/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.DB_Statements;
import Control.MovieCatalog;
import Control.ShowingCatalog;
import Model.Showing;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import Model.Hall;
import Model.Movie;
import java.util.ArrayList;

/**
 *
 * @author Simon_
 */
public class SeatBookingGUI extends javax.swing.JFrame {

    /**
     * Creates new form SeatBookingGUI
     */
    public SeatBookingGUI(Showing showing) {

        initComponents();
        updateSeatTable(showing);

        setVisible(true);

    }

    public void updateSeatTable(Showing showing) {
        String[] colNames = new String[showing.getHall().getCols()];
  for (int i = 0; i < showing.getHall().getCols(); i++) {
             
          colNames[i] = "" +i;
        }
        
        TableModel model = new DefaultTableModel(new Object[showing.getHall().getRows()][showing.getHall().getCols()],colNames);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setModel(model);
        jTable1.repaint();
        
        
        
        

        /*while (jTable1.getRowCount() != 0) {
            ((DefaultTableModel) model).removeRow(0);
            
        }

        for (int i = 0; i < showing.getHall().getRows(); i++) {
            ((DefaultTableModel) model).addRow(new Object[jTable1.getColumnCount() - 1]);
            jTable1.setValueAt(0, jTable1.getRowCount() - 1, 0);


            {for (int j = 0; j < showing.getHall().getCols(); j++) {
                    ((DefaultTableModel) model).addColumn(new Object[jTable1.getRowCount() -1]);
                    jTable1.setValueAt(1, jTable1.getRowCount() - 1, j);
                }

            }}

            
        
        for (int j = 0; j < showing.getHall().getRows(); j++) {
                ((DefaultTableModel) model).addRow(new Object[jTable1.getColumnCount()- 1]);
                jTable1.setValueAt(j, jTable1.getRowCount()- 1, 0);
                {
        for (int i = 0; i < showing.getHall().getCols(); i++) {
                ((DefaultTableModel) model).addColumn(new Object[jTable1.getRowCount()- 1]);
                jTable1.setValueAt(i, jTable1.getColumnCount()- 1, 1);
        }
                
            }
            }
         */

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(jNorth, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(jSouth, java.awt.BorderLayout.PAGE_END);
        getContentPane().add(jEast, java.awt.BorderLayout.LINE_END);
        getContentPane().add(jWest, java.awt.BorderLayout.LINE_START);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

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

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jCenter.add(jButton1);

        getContentPane().add(jCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jCenter;
    private javax.swing.JPanel jEast;
    private javax.swing.JPanel jNorth;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jSouth;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jWest;
    // End of variables declaration//GEN-END:variables
}
