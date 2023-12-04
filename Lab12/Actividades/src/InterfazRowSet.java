import java.sql.*;
import javax.sql.rowset.*;

public class InterfazRowSet {

    public static void main(String[] args) {
        try {

            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();

            rowSet.setUrl("jdbc:mysql://localhost:3306/actividad_1");
            rowSet.setUsername("root");
            rowSet.setPassword("administrator");

            rowSet.setCommand("SELECT * FROM Clientes");
            rowSet.execute();

            while (rowSet.next()) {
                System.out.println(
                "ID: " + rowSet.getInt(1) + 
                ", Nombre: " + rowSet.getString(2) + 
                ", DNI: " + rowSet.getString(3));
            }

            rowSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
