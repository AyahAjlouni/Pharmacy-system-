/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy_system;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class view extends javax.swing.JFrame {

    /**
     * Creates new form view
     */
    public view() {
        initComponents();
        setSize(1300, 800);
        setLocation(200,100);
        
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Expiry_date = new javax.swing.JTextField();
        cost_area = new javax.swing.JTextField();
        prescription = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        available = new javax.swing.JPanel();
        avibility = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("num of medicine");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 71, 210, 55));

        number.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });
        getContentPane().add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 250, 50));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("view info");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 150, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("quantity");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 130, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("need prescription");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 240, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Expiry date");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 170, 50));

        Expiry_date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Expiry_date.setToolTipText("");
        getContentPane().add(Expiry_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 320, 40));

        cost_area.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cost_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cost_areaActionPerformed(evt);
            }
        });
        getContentPane().add(cost_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 320, 40));

        prescription.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(prescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 320, 40));

        quantity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 320, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("price");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 100, 50));

        available.setBackground(new java.awt.Color(0, 204, 204));
        available.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        available.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        avibility.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        avibility.setText(" ");
        avibility.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        available.add(avibility, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 290, 60));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        available.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 670, 140, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\medicine.png")); // NOI18N
        available.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 600, 660));

        getContentPane().add(available, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1360, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     
     
        try {
        int  mnumber = Integer.parseInt(this.number.getText());
      
        int t=0;
        
        
       for (int i = 0 ; i < LogIn.list.size() ; i++){
       if (mnumber==LogIn.list.get(i).num_of_medicine ){
           t++;
        this.cost_area.setText( "    "+LogIn.list.get(i).cost +"  JD");
        
        if (LogIn.list.get(i).need_prescription) this.prescription.setText( " need  prescription"    );
        else this.prescription.setText( "dont need prescription "    );   
       
           this.quantity.setText( "    "+LogIn.list.get(i).quantity  );
       this.Expiry_date.setText( "    "+LogIn.list.get(i).expiry_date_month + "/"+LogIn.list.get(i).expiry_date_year  );
     
        this.avibility.setText(LogIn.list.get(i).check_avibility());
       }
  
       
       
       }
          if (t==0){
        JOptionPane.showMessageDialog(null," medicine is not exist " );
           //this.aviabelity.setText("       aviabel");
          }
          } catch (Exception e){
          JOptionPane.showMessageDialog(null,"wrong input  " );
          this.number.setText(null);
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cost_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cost_areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cost_areaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        Manager l = new Manager();
        l.setVisible(true);
      
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Expiry_date;
    private javax.swing.JPanel available;
    private javax.swing.JLabel avibility;
    private javax.swing.JTextField cost_area;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField number;
    private javax.swing.JTextField prescription;
    private javax.swing.JTextField quantity;
    // End of variables declaration//GEN-END:variables
}
