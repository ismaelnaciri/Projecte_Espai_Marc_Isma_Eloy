package cat.insvidreres.inmrec.projecte_espai.UI;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import cat.insvidreres.inmrec.projecte_espai.classes.Cientific;
import cat.insvidreres.inmrec.projecte_espai.engine.MySQLConnection;
import cat.insvidreres.inmrec.projecte_espai.engine.Queries;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ELOWIS
 */
public class dadesGUI extends javax.swing.JFrame implements Cientific {
    public boolean esEntrada = true;

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
        mostrarDadesTxt1 = new javax.swing.JLabel();
        mostrarDadesTxt2 = new javax.swing.JLabel();
        mostrarDadesTxt3 = new javax.swing.JLabel();
        mostrarDadesTxt4 = new javax.swing.JLabel();
        mostrarDadesTxt5 = new javax.swing.JLabel();
        mostrarDadesTxt6 = new javax.swing.JLabel();
        mostrarDadesTxt7 = new javax.swing.JLabel();
        mostrarDadesTxt8 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("DADES");

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setText("jButton1");

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        dadesTxt2.setText("d");

        dadesTxt3.setText("d");

        dadesTxt4.setText("d");

        dadesTxt5.setText("d");

        dadesTxt6.setText("d");

        dadesTxt7.setText("d");

        dadesTxt8.setText("d");

        mostrarDadesTxt1.setText("jLabel2");

        mostrarDadesTxt2.setText("jLabel3");

        mostrarDadesTxt3.setText("jLabel4");

        mostrarDadesTxt4.setText("jLabel5");

        mostrarDadesTxt5.setText("jLabel6");

        mostrarDadesTxt6.setText("jLabel7");

        mostrarDadesTxt7.setText("jLabel8");

