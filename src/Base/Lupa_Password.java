/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

/**
 *
 * @author ADINDA DWI WIJAYANTI
 */
public class Lupa_Password extends javax.swing.JFrame {

    /**
     * Creates new form Lupa_Password
     */
    public Lupa_Password() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_input_namaMomDad = new javax.swing.JTextField();
        txt_input_email = new javax.swing.JTextField();
        txt_input_NoHp = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JToggleButton();
        psw_Password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_input_namaMomDad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        txt_input_namaMomDad.setBorder(null);
        getContentPane().add(txt_input_namaMomDad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 500, 40));

        txt_input_email.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        txt_input_email.setBorder(null);
        getContentPane().add(txt_input_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 500, 40));

        txt_input_NoHp.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        txt_input_NoHp.setBorder(null);
        getContentPane().add(txt_input_NoHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 500, 40));

        btn_simpan.setBackground(new java.awt.Color(62, 130, 255));
        btn_simpan.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btn_simpan.setText("Simpan");
        btn_simpan.setBorder(null);
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 500, 330, 80));

        psw_Password.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        psw_Password.setBorder(null);
        getContentPane().add(psw_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 270, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_componet_CareNity/Lupa Password.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        sig_in_user Masuk = new sig_in_user ();
        Masuk.setVisible(true);
    }//GEN-LAST:event_btn_simpanActionPerformed

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
            java.util.logging.Logger.getLogger(Lupa_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lupa_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lupa_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lupa_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lupa_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField psw_Password;
    private javax.swing.JTextField txt_input_NoHp;
    private javax.swing.JTextField txt_input_email;
    private javax.swing.JTextField txt_input_namaMomDad;
    // End of variables declaration//GEN-END:variables
}
