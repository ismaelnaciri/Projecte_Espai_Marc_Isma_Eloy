package cat.insvidreres.inmrec.projecte_espai.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReadCustomerGUI  extends JFrame {

    public String categoria, codi;
    private JComboBox categoryBoxOption;
    private JLabel introLabel;
    private JTextField introSearchCodeField;
    private JButton searchButton;


    private JLabel label1, label2, label3, label4,
                   label5, label6, label7, label8,
                   label9, label10, label11;

    private String valueLabel1, valueLabel2, valueLabel3, valueLabel4,
                   valueLabel5, valueLabel6, valueLabel7, valueLabel8,
                   valueLabel9, valueLabel10, valueLabel11;

    public ReadCustomerGUI() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Projecte PES");
        setResizable(false);
        setLocationRelativeTo(null);

        introLabel = new JLabel();
        introSearchCodeField = new JTextField();
        categoryBoxOption = new JComboBox<>();
        categoryBoxOption.setModel(new DefaultComboBoxModel(new String[] { "Mecanic", "Fisic", "Astronauta", "Espia" }));


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
        introSearchCodeField.setFont(new Font("Segoe UI Black", 0, 18));

        searchButton.setText("Buscar");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("Buscar")) {
                    categoria = (String) categoryBoxOption.getSelectedItem();


                }
            }
        });
    }
}
