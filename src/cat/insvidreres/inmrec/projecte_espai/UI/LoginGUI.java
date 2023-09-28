package cat.insvidreres.inmrec.projecte_espai.UI;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import cat.insvidreres.inmrec.projecte_espai.engine.Queries;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;

/**
 *
 * @author ELOWIS
 */
public class LoginGUI extends javax.swing.JFrame {

    public static String categoria = "";
    public static String codigo = "";


    /**
     * Creates new form LoginJFrame
     */
    public LoginGUI() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        enviaButton = new javax.swing.JButton();
        catComboBox = new javax.swing.JComboBox<>();
        userTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setText("INICI SESSIÓ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Usuari:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Constrasenya:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Categoria:");

        enviaButton.setBackground(new java.awt.Color(153, 153, 255));
        enviaButton.setText("ENVIA");
        enviaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String seleccion = (String) catComboBox.getSelectedItem();
                String user = userTextField.getText();

                char[] temp = passwordTextField.getPassword();
                String password = new String(temp);

                String code = Queries.getCodigo(seleccion, user, password);


                if ("Mecanic".equals(seleccion)) {
                    categoria = seleccion;
                    dadesCrudGUI dadescrudgui = new dadesCrudGUI();
                    categoria = seleccion;
                    codigo = code;
                    dadescrudgui.setVisible(true);
                    dispose();
                    JOptionPane.showMessageDialog(null, "Has entrat amb Mecànic (admin)");
                } else if ("Físic".equals(seleccion)) {
                    categoria = seleccion;
                    System.out.println(categoria);
                    dadesGUI dadesgui = new dadesGUI();
                    dadesgui.setVisible(true);
                    // System.out.println(categoria);
                    dispose();
                    JOptionPane.showMessageDialog(null, "Has entrat amb Físic");
                } else if ("Astronauta".equals(seleccion)) {
                    categoria = seleccion;
                    dadesGUI dadesgui = new dadesGUI();
                    dadesgui.setVisible(true);
                    dispose();
                    JOptionPane.showMessageDialog(null, "Has entrat amb Astronauta");
                } else if ("Espia".equals(seleccion)) {
                    categoria = seleccion;

                    dadesGUI dadesgui = new dadesGUI();
                    dadesgui.setVisible(true);
                    dispose();
                    JOptionPane.showMessageDialog(null, "Has entrat amb Espía");
                }
            }
        });


        super.setTitle("Projecte PES");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setResizable(false);
        super.setLocationRelativeTo(null);

        catComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mecanic", "Físic", "Astronauta", "Espia" }));
        catComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enviaButton)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(catComboBox, 0, 131, Short.MAX_VALUE)
                            .addComponent(userTextField)
                            .addComponent(passwordTextField))
                        .addGap(102, 102, 102))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(catComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(enviaButton)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void catComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catComboBoxActionPerformed

    private void enviaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviaButtonActionPerformed

    }//GEN-LAST:event_enviaButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> catComboBox;
    private javax.swing.JButton enviaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}
