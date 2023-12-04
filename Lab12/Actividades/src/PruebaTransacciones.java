import java.sql.*;

class PruebaTransacciones {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/actividad_1", "root", "administrator");
            con.setAutoCommit(false);

            Statement stmt = con.createStatement();
            
            stmt.executeUpdate("INSERT INTO Clientes (nombre, dni) VALUES ('Sub-Zero', '77777778')");

            con.commit();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}