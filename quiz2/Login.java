/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quiz2;

import com.mysql.jdbc.Statement;
import java.security.MessageDigest;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_login = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        tf_password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btn_login.setBackground(new java.awt.Color(85, 53, 107));
        btn_login.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("LOGIN");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login);
        btn_login.setBounds(750, 430, 140, 40);

        btn_reset.setBackground(new java.awt.Color(85, 53, 107));
        btn_reset.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(255, 255, 255));
        btn_reset.setText("RESET");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset);
        btn_reset.setBounds(530, 430, 140, 40);

        tf_password.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        getContentPane().add(tf_password);
        tf_password.setBounds(530, 330, 360, 40);

        jLabel5.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        jLabel5.setText("password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(530, 290, 120, 40);

        tf_username.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        getContentPane().add(tf_username);
        tf_username.setBounds(530, 230, 360, 40);

        jLabel4.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        jLabel4.setText("username");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(530, 190, 120, 40);

        jLabel3.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        jLabel3.setText("Sign in to continue");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(560, 80, 220, 80);

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 50)); // NOI18N
        jLabel2.setText("WELCOME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(530, 30, 320, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quiz2/1.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        try{
            String username = tf_username.getText();
            String password = (tf_password.getText());
            
            java.sql.Connection conn = quiz2.koneksi.koneksiDB();
            String sql = "SELECT * FROM db_login WHERE username=? AND password=?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()){
                JOptionPane.showMessageDialog(null, "berhasil login");
                HomePage m = new HomePage();
                m.setVisible(true);
                m.pack();
                m.setLocationRelativeTo(null);
                m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
            }else{
                JOptionPane.showMessageDialog(this, "username & password yang anda masukkan salah...", "pesan", JOptionPane.ERROR_MESSAGE);
                tf_password.setText("");
                tf_username.setText("");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        tf_username.setText("");
        tf_password.setText("");
    }//GEN-LAST:event_btn_resetActionPerformed


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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
