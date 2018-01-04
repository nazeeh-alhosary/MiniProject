/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Classes.*;
import Connection.Connections;
import Connection.Tools;

/**
 *
 * @author M Nazeeh Alhosary
 */
public class FrmCustomer_Login extends javax.swing.JFrame {

    /**
     * Creates new form LogInCustomer
     */
   // LoginC logincustomer = new LoginC();
    public FrmCustomer_Login() {
        initComponents();
        //Tools.PutImageInLable("Exit_Red.png", lblExit, 35, 35);
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
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        lblRegister = new javax.swing.JLabel();
        logbtn5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(460, 650));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(64, 1, 64));
        jPanel1.setForeground(new java.awt.Color(66, 0, 66));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Connection/books.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(190, 90, 76, 100);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(110, 300, 210, 2);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(110, 370, 210, 10);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Connection/username.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(330, 270, 24, 24);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Connection/locked.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(330, 340, 24, 24);

        jLabel4.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 310, 98, 22);

        jLabel3.setFont(new java.awt.Font("Big Caslon", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(390, 600, 50, 30);

        txtEmail.setBackground(new java.awt.Color(64, 1, 64));
        txtEmail.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setToolTipText("Enter your UserName");
        txtEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailMouseClicked(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail);
        txtEmail.setBounds(110, 270, 210, 30);

        txtpass.setBackground(new java.awt.Color(64, 1, 64));
        txtpass.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
        txtpass.setForeground(new java.awt.Color(255, 255, 255));
        txtpass.setToolTipText("Enter your PassWord");
        txtpass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpassMouseClicked(evt);
            }
        });
        jPanel1.add(txtpass);
        txtpass.setBounds(110, 340, 210, 30);

        jLabel5.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-mail:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 230, 190, 22);

        jLabel9.setFont(new java.awt.Font("Big Caslon", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("    Library System");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(80, 10, 370, 44);

        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Connection/exit.png"))); // NOI18N
        lblExit.setToolTipText("Exit the program");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });
        jPanel1.add(lblExit);
        lblExit.setBounds(10, 580, 60, 60);

        jLabel10.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(110, 360, 220, 30);

        jLabel11.setFont(new java.awt.Font("Big Caslon", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Connection/Icons/refresh-lock.png"))); // NOI18N
        jLabel11.setText("Forget your password?");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(110, 380, 220, 40);

        lblAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Connection/Icons/Admin.png"))); // NOI18N
        lblAdmin.setToolTipText("Login as an admin");
        lblAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminMouseClicked(evt);
            }
        });
        jPanel1.add(lblAdmin);
        lblAdmin.setBounds(380, 530, 60, 80);

        lblRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Connection/Icons/note.png"))); // NOI18N
        lblRegister.setToolTipText("Register yourself in the library");
        lblRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }
        });
        jPanel1.add(lblRegister);
        lblRegister.setBounds(230, 490, 60, 70);

        logbtn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Connection/login.png"))); // NOI18N
        logbtn5.setToolTipText("Login");
        logbtn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logbtn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logbtn5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logbtn5MouseEntered(evt);
            }
        });
        jPanel1.add(logbtn5);
        logbtn5.setBounds(140, 490, 64, 64);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        Tools.PutImageInLable("exit.png", lblExit, 35, 35);
    }//GEN-LAST:event_lblExitMouseExited

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        Tools.PutImageInLable("exit.png", lblExit, 45, 45);
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        boolean check = Tools.YesNoChooserBox("Do you want to quit?", "Exit!");
        if(check){
            System.exit(0);
        }
    }//GEN-LAST:event_lblExitMouseClicked

    private void txtpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassMouseClicked

        txtpass.setText("");
    }//GEN-LAST:event_txtpassMouseClicked

    private void txtEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseClicked
        txtEmail.setText("");
    }//GEN-LAST:event_txtEmailMouseClicked

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void lblAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMouseClicked
        this.dispose();
        Tools.OpenForm(new FrmAdmin_Login());
    }//GEN-LAST:event_lblAdminMouseClicked

    private void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseClicked
       this.dispose();
       Tools.OpenForm(new FrmCustomer_Registration());
    }//GEN-LAST:event_lblRegisterMouseClicked
    private boolean IsEmpty(){
        if(txtpass.getText().equals("") || txtEmail.getText().equals("")){
            return true;
        }
        return false;
    }
    private void logbtn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logbtn5MouseClicked
        if(!IsEmpty()){
           String Pass = Tools.hashPassword(txtpass.getText());
            if ( Connections.CheckLogInCustomer(txtEmail.getText(), Pass) ){
                this.dispose();
               // Tools.OpenForm(new FrmCustomer_Menu(txtEmail.getText()));
            }
            else{
                Tools.MsgBoxInfo("Invaild Username or Password", "Log In failed");
                txtEmail.setText("");
                txtpass.setText("");
                txtEmail.requestFocus();        
            }
        }
        else{
            Tools.MsgBoxErrorX("Please fill all text fields", "Empty field(s)");
        }
    }//GEN-LAST:event_logbtn5MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new FrmResetPassword().setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void logbtn5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logbtn5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_logbtn5MouseEntered

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
            java.util.logging.Logger.getLogger(FrmCustomer_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCustomer_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCustomer_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCustomer_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCustomer_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel logbtn5;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}