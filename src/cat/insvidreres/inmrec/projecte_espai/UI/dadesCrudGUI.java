package cat.insvidreres.inmrec.projecte_espai.UI;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import cat.insvidreres.inmrec.projecte_espai.UI.WindowManager;
import cat.insvidreres.inmrec.projecte_espai.UI.DadesPanel;
import cat.insvidreres.inmrec.projecte_espai.UI.CrudPanel;

import javax.swing.*;

/**
 *
 * @author ELOWIS
 */
public class dadesCrudGUI extends javax.swing.JFrame {

    /**
     * Creates new form dadesCrudGUI
     */
    public dadesCrudGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("DADES", new DadesPanel());
        tabbedPane.addTab("CRUD", new CrudPanel());

        getContentPane().add(tabbedPane);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        // Width
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        // Hight
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        getContentPane().add(tabbedPane);
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
