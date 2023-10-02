package cat.insvidreres.inmrec.projecte_espai.engine;

import cat.insvidreres.inmrec.projecte_espai.UI.LoginGUI;
import cat.insvidreres.inmrec.projecte_espai.classes.Agent;
import cat.insvidreres.inmrec.projecte_espai.init.Start;

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
        } finally {
            try {
                if (result != null) {
                    result.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
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

}
