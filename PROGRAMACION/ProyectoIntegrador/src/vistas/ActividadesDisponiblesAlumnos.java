package vistas;

import javax.swing.*;
import java.awt.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ActividadesDisponiblesAlumnos extends JPanel {
    private JTextField textFecha;
    private JTextField textHora;
    private JTextField textActividad;
    private JTextField textSala;

    public ActividadesDisponiblesAlumnos() {
        textFecha = new JTextField(10);
        textHora = new JTextField(10);
        textActividad = new JTextField(10);
        textSala = new JTextField(10);

        JLabel lblFecha = new JLabel("Fecha");
        JLabel lblHora = new JLabel("Hora");
        JLabel lblActividad = new JLabel("Actividad");
        JLabel lblSala = new JLabel("Sala");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGap(20)
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(lblFecha)
                    .addComponent(textFecha))
                .addGap(20)
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(lblHora)
                    .addComponent(textHora))
                .addGap(20)
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(lblActividad)
                    .addComponent(textActividad))
                .addGap(20)
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(lblSala)
                    .addComponent(textSala))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGap(20)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(lblHora)
                    .addComponent(lblActividad)
                    .addComponent(lblSala))
                .addGap(10)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(textFecha)
                    .addComponent(textHora)
                    .addComponent(textActividad)
                    .addComponent(textSala))
        );
    }
}
