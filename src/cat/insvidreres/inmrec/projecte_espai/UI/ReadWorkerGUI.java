package cat.insvidreres.inmrec.projecte_espai.UI;

import cat.insvidreres.inmrec.projecte_espai.engine.Queries;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReadWorkerGUI extends JFrame {

    public String categoria, codi;
    private JComboBox categoryBoxOption;
    private JLabel introLabel, codiLabel, tableLabel;
    private JTextField codiField, tableField;
    private JButton searchButton;


    private JLabel label1, label2, label3, label4,
                   label5, label6, label7, label8,
                   label9, label10, label11;


    public ReadWorkerGUI() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Projecte PES");
        setResizable(false);
        setLocationRelativeTo(null);

        introLabel = new JLabel("Search Worker");
        codiLabel = new JLabel("Codi: ");
        tableLabel = new JLabel("Taula: ");
        codiField = new JTextField();
        tableField = new JTextField();
        categoryBoxOption = new JComboBox<>();
        categoryBoxOption.setModel(new DefaultComboBoxModel(new String[]{"Mecanic", "Fisic", "Astronauta", "Espia"}));
        searchButton = new JButton();

        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();


        label1.setFont(new Font("Segoe UI Black", 0, 18));
        label2.setFont(new Font("Segoe UI Black", 0, 18));
        label3.setFont(new Font("Segoe UI Black", 0, 18));
        label4.setFont(new Font("Segoe UI Black", 0, 18));
        label5.setFont(new Font("Segoe UI Black", 0, 18));
        label6.setFont(new Font("Segoe UI Black", 0, 18));
        label7.setFont(new Font("Segoe UI Black", 0, 18));
        label8.setFont(new Font("Segoe UI Black", 0, 18));
        label9.setFont(new Font("Segoe UI Black", 0, 18));
        label10.setFont(new Font("Segoe UI Black", 0, 18));
        label11.setFont(new Font("Segoe UI Black", 0, 18));


        introLabel.setFont(new Font("Segoe UI Black", 0, 18));

        searchButton.setText("Buscar");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("Buscar")) {
                    categoria = tableField.getText();
                    codi = codiField.getText();
                    Queries.crudSelect(codi, categoria);
                    ReadWorkerDadesGUI readWorkerDadesGUI = new ReadWorkerDadesGUI();
                    readWorkerDadesGUI.setVisible(true);
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(211, 211, 211)
                                                .addComponent(introLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(135, 135, 135)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(tableLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(tableField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(codiLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(codiField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(214, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(introLabel)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(codiLabel)
                                        .addComponent(codiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tableLabel)
                                        .addComponent(tableField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }

    public String getCategoria() {
        return categoria;
    }
}
