package cat.insvidreres.inmrec.projecte_espai.classes;

import cat.insvidreres.inmrec.projecte_espai.engine.MySQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public interface Cientific {

    default String obtenerHoraYDiaActual() {
        // Obtener la fecha y hora actual
        LocalDateTime fechaYHoraActual = LocalDateTime.now();

        // Formatear la fecha y hora en el formato deseado (por ejemplo, "yyyy-MM-dd HH:mm:ss")
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaYHoraFormateada = fechaYHoraActual.format(formatter);

        return fechaYHoraFormateada;
    }

    default void insertarFechaEntrada(String codi_professional, String fecha_entrada, String categoria) {
        try (Connection connection = MySQLConnection.getConnection()) {
            String cat = categoria;
            System.out.println(cat);

            if (cat.equals("Mecanic")){
                String sql = "INSERT INTO assistencia_mecanic (data_entrada, codi_prof_mecanic) VALUES (?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);

                statement.setString(1, fecha_entrada);
                statement.setString(2, codi_professional);
                statement.executeUpdate();
                System.out.println("Fecha de entrada insertada en assistencia_mecanic");
            }
            else if (cat.equals("Fisic")) {
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

            if (cat.equals("Mecanic")){
                String sql = "UPDATE assistencia_mecanic SET data_sortida = ? WHERE codi_prof_mecanic = ? AND data_sortida IS NULL";
                PreparedStatement statement = connection.prepareStatement(sql);

                statement.setString(1, fecha_salida);
                statement.setString(2, codi_professional);
                statement.executeUpdate();
                System.out.println("Fecha de salida insertada en assistencia_fisic");
            }
            else if (cat.equals("Fisic")) {
                String sql = "UPDATE assistencia_fisic SET data_sortida = ? WHERE codi_prof_fisic = ? AND data_sortida IS NULL";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, fecha_salida);
                statement.setString(2, codi_professional);
                statement.executeUpdate();

                System.out.println("Fecha de salida insertada en assistencia_fisic");
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar fecha de salida: " + e.getMessage());
        }
    }
}
