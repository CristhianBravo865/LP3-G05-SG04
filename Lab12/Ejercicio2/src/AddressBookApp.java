import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class AddressBookApp extends JFrame implements ActionListener {
    private JTextField nombreField, apellidoField, emailField, telefonoField;
    private JButton addButton, showButton, nextButton, prevButton;
    private JLabel numberoftotalLabel, totalLabel;

    private Connection connection;
    private final String url = "jdbc:mysql://localhost:3306/Ejercicio2";
    private final String username = "root";
    private final String password = "administrator";
    private ResultSet resultSet;
    private int totalRecords = 0;

    public AddressBookApp() {
        super("Agenda");
        setLayout(null);
        prevButton = new JButton("Anterior");
        prevButton.setBounds(20, 20, 100, 25);
        prevButton.addActionListener(this);
        add(prevButton);

        numberoftotalLabel = new JLabel("N°: ");
        numberoftotalLabel.setBounds(130, 20, 100, 25);
        add(numberoftotalLabel);

        totalLabel = new JLabel("Total ");
        totalLabel.setBounds(160, 20, 100, 25);
        add(totalLabel);

        nextButton = new JButton("Siguiente");
        nextButton.setBounds(230, 20, 100, 25);
        nextButton.addActionListener(this);
        add(nextButton);

        

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreLabel.setBounds(20, 50, 80, 25);
        add(nombreLabel);

        nombreField = new JTextField();
        nombreField.setBounds(100, 50, 150, 25);
        add(nombreField);

        JLabel apellidoLabel = new JLabel("Apellido:");
        apellidoLabel.setBounds(20, 80, 80, 25);
        add(apellidoLabel);

        apellidoField = new JTextField();
        apellidoField.setBounds(100, 80, 150, 25);
        add(apellidoField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20, 110, 80, 25);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(100, 110, 150, 25);
        add(emailField);

        JLabel telefonoLabel = new JLabel("Teléfono:");
        telefonoLabel.setBounds(20, 140, 80, 25);
        add(telefonoLabel);

        telefonoField = new JTextField();
        telefonoField.setBounds(100, 140, 150, 25);
        add(telefonoField);

        JLabel buscarApellidoLabel = new JLabel("Buscar por Apellido:");
        buscarApellidoLabel.setBounds(20, 170, 150, 25);
        add(buscarApellidoLabel);

        JTextField buscarApellidoField = new JTextField();
        buscarApellidoField.setBounds(150, 170, 150, 25);
        add(buscarApellidoField);

        JButton buscarButton = new JButton("Buscar");
        buscarButton.setBounds(300, 170, 80, 25);
        buscarButton.addActionListener(e -> buscarPorApellido(buscarApellidoField.getText()));
        add(buscarButton);

        addButton = new JButton("Agregar");
        addButton.setBounds(20, 200, 90, 25);
        addButton.addActionListener(this);
        add(addButton);

        showButton = new JButton("Mostrar");
        showButton.setBounds(120, 200, 90, 25);
        showButton.addActionListener(this);
        add(showButton);

        try {
            connection = DriverManager.getConnection(url, username, password);
            calcularTotalRegistros();
            if (totalRecords > 0) {
                mostrarPrimerRegistro();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        setSize(400, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            agregarDatos();
        } else if (e.getSource() == showButton) {
            mostrarDatos();
        } else if (e.getSource() == prevButton) {
            retrocederRegistro();
        } else if (e.getSource() == nextButton) {
            avanzarRegistro();
        }
    }

    private void agregarDatos() {
        String nombre = nombreField.getText();
        String apellido = apellidoField.getText();
        String email = emailField.getText();
        String telefono = telefonoField.getText();

        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO Agenda (Nombre, Apellido, Email, Telefono) VALUES (?, ?, ?, ?)");
            statement.setString(1, nombre);
            statement.setString(2, apellido);
            statement.setString(3, email);
            statement.setString(4, telefono);
            statement.executeUpdate();
            calcularTotalRegistros();
            JOptionPane.showMessageDialog(this, "Datos agregados correctamente", "Información",
                    JOptionPane.INFORMATION_MESSAGE);
            mostrarPrimerRegistro();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void mostrarDatos() {
        StringBuilder result = new StringBuilder();
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Agenda");
            while (resultSet.next()) {
                result.append("Nombre: ").append(resultSet.getString("Nombre")).append(", Apellido: ")
                        .append(resultSet.getString("Apellido"))
                        .append(", Email: ").append(resultSet.getString("Email")).append(", Teléfono: ")
                        .append(resultSet.getString("Telefono"))
                        .append("\n");
            }
            if (result.length() > 0) {
                JOptionPane.showMessageDialog(this, result.toString(), "Registros en la base de datos",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No hay registros en la base de datos", "Información",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void avanzarRegistro() {
        try {
            if (resultSet != null && resultSet.next()) {
                mostrarRegistroActual();
            } else {
                int numeroRegistroFuera = calcularTotalRegistros()+1;
                resultSet.afterLast();
                limpiarCampos();
                JOptionPane.showMessageDialog(this, "Limite de la agenda, \n Puedes agregar un nuevo contacto aqui o retroceder\n", "Información",
                        JOptionPane.INFORMATION_MESSAGE);
                
                numberoftotalLabel.setText("N°: " + numeroRegistroFuera);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void retrocederRegistro() {
        try {
            if (resultSet != null && resultSet.previous()) {
                mostrarRegistroActual();
            } else {
                resultSet.last(); 
                mostrarRegistroActual();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void mostrarRegistroActual() {
        try {
            if (resultSet != null && resultSet.isBeforeFirst()) {
                resultSet.next();
            }
    
            if (resultSet != null) {
                nombreField.setText(resultSet.getString("Nombre"));
                apellidoField.setText(resultSet.getString("Apellido"));
                emailField.setText(resultSet.getString("Email"));
                telefonoField.setText(resultSet.getString("Telefono"));
                
                int numeroRegistroActual = resultSet.getRow();
                numberoftotalLabel.setText("N°: " + numeroRegistroActual);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void limpiarCampos() {
        nombreField.setText("");
        apellidoField.setText("");
        emailField.setText("");
        telefonoField.setText("");
    }

    private int calcularTotalRegistros() {
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT COUNT(*) AS total FROM Agenda");
            if (rs.next()) {
                totalRecords = rs.getInt("total");
                totalLabel.setText("Total: " + totalRecords);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return totalRecords;
    }
    

    private void mostrarPrimerRegistro() {
        try {
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery("SELECT * FROM Agenda");
            resultSet.first();
            mostrarRegistroActual();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void buscarPorApellido(String apellidoABuscar) {
        try {
            StringBuilder result = new StringBuilder();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Agenda WHERE Apellido = ?");
            statement.setString(1, apellidoABuscar);
            ResultSet resultApe = statement.executeQuery();
            while (resultApe.next()) {
                result.append("Nombre: ").append(resultApe.getString("Nombre")).append(", Apellido: ")
                        .append(resultApe.getString("Apellido"))
                        .append(", Email: ").append(resultApe.getString("Email")).append(", Teléfono: ")
                        .append(resultApe.getString("Telefono"))
                        .append("\n");
            }
            if (result.length() > 0) {
                JOptionPane.showMessageDialog(this, result.toString(), "Registros con el apellido en la base de datos",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontraron registros con ese apellido", "Información",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AddressBookApp::new);
    }
}
