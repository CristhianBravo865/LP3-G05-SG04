import java.sql.*;
import java.util.Scanner;

public class Operaciones {
    static final String DB_URL = "jdbc:mysql://localhost/actividad_1";
    static final String USER = "root";
    static final String PASS = "administrator";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            con.setAutoCommit(false);

            Scanner scanner = new Scanner(System.in);
            int choice = 0;

            do {
                System.out.println("Menú:");
                System.out.println("1. Insertar registro");
                System.out.println("2. Recuperar registros");
                System.out.println("3. Actualizar registro");
                System.out.println("4. Borrar registro");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        insertarRegistro(con);
                        break;
                    case 2:
                        recuperarRegistros(con);
                        break;
                    case 3:
                        actualizarRegistro(con);
                        break;
                    case 4:
                        borrarRegistro(con);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa.");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        break;
                }
            } while (choice != 5);

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void insertarRegistro(Connection con) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el DNI: ");
        String dni = scanner.nextLine();

        Statement stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO Clientes (nombre, dni) VALUES ('" + nombre + "', '" + dni + "')");
        con.commit();
        System.out.println("Registro insertado correctamente.");
    }

    static void recuperarRegistros(Connection con) throws SQLException {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Clientes");

        while (rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String dni = rs.getString("dni");
            System.out.println("ID: " + id + ", Nombre: " + nombre + ", DNI: " + dni);
        }
    }

    static void actualizarRegistro(Connection con) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del cliente a actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Ingrese el nuevo nombre: ");
        String nuevoNombre = scanner.nextLine();
        System.out.print("Ingrese el nuevo DNI: ");
        String nuevoDNI = scanner.nextLine();

        Statement stmt = con.createStatement();
        stmt.executeUpdate("UPDATE Clientes SET nombre = '" + nuevoNombre + "', dni = '" + nuevoDNI + "' WHERE id = " + id);
        con.commit();
        System.out.println("Registro actualizado correctamente.");
    }

    static void borrarRegistro(Connection con) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del cliente a borrar: ");
        int id = scanner.nextInt();

        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM Clientes WHERE id = " + id);
        con.commit();
        System.out.println("Registro borrado correctamente.");
    }
}
