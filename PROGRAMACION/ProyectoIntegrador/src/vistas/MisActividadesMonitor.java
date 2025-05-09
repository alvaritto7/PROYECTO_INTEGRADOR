package vistas;

import javax.swing.*;
import java.awt.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class MisActividadesMonitor extends JPanel {
    private JTextField textFecha;
    private JTextField textHora;
    private JTextField textActividad;
    private JTextField textSala;

    public MisActividadesMonitor() {
        // Crear componentes
        JLabel lblFecha = new JLabel("Fecha");
        lblFecha.setFont(new Font("Tahoma", Font.BOLD, 12));
        textFecha = new JTextField(10);

        JLabel lblHora = new JLabel("Hora");
        lblHora.setFont(new Font("Tahoma", Font.BOLD, 12));
        textHora = new JTextField(10);

        JLabel lblActividad = new JLabel("Actividad");
        lblActividad.setFont(new Font("Tahoma", Font.BOLD, 12));
        textActividad = new JTextField(20);  // Más largo

        JLabel lblSala = new JLabel("Sala");
        lblSala.setFont(new Font("Tahoma", Font.BOLD, 12));
        textSala = new JTextField(10);

        JButton btnNuevo = new JButton("Nuevo");
        JButton btnGuardar = new JButton("Guardar");
        JButton btnBorrar = new JButton("Borrar");

        // Layout general
        GroupLayout layout = new GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.CENTER)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(10, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblFecha)
        						.addComponent(textFecha, 118, 118, 118))
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblHora)
        						.addComponent(textHora, 118, 118, 118))
        					.addGap(6)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblActividad)
        						.addComponent(textActividad, 198, 198, 198))
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblSala)
        						.addComponent(textSala, 119, 119, 119))
        					.addGap(10))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(btnNuevo)
        						.addGap(18)
        						.addComponent(btnGuardar))
        					.addGap(6)
        					.addComponent(btnBorrar)
        					.addGap(41))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblFecha)
        				.addComponent(lblHora)
        				.addComponent(lblActividad)
        				.addComponent(lblSala))
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(textFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(textHora, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(textActividad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(textSala, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnNuevo)
        				.addComponent(btnGuardar)
        				.addComponent(btnBorrar))
        			.addGap(23))
        );
        setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
    }
}
