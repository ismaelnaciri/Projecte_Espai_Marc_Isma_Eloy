package cat.insvidreres.inmrec.projecte_espai.classes;

import cat.insvidreres.inmrec.projecte_espai.engine.MySQLConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface Agent {
    default void enviarMissatgeEspia(String codi_professional, String missatge) {
        String codi = codi_professional;
        String msg = missatge;

        msg = eliminarVocals(msg);

        try (Connection connection = MySQLConnection.getConnection()) {
            System.out.println("Codi: " +codi);
            System.out.println("Msg: " +msg);

            String sql = "INSERT INTO missatge_espia (emissor, contingut_missatge) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, codi);
            statement.setString(2, msg);

            statement.executeUpdate();
            System.out.println("missatge enviat");
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }

    }

    default void enviarMissatgeAstronauta(String codi_professional, String missatge) {

            String codi = codi_professional;
            String msg = missatge;

            msg = eliminarConsonants(msg);


            try (Connection connection = MySQLConnection.getConnection()) {


                String sql = "INSERT INTO missatge_astronauta (emissor, contingut_missatge) VALUES (?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);

                statement.setString(1, codi);
                statement.setString(2, msg);

                statement.executeUpdate();
                System.out.println("missatge enviat");

            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
    }
    private String eliminarVocals(String mensaje) {
        return mensaje.replaceAll("[AEIOUaeiou]", "");
    }

    private String eliminarConsonants(String mensaje) {
        return mensaje.replaceAll("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]", "");
    }
}
