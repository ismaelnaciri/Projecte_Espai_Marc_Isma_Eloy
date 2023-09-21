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
}
class DadesPanel extends JPanel {
    public DadesPanel(){
        setLayout(new BorderLayout());

        JLabel jLabel1 = new JLabel("DADES");
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // Establece la fuente y el tamaño
        jLabel1.setHorizontalAlignment(JLabel.CENTER); // Centra el texto horizontalmente

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50)); // Alinea los botones en el centro

        JButton b1 = new JButton("PROVA1");
        JButton b2 = new JButton("PROVA2");

        // Tamaño más pequeño para los botones
        Dimension buttonSize = new Dimension(100, 40);
        b1.setPreferredSize(buttonSize);
        b2.setPreferredSize(buttonSize);

        // Cambiar color de fondo de los botones
        Color buttonColor = new Color(153, 153, 255);
        b1.setBackground(buttonColor);
        b2.setBackground(buttonColor);

        // Cambiar color de texto de los botones
        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);

        // Cambiar fuente y tamaño de texto de los botones
        Font buttonFont = new java.awt.Font("Segoe UI Black", Font.PLAIN, 16);
        b1.setFont(buttonFont);
        b2.setFont(buttonFont);

        buttonPanel.add(b1);
        buttonPanel.add(b2);

        add(jLabel1, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
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
