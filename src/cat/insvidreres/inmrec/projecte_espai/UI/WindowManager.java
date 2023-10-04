package cat.insvidreres.inmrec.projecte_espai.UI;

import cat.insvidreres.inmrec.projecte_espai.classes.Cientific;
import cat.insvidreres.inmrec.projecte_espai.engine.MySQLConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
class DadesPanel extends JPanel implements Cientific {

    public boolean esEntrada = true;
    JLabel value1, value2, value3, value4,
            value5, value6, value7, value8, value0;

    public DadesPanel() {
        setLayout(new BorderLayout());

        JLabel jLabel1 = new JLabel("DADES");
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24));
        jLabel1.setHorizontalAlignment(JLabel.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));

        JButton b1 = new JButton("Fitxar");
        JButton b2 = new JButton("Llistar Vehicles");
        Dimension buttonSize = new Dimension(100, 40);
        b1.setPreferredSize(buttonSize);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cat = LoginGUI.categoria;
                String codi = LoginGUI.codigo;

                if (esEntrada==true) {
                    // Si es entrada, realiza acciones de entrada
                    String horaEntrada = obtenerHoraYDiaActual();
                    insertarFechaEntrada(codi, horaEntrada, cat);
                    b1.setText("Fitxar Sortida");
                    esEntrada= false;
                } else {
                    // Si es salida, realiza acciones de salida
                    String horaSortida = obtenerHoraYDiaActual();
                    actualizarFechaSalida(codi, horaSortida, cat);
                    b1.setVisible(false);
                }
            }
        });
        b2.setPreferredSize(buttonSize);
        Color buttonColor = new Color(153, 153, 255);
        b1.setBackground(buttonColor);
        b2.setBackground(buttonColor);
        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);
        Font buttonFont = new java.awt.Font("Segoe UI Black", Font.PLAIN, 14);
        b1.setFont(buttonFont);
        b2.setFont(buttonFont);

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("Llistar Vehicles")) {
                    llistaVehiclesGUI llistaVehiclesGUI = new llistaVehiclesGUI();
                    llistaVehiclesGUI.setVisible(true);
                }
            }
        });

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(9, 2, 5, 5)); // Establece un diseño de cuadrícula para el formulario

        JLabel label0 = new JLabel("Codi: ");
        value0 = new JLabel();
        JLabel label1 = new JLabel("Nom: ");
        value1 = new JLabel();
        JLabel label2 = new JLabel("Salari: ");
        value2 = new JLabel();
        JLabel label3 = new JLabel("Edat: ");
        value3 = new JLabel();
        JLabel label4 = new JLabel("Numero Taller: ");
        value4 = new JLabel();
        JLabel label5 = new JLabel("Adreça: ");
        value5 = new JLabel();
        JLabel label6 = new JLabel("Anys Experiencia: ");
        value6 = new JLabel();
        JLabel label7 = new JLabel("Ciutat: ");
        value7 = new JLabel();
        JLabel label8 = new JLabel("Sexe: ");
        value8 = new JLabel();

        formPanel.add(label0);
        formPanel.add(value0);
        formPanel.add(label1);
        formPanel.add(value1);
        formPanel.add(label2);
        formPanel.add(value2);
        formPanel.add(label3);
        formPanel.add(value3);
        formPanel.add(label4);
        formPanel.add(value4);
        formPanel.add(label5);
        formPanel.add(value5);
        formPanel.add(label6);
        formPanel.add(value6);
        formPanel.add(label7);
        formPanel.add(value7);
        formPanel.add(label8);
        formPanel.add(value8);

        mostrarDadesMecanicCrud();

        buttonPanel.add(b1);
        buttonPanel.add(b2);

        add(jLabel1, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void mostrarDadesMecanicCrud() {
        Connection connection = null;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String SQLSentence = "SELECT codi, nom, salari, edat, num_taller, adreca, anys_experiencia, ciutat, sexe "
                            + "FROM mecanic WHERE codi = ?";
        String codi = LoginGUI.codigo;

        try {
            connection = MySQLConnection.getConnection();

            preparedStatement = connection.prepareStatement(SQLSentence);
            preparedStatement.setString(1, codi);

            resultSet = preparedStatement.executeQuery();


            if (resultSet.next()) {
                value0.setText(resultSet.getString("codi"));
                value0.setVisible(true);
                value1.setText(resultSet.getString("nom"));
                value1.setVisible(true);
                value2.setText(resultSet.getString("salari"));
                value2.setVisible(true);
                value3.setText(resultSet.getString("edat"));
                value3.setVisible(true);
                value4.setText(resultSet.getString("num_taller"));
                value4.setVisible(true);
                value5.setText(resultSet.getString("adreca"));
                value5.setVisible(true);
                value6.setText(resultSet.getString("anys_experiencia"));
                value6.setVisible(true);
                value7.setText(resultSet.getString("ciutat"));
                value7.setVisible(true);
                value8.setText(resultSet.getString("sexe"));
                value8.setVisible(true);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


class CrudPanel extends JPanel {

    public JButton b1, b2, b3, b4;

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
        b1 = new JButton("CREATE");
        b2 = new JButton("READ");
        b3 = new JButton("UPDATE");
        b4 = new JButton("DELETE");

        // Configura el tamaño deseado para los botones
        Dimension buttonSize = new Dimension(150, 60);
        b1.setPreferredSize(buttonSize);
        b2.setPreferredSize(buttonSize);
        b3.setPreferredSize(buttonSize);
        b4.setPreferredSize(buttonSize);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("CREATE")) {
                    CreateWorkerGUI cwgui = new CreateWorkerGUI();
                    cwgui.setVisible(true);
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("READ")) {
                    ReadWorkerGUI readWorkerGUI = new ReadWorkerGUI();
                    readWorkerGUI.setVisible(true);
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("UPDATE")) {

                }
            }
        });


        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("DELETE")) {
                    DeleteWorkerGUI deleteWorkerGUI = new DeleteWorkerGUI();
                    deleteWorkerGUI.setVisible(true);
                }
            }
        });
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
