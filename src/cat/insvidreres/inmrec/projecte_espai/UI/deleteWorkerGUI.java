package cat.insvidreres.inmrec.projecte_espai.UI;

import cat.insvidreres.inmrec.projecte_espai.engine.Queries;
import javafx.scene.control.ComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class deleteWorkerGUI extends JFrame {

    public String categoria, codi;

    private JComboBox option;
    private JLabel codeLabel;
    private JTextField codeField;
    private JButton deleteButton;

    public deleteWorkerGUI() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Projecte PES");
        setResizable(false);
        setLocationRelativeTo(null);

        codeLabel = new JLabel();
        codeField = new JTextField();
        deleteButton = new JButton();

        option = new JComboBox<>();
        option.setModel(new DefaultComboBoxModel(new String[] { "Mecanic", "Fisic", "Astronauta", "Espia" }));
        categoria = (String) option.getSelectedItem();

        codeLabel.setFont(new Font("Segoe UI Black", 0, 18));
        codeField.setFont(new Font("Segoe UI Black", 0, 18));

        deleteButton.setBackground(new Color(153, 153, 255));
        deleteButton.setText("Eliminar");

        codi = codeField.getText();

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("Eliminar")) {
                    Queries.crudDelete(codi, categoria);
                    System.out.println("Test");
                }
            }
        });
    }
}
