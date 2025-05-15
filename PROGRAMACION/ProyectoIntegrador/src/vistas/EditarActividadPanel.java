package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditarActividadPanel extends Monitor {
    private JPanel panelEditar;

    public EditarActividadPanel() {
        super(); // hereda todo de Monitor

        panelContenido.removeAll();

        panelEditar = new JPanel();
        panelEditar.setLayout(new GridLayout(5, 2, 10, 10));

        panelEditar.add(new JLabel("Fecha:"));
        panelEditar.add(new JTextField());

        panelEditar.add(new JLabel("Hora:"));
        panelEditar.add(new JTextField());

        panelEditar.add(new JLabel("Actividad:"));
        panelEditar.add(new JTextField());

        panelEditar.add(new JLabel("Sala:"));
        panelEditar.add(new JTextField());

        JButton btnGuardar = new JButton("Guardar");
        JButton btnCancelar = new JButton("Cancelar");

        panelEditar.add(btnGuardar);
        panelEditar.add(btnCancelar);

        panelContenido.add(panelEditar, "editar");

        CardLayout cl = (CardLayout) panelContenido.getLayout();
        cl.show(panelContenido, "editar");

        // Acción para volver a la vista principal
        ActionListener volverAMisActividades = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra la ventana actual
                // Si quieres que reabra la ventana principal, hazlo aquí:
                Monitor principal = new Monitor();
                principal.setVisible(true);
            }
        };

        btnGuardar.addActionListener(volverAMisActividades);
        btnCancelar.addActionListener(volverAMisActividades);
    }
}
