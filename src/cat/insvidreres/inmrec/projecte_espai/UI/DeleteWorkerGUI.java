package cat.insvidreres.inmrec.projecte_espai.UI;

import cat.insvidreres.inmrec.projecte_espai.engine.Queries;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DeleteWorkerGUI extends JFrame {

    public String categoria, codi;
    private JLabel codeLabel, categoryLabel;
    private JTextField codeField, categoryField;
    private JButton deleteButton;

    public DeleteWorkerGUI() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Projecte PES");
        setResizable(false);
        setLocationRelativeTo(null);

        codeLabel = new JLabel("Codi: ");
        categoryLabel = new JLabel("Categoria: ");
        codeField = new JTextField();
        deleteButton = new JButton();

        codeLabel.setFont(new Font("Segoe UI Black", 0, 18));
        codeField.setFont(new Font("Segoe UI Black", 0, 18));

        deleteButton.setBackground(new Color(153, 153, 255));
        deleteButton.setText("Eliminar");

        codi = codeField.getText();
        categoria = categoryField.getText();

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("Eliminar")) {
                    Queries.crudDelete(codi, categoria);
                    System.out.println("Delete successful");
                }
            }
        });
    }
}
