package cat.insvidreres.inmrec.projecte_espai.engine;

import cat.insvidreres.inmrec.projecte_espai.UI.CreateWorkerGUI;
import cat.insvidreres.inmrec.projecte_espai.UI.LoginGUI;
import cat.insvidreres.inmrec.projecte_espai.classes.Agent;
import cat.insvidreres.inmrec.projecte_espai.init.Start;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class Queries implements Agent {

    private static String SQLSentence;
    private static Connection connection;
    private static PreparedStatement statement;
    private static ResultSet result;


    public static void insertCodedMessage(String codi_professional, String message, String categoria) throws SQLException {

        connection = MySQLConnection.getConnection();
        SQLSentence = "INSERT INTO missatge (emissor, contingut_missatge, categoria_emissor) VALUES (?, ?, ?)";

        try {
            statement = connection.prepareStatement(SQLSentence);
            statement.setString(1, codi_professional);
            statement.setString(2, message);
            statement.setString(3, categoria);

            int rowsInserted = statement.executeUpdate(SQLSentence);

            if (rowsInserted > 1)
                System.out.println("Rows inserted correctly");
            else
                System.out.println("Error in inserting");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();

        }
    }

    public static void getVehiclesCodiOfMechanic(String codi_mecanic) throws SQLException {

        connection = MySQLConnection.getConnection();
        SQLSentence = "SELECT codi_vin FROM vehicle_mecanic WHERE codi_mecanic = ?";

        try {
            statement = connection.prepareStatement(SQLSentence);
            statement.setString(1, codi_mecanic);

            result = statement.executeQuery();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (result != null)
                    result.close();
                if (statement != null)
                    statement.close();

            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public static void getVehicles(int codi_vin) throws SQLException {

        connection = MySQLConnection.getConnection();
        SQLSentence = "SELECT * FROM vehicle WHERE codi_vin = ?";

        try {
            statement = connection.prepareStatement(SQLSentence);
            statement.setInt(1, codi_vin);

            result = statement.executeQuery();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (result != null)
                    result.close();
                if (statement != null)
                    statement.close();

            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public static void insertCoordenades(String codi_astronauta, String cordenades) throws SQLException {

        connection = MySQLConnection.getConnection();
        SQLSentence = "INSERT INTO coordenades(codi_astronauta, num_cordenada) VALUES (?, ?)";

        try {
            statement = connection.prepareStatement(SQLSentence);
            statement.setString(1, codi_astronauta);
            statement.setString(2, cordenades);


            int rowsInserted = statement.executeUpdate(SQLSentence);

            if (rowsInserted > 1)
                System.out.println("Rows inserted correctly");
            else
                System.out.println("Error in inserting");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static String getCodigo(String seleccion, String user, String password) {
        String code = "";

        try {
            connection = MySQLConnection.getConnection();
            SQLSentence = "SELECT codi FROM " + seleccion + " WHERE user = ? AND psw = ?";
            statement = connection.prepareStatement(SQLSentence);
            statement.setString(1, user);
            statement.setString(2, password);

            result = statement.executeQuery();

            if (result.next()) {
                code = result.getString("codi");
                LoginGUI.codigo = code;
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

        return code;
    }


    public static void crudDelete(String codi, String categoria) {
        String tableNameDEL = "";

        if ("Astronauta".equalsIgnoreCase(categoria)) {
            tableNameDEL = "astronauta";
        } else if ("Espia".equalsIgnoreCase(categoria)) {
            tableNameDEL = "espia";
        } else if ("Fisic".equalsIgnoreCase(categoria)) {
            tableNameDEL = "fisic";
        } else if ("Mecanic".equalsIgnoreCase(categoria)) {
            tableNameDEL = "mecanic";
        } else {
            System.out.println("Categoria no valida");
            return;
        }
        String SQLSentence = "DELETE FROM " + tableNameDEL + " WHERE codi = ?";

        try {
            connection = MySQLConnection.getConnection();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        SQLSentence = "SELECT codigo FROM " + categoria + " WHERE (user = ?) AND (psw = ?)";

        try {
            statement = connection.prepareStatement(SQLSentence);
            statement.setString(1, codi);

            int rowsDeleted = statement.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("User with codi " + codi + " deleted successfully from " + categoria);
            } else {
                System.out.println("User with codi " + codi + " not found in " + categoria);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }


    public static void crudSelect(String codi, String categoria) {
        String tableNameSELECT = "";

        //ASTRONAUTA
        if ("Astronauta".equalsIgnoreCase(categoria)) {
            tableNameSELECT = "Astronauta";

            SQLSentence = "SELECT * FROM  + tableNameSELECT +  WHERE codi = ?";

            try {
                statement = connection.prepareStatement(SQLSentence);
                statement.setString(1, codi);

                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {

                    String userCode = resultSet.getString("codi");
                    String userName = resultSet.getString("nombre");
                    int userSalary = resultSet.getInt("salario");

                    System.out.println("User Details:");
                    System.out.println("Código: " + userCode);
                    System.out.println("Nombre: " + userName);
                    System.out.println("Salario: " + userSalary);

                } else {
                    System.out.println("User with codi " + codi + " not found in " + categoria);
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }

            //ESPIA
        } else if ("Espia".equalsIgnoreCase(categoria)) {
            tableNameSELECT = "Espia";

            SQLSentence = "SELECT * FROM  + tableNameSELECT +  WHERE codi = ?";

            try {
                statement = connection.prepareStatement(SQLSentence);
                statement.setString(1, codi);

                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {

                    String userCode = resultSet.getString("codi");
                    String userName = resultSet.getString("nombre");
                    int userSalary = resultSet.getInt("salario");

                    System.out.println("User Details:");
                    System.out.println("Código: " + userCode);
                    System.out.println("Nombre: " + userName);
                    System.out.println("Salario: " + userSalary);

                } else {
                    System.out.println("User with codi " + codi + " not found in " + categoria);
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }

            //fisic
        } else if ("Fisic".equalsIgnoreCase(categoria)) {
            tableNameSELECT = "Fisic";

            String SQLSentence = "SELECT * FROM  + tableNameSELECT +  WHERE codi = ?";

            try {
                statement = connection.prepareStatement(SQLSentence);
                statement.setString(1, codi);

                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {

                    String userCode = resultSet.getString("codi");
                    String userName = resultSet.getString("nombre");
                    int userSalary = resultSet.getInt("salario");

                    System.out.println("User Details:");
                    System.out.println("Código: " + userCode);
                    System.out.println("Nombre: " + userName);
                    System.out.println("Salario: " + userSalary);

                } else {
                    System.out.println("User with codi " + codi + " not found in " + categoria);
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public static void crudInsert(String categoria) {
        String codi, nom, salari,
                edat, telefon, num_taller,
                adreca, anys_exp, ciutat,
                titulacio, primer_vol, missions_ok, missions_ko,
                rang_militar,sexe, user, passw;

        if (categoria.equals("Mecanic")) {
            codi = CreateWorkerGUI.getLabel1Value();
            nom = CreateWorkerGUI.getLabel2Value();
            salari = CreateWorkerGUI.getLabel3Value();
            edat = CreateWorkerGUI.getLabel4Value();
            num_taller = CreateWorkerGUI.getLabel5Value();
            adreca = CreateWorkerGUI.getLabel6Value();
            anys_exp = CreateWorkerGUI.getLabel7Value();
            ciutat = CreateWorkerGUI.getLabel8Value();
            sexe = CreateWorkerGUI.getLabel9Value();
            user = CreateWorkerGUI.getLabel10Value();
            passw = CreateWorkerGUI.getLabel11Value();

            SQLSentence = "INSERT INTO " + categoria + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try {
                statement = connection.prepareStatement(SQLSentence);

                statement.setString(1, codi);
                statement.setString(2, nom);
                statement.setString(3, salari);
                statement.setString(4, edat);
                statement.setString(5, num_taller);
                statement.setString(6, adreca);
                statement.setString(7, anys_exp);
                statement.setString(8, ciutat);
                statement.setString(9, sexe);
                statement.setString(10, user);
                statement.setString(11, passw);

                statement.executeQuery();

            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println("pepepepepepepepep");

        }
        else if (categoria.equals("Fisic")) {
            codi = CreateWorkerGUI.getLabel1Value();
            nom = CreateWorkerGUI.getLabel2Value();
            salari = CreateWorkerGUI.getLabel3Value();
            edat = CreateWorkerGUI.getLabel4Value();
            titulacio = CreateWorkerGUI.getLabel5Value();
            adreca = CreateWorkerGUI.getLabel6Value();
            ciutat = CreateWorkerGUI.getLabel7Value();
            sexe = CreateWorkerGUI.getLabel8Value();
            user = CreateWorkerGUI.getLabel9Value();
            passw = CreateWorkerGUI.getLabel10Value();

            SQLSentence = "INSERT INTO " + categoria + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try {
                statement = connection.prepareStatement(SQLSentence);

                statement.setString(1, codi);
                statement.setString(2, nom);
                statement.setString(3, salari);
                statement.setString(4, edat);
                statement.setString(5, titulacio);
                statement.setString(6, adreca);
                statement.setString(7, ciutat);
                statement.setString(8, sexe);
                statement.setString(9, user);
                statement.setString(10, passw);

                statement.executeQuery();
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        else if (categoria.equals("Astronauta")) {
            codi = CreateWorkerGUI.getLabel1Value();
            nom = CreateWorkerGUI.getLabel2Value();
            edat = CreateWorkerGUI.getLabel3Value();
            primer_vol = CreateWorkerGUI.getLabel4Value();
            missions_ok = CreateWorkerGUI.getLabel5Value();
            missions_ko = CreateWorkerGUI.getLabel6Value();
            adreca = CreateWorkerGUI.getLabel7Value();
            sexe = CreateWorkerGUI.getLabel8Value();
            rang_militar = CreateWorkerGUI.getLabel9Value();
            user = CreateWorkerGUI.getLabel10Value();
            passw = CreateWorkerGUI.getLabel11Value();

            SQLSentence = "INSERT INTO " + categoria + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try {
                statement = connection.prepareStatement(SQLSentence);

                statement.setString(1, codi);
                statement.setString(2, nom);
                statement.setString(3, edat);
                statement.setString(4, primer_vol);
                statement.setString(5, missions_ok);
                statement.setString(6, missions_ko);
                statement.setString(7, adreca);
                statement.setString(8, sexe);
                statement.setString(9, rang_militar);
                statement.setString(10, user);
                statement.setString(11, passw);

                statement.executeQuery();
            } catch (SQLException e) {
                System.out.println("Error : " + e.getMessage());
            }
        }

        else if (categoria.equals("Espia")) {
            codi = CreateWorkerGUI.getLabel1Value();
            nom = CreateWorkerGUI.getLabel2Value();
            telefon = CreateWorkerGUI.getLabel3Value();
            user = CreateWorkerGUI.getLabel4Value();
            passw = CreateWorkerGUI.getLabel5Value();

            SQLSentence = "INSERT INTO " + categoria + " VALUES(?, ?, ?, ?, ?)";

            try {
                statement = connection.prepareStatement(SQLSentence);

                statement.setString(1, codi);
                statement.setString(2, nom);
                statement.setString(3, telefon);
                statement.setString(4, user);
                statement.setString(5, passw);
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }
}
