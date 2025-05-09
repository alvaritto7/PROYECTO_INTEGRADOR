package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MisActividadesAlumno extends JPanel {

    private JTextField textFecha;
    private JTextField textHora;
    private JTextField textActividad;
    private JTextField textSala;
    private JCheckBox chkFiltrarCapacidad;

    public MisActividadesAlumno() {
        setLayout(new BorderLayout());

        JPanel panelCampos = new JPanel();
        panelCampos.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        JLabel lblFecha = new JLabel("Fecha");
        JLabel lblHora = new JLabel("Hora");
        JLabel lblActividad = new JLabel("Actividad");
        JLabel lblSala = new JLabel("Sala");

        Font labelFont = new Font("Tahoma", Font.BOLD, 12);
        lblFecha.setFont(labelFont);
        lblHora.setFont(labelFont);
        lblActividad.setFont(labelFont);
        lblSala.setFont(labelFont);

        textFecha = new JTextField(10);
        textHora = new JTextField(10);
        textActividad = new JTextField(10);
        textSala = new JTextField(10);

        panelCampos.add(lblFecha);
        panelCampos.add(textFecha);
        panelCampos.add(lblHora);
        panelCampos.add(textHora);
        panelCampos.add(lblActividad);
        panelCampos.add(textActividad);
        panelCampos.add(lblSala);
        panelCampos.add(textSala);

        chkFiltrarCapacidad = new JCheckBox("Filtrar actividades disponibles");
        JPanel panelInferior = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btnInscribirse = new JButton("Inscribirse");
        btnInscribirse.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Inscripción realizada.");
        });

        panelInferior.add(chkFiltrarCapacidad);
        panelInferior.add(btnInscribirse);

        add(panelCampos, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Actividades Disponibles (Alumno)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 200);
        frame.setLocationRelativeTo(null);
        frame.add(new MisActividadesAlumno());
        frame.setVisible(true);
    }
}
