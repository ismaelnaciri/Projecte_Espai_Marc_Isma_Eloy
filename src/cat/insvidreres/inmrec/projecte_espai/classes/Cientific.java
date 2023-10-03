package cat.insvidreres.inmrec.projecte_espai.classes;

import cat.insvidreres.inmrec.projecte_espai.engine.MySQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface Cientific {
    default void insertarFechaEntrada(String codi_professional, String fecha_entrada, String categoria) {
        try (Connection connection = MySQLConnection.getConnection()) {
            String cat = categoria;

            if (cat.equals("mecanic")){
                String sql = "INSERT INTO assistencia_mecanic (data_entrada, codi_prof_mecanic) VALUES (?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);

                statement.setString(1, fecha_entrada);
                statement.setString(2, codi_professional);
                statement.executeUpdate();
                System.out.println("Fecha de entrada insertada en assistencia_mecanic");
            }
            else if (cat.equals("fisic")) {
                String sql = "INSERT INTO assistencia_fisic (data_entrada, codi_prof_fisic) VALUES (?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);

                statement.setString(1, fecha_entrada);
                statement.setString(2, codi_professional);
                statement.executeUpdate();
                System.out.println("Fecha de entrada insertada en assistencia_fisic");
            }

        } catch (SQLException e) {
            System.out.println("Error al insertar fecha de entrada: " + e.getMessage());
        }
    }

    default void actualizarFechaSalida(String codi_professional, String fecha_salida, String categoria) {
        try (Connection connection = MySQLConnection.getConnection()) {
            String cat = categoria;

            if (cat.equals("mecanic")){
                String sql = "UPDATE assistencia_mecanic SET data_sortida = ? WHERE codi_prof_mecanic = ?";
                PreparedStatement statement = connection.prepareStatement(sql);

                statement.setString(1, fecha_salida);
                statement.setString(2, codi_professional);
                System.out.println("Fecha de salida insertada en assistencia_fisic");
            }
            else if (cat.equals("fisic")) {
                String sql = "UPDATE assistencia_fisic SET data_sortida = ? WHERE codi_prof_mecanic = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, fecha_salida);
                statement.setString(2, codi_professional);
                System.out.println("Fecha de salida insertada en assistencia_fisic");
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar fecha de salida: " + e.getMessage());
        }
    }
}
