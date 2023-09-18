package cat.insvidreres.inmrec.projecte_espai.engine;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLConnection {

    static String rutaProjecte = System.getProperty("user.dir");
    // static String sep = File.separator;

    public static Connection getConnection() throws SQLException {
        Connection connection = null;

        try (FileInputStream fis = new FileInputStream(rutaProjecte)) {
            //TODO
            Properties pros = new Properties();
            pros.load(fis);

            String user = pros.getProperty("user");
            String password = pros.getProperty("password");
            String url = pros.getProperty("url");

            connection = DriverManager.getConnection(url, user, password);

        } catch (IOException e) {
            System.out.println("I/O Exception: " + e.getMessage());
            e.printStackTrace();
        }
        return connection;
    }

}
