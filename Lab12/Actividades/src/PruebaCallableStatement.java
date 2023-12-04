import java.sql.*;

class PruebaCallableStatement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/actividad_1";
        String username = "root";
        String password = "administrator";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String callProcedure = "{call insertCliente(?, ?)}"; 
            try (CallableStatement callableStatement = conn.prepareCall(callProcedure)) {
                
                callableStatement.setString(1, "Reptile");
                callableStatement.setString(2, "89654534");

                
                callableStatement.execute();
                
                System.out.println("Procedimiento almacenado ejecutado con éxito.");
            } catch (SQLException e) {
                System.out.println("Error al ejecutar el procedimiento almacenado: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}
