import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Ejercicio1 extends JFrame {
    private JTextField queryField, filterField;
    private JButton submitButton, filterButton;
    private JLabel filterLabel;
    private JTable table;
    private DefaultTableModel model;
    private Connection connection;
    private boolean filterActive = false;
    //ESTATIC CON EL WHERE
    private String filterValue = "";
    public Ejercicio1() {
        super("SQL Query App");
        setLayout(new BorderLayout());

        // Panel Superior
        JPanel upperPanel = new JPanel(new GridLayout(1, 2));
        queryField = new JTextField();
        submitButton = new JButton("Submit Query");
        submitButton.addActionListener(new SubmitListener());
        upperPanel.add(queryField);
        upperPanel.add(submitButton);
        add(upperPanel, BorderLayout.NORTH);

        // Tabla del centro
        model = new DefaultTableModel();
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Filtro abajo
        JPanel bottomPanel = new JPanel(new GridLayout(1, 3));
        filterLabel = new JLabel("Filter: ");
        filterField = new JTextField();
        filterButton = new JButton("Apply Filter");
        filterButton.addActionListener(new FilterListener());
        bottomPanel.add(filterLabel);
        bottomPanel.add(filterField);
        bottomPanel.add(filterButton);
        add(bottomPanel, BorderLayout.SOUTH);

        // Conceccionb
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/ejercicio1", "root", "administrator");
            loadTableData();
        } catch (Exception e) {
            e.printStackTrace();
        }

        setSize(1000, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void loadTableData() {
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM autores";
            if (filterActive) {
                query += " WHERE FIRSTNAME LIKE '%" + filterValue + "%' OR LASTNAME LIKE '%" + filterValue + "%' OR AUTHORID LIKE '%" + filterValue+ "%'";
            }
            ResultSet resultSet = statement.executeQuery(query);
            ResultSetMetaData metaData = resultSet.getMetaData();

            model.setRowCount(0);
            model.setColumnCount(0);

            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(metaData.getColumnName(i));
            }

            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = resultSet.getObject(i + 1);
                }
                model.addRow(rowData);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private class SubmitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            String query = queryField.getText();
            if (filterActive==true) {
                query += " WHERE FIRSTNAME LIKE '%" + filterValue + "%' OR LASTNAME LIKE '%" + filterValue + "%' OR AUTHORID LIKE '%" + filterValue+ "%'";
            }
            try {
                Statement statement = connection.createStatement();
                statement.executeUpdate(query);
                loadTableData();
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private class FilterListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            filterValue = filterField.getText();
            if (filterValue==""){
                filterActive = false;
            }
            else{
                filterActive = true;
            }
            loadTableData();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ejercicio1::new);
    }
}
