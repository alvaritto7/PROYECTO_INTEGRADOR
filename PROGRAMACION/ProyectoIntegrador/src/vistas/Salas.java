package vistas;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Salas extends JFrame {
	private JTextField textSala;
	private JTextField textSala2;
	private JTextField textSala3;
	private JTextField textSala4;
	private JTextField textNumeroSala;
	private JTextField textNumeroSala2;
	private JTextField textNumeroSala3;
	private JTextField textNumeroSala4;
	
	
	public Salas()
	{
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("Salas");
		
		textSala = new JTextField();
		textSala.setBackground(new Color(255, 255, 255));
		textSala.setColumns(10);
		
		textSala2 = new JTextField();
		textSala2.setColumns(10);
		textSala2.setBackground(Color.WHITE);
		
		JLabel lblNombreSala = new JLabel("Nombre de la Sala:");
		lblNombreSala.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNombreSala2 = new JLabel("Nombre de la Sala:");
		lblNombreSala2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNombreSala3 = new JLabel("Nombre de la Sala:");
		lblNombreSala3.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textSala3 = new JTextField();
		textSala3.setColumns(10);
		textSala3.setBackground(Color.WHITE);
		
		textSala4 = new JTextField();
		textSala4.setColumns(10);
		textSala4.setBackground(Color.WHITE);
		
		textNumeroSala = new JTextField();
		textNumeroSala.setColumns(10);
		textNumeroSala.setBackground(Color.WHITE);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNuevo_2 = new JButton("Nuevo");
		
		JLabel lblNumeroSala = new JLabel("Numero de la Sala:");
		lblNumeroSala.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNombreSala4 = new JLabel("Nombre de la Sala:");
		lblNombreSala4.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNumeroSala2 = new JLabel("Numero de la Sala:");
		lblNumeroSala2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNumeroSala3 = new JLabel("Numero de la Sala:");
		lblNumeroSala3.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNumeroSala4 = new JLabel("Numero de la Sala:");
		lblNumeroSala4.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textNumeroSala2 = new JTextField();
		textNumeroSala2.setColumns(10);
		textNumeroSala2.setBackground(Color.WHITE);
		
		textNumeroSala3 = new JTextField();
		textNumeroSala3.setColumns(10);
		textNumeroSala3.setBackground(Color.WHITE);
		
		textNumeroSala4 = new JTextField();
		textNumeroSala4.setColumns(10);
		textNumeroSala4.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(59)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNombreSala4, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lblNombreSala3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNombreSala2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNombreSala, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textSala4)
								.addComponent(textSala3)
								.addComponent(textSala2)
								.addComponent(textSala, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNumeroSala4, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textNumeroSala4, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNumeroSala3, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textNumeroSala3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNumeroSala2, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNumeroSala, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textNumeroSala, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
										.addComponent(textNumeroSala2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))))
							.addGap(6))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNuevo_2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnBorrar, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(78)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textSala, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombreSala)
						.addComponent(lblNumeroSala, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textNumeroSala, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textSala2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombreSala2)
						.addComponent(lblNumeroSala2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textNumeroSala2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textSala3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombreSala3)
						.addComponent(lblNumeroSala3, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textNumeroSala3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textSala4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombreSala4, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumeroSala4, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textNumeroSala4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBorrar)
						.addComponent(btnNuevo_2)
						.addComponent(btnGuardar))
					.addGap(21))
		);
		getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnActividades = new JMenu("Actividades");
		menuBar.add(mnActividades);
		
		JMenu mnSalas = new JMenu("Salas");
		menuBar.add(mnSalas);
		
		JMenu mnNewMenu_2 = new JMenu("Datos Personales");
		menuBar.add(mnNewMenu_2);
		
		
		
		}
}