        mostrarDadesTxt8.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        dadesCategories();
        mostrarDadesPerCategoria();
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mostrarDadesTxt1)
                            .addComponent(mostrarDadesTxt2)
                            .addComponent(mostrarDadesTxt3)
                            .addComponent(mostrarDadesTxt4))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dadesTxt6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mostrarDadesTxt6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dadesTxt5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mostrarDadesTxt5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dadesTxt7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mostrarDadesTxt7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dadesTxt8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mostrarDadesTxt8)))
                        .addContainerGap(245, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dadesTxt1)
                    .addComponent(dadesTxt5)
                    .addComponent(mostrarDadesTxt1)
                    .addComponent(mostrarDadesTxt5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dadesTxt2)
                    .addComponent(dadesTxt6)
                    .addComponent(mostrarDadesTxt2)
                    .addComponent(mostrarDadesTxt6))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dadesTxt3)
                    .addComponent(dadesTxt7)
                    .addComponent(mostrarDadesTxt3)
                    .addComponent(mostrarDadesTxt7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dadesTxt4)
                    .addComponent(dadesTxt8)
                    .addComponent(mostrarDadesTxt4)
                    .addComponent(mostrarDadesTxt8))
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void dadesCategories() {
        /*
        Mecànic: nom, salari, edat, numero del taller, adreça, anys d’experiència, ciutat on treballa i sexe.
        Físic: anys d’experiència, sexe, salari, nom, titulació acadèmica, ciutat on treballa, edat i adreça.
        Astronauta: data primer vol, nom, edat, missions ok, sexe, missions ko, adreça i rang militar.
        Espia: nom clau i telèfon de contacte.
        */
        if (LoginGUI.categoria.equals("Fisic")) {
            dadesTxt1.setText("Nom: ");
            dadesTxt2.setText("Salari: ");
            dadesTxt3.setText("Edat: ");
            dadesTxt4.setText("Titulació: ");
            dadesTxt5.setText("Ciutat: ");
            dadesTxt6.setText("Adreça: ");
            dadesTxt7.setText("Sexe: ");
            dadesTxt8.setVisible(false);

            jButton1.setText("Fitxar Entrada");

            jButton1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String cat = LoginGUI.categoria;
                    String codi = LoginGUI.codigo;

                    if (esEntrada==true) {
                        // Si es entrada, realiza acciones de entrada
                        String horaEntrada = obtenerHoraYDiaActual();
                        insertarFechaEntrada(codi, horaEntrada, cat);
                        jButton1.setText("Fitxar Sortida");
                        esEntrada= false;
                    } else {
                        // Si es salida, realiza acciones de salida
                        String horaSortida = obtenerHoraYDiaActual();
                        actualizarFechaSalida(codi, horaSortida, cat);
                        jButton1.setVisible(false);
                    }
                }
            });


            jButton1.setVisible(true);

        } else if (LoginGUI.categoria.equals("Astronauta")){
            dadesTxt1.setText("Nom: ");
            dadesTxt2.setText("Edat: ");
            dadesTxt3.setText("Primer Vol: ");
            dadesTxt4.setText("Missions Ok: ");
            dadesTxt5.setText("Missions Ko: ");
            dadesTxt6.setText("Adreça: ");
            dadesTxt7.setText("Sexe: ");
            dadesTxt8.setText("Rang Militar: ");
            jButton2.setText("Missatge Encriptat");
            jButton1.setText("Enviar Coordenades");

            jButton2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getActionCommand().equals("Missatge Encriptat")) {
                        missatgeGUI missatgeGUI = new missatgeGUI();
                        missatgeGUI.setVisible(true);
                    }
                }
            });
        } else if (LoginGUI.categoria.equals("Espia")){
            dadesTxt1.setText("Nom: ");
            dadesTxt2.setText("Telèfon: ");
            jButton1.setText("Fitxar");
            dadesTxt3.setVisible(false);
            dadesTxt4.setVisible(false);
            dadesTxt5.setVisible(false);
            dadesTxt6.setVisible(false);
            dadesTxt7.setVisible(false);
            dadesTxt8.setVisible(false);
            jButton2.setText("Missatge Encriptat");

            jButton2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getActionCommand().equals("Missatge Encriptat")) {
                        missatgeGUI missatgeGUI = new missatgeGUI();
                        missatgeGUI.setVisible(true);
                    }
                }
            });
        }
    }

    public void mostrarDadesPerCategoria() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Obtener una conexión a la base de datos utilizando el método getConnection de MySQLConnection
            connection = MySQLConnection.getConnection();

            String sql = null;
            String categoria = LoginGUI.categoria;
            if (categoria == "Fisic") {
                sql = "SELECT nom, salari, edat, titulacio, ciutat, adreca, sexe FROM fisic WHERE codi = ?";
            } else if (categoria == "Astronauta") {
                sql = "SELECT nom, edat, primer_vol, missions_OK, missions_KO, adreca, sexe, rang_militar FROM astronauta WHERE codi = ?";
            } else if (categoria == "Espia") {
                sql = "SELECT nom_clau, telefon FROM espia WHERE codi = ?";
            }

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, LoginGUI.codigo);

            // Ejecutar la consulta
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                if (categoria == "Fisic") {
                    mostrarDadesTxt1.setText(resultSet.getString("nom"));
                    mostrarDadesTxt2.setText(resultSet.getString("salari"));
                    mostrarDadesTxt3.setText(resultSet.getString("edat"));
                    mostrarDadesTxt4.setText(resultSet.getString("titulacio"));
                    mostrarDadesTxt5.setText(resultSet.getString("ciutat"));
                    mostrarDadesTxt6.setText(resultSet.getString("adreca"));
                    mostrarDadesTxt7.setText(resultSet.getString("sexe"));
                    mostrarDadesTxt8.setVisible(false);
                } else if (categoria == "Astronauta") {
                    mostrarDadesTxt1.setText(resultSet.getString("nom"));
                    mostrarDadesTxt2.setText(resultSet.getString("edat"));
                    mostrarDadesTxt3.setText(resultSet.getString("primer_vol"));
                    mostrarDadesTxt4.setText(resultSet.getString("missions_OK"));
                    mostrarDadesTxt5.setText(resultSet.getString("missions_KO"));
                    mostrarDadesTxt6.setText(resultSet.getString("adreca"));
                    mostrarDadesTxt7.setText(resultSet.getString("sexe"));
                    mostrarDadesTxt8.setText(resultSet.getString("rang_militar"));
                } else if (categoria == "Espia") {
                    mostrarDadesTxt1.setText(resultSet.getString("nom_clau"));
                    mostrarDadesTxt2.setText(resultSet.getString("telefon"));
                    mostrarDadesTxt3.setVisible(false);
                    mostrarDadesTxt4.setVisible(false);
                    mostrarDadesTxt5.setVisible(false);
                    mostrarDadesTxt6.setVisible(false);
                    mostrarDadesTxt7.setVisible(false);
                    mostrarDadesTxt8.setVisible(false);
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar los datos de la tabla: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

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
    private javax.swing.JLabel mostrarDadesTxt1;
    private javax.swing.JLabel mostrarDadesTxt2;
    private javax.swing.JLabel mostrarDadesTxt3;
    private javax.swing.JLabel mostrarDadesTxt4;
    private javax.swing.JLabel mostrarDadesTxt5;
    private javax.swing.JLabel mostrarDadesTxt6;
    private javax.swing.JLabel mostrarDadesTxt7;
    private javax.swing.JLabel mostrarDadesTxt8;
    // End of variables declaration//GEN-END:variables
}
