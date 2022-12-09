/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingui;

import connection.dbconnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hansaka Peiris
 */
public class Users extends javax.swing.JFrame {

    /**
     * Creates new form customer
     */
    public Users() {
        initComponents();
        InsertUserID();
        

    }
    int getuserid;
    public void generateuserid(String passQuery){
        try {
            Connection c=dbconnection.dbconmethod();
            Statement s=c.createStatement();
            ResultSet rs=s.executeQuery(passQuery);

            if (rs.next()) {

               getuserid=Integer.parseInt(rs.getString(1));
            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }
    public void InsertUserID(){
        generateuserid("SELECT COUNT(user_id)+1 FROM user");
        int id=000+getuserid;
        String UID="U"+id;
        userid.setText(UID);
    }


    public void ClearUser(){
        userfname.setText("");
        userlname.setText("");
        userdob.setDate(null);
        useraddress.setText("");
        useremail.setText("");
        usertp.setText("");
        usertype.setSelectedItem(null);


    }

    public void saveuser(){
        try {
            
            String s0=userid.getText();
            String s1=userfname.getText();
            String s2=userlname.getText();
            DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
            String s3=df.format(userdob.getDate());
            String s4=useraddress.getText();
            String s5=useremail.getText();
            String s6=usertp.getText();
            String s7=usertype.getSelectedItem().toString();

            Connection c=dbconnection.dbconmethod();
            Statement s=c.createStatement();
            s.executeUpdate("INSERT INTO user (user_id,user_fname,user_lname,user_dob,user_address,user_email,user_tp,user_type) VALUES ('"+s0+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"')");
            JOptionPane.showMessageDialog(new swingui.Home(),"User registered Succesfully","Saved Alert",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }



    }
    public void updateuser(){
         try {
            String s0=userid.getText();
            String s1=userfname.getText();
            String s2=userlname.getText();
            DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
            String s3=df.format(userdob.getDate());
            String s4=useraddress.getText();
            String s5=useremail.getText();
            String s6=usertp.getText();
            String s7=usertype.getSelectedItem().toString();

            Connection c=dbconnection.dbconmethod();
            Statement s=c.createStatement();
            s.executeUpdate("UPDATE user set user_fname='"+s1+"',user_lname='"+s2+"',user_dob='"+s3+"',user_address='"+s4+"',user_email='"+s5+"',user_tp='"+s6+"',user_type='"+s7+"' WHERE user_id='"+s0+"'");
            JOptionPane.showMessageDialog(new swingui.Home(),"User Updated Succesfully","Saved Alert",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    public void searchuser(){
        try {
            Connection c=dbconnection.dbconmethod();
            Statement s=c.createStatement();
            String UID=suid.getText();
            
            ResultSet rs=s.executeQuery("SELECT * FROM user WHERE user_id='"+UID+"'");
            while (rs.next()) {   
                userid.setText(UID);
                userfname.setText(rs.getString(2));
                userlname.setText(rs.getString(3));
                Date date= new SimpleDateFormat("dd-MM-yyyy").parse(rs.getString("user_dob"));
                userdob.setDate(date);
                useraddress.setText(rs.getString(5));
                useremail.setText(rs.getString(6));
                usertp.setText(rs.getString(7));
                usertype.setSelectedItem(rs.getString(8));
                
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    public void deleteuser(){
        try {
            Connection c=dbconnection.dbconmethod();
            Statement s=c.createStatement();
            String UID=userid.getText();
            s.executeUpdate("DELETE FROM user WHERE user_id='"+UID+"'");
            JOptionPane.showMessageDialog(new Users(), "Delete Succesfully","Deletion Alert",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
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
        jPanel2 = new javax.swing.JPanel();
        userfname = new javax.swing.JTextField();
        custAddressl = new javax.swing.JLabel();
        useraddress = new javax.swing.JTextField();
        custEmaill = new javax.swing.JLabel();
        useremail = new javax.swing.JTextField();
        custTPL = new javax.swing.JLabel();
        usertp = new javax.swing.JTextField();
        btn_userclear = new javax.swing.JButton();
        btn_userok = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        custNamel1 = new javax.swing.JLabel();
        custNamel3 = new javax.swing.JLabel();
        userlname = new javax.swing.JTextField();
        custNamel2 = new javax.swing.JLabel();
        custIDL1 = new javax.swing.JLabel();
        userid = new javax.swing.JLabel();
        custIDL3 = new javax.swing.JLabel();
        usertype = new javax.swing.JComboBox<>();
        btn_userupdate = new javax.swing.JButton();
        btn_userdelete = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        suid = new javax.swing.JTextField();
        btn_supsearch = new javax.swing.JButton();
        userdob = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        custAddressl1 = new javax.swing.JLabel();
        usercombo = new javax.swing.JComboBox<>();
        usersearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userfname.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        userfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userfnameActionPerformed(evt);
            }
        });
        jPanel2.add(userfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 429, 42));

        custAddressl.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        custAddressl.setText("Address");
        jPanel2.add(custAddressl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 135, 42));

        useraddress.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        useraddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useraddressActionPerformed(evt);
            }
        });
        jPanel2.add(useraddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 429, 42));

        custEmaill.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        custEmaill.setText("Email");
        jPanel2.add(custEmaill, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 135, 42));

        useremail.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        useremail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useremailActionPerformed(evt);
            }
        });
        jPanel2.add(useremail, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 429, 42));

        custTPL.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        custTPL.setText("Telephone No:");
        jPanel2.add(custTPL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 135, 42));

        usertp.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        usertp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertpActionPerformed(evt);
            }
        });
        jPanel2.add(usertp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 429, 42));

        btn_userclear.setBackground(new java.awt.Color(51, 102, 255));
        btn_userclear.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btn_userclear.setForeground(new java.awt.Color(255, 255, 255));
        btn_userclear.setText("Clear");
        btn_userclear.setBorder(null);
        btn_userclear.setBorderPainted(false);
        btn_userclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userclearActionPerformed(evt);
            }
        });
        jPanel2.add(btn_userclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 622, 124, 33));

        btn_userok.setBackground(new java.awt.Color(51, 102, 255));
        btn_userok.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btn_userok.setForeground(new java.awt.Color(255, 255, 255));
        btn_userok.setText("OK");
        btn_userok.setBorder(null);
        btn_userok.setBorderPainted(false);
        btn_userok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userokActionPerformed(evt);
            }
        });
        jPanel2.add(btn_userok, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 622, 124, 32));

        jLabel15.setFont(new java.awt.Font("Roboto Condensed", 1, 48)); // NOI18N
        jLabel15.setText("User Data");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 13, 374, 74));

        custNamel1.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        custNamel1.setText("First Name");
        jPanel2.add(custNamel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 135, 42));

        custNamel3.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        custNamel3.setText("Last Name");
        jPanel2.add(custNamel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 135, 42));

        userlname.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        userlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userlnameActionPerformed(evt);
            }
        });
        jPanel2.add(userlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 429, 42));

        custNamel2.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        custNamel2.setText("Date of Birth");
        jPanel2.add(custNamel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 135, 42));

        custIDL1.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        custIDL1.setText("User ID");
        jPanel2.add(custIDL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 135, 42));

        userid.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        userid.setText("User ID");
        jPanel2.add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 430, 42));

        custIDL3.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        custIDL3.setText("User Type");
        jPanel2.add(custIDL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 510, 135, 42));

        usertype.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        usertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pharmacist", "Clerk", "Manager", "Administrator" }));
        usertype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertypeActionPerformed(evt);
            }
        });
        jPanel2.add(usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 510, 421, 42));

        btn_userupdate.setBackground(new java.awt.Color(51, 102, 255));
        btn_userupdate.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btn_userupdate.setForeground(new java.awt.Color(255, 255, 255));
        btn_userupdate.setText("Update");
        btn_userupdate.setBorder(null);
        btn_userupdate.setBorderPainted(false);
        btn_userupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userupdateActionPerformed(evt);
            }
        });
        jPanel2.add(btn_userupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 622, 124, 32));

        btn_userdelete.setBackground(new java.awt.Color(51, 102, 255));
        btn_userdelete.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btn_userdelete.setForeground(new java.awt.Color(255, 255, 255));
        btn_userdelete.setText("Delete");
        btn_userdelete.setBorder(null);
        btn_userdelete.setBorderPainted(false);
        btn_userdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userdeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btn_userdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 622, 124, 32));

        jPanel5.setBackground(new java.awt.Color(0, 153, 255));

        suid.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        suid.setText("Enter User ID");
        suid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suidActionPerformed(evt);
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
                    .addComponent(suid, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(btn_supsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(suid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_supsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 150, 480, 210));
        jPanel2.add(userdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 430, 30));

        jTabbedPane1.addTab("Add ", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplir ID", "First Name", "Last Name", "Date of Birth", "Address", "EMail", "Telephone No"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel17.setFont(new java.awt.Font("Roboto Condensed", 1, 48)); // NOI18N
        jLabel17.setText("User Data");

        custAddressl1.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        custAddressl1.setText("Search Via");

        usercombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usercombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User ID", "User Name" }));
        usercombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usercomboActionPerformed(evt);
            }
        });

        usersearch.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        usersearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(custAddressl1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(usercombo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(usersearch, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 641, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usercombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(custAddressl1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(usersearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(606, Short.MAX_VALUE))
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
            .addGap(0, 1086, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("View ", jPanel3);

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

    private void userfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userfnameActionPerformed

    private void useraddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useraddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useraddressActionPerformed

    private void useremailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useremailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useremailActionPerformed

    private void usertpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertpActionPerformed

    private void btn_userclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userclearActionPerformed
       ClearUser();
       InsertUserID();
    }//GEN-LAST:event_btn_userclearActionPerformed

    private void btn_userokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userokActionPerformed
        saveuser();
        ClearUser();
        InsertUserID();
    }//GEN-LAST:event_btn_userokActionPerformed

    private void userlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userlnameActionPerformed

    private void btn_userupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userupdateActionPerformed
        updateuser();
        ClearUser();
        InsertUserID();
    }//GEN-LAST:event_btn_userupdateActionPerformed

    private void btn_userdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userdeleteActionPerformed
        deleteuser();
        ClearUser();
        InsertUserID();
    }//GEN-LAST:event_btn_userdeleteActionPerformed

    private void suidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suidActionPerformed

    private void btn_supsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supsearchActionPerformed
       searchuser();
    }//GEN-LAST:event_btn_supsearchActionPerformed

    private void usercomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usercomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usercomboActionPerformed

    private void usersearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usersearchActionPerformed

    private void usertypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertypeActionPerformed

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
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_supsearch;
    private javax.swing.JButton btn_userclear;
    private javax.swing.JButton btn_userdelete;
    private javax.swing.JButton btn_userok;
    private javax.swing.JButton btn_userupdate;
    private javax.swing.JLabel custAddressl;
    private javax.swing.JLabel custAddressl1;
    private javax.swing.JLabel custEmaill;
    private javax.swing.JLabel custIDL1;
    private javax.swing.JLabel custIDL3;
    private javax.swing.JLabel custNamel1;
    private javax.swing.JLabel custNamel2;
    private javax.swing.JLabel custNamel3;
    private javax.swing.JLabel custTPL;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField suid;
    private javax.swing.JTextField useraddress;
    private javax.swing.JComboBox<String> usercombo;
    private com.toedter.calendar.JDateChooser userdob;
    private javax.swing.JTextField useremail;
    private javax.swing.JTextField userfname;
    private javax.swing.JLabel userid;
    private javax.swing.JTextField userlname;
    private javax.swing.JTextField usersearch;
    private javax.swing.JTextField usertp;
    private javax.swing.JComboBox<String> usertype;
    // End of variables declaration//GEN-END:variables
}
