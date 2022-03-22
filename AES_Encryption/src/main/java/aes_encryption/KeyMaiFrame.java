/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aes_encryption;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Hp
 */
public class KeyMaiFrame extends javax.swing.JFrame {

    /**
     * Creates new form KeyMaınFrame
     */
    public KeyMaiFrame() {
        try {
            initComponents();
            EncryptionUtils1.setKey(1);
        } catch (Exception e) {
            e.printStackTrace();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        keyList = new javax.swing.JComboBox<>();
        messageTxt = new javax.swing.JTextField();
        decryptBtn = new javax.swing.JButton();
        encryptBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTxt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cio - Key Presenter");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Result");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 110, 60, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Key Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 20, 70, 20);

        keyList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Key1", "Key2" }));
        keyList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                keyListItemStateChanged(evt);
            }
        });
        getContentPane().add(keyList);
        keyList.setBounds(80, 20, 190, 20);
        getContentPane().add(messageTxt);
        messageTxt.setBounds(80, 50, 440, 20);

        decryptBtn.setText("Decrypt");
        decryptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptBtnActionPerformed(evt);
            }
        });
        getContentPane().add(decryptBtn);
        decryptBtn.setBounds(170, 80, 100, 23);

        encryptBtn.setText("Encrypt");
        encryptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptBtnActionPerformed(evt);
            }
        });
        getContentPane().add(encryptBtn);
        encryptBtn.setBounds(80, 80, 80, 23);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Message");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 50, 60, 20);

        resultTxt.setColumns(20);
        resultTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resultTxt.setRows(5);
        jScrollPane1.setViewportView(resultTxt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 110, 440, 160);

        setSize(new java.awt.Dimension(548, 321));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void encryptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptBtnActionPerformed
        // TODO add your handling code here:
        try {
            resultTxt.setText(EncryptionUtils1.encrypt(messageTxt.getText()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_encryptBtnActionPerformed

    private void keyListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_keyListItemStateChanged
        // TODO add your handling code here:
        EncryptionUtils1.setKey(keyList.getSelectedIndex() + 1);
    }//GEN-LAST:event_keyListItemStateChanged

    private void decryptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptBtnActionPerformed
        // TODO add your handling code here:
        try {
            resultTxt.setText(EncryptionUtils1.decrypt(messageTxt.getText()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_decryptBtnActionPerformed

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
            java.util.logging.Logger.getLogger(KeyMaiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KeyMaiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KeyMaiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KeyMaiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    UIManager.setLookAndFeel(
                            UIManager.getCrossPlatformLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(KeyMaiFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(KeyMaiFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(KeyMaiFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(KeyMaiFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                new KeyMaiFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton decryptBtn;
    private javax.swing.JButton encryptBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> keyList;
    private javax.swing.JTextField messageTxt;
    private javax.swing.JTextArea resultTxt;
    // End of variables declaration//GEN-END:variables
}
