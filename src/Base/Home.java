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
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        btn_tambahprofilanak = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        btn_transaksi = new javax.swing.JButton();
        btn_chatdokter = new javax.swing.JButton();
        btn_komunitas = new javax.swing.JButton();
        btn_konten = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_tambahprofilanak.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_tambahprofilanak.setText("Tambah Profil Anak");
        getContentPane().add(btn_tambahprofilanak, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 280, 280, 50));

        btn_home.setText("Home");
        getContentPane().add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 220, 110, -1));

        btn_transaksi.setText("Transaksi");
        getContentPane().add(btn_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 110, -1));

        btn_chatdokter.setText("Chat Dokter");
        getContentPane().add(btn_chatdokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 120, -1));

        btn_komunitas.setText("Komunitas");
        getContentPane().add(btn_komunitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 110, -1));

        btn_konten.setText("Konten");
        getContentPane().add(btn_konten, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_componet_CareNity/Home.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_chatdokter;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_komunitas;
    private javax.swing.JButton btn_konten;
    private javax.swing.JButton btn_tambahprofilanak;
    private javax.swing.JButton btn_transaksi;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
