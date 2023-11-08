import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio2 extends JFrame implements ActionListener {
    private JTextField nombreTextField, documentoTextField, fechaViajeTextField;
    private JCheckBox audifonosCheckBox, mantaCheckBox, revistasCheckBox;
    private JRadioButton primerPisoRadioButton, segundoPisoRadioButton;
    private JComboBox<String> origenComboBox, destinoComboBox;
    private JList<String> calidadServicioList;
    private JButton mostrarResumenButton,limpiarButton;
    private ButtonGroup pisoGroup;

    public Ejercicio2() {
        setTitle("Cristhian Bravo - Kevin Huacasi");
        setSize(568, 568);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(10, 2));
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreTextField = new JTextField();

        JLabel documentoLabel = new JLabel("Documento de Identidad:");
        documentoTextField = new JTextField();

        JLabel fechaViajeLabel = new JLabel("Fecha de Viaje:");
        fechaViajeTextField = new JTextField();

        JLabel nombreServiciosOpc = new JLabel("Servicios Opcionales");
        JPanel serviciosOpcionalesPanel = new JPanel();
        audifonosCheckBox = new JCheckBox("Audífonos");
        mantaCheckBox = new JCheckBox("Manta");
        revistasCheckBox = new JCheckBox("Revistas");
        serviciosOpcionalesPanel.add(audifonosCheckBox);
        serviciosOpcionalesPanel.add(mantaCheckBox);
        serviciosOpcionalesPanel.add(revistasCheckBox);

        JLabel pisoLabel = new JLabel("N° de piso: ");
        pisoGroup = new ButtonGroup();
        primerPisoRadioButton = new JRadioButton("1er Piso");
        segundoPisoRadioButton = new JRadioButton("2do Piso");
        pisoGroup.add(primerPisoRadioButton);
        pisoGroup.add(segundoPisoRadioButton);
        JPanel pisosPanel=new JPanel();
        pisosPanel.add(primerPisoRadioButton);
        pisosPanel.add(segundoPisoRadioButton);

        JLabel oriLabel = new JLabel("Origen:");
        String[] origenOptions = {"","Arequipa", "Lima", "Cuzco"};
        origenComboBox = new JComboBox<>(origenOptions);

        JLabel desLabel = new JLabel("Destino:");
        String[] destinoOptions = {"","Arequipa", "Lima", "Cuzco"};
        destinoComboBox = new JComboBox<>(destinoOptions);

        JLabel calidadLabel =new JLabel("Calidad del servicio: ");
        String[] calidadServicioOptions = {"Económico", "Standard", "VIP"};
        calidadServicioList = new JList<>(calidadServicioOptions);

        mostrarResumenButton = new JButton("Mostrar Resumen");
        mostrarResumenButton.addActionListener(this);

        limpiarButton = new JButton("LIMPIAR DATOS");
        limpiarButton.addActionListener(this);

        add(nombreLabel);
        add(nombreTextField);

        add(documentoLabel);
        add(documentoTextField);

        add(fechaViajeLabel);
        add(fechaViajeTextField);

        add(nombreServiciosOpc);
        add(serviciosOpcionalesPanel);

        add(pisoLabel);
        add(pisosPanel);

        add(oriLabel);
        add(origenComboBox);

        add(desLabel);
        add(destinoComboBox);

        add(calidadLabel);
        add(calidadServicioList);
        
        add(mostrarResumenButton);
        add(limpiarButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mostrarResumenButton) {
            
            String resumen = "Resumen de Datos:\n";
            resumen += "Nombre: " + nombreTextField.getText() + "\n";
            resumen += "Documento de Identidad: " + documentoTextField.getText() + "\n";
            resumen += "Fecha de Viaje: " + fechaViajeTextField.getText() + "\n";
            resumen += "Servicios Opcionales: ";
            if (audifonosCheckBox.isSelected()) resumen += "Audífonos ";
            if (mantaCheckBox.isSelected()) resumen += "Manta ";
            if (revistasCheckBox.isSelected()) resumen += "Revistas ";
            resumen += "\nPiso: ";
            if (primerPisoRadioButton.isSelected()) resumen += "1er Piso\n";
            if (segundoPisoRadioButton.isSelected()) resumen += "2do Piso\n";
            resumen += "Origen: " + origenComboBox.getSelectedItem() + "\n";
            resumen += "Destino: " + destinoComboBox.getSelectedItem() + "\n";
            resumen += "Calidad de Servicio: " + calidadServicioList.getSelectedValue();

            JOptionPane.showMessageDialog(this, resumen, "Resumen de Compra de Pasajes", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(e.getSource()==limpiarButton){
            nombreTextField.setText("");
            documentoTextField.setText("");
            fechaViajeTextField.setText("");
            audifonosCheckBox.setSelected(false);
            mantaCheckBox.setSelected(false);
            revistasCheckBox.setSelected(false);
            pisoGroup.clearSelection();
            origenComboBox.setSelectedIndex(0);
            destinoComboBox.setSelectedIndex(0);
            calidadServicioList.clearSelection();
            JOptionPane.showMessageDialog(this,"Se limpiaron los datos");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ejercicio2());
    }
}

