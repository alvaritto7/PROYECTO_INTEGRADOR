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

public class MisActividadesAlumno extends JFrame {

    
    private JTextField textFecha;
    private JTextField textHora;
    private JTextField textField; // Para actividad
    private JTextField textField_1;   // Para sala

    // Constructor de la ventana
    public MisActividadesAlumno() {
        // Establece fuente y título de la ventana
        setFont(new Font("Dialog", Font.BOLD, 12));
        setTitle("Actividades Disponibles (Alumno)");

        // Inicialización de campos de entrada
        textFecha = new JTextField();
        textFecha.setColumns(10); //define el numero de columnas

        textHora = new JTextField();
        textHora.setColumns(10);

        textField = new JTextField(); // Actividad
        textField.setColumns(10);

        textField_1 = new JTextField();     // Sala
        textField_1.setColumns(10);

        // Creación de etiquetas
        JLabel lblFecha = new JLabel("Fecha");
        lblFecha.setFont(new Font("Tahoma", Font.BOLD, 12));

        JLabel lblHora = new JLabel("Hora");
        lblHora.setFont(new Font("Tahoma", Font.BOLD, 12));

        JLabel lblActividad = new JLabel("Actividad");
        lblActividad.setFont(new Font("Tahoma", Font.BOLD, 12));

        JLabel lblSala = new JLabel("Sala");
        lblSala.setFont(new Font("Tahoma", Font.BOLD, 12));

        // Elementos de interfaz adicionales
        JList list = new JList();     // Lista vacía (sin uso por ahora)
        JList list_1 = new JList();   // Otra lista (para mostrar actividades)

        // Botón para inscribirse en la actividad
        JButton btnInscribirse = new JButton("Inscribirse");
        btnInscribirse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        JPanel panel = new JPanel();
    
    
   //TODO comprobar si es por la version o xque está mal
    public void hacerVisible() {
    	
    	setVisible(true);
    }
}