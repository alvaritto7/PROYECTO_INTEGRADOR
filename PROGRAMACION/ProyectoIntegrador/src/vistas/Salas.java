package vistas;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Salas extends JPanel {
    private JTextField textSala;
    private JTextField textCapacidad, textNumeroSala2;

    public Salas() {
        setFont(new Font("Dialog", Font.BOLD, 12));

        textSala = new JTextField(10);
        textSala.setBackground(Color.WHITE);

        textCapacidad = new JTextField(10);
        textCapacidad.setBackground(Color.WHITE);

        textNumeroSala2 = new JTextField(10);
        textNumeroSala2.setBackground(Color.WHITE);

        JLabel lblNombreSala = new JLabel("Nombre:");

        JLabel lblCapacidad = new JLabel("Capacidad:");
        JLabel lblNumeroSala2 = new JLabel("Número de la Sala:");

        Font labelFont = new Font("Tahoma", Font.BOLD, 12);
        lblNombreSala.setFont(labelFont);
        lblCapacidad.setFont(labelFont);
        lblNumeroSala2.setFont(labelFont);

        JButton btnNuevo = new JButton("Nuevo");
        JButton btnGuardar = new JButton("Guardar");
        JButton btnBorrar = new JButton("Borrar");

        GroupLayout layout = new GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(40)
        			.addComponent(lblNombreSala)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(textSala, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(btnNuevo, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(btnBorrar, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(lblCapacidad)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(textCapacidad, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(lblNumeroSala2)
        					.addGap(10)
        					.addComponent(textNumeroSala2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(40)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNombreSala)
        				.addComponent(textSala, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblCapacidad)
        				.addComponent(textCapacidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblNumeroSala2)
        				.addComponent(textNumeroSala2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(286)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnNuevo)
        				.addComponent(btnGuardar)
        				.addComponent(btnBorrar))
        			.addGap(59))
        );

        setLayout(layout);
    }
}
