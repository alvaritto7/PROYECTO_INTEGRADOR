package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class EditarActividadPanel extends JPanel {
    public EditarActividadPanel(ActionListener volverAMisActividades) {
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("Fecha:"));
        add(new JTextField());

        add(new JLabel("Hora:"));
        add(new JTextField());

        add(new JLabel("Actividad:"));
        add(new JTextField());

        add(new JLabel("Sala:"));
        add(new JTextField());

        JButton btnGuardar = new JButton("Guardar");
        JButton btnCancelar = new JButton("Cancelar");

        add(btnGuardar);
        add(btnCancelar);

        btnGuardar.addActionListener(volverAMisActividades);
        btnCancelar.addActionListener(volverAMisActividades);
    }
}