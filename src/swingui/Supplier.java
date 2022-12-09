/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingui;

import connection.dbconnection;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hansaka Peiris
 */
public class Supplier extends javax.swing.JFrame {

    /**
     * Creates new form customer
     */
    public Supplier() {
        initComponents();
    }
    public void ClearSupplier(){
            supname.setText("");
            supaddress.setText("");
            supemail.setText("");
            suptp.setText("");
            supcode.setText("");
    
    
    }
    public void savesupplier(){
            
        try {
            String s1=supname.getText();
            String s2=supaddress.getText();
            String s3=supemail.getText();
            String s4=suptp.getText();
            String s5=supcode.getText();
            
            Connection c = dbconnection.dbconmethod();
            Statement s= c.createStatement();
            s.executeQuery("INSERT INTO supplier (supplier_name,supplier_address,supplier_email,supplier_telephone,supplier_code) VALUES ('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
            JOptionPane.showMessageDialog(new swingui.Home(),"Saved Succesfully","Saved Alert",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        custAddressl1 = new javax.swing.JLabel();
        supsearch = new javax.swing.JTextField();
        supcombo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        custNamel = new javax.swing.JLabel();
        custAddressl = new javax.swing.JLabel();
        supaddress = new javax.swing.JTextField();
        custEmaill = new javax.swing.JLabel();
        supemail = new javax.swing.JTextField();
        custTPL = new javax.swing.JLabel();
        suptp = new javax.swing.JTextField();
        btn_supclear = new javax.swing.JButton();
        btn_supupdate = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        custIDL2 = new javax.swing.JLabel();
        supcode = new javax.swing.JLabel();
        btn_supdelete = new javax.swing.JButton();
        supname1 = new javax.swing.JTextField();
        btn_supok3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        supname = new javax.swing.JTextField();
        btn_supsearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplir ID", "Name", "Address", "E-Mail", "Telephone No"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel17.setFont(new java.awt.Font("Roboto Condensed", 1, 48)); // NOI18N
        jLabel17.setText("Supplier Data");

        custAddressl1.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        custAddressl1.setText("Search Via");

        supsearch.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        supsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supsearchActionPerformed(evt);
            }
        });

        supcombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        supcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supplier Code", "Supplier Name" }));
        supcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supcomboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(custAddressl1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(supcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(supsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 674, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(supcombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(custAddressl1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(supsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(517, 517, 517))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1635, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1079, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("View ", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        custNamel.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        custNamel.setText("Name");
        jPanel2.add(custNamel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 135, 42));

        custAddressl.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        custAddressl.setText("Address");
        jPanel2.add(custAddressl, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 268, 135, 42));

        supaddress.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        supaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supaddressActionPerformed(evt);
            }
        });
        jPanel2.add(supaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 268, 421, 42));

        custEmaill.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        custEmaill.setText("Email");
        jPanel2.add(custEmaill, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 317, 135, 42));

        supemail.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        supemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supemailActionPerformed(evt);
            }
        });
        jPanel2.add(supemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 317, 421, 42));

        custTPL.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        custTPL.setText("Telephone No:");
        jPanel2.add(custTPL, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 366, 135, 42));

        suptp.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        suptp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suptpActionPerformed(evt);
            }
        });
        jPanel2.add(suptp, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 366, 421, 42));

        btn_supclear.setBackground(new java.awt.Color(51, 102, 255));
        btn_supclear.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btn_supclear.setForeground(new java.awt.Color(255, 255, 255));
        btn_supclear.setText("Clear");
        btn_supclear.setBorder(null);
        btn_supclear.setBorderPainted(false);
        btn_supclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supclearActionPerformed(evt);
            }
        });
        jPanel2.add(btn_supclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 581, 124, 32));

        btn_supupdate.setBackground(new java.awt.Color(51, 102, 255));
        btn_supupdate.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btn_supupdate.setForeground(new java.awt.Color(255, 255, 255));
        btn_supupdate.setText("Update");
        btn_supupdate.setBorder(null);
        btn_supupdate.setBorderPainted(false);
        btn_supupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supupdateActionPerformed(evt);
            }
        });
        jPanel2.add(btn_supupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 581, 124, 32));

        jLabel16.setFont(new java.awt.Font("Roboto Condensed", 1, 48)); // NOI18N
        jLabel16.setText("Supplier Data");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 13, 374, 74));

        custIDL2.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        custIDL2.setText("Supplier Code");
        jPanel2.add(custIDL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 415, 135, 42));

        supcode.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jPanel2.add(supcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 415, 421, 42));

        btn_supdelete.setBackground(new java.awt.Color(51, 102, 255));
        btn_supdelete.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btn_supdelete.setForeground(new java.awt.Color(255, 255, 255));
        btn_supdelete.setText("Delete");
        btn_supdelete.setBorder(null);
        btn_supdelete.setBorderPainted(false);
        btn_supdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supdeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btn_supdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, 124, 32));

        supname1.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        supname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supname1ActionPerformed(evt);
            }
        });
        jPanel2.add(supname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 421, 42));

        btn_supok3.setBackground(new java.awt.Color(51, 102, 255));
        btn_supok3.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btn_supok3.setForeground(new java.awt.Color(255, 255, 255));
        btn_supok3.setText("OK");
        btn_supok3.setBorder(null);
        btn_supok3.setBorderPainted(false);
        btn_supok3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supok3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_supok3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 580, 124, 32));

        jPanel5.setBackground(new java.awt.Color(0, 153, 255));

        supname.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        supname.setText("Enter Supplier code");
        supname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supnameActionPerformed(evt);
            }
        });

        btn_supsearch.setBackground(new java.awt.Color(255, 51, 0));
        btn_supsearch.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btn_supsearch.setForeground(new java.awt.Color(255, 255, 255));
        btn_supsearch.setText("Search");
        btn_supsearch.setBorder(null);
        btn_supsearch.setBorderPainted(false);
        btn_supsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(supname, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(btn_supsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(supname, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_supsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 190, 480, 210));

        jTabbedPane1.addTab("Add ", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 260, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1640, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void supnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supnameActionPerformed

    private void supaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supaddressActionPerformed

    private void supemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supemailActionPerformed

    private void suptpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suptpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suptpActionPerformed

    private void btn_supclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supclearActionPerformed
        ClearSupplier();
    }//GEN-LAST:event_btn_supclearActionPerformed

    private void btn_supupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supupdateActionPerformed
        savesupplier();
        ClearSupplier();
    }//GEN-LAST:event_btn_supupdateActionPerformed

    private void supsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supsearchActionPerformed

    private void btn_supdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supdeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_supdeleteActionPerformed

    private void btn_supsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_supsearchActionPerformed

    private void supname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supname1ActionPerformed

    private void btn_supok3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supok3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_supok3ActionPerformed

    private void supcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supcomboActionPerformed

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
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_supclear;
    private javax.swing.JButton btn_supdelete;
    private javax.swing.JButton btn_supok3;
    private javax.swing.JButton btn_supsearch;
    private javax.swing.JButton btn_supupdate;
    private javax.swing.JLabel custAddressl;
    private javax.swing.JLabel custAddressl1;
    private javax.swing.JLabel custEmaill;
    private javax.swing.JLabel custIDL2;
    private javax.swing.JLabel custNamel;
    private javax.swing.JLabel custTPL;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField supaddress;
    private javax.swing.JLabel supcode;
    private javax.swing.JComboBox<String> supcombo;
    private javax.swing.JTextField supemail;
    private javax.swing.JTextField supname;
    private javax.swing.JTextField supname1;
    private javax.swing.JTextField supsearch;
    private javax.swing.JTextField suptp;
    // End of variables declaration//GEN-END:variables
}
