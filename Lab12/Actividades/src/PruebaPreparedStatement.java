import java.sql.*;

public class PruebaPreparedStatement {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/actividad_1", "root", "administrator");
            con.setAutoCommit(false);

            PreparedStatement stmt = con.prepareStatement("INSERT INTO Clientes (nombre, dni) VALUES (?, ?)");
            stmt.setString(1, "Scorpion");
            stmt.setString(2, "97431232");

            int i = stmt.executeUpdate();
            System.out.println(i + " records inserted");

            con.commit();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
