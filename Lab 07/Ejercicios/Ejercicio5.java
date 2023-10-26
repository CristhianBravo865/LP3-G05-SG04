package Ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero = -78;
        
        assert (numero > 0) : "El número no es positivo";
        
        System.out.println("El número es positivo: " + numero);
    }
}
-----------------------------------------------------------------------
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmpresaTransporte extends JFrame implements ActionListener {
    private JLabel lblNombre, lblDocumento, lblFecha, lblOrigen, lblDestino, lblServicio;
    private JTextField txtNombre, txtDocumento, txtFecha;
    private JComboBox<String> comboOrigen, comboDestino, comboServicio;
    private JRadioButton radio1erPiso, radio2doPiso;
    private JCheckBox checkAudifonos, checkManta, checkRevistas;
    private JButton btnResumen, btnReiniciar;

    public EmpresaTransporte() {
        super("Compra de Pasajes");

        // Crear componentes
        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(20);

        lblDocumento = new JLabel("Documento de Identidad:");
        txtDocumento = new JTextField(10);

        lblFecha = new JLabel("Fecha de Viaje (dd/mm/aaaa):");
        txtFecha = new JTextField(10);

        lblOrigen = new JLabel("Origen:");
        comboOrigen = new JComboBox<>(new String[]{"Lima", "Arequipa", "Cusco"});

        lblDestino = new JLabel("Destino:");
        comboDestino = new JComboBox<>(new String[]{"Lima", "Arequipa", "Cusco"});

        lblServicio = new JLabel("Calidad de Servicio:");
        comboServicio = new JComboBox<>(new String[]{"Económico", "Standard", "VIP"});

        radio1erPiso = new JRadioButton("1er Piso");
        radio2doPiso = new JRadioButton("2do Piso");
        ButtonGroup grupoPisos = new ButtonGroup();
        grupoPisos.add(radio1erPiso);
        grupoPisos.add(radio2doPiso);

        checkAudifonos = new JCheckBox("Audífonos");
        checkManta = new JCheckBox("Manta");
        checkRevistas = new JCheckBox("Revistas");

        btnResumen = new JButton("Mostrar Resumen");
        btnReiniciar = new JButton("Reiniciar");

        // Agregar componentes al panel
        JPanel panel = new JPanel(new GridLayout(0, 2));
        panel.add(lblNombre);
        panel.add(txtNombre);
        panel.add(lblDocumento);
        panel.add(txtDocumento);
        panel.add(lblFecha);
        panel.add(txtFecha);
        panel.add(lblOrigen);
        panel.add(comboOrigen);
        panel.add(lblDestino);
        panel.add(comboDestino);
        panel.add(lblServicio);
        panel.add(comboServicio);
        panel.add(radio1erPiso);
        panel.add(radio2doPiso);
        panel.add(checkAudifonos);
        panel.add(checkManta);
        panel.add(checkRevistas);

        // Agregar botones al panel
        JPanel panelBotones = new JPanel();
        panelBotones.add(btnResumen);
        panelBotones.add(btnReiniciar);

        // Agregar paneles al frame
        add(panel, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        // Registrar eventos de botones
        btnResumen.addActionListener(this);
        btnReiniciar.addActionListener(this);

        // Configurar el frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        EmpresaTransporte app = new EmpresaTransporte();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnResumen) {
            // Mostrar resumen en un cuadro de diálogo
            String resumen = "Resumen de la Compra:\n\n";
            resumen += "Nombre: " + txtNombre.getText() + "\n";
            resumen += "Documento de Identidad: " + txtDocumento.getText() + "\n";
            resumen += "Fecha de Viaje: " + txtFecha.getText() + "\n";
            resumen += "Origen: " + comboOrigen.getSelectedItem() + "\n";
            resumen += "Destino: " + comboDestino.getSelectedItem() + "\n";
            resumen += "Calidad de Servicio: " + comboServicio.getSelectedItem() + "\n";

            if (radio1erPiso.isSelected()) {
                resumen += "Piso: 1er Piso\n";
            } else if (radio2doPiso.isSelected()) {
                resumen += "Piso: 2do Piso\n";
            }

            if (checkAudifonos.isSelected()) {
                resumen += "- Audífonos\n";
            }

            if (checkManta.isSelected()) {
                resumen += "- Manta\n";
            }

            if (checkRevistas.isSelected()) {
                resumen += "- Revistas\n";
            }

            JOptionPane.showMessageDialog(this, resumen);
            
        } else if (e.getSource() == btnReiniciar) {
            // Reiniciar todos los campos
            txtNombre.setText("");
            txtDocumento.setText("");
            txtFecha.setText("");
            comboOrigen.setSelectedIndex(0);
            comboDestino.setSelectedIndex(0);
            comboServicio.setSelectedIndex(0);
            radio1erPiso.setSelected(true);
            checkAudifonos.setSelected(false);
            checkManta.setSelected(false);
            checkRevistas.setSelected(false);
            
            // Mostrar mensaje de confirmación
            JOptionPane.showMessageDialog(this, "Los campos han sido reiniciados.");
        }
    }
}
