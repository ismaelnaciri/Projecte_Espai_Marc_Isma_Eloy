package cat.insvidreres.inmrec.projecte_espai.UI;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ELOWIS
 */
public class dadesGUI extends javax.swing.JFrame {

    /**
     * Creates new form dadesGUI
     */
    public dadesGUI() {
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

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        dadesTxt1 = new javax.swing.JLabel();
        dadesTxt2 = new javax.swing.JLabel();
        dadesTxt3 = new javax.swing.JLabel();
        dadesTxt4 = new javax.swing.JLabel();
        dadesTxt5 = new javax.swing.JLabel();
        dadesTxt6 = new javax.swing.JLabel();
        dadesTxt7 = new javax.swing.JLabel();
        dadesTxt8 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("DADES");

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setText("jButton1");

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setText("jButton2");

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("jButton2")) {
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            new missatgeGUI().setVisible(true);
                        }
                    });
                }
            }
        });

        super.setTitle("Projecte PES");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setResizable(false);
        super.setLocationRelativeTo(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());


        getContentPane().setLayout(layout);
        /*
        Mecànic: nom, salari, edat, numero del taller, adreça, anys d’experiència, ciutat on treballa i sexe.
        Físic: anys d’experiència, sexe, salari, nom, titulació acadèmica, ciutat on treballa, edat i adreça.
        Astronauta: data primer vol, nom, edat, missions ok, sexe, missions ko, adreça i rang militar.
        Espia: nom clau i telèfon de contacte.
        */
        if (LoginGUI.categoria.equals("Físic")) {
            dadesTxt1.setText("Nom: ");
            dadesTxt2.setText("Salari: ");
            dadesTxt3.setText("Edat: ");
            dadesTxt4.setText("Titulació: ");
            dadesTxt5.setText("Ciutat: ");
            dadesTxt6.setText("Adreça: ");
            dadesTxt7.setText("Sexe: ");
        } else if (LoginGUI.categoria.equals("Astronauta")){
            dadesTxt1.setText("Nom: ");
            dadesTxt2.setText("Edat: ");
            dadesTxt3.setText("Primer Vol: ");
            dadesTxt4.setText("Missions Ok: ");
            dadesTxt5.setText("Missions Ko: ");
            dadesTxt6.setText("Adreça: ");
            dadesTxt7.setText("Sexe: ");
            dadesTxt8.setText("Rang Militar: ");
        } else if (LoginGUI.categoria.equals("Espia")){
            dadesTxt1.setText("Nom: ");
            dadesTxt2.setText("Telèfon: ");
        }
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(116, 273, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(246, 246, 246))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dadesTxt4)
                    .addComponent(dadesTxt3)
                    .addComponent(dadesTxt2)
                    .addComponent(dadesTxt1)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(110, 110, 110))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dadesTxt6)
                            .addComponent(dadesTxt5)
                            .addComponent(dadesTxt7)
                            .addComponent(dadesTxt8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(369, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(dadesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(dadesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(dadesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(dadesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new dadesGUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dadesTxt1;
    private javax.swing.JLabel dadesTxt2;
    private javax.swing.JLabel dadesTxt3;
    private javax.swing.JLabel dadesTxt4;
    private javax.swing.JLabel dadesTxt5;
    private javax.swing.JLabel dadesTxt6;
    private javax.swing.JLabel dadesTxt7;
    private javax.swing.JLabel dadesTxt8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
