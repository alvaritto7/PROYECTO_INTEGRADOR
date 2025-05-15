package vistas;

import javax.swing.*;
import java.awt.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
        JButton btnBorrar = new JButton("Borrar");
        
        JButton btnNewButton = new JButton("Editar");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });

        // Layout general
        GroupLayout layout = new GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.CENTER)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(28, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
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
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(btnNewButton)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnNuevo)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(btnBorrar)
        					.addGap(126))))
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
        			.addPreferredGap(ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnNuevo)
        				.addComponent(btnBorrar)
        				.addComponent(btnNewButton))
        			.addGap(23))
        );
        setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EditarActividadPanel editarVentana = new EditarActividadPanel();
                editarVentana.setVisible(true);
    }
    
    
});
    }
}

