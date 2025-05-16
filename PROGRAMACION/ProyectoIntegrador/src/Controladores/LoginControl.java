package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import Modelo.Actividad;
import Modelo.AccesoBD;
import vistas.Alumno;
import vistas.LoginVista;
import vistas.Monitor;

public class LoginControl implements ActionListener {

	private AccesoBD modelo;

	private LoginVista vista;

	public LoginControl(LoginVista vista) {
		this.modelo = new AccesoBD();

		this.vista = vista;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String usuario = vista.getUsuario();
		String password = vista.getPassword();

		String resultado = modelo.validarUsuario(usuario, password);
		System.out.println("---> "+resultado);

		switch (resultado) {
		case "Usuario no existe":
			JOptionPane.showMessageDialog(vista, "El usuario introducido no existe en la base de datos.");
			break;

		case "Contraseña incorrecta":
			JOptionPane.showMessageDialog(vista, "Contraseña Incorrecta, porfavor vuelva a intentarlo.");

			break;

		case "Login exitoso":
			JOptionPane.showMessageDialog(vista, "Login exitoso!");
			vista.dispose();


			if (modelo.getTipo_usuario().equals("A")) {
				new Alumno().setVisible(true);
			} else {
				ArrayList<Actividad> actividades = modelo.consultaActividades();
				//pedir a la bbdd la lista de actividades
				//pasársela a Monitor
				new Monitor(actividades).setVisible(true);
			}

			break;

		default:
			JOptionPane.showMessageDialog(vista, "Error en la validación.");
		}
		
		modelo.cerrarConexion();

	}

}