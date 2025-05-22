package vistas;

import javax.swing.*;

import Controladores.VolverListener;
import Modelo.Actividad;

import java.awt.*;
import java.awt.event.ActionListener;

public class EditarActividadPanel extends JPanel {
	
	private Monitor monitor;
	//TODO incluir AQUI los JTextField con nombre como atributos
	//para luego poder hacer getters y setters de la información que hay dentro.
	JTextField nombre;
	JTextField fecha;
	JTextField hora;
	JTextField sala;
	
	
    public EditarActividadPanel(Monitor monitor, Actividad actividad) {
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("Actividad:"));
        nombre = new JTextField(actividad.getNombre());
        add(nombre);
        
        add(new JLabel("Fecha:"));
        fecha = new JTextField(actividad.getFecha().toString());
        add(fecha);

        add(new JLabel("Hora:"));
        hora = new JTextField(actividad.getHora().toString());
        add(hora);

        
        
        add(new JLabel("Sala:"));
        sala = new JTextField(actividad.getIdSala());
        add(sala);

        JButton btnGuardar = new JButton("Guardar");
        JButton btnCancelar = new JButton("Cancelar");

        add(btnGuardar);
        add(btnCancelar);

        VolverListener escucharVolver = new VolverListener(monitor);
        //TODO este de guardar no puede tener el mismo Listener (de momento ok pero hay que cambiarlo)
        btnGuardar.addActionListener(escucharVolver);
        btnCancelar.addActionListener(escucharVolver);
    }
}
