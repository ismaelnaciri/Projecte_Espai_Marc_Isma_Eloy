package cat.insvidreres.inmrec.projecte_espai.engine;

import cat.insvidreres.inmrec.projecte_espai.init.Start;
import jdk.internal.access.JavaIOFileDescriptorAccess;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class Queries {

    private static String SQLSentence;
    private static Connection connection = Start.getConnection();
    private static Statement statement;
    private static ResultSet result;

    public static void insertCodedMessage(String codi_professional, String message, String categoria) {

    }

    public static void llistarVehicleMecanic(String codi_profesional){
            try (Connection connection = Start.getConnection()) {

                String sqlConsulta = "SELECT codi_vin, matricula, marca, modelo  " +
                                     "FROM vehicle, mecanic, vehicle_mecanic  " +
                                     "WHERE mecanic.codi = vehicle_mecanic.codi_mecanic  " +
                                     "AND vehicle_mecanic.codi_vin = vehicle.codi_vin  " +
                                     "AND mecanic.codi = ?";

                PreparedStatement statementConsulta = connection.prepareStatement(sqlConsulta);
                statementConsulta.setString(1, codi_profesional);
                ResultSet resultSet = statementConsulta.executeQuery();


                //Escriptura en fitxer
                FileWriter fileWriter = new FileWriter("src/cat/insvidreres/inmrec/projecte_espai/utils/magatzem_vehicles.txt");
                PrintWriter printWriter = new PrintWriter(fileWriter);
                printWriter.println("Codi Vin\tMatricula\tMarca\tModel");



                DefaultTableModel tableModel = new DefaultTableModel();
                tableModel.addColumn("Codi Vin");
                tableModel.addColumn("Matricula");
                tableModel.addColumn("Marca");
                tableModel.addColumn("Model");

                while (resultSet.next()) {
                    int codi_vin = resultSet.getInt("codi_vin");
                    String matricula = resultSet.getString("matricula");
                    String marca = resultSet.getString("marca");
                    String model = resultSet.getString("modelo");

                    Object[] row = { codi_vin, matricula, marca, model };
                    tableModel.addRow(row);

                    printWriter.println(codi_vin + "\t" + matricula + "\t" + marca + "\t" + model);

                }

//                JTable table = new JTable(tableModel);
//                JScrollPane scrollPane = new JScrollPane(table);
//                JButton btnActualizar = new JButton("Actualizar");
//                btnActualizar.addActionListener(e -> llistarVehicleMecanic(codi_profesional));

                printWriter.close();
                fileWriter.close();

            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error: "+ e.getMessage());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }





}
