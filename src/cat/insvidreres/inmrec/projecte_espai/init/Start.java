package cat.insvidreres.inmrec.projecte_espai.init;

import cat.insvidreres.inmrec.projecte_espai.UI.LoginGUI;
import cat.insvidreres.inmrec.projecte_espai.UI.WindowManager;
import cat.insvidreres.inmrec.projecte_espai.engine.MySQLConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class Start {

    private static Connection connection;

    public static void main(String[] args) throws SQLException {
        WindowManager.openLoginWindow();

        connection = MySQLConnection.getConnection();

        try {
            System.out.printf("Conected to database %s" + " successfully.%n", connection.getCatalog());


        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        } finally {

            if (connection.isClosed())
                System.out.println("Connection closed");
        }

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    public static Connection getConnection() { return connection; }




//    static Date dt = new Date();
//    static String mysqlPattern = "yyyy-MM-dd HH:mm:ss";
//    static SimpleDateFormat sdf = new SimpleDateFormat(mysqlPattern);
//    public static void main(String[] args) {
//        String currentTime = sdf.format(dt);
//        System.out.println(currentTime);
//    }
}
