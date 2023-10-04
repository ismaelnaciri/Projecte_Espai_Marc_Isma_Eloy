package cat.insvidreres.inmrec.projecte_espai.UI;

import javax.swing.*;
import java.awt.*;

public class ReadWorkerDadesGUI extends JFrame {

    public ReadWorkerDadesGUI() {
        initComponents();
    }

    public void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton1.setVisible(false);
        jButton2 = new javax.swing.JButton();
        jButton2.setVisible(false);
        jButton3 = new javax.swing.JButton();
        jButton3.setVisible(false);
        jLabel1 = new javax.swing.JLabel();
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

        Font font = new Font("Segoe UI Black", 0, 18);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
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
    }

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

}
