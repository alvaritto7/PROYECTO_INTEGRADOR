/**
 * 
 */
package vistas;

import javax.swing.*;
import java.awt.Color;

/**
 * 
 */
public class VentanaPrincipalMonitor extends JFrame {
	
	public VentanaPrincipalMonitor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		setLocationRelativeTo(null);  //Centra la ventana
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Actividades");
		mnNewMenu.setBackground(new Color(255, 255, 255));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Nueva actividad");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Ver todas las actividades");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Mis actividades");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JButton btnNewButton = new JButton("Salas");
		btnNewButton.setBackground(new Color(255, 255, 255));
		menuBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Datos Personales");
		menuBar.add(btnNewButton_1);
		
		
		
		
		
		
		
	}
	
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	
	

}
