package cat.insvidreres.inmrec.projecte_espai.UI;

import javax.swing.*;
import java.awt.*;

public class WindowManager extends JPanel {
    
    public WindowManager() {
        initComponents();
    }
    
     private void initComponents() {

        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("DADES", new DadesPanel());
        tabbedPane.addTab("CRUD", new CrudPanel());

         add(tabbedPane);
        
    }

    public static void openLoginWindow() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }
}
class DadesPanel extends JPanel {
    public DadesPanel() {
        setLayout(new BorderLayout());

        JLabel jLabel1 = new JLabel("DADES");
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24));
        jLabel1.setHorizontalAlignment(JLabel.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));

        JButton b1 = new JButton("PROVA1");
        JButton b2 = new JButton("PROVA2");
        Dimension buttonSize = new Dimension(100, 40);
        b1.setPreferredSize(buttonSize);
        b2.setPreferredSize(buttonSize);
        Color buttonColor = new Color(153, 153, 255);
        b1.setBackground(buttonColor);
        b2.setBackground(buttonColor);
        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);
        Font buttonFont = new java.awt.Font("Segoe UI Black", Font.PLAIN, 16);
        b1.setFont(buttonFont);
        b2.setFont(buttonFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(7, 2, 10, 10)); // Establece un diseño de cuadrícula para el formulario

        JLabel label1 = new JLabel("Nom: ");
        JTextField textField1 = new JTextField();
        JLabel label2 = new JLabel("Salari: ");
        JTextField textField2 = new JTextField();
        JLabel label3 = new JLabel("Edat: ");
        JTextField textField3 = new JTextField();
        JLabel label4 = new JLabel("Titulació: ");
        JTextField textField4 = new JTextField();
        JLabel label5 = new JLabel("Ciutat: ");
        JTextField textField5 = new JTextField();
        JLabel label6 = new JLabel("Adreça: ");
        JTextField textField6 = new JTextField();
        JLabel label7 = new JLabel("Sexe: ");
        JTextField textField7 = new JTextField();

        formPanel.add(label1);
        formPanel.add(textField1);
        formPanel.add(label2);
        formPanel.add(textField2);
        formPanel.add(label3);
        formPanel.add(textField3);
        formPanel.add(label4);
        formPanel.add(textField4);
        formPanel.add(label5);
        formPanel.add(textField5);
        formPanel.add(label6);
        formPanel.add(textField6);
        formPanel.add(label7);
        formPanel.add(textField7);

        buttonPanel.add(b1);
        buttonPanel.add(b2);

        add(jLabel1, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
}


class CrudPanel extends JPanel {
    public CrudPanel() {
        setLayout(new BorderLayout());

        // Crea el panel para el título
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("ADMIN MANAGER");
        titleLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 24));
        titlePanel.add(titleLabel);
        add(titlePanel, BorderLayout.NORTH);

        // Crea el panel para los botones con GridLayout
        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10)); // 2 filas, 2 columnas
        add(buttonPanel, BorderLayout.CENTER);

        // Crea los botones
        JButton b1 = new JButton("CREATE");
        JButton b2 = new JButton("READ");
        JButton b3 = new JButton("UPDATE");
        JButton b4 = new JButton("DELETE");

        // Configura el tamaño deseado para los botones
        Dimension buttonSize = new Dimension(150, 60);
        b1.setPreferredSize(buttonSize);
        b2.setPreferredSize(buttonSize);
        b3.setPreferredSize(buttonSize);
        b4.setPreferredSize(buttonSize);

        // Configura el fondo de los botones
        Color purple = new Color(153, 153, 255);
        b1.setBackground(purple);
        b2.setBackground(purple);
        b3.setBackground(purple);
        b4.setBackground(purple);

        // Configura la fuente de los botones
        Font font = new Font("Segoe UI Black", Font.PLAIN, 18);
        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);
        b4.setFont(font);

        // Agrega los botones al panel
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(b4);
    }
}
