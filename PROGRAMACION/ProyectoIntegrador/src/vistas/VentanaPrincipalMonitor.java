/**
 * 
 */
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

public class VentanaPrincipalMonitor extends JFrame {
	
	
	public VentanaPrincipalMonitor()
	{
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("Mis Actividades (Monitor)");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 571, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 376, Short.MAX_VALUE)
		);
		getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnActividades = new JMenu("Actividades");
		menuBar.add(mnActividades);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Nueva Actividad");
		mnActividades.add(mntmNewMenuItem);
		
		JMenuItem mntmVerActividadesDisponibles = new JMenuItem("Ver todas las actividades");
		mnActividades.add(mntmVerActividadesDisponibles);
		
		JMenuItem mntmMisActividades = new JMenuItem("Mis actividades");
		mnActividades.add(mntmMisActividades);
		
		JMenu mnSalas = new JMenu("Salas");
		menuBar.add(mnSalas);
		
		JMenu mnNewMenu_2 = new JMenu("Datos Personales");
		menuBar.add(mnNewMenu_2);
		
		
		
		}
}

		
		

	
	


