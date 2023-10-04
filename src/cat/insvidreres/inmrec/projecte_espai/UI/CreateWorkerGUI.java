package cat.insvidreres.inmrec.projecte_espai.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateWorkerGUI extends JFrame {

    public static String categoria;

    private static JLabel label1, label2, label3, label4,
                   label5, label6, label7, label8,
                   label9, label10, label11;

    public static String label1Value, label2Value, label3Value, label4Value,
                   label5Value, label6Value, label7Value, label8Value,
                   label9Value, label10Value, label11Value;

    private static JTextField tfield1, tfield2, tfield3, tfield4,
                       tfield5, tfield6, tfield7, tfield8,
                       tfield9, tfield10, tfield11;

    private static JButton createButton;

    private static JComboBox option;


    public CreateWorkerGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        setTitle("Projecte PES");
        setResizable(false);
        setLocationRelativeTo(null);


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

        tfield1 = new JTextField();
        tfield2 = new JTextField();
        tfield3 = new JTextField();
        tfield4 = new JTextField();
        tfield5 = new JTextField();
        tfield6 = new JTextField();
        tfield7 = new JTextField();
        tfield8 = new JTextField();
        tfield9 = new JTextField();
        tfield10 = new JTextField();
        tfield11 = new JTextField();

        createButton = new JButton();
        createButton.setBackground(new Color(153, 153, 255));
        createButton.setText("Crear");

        option = new JComboBox<>();

        option.setModel(new DefaultComboBoxModel(new String[] { "Mecanic", "Fisic", "Astronauta", "Espia" }));

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

        tfield1.setFont(new Font("Segoe UI Black", 0, 18));
        tfield2.setFont(new Font("Segoe UI Black", 0, 18));
        tfield3.setFont(new Font("Segoe UI Black", 0, 18));
        tfield4.setFont(new Font("Segoe UI Black", 0, 18));
        tfield5.setFont(new Font("Segoe UI Black", 0, 18));
        tfield6.setFont(new Font("Segoe UI Black", 0, 18));
        tfield7.setFont(new Font("Segoe UI Black", 0, 18));
        tfield8.setFont(new Font("Segoe UI Black", 0, 18));
        tfield9.setFont(new Font("Segoe UI Black", 0, 18));
        tfield10.setFont(new Font("Segoe UI Black", 0, 18));
        tfield11.setFont(new Font("Segoe UI Black", 0, 18));

        //Place ui code here

        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("Crear")) {
                    if ("Mecanic".equals(categoria)) {

                        label1.setText("Codi:");
                        label2.setText("Nom:");
                        label3.setText("Salari:");
                        label4.setText("Edat:");
                        label5.setText("Numero de Taller:");
                        label6.setText("Adreça:");
                        label7.setText("Anys d' experiencia:");
                        label8.setText("Ciutat:");
                        label9.setText("Sexe:");
                        label10.setText("User:");
                        label11.setText("Password:");

                        label1.setVisible(true);
                        label2.setVisible(true);
                        label3.setVisible(true);
                        label4.setVisible(true);
                        label5.setVisible(true);
                        label6.setVisible(true);
                        label7.setVisible(true);
                        label8.setVisible(true);
                        label9.setVisible(true);
                        label10.setVisible(true);
                        label11.setVisible(true);

                        tfield1.setVisible(true);
                        tfield2.setVisible(true);
                        tfield3.setVisible(true);
                        tfield4.setVisible(true);
                        tfield5.setVisible(true);
                        tfield6.setVisible(true);
                        tfield7.setVisible(true);
                        tfield8.setVisible(true);
                        tfield9.setVisible(true);
                        tfield10.setVisible(true);
                        tfield11.setVisible(true);

                        label1Value = tfield1.getText();
                        label2Value = tfield2.getText();
                        label3Value = tfield3.getText();
                        label4Value = tfield4.getText();
                        label5Value = tfield5.getText();
                        label6Value = tfield6.getText();
                        label7Value = tfield7.getText();
                        label8Value = tfield8.getText();
                        label9Value = tfield9.getText();
                        label10Value = tfield10.getText();
                        label11Value = tfield11.getText();

                        repaint();
                    }
                    else if ("Fisic".equals(categoria)) {
                        label1.setText("Codi:");
                        label2.setText("Nom:");
                        label3.setText("Salari:");
                        label4.setText("Edat:");
                        label5.setText("Titulacio:");
                        label6.setText("Adreça:");
                        label7.setText("Ciutat:");
                        label8.setText("Sexe:");
                        label9.setText("User:");
                        label10.setText("Password:");

                        label1.setVisible(true);
                        label2.setVisible(true);
                        label3.setVisible(true);
                        label4.setVisible(true);
                        label5.setVisible(true);
                        label6.setVisible(true);
                        label7.setVisible(true);
                        label8.setVisible(true);
                        label9.setVisible(true);
                        label10.setVisible(true);

                        tfield1.setVisible(true);
                        tfield2.setVisible(true);
                        tfield3.setVisible(true);
                        tfield4.setVisible(true);
                        tfield5.setVisible(true);
                        tfield6.setVisible(true);
                        tfield7.setVisible(true);
                        tfield8.setVisible(true);
                        tfield9.setVisible(true);
                        tfield10.setVisible(true);

                        label1Value = tfield1.getText();
                        label2Value = tfield2.getText();
                        label3Value = tfield3.getText();
                        label4Value = tfield4.getText();
                        label5Value = tfield5.getText();
                        label6Value = tfield6.getText();
                        label7Value = tfield7.getText();
                        label8Value = tfield8.getText();
                        label9Value = tfield9.getText();
                        label10Value = tfield10.getText();

                        repaint();
                    }
                    else if ("Astronauta".equals(categoria)) {
                        label1.setText("Codi:");
                        label2.setText("Nom:");
                        label3.setText("Edat:");
                        label4.setText("Primer Vol:");
                        label5.setText("Missions OK:");
                        label6.setText("Missions KO:");
                        label7.setText("Adreça:");
                        label8.setText("Sexe:");
                        label9.setText("Rang Militar:");
                        label10.setText("User:");
                        label11.setText("Password:");

                        label1.setVisible(true);
                        label2.setVisible(true);
                        label3.setVisible(true);
                        label4.setVisible(true);
                        label5.setVisible(true);
                        label6.setVisible(true);
                        label7.setVisible(true);
                        label8.setVisible(true);
                        label9.setVisible(true);
                        label10.setVisible(true);
                        label11.setVisible(true);

                        tfield1.setVisible(true);
                        tfield2.setVisible(true);
                        tfield3.setVisible(true);
                        tfield4.setVisible(true);
                        tfield5.setVisible(true);
                        tfield6.setVisible(true);
                        tfield7.setVisible(true);
                        tfield8.setVisible(true);
                        tfield9.setVisible(true);
                        tfield10.setVisible(true);
                        tfield11.setVisible(true);

                        label1Value = tfield1.getText();
                        label2Value = tfield2.getText();
                        label3Value = tfield3.getText();
                        label4Value = tfield4.getText();
                        label5Value = tfield5.getText();
                        label6Value = tfield6.getText();
                        label7Value = tfield7.getText();
                        label8Value = tfield8.getText();
                        label9Value = tfield9.getText();
                        label10Value = tfield10.getText();
                        label11Value = tfield11.getText();

                        repaint();
                    }
                    else if ("Espia".equals(categoria)) {
                        label1.setText("Codi:");
                        label2.setText("Nom Clau:");
                        label3.setText("Telefon:");
                        label4.setText("User:");
                        label5.setText("Password:");

                        label1.setVisible(true);
                        label2.setVisible(true);
                        label3.setVisible(true);
                        label4.setVisible(true);
                        label5.setVisible(true);

                        tfield1.setVisible(true);
                        tfield2.setVisible(true);
                        tfield3.setVisible(true);
                        tfield4.setVisible(true);
                        tfield5.setVisible(true);

                        label1Value = tfield1.getText();
                        label2Value = tfield2.getText();
                        label3Value = tfield3.getText();
                        label4Value = tfield4.getText();
                        label5Value = tfield5.getText();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Error al conseguir la categoria", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }

    public static String getLabel1Value() {
        return label1Value;
    }

    public static String getLabel2Value() {
        return label2Value;
    }

    public static String getLabel3Value() {
        return label3Value;
    }

    public static String getLabel4Value() {
        return label4Value;
    }

    public static String getLabel5Value() {
        return label5Value;
    }

    public static String getLabel6Value() {
        return label6Value;
    }

    public static String getLabel7Value() {
        return label7Value;
    }

    public static String getLabel8Value() {
        return label8Value;
    }

    public static String getLabel9Value() {
        return label9Value;
    }

    public static String getLabel10Value() {
        return label10Value;
    }

    public static String getLabel11Value() {
        return label11Value;
    }
}
