
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.io.ByteArrayOutputStream;   
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My Computer
 */
public class ChangePass extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form ChangePass
     */
    public ChangePass() {
        initComponents();
        //Connection.connect();
         conn=db.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
    }
/*static public class SqliteExtensions
{
    public static object ExecuteScalar(this SQLiteConnection connection, string commandText)
    {
        // Added using
        using (var command = connection.CreateCommand())
        {
            command.CommandText = commandText;
            return command.ExecuteScalar();
        }
    }
}
var command = connection.CreateCommand();
command.CommandText = commandText;
value = command.ExecuteScalar();*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        showp = new javax.swing.JCheckBox();
        username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        change = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        newpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        showp.setText("show password");
        showp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpActionPerformed(evt);
            }
        });

        jLabel1.setText("Username:");

        back.setBackground(new java.awt.Color(255, 153, 153));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel4.setText("Old Password:");

        change.setBackground(new java.awt.Color(255, 153, 153));
        change.setForeground(new java.awt.Color(255, 255, 255));
        change.setText("Submit");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });

        jLabel2.setText("New Password:");

        reset.setBackground(new java.awt.Color(255, 153, 153));
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Clear");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 102));
        jLabel3.setText("Change Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(change)
                            .addGap(31, 31, 31)
                            .addComponent(reset))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(back, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(showp))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(47, 47, 47)
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(27, 27, 27)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(21, 21, 21)
                                    .addComponent(newpass, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(jLabel3))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(newpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(showp)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(change)
                    .addComponent(reset))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
    
        /*String user,pass,newp;
        user=username.getText();
        pass=password.getText();
        newp=newpass.getText();
        String sql = "select * from Login where username='"+user+"'";
        String sql1 = "update Login set password= '"+newp+"' where username='"+user+"'";
        try{
        //Connection.rs=Connection.pst.executeQuery(sql);
        pst=conn.prepareStatement(sql);
        pst.executeQuery(sql);
        if(rs.next())
        {
        if(rs.getString("password").equals(pass))
        {
        // newp.setText("");
        pst.executeUpdate(sql1);
        JOptionPane.showMessageDialog(null,"Password Changed!");
        }
        else{
        JOptionPane.showMessageDialog(null, "Invalid username or password", "Access Denied",JOptionPane.ERROR_MESSAGE);
        
        }
        }
        else{
        JOptionPane.showMessageDialog(null,"Wrong username!");
        }
        }  catch (Exception e) {
        }
        //String username;
        //String password;
        //String newpass;
        /*conn=db.java_db();
        //conn = db.ConnectDB();
        String sql = "Select * from Login where Username='"+username+"'";
        try {
        pst =conn.prepareStatement(sql);
        pst.setString(1,username.getText());
        //pst.setString(2,password.getText());
        //pst.setString(3,newpass.getText());
        rs=pst.executeQuery();
        if(rs.next()){*/
//backup 
/*
int p = JOptionPane.showConfirmDialog(null, "Are you sure you want change password?","Update Record",JOptionPane.YES_NO_OPTION);
if(p==0){

try{

String value1 = username.getText();
String value2 = password.getText();
//String value3 = newpass.getText();
//String sql1 = "update Login set Password= '"+value3+"', Newpass='"+value3+"' where Username='"+value1+"'";
//String sql1= "update Login set password='"+value3+"'";
// "where username='"+value1+"' ";
String sql= "update Login set Username='"+value1+"', Password='"+value2+"' "
+ "where Username='"+value1+"' ";
//+ "WHERE username = '"+value1+"'";


pst=conn.prepareStatement(sql);
pst.execute();
JOptionPane.showMessageDialog(null, "Record Updated");

}catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}
finally {

try{
rs.close();
pst.close();

}
catch(Exception e){

}
}}
username.setText("");
password.setText("");
//JOptionPane.showMessageDialog(null, "Welcome User!");
// Loading l = new Loading();
//l.setVisible(true);
// MainScreen m = new MainScreen();
//RegisterBooks m = new RegisterBooks();

/* }
else if(username.getText().equals("")){
JOptionPane.showMessageDialog(rootPane, "Please Enter Username!");
}
else if(password.getText().equals("")){
JOptionPane.showMessageDialog(rootPane, "Please Enter Password!");
}
else{
JOptionPane.showMessageDialog(null, "Invalid username or password", "Access Denied",JOptionPane.ERROR_MESSAGE);
}
} catch (Exception e) {
JOptionPane.showMessageDialog(null, e);
} finally {

try{

rs.close();
pst.close();


}
catch(Exception e){

}
}    */
//test
try {
String user = username.getText();
String pass = password.getText();
String newp = newpass.getText();

String sqlSelect = "select * from Login where username = ?";
PreparedStatement pstSelect = conn.prepareStatement(sqlSelect);
pstSelect.setString(1, user);
ResultSet rs = pstSelect.executeQuery();

if (rs.next()) {
    if (rs.getString("password").equals(pass)) {
        String sqlUpdate = "update Login set password = ? where username = ?";
        PreparedStatement pstUpdate = conn.prepareStatement(sqlUpdate);
        pstUpdate.setString(1, newp);
        pstUpdate.setString(2, user);
        pstUpdate.executeUpdate();
        JOptionPane.showMessageDialog(null, "Password Changed!");
    } else {
        JOptionPane.showMessageDialog(null, "Invalid username or password", "Access Denied", JOptionPane.ERROR_MESSAGE);
    }
} else {
    JOptionPane.showMessageDialog(null, "Invalid username!");
}
}catch(Exception e){
              //  JOptionPane.showMessageDialog(null, e);
            }
                finally {

                try{
                    rs.close();
                    pst.close();
                    conn.close();
                    
//pstSelect.close();
//pstUpdate.close();
//sqlUpdate.close();
}
                catch(Exception e){

                }
            }

   // MySQLiteConnection.Close();
//SQLite.SQLiteConnection.ClearAllPools();

    /*} catch (SQLException ex) {
        Logger.getLogger(ChangePass.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally {

            try{

                rs.close();
                pst.close();
                conn.close();
            }
            catch(SQLException ex){

            }
        }*/
        username.setText("");
        password.setText("");
        newpass.setText("");
    try {
        conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(ChangePass.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_changeActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
 login1 w = new login1();
    w.setVisible(true);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void showpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpActionPerformed
        {if(showp.isSelected()){
        newpass.setEchoChar((char) 0);
        password.setEchoChar((char) 0);
    }else{
        newpass.setEchoChar('*');   
        password.setEchoChar('*'); 
    }//GEN-LAST:event_showpActionPerformed
        }}
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        username.setText("");
        password.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    
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
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton change;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton reset;
    private javax.swing.JCheckBox showp;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
