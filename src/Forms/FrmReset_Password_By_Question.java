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
 * @author mnaze
 */
public class FrmReset_Password_By_Question extends javax.swing.JFrame {

    /**
     * Creates new form FrmForgetPassword
     */
    CustomerLogIn customerlogin = new CustomerLogIn();
    
    public FrmReset_Password_By_Question() {
        initComponents();
    }

    private void PutInfo(){
        customerlogin.setCardNumber(Integer.parseInt(txtCard.getText()));
        customerlogin.setQuestion(ComQuestion.getSelectedItem().toString());
        customerlogin.setAnswer(txtAnswer.getText());
    }
    
    private boolean IsEmpty(){
       if (txtCard.getText().equals("")||
               txtAnswer.getText().equals("")|| 
               ComQuestion.getSelectedItem().toString().equals("*** Select one reminder question ***")){
       return true;
       }
    return false;
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
        jLabel2 = new javax.swing.JLabel();
        txtCard = new Controls.JTextBox();
        jSeparator5 = new javax.swing.JSeparator();
        ComQuestion = new Controls.JCombo();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtAnswer = new Controls.JTextBox();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        lblReturn = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(455, 480));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(64, 1, 64));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Big Caslon", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Card Number");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 110, 90, 30);

        txtCard.setToolTipText("Enter Library Card Number");
        txtCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardActionPerformed(evt);
            }
        });
        jPanel1.add(txtCard);
        txtCard.setBounds(130, 110, 250, 24);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(130, 240, 240, 10);

        ComQuestion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "*** Select one reminder question ***", " 1 - What is your mother name?", " 2 - What is your best friend name?", " 3 - Who is your favorite football player?", " 4 - Who is your idol?", " 5 - What is your favorite teacher name?", " 6 - What is your first school name?", " 7 - What is your favorite PC game?" }));
        ComQuestion.setToolTipText("Choose one question that you have chosen before");
        ComQuestion.setFont(new java.awt.Font("Big Caslon", 0, 12)); // NOI18N
        jPanel1.add(ComQuestion);
        ComQuestion.setBounds(130, 160, 245, 26);

        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator12);
        jSeparator12.setBounds(130, 140, 240, 10);

        jLabel10.setFont(new java.awt.Font("Big Caslon", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Question");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 160, 60, 20);

        jLabel11.setFont(new java.awt.Font("Big Caslon", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Answer");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 220, 60, 20);

        txtAnswer.setToolTipText("Enter Your Answer");
        txtAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswerActionPerformed(evt);
            }
        });
        jPanel1.add(txtAnswer);
        txtAnswer.setBounds(130, 210, 250, 24);

        jSeparator13.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator13);
        jSeparator13.setBounds(130, 190, 240, 10);

        jLabel9.setFont(new java.awt.Font("Big Caslon", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Reset PassWord");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(90, 20, 306, 41);

        lblReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Connection/Icons/refresh-lock (1).png"))); // NOI18N
        lblReturn.setToolTipText("Return PassWord");
        lblReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReturnMouseClicked(evt);
            }
        });
        jPanel1.add(lblReturn);
        lblReturn.setBounds(210, 310, 64, 64);

        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Connection/exit.png"))); // NOI18N
        lblExit.setToolTipText("Close");
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
        lblExit.setBounds(30, 410, 50, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-6, 1, 460, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnswerActionPerformed

    private void lblReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReturnMouseClicked
        if(!IsEmpty()){
            PutInfo();
            if (!customerlogin.ReturnPassWord()){
                Tools.MsgBoxErrorX("The library card number \nOR the question that you have chosen \nOR the answer that you have put \n             is wrong", "Failed to return your PassWord");
            }
            else{
               PutInfo();
               //customerlogin.setCardNumber(Integer.parseInt( txtCard.getText() ));
               String email = Connections.GetEmail( Integer.parseInt( txtCard.getText() ) );
               String newPass = "$"+email.toUpperCase().substring(3, 4) +"#" + email.toUpperCase().substring(1,3)+"%";
               String hashPass = Tools.hashPassword(newPass);
                customerlogin.ChangePassByCardNumber(hashPass);
                Tools.MsgBox("Your new Password is: " + newPass);
            }
        }
        else{
            Tools.MsgBoxErrorX("Please fill all text fields and choose one question!", "Selection failed!!!");
        }
    }//GEN-LAST:event_lblReturnMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        Tools.PutImageInLable("exit3.png", lblExit, 45, 45);
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        Tools.PutImageInLable("exit3.png", lblExit, 35, 35);
    }//GEN-LAST:event_lblExitMouseExited

    private void txtCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCardActionPerformed
        private static String test ;
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
            java.util.logging.Logger.getLogger(FrmReset_Password_By_Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReset_Password_By_Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReset_Password_By_Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReset_Password_By_Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReset_Password_By_Question().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Controls.JCombo ComQuestion;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblReturn;
    private Controls.JTextBox txtAnswer;
    private Controls.JTextBox txtCard;
    // End of variables declaration//GEN-END:variables
}
