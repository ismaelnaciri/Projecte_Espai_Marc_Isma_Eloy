package cat.insvidreres.inmrec.projecte_espai.classes;

import cat.insvidreres.inmrec.projecte_espai.engine.MySQLConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface Agent {

    default void enviarMissatge(String codi_professional, String missatge, String categoria) {

            String codi = codi_professional;
            String msg = missatge;
            String cat = categoria;

            if ("espia".equals(cat)) {
                msg = eliminarVocals(msg);
            }

            else if ("astronauta".equals(cat)) {
                msg = eliminarConsonants(msg);
            }

            try (Connection connection = MySQLConnection.getConnection()) {

                String sql = "INSERT INTO missatge (emissor, contingut_missatge, categoria_emissor) VALUES (?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);

                statement.setString(1, codi);
                statement.setString(2, msg);
                statement.setString(3, cat);

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
