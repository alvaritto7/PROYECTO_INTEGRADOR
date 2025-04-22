/**
 * 
 */
package vistas;

import javax.swing.*;

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
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Nueva actividad");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Ver todas las actividades");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Mis actividades");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JButton btnNewButton = new JButton("Salas");
		menuBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Datos Personales");
		menuBar.add(btnNewButton_1);
		
		
		
		
		
	}
	
	
	

}
