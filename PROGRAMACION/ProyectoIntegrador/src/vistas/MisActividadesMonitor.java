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

public class MisActividadesMonitor extends JFrame {
    // Se declaran las variables para los campos de texto donde el usuario meterá información
    private JTextField textFecha;
    private JTextField textHora;
    private JTextField textField;
    private JTextField textField_1;
    
    // Constructor de la clase, donde se inicializa la interfaz gráfica
    public MisActividadesMonitor() {
        // se establece la fuente y tamaño de la fuente para el título de la ventana
        setFont(new Font("Dialog", Font.BOLD, 12));
        // sE define el título de la ventana
        setTitle("Mis actividades (Monitor)");
        
        // Inicializamos los campos de texto para la fecha, hora, actividad, y sala
        textFecha = new JTextField();
        textFecha.setColumns(10);//Numero de columnas
        
        // Se crea y configura la etiqueta para la fecha
        JLabel lblFecha = new JLabel("Fecha");
        lblFecha.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        // Se crea y configura la etiqueta para la hora
        JLabel lblHora = new JLabel("Hora");
        lblHora.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        // Inicializamos el campo de texto para la hora
        textHora = new JTextField();
        textHora.setColumns(10);
        
        // Se crea y configura la etiqueta para la actividad
        JLabel lblActividad = new JLabel("Actividad");
        lblActividad.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        // Inicializamos el campo de texto para la actividad
        textField = new JTextField();
        textField.setColumns(10);
        
        // Inicializamos el campo de texto para la sala
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        
        // Se crea y configura la etiqueta para las sala
        JLabel lblSala = new JLabel("Sala");
        lblSala.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        // Se crean los botones de la interfaz
        JButton btnNuevo = new JButton("Nuevo");
        JButton btnGuardar = new JButton("Guardar");
        JButton btnBorrar = new JButton("Borrar");

        // Se crea el GroupLayout para definir el layout de los componentes en la ventana
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
            // Definimos la alineación de los elementos en una fila horizontal
            groupLayout.createParallelGroup(Alignment.TRAILING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(24)
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        // Agrupamos las etiquetas de fecha y hora en la misma línea
                        .addGroup(groupLayout.createSequentialGroup()
                            .addComponent(lblFecha, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                            .addGap(18)
                            .addComponent(lblHora, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
                        // Agrupamos los campos de texto de fecha y hora en la misma línea
                        .addGroup(groupLayout.createSequentialGroup()
                            .addComponent(textFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(textHora, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        // Campo de texto y etiqueta de "Actividad"
                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblActividad, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        // Campo de texto y etiqueta de "Sala"
                        .addComponent(lblSala, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(151, Short.MAX_VALUE))
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap(312, Short.MAX_VALUE)
                    // Alineamos los botones en la parte inferior de la ventana
                    .addComponent(btnNuevo, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(btnBorrar, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                    .addGap(100))
        );

        // Definimos la posicion vertical de los componentes en la ventana
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(30)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        // Definimos la alineación de las etiquetas en la primera fila
                        .addComponent(lblFecha, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblHora, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblActividad, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSala, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
                    .addGap(18)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        // Definimos la alineación de los campos de texto en la segunda fila
                        .addComponent(textFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textHora, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                    // Definimos la alineación de los botones en la parte inferior
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(btnNuevo)
                        .addComponent(btnGuardar)
                        .addComponent(btnBorrar))
                    .addGap(25))
        );

        // Aplicamos el layout a la ventana
        getContentPane().setLayout(groupLayout);
        
        // Creamos la barra de menú
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        // Creamos el menú "Actividades" con opciones para crear, ver y gestionar actividades
        JMenu mnActividades = new JMenu("Actividades");
        menuBar.add(mnActividades);
        
        // Añadimos opciones al menú de actividades
        JMenuItem mntmNewMenuItem = new JMenuItem("Nueva Actividad");
        mnActividades.add(mntmNewMenuItem);
        
        JMenuItem mntmVerActividadesDisponibles = new JMenuItem("Ver todas las actividades");
        mnActividades.add(mntmVerActividadesDisponibles);
        
        JMenuItem mntmMisActividades = new JMenuItem("Mis actividades");
        mnActividades.add(mntmMisActividades);
        
        // Creamos el menú "Salas" (aunque no tiene opciones por el momento)
        JMenu mnSalas = new JMenu("Salas");
        menuBar.add(mnSalas);
        
        // Creamos el menú "Datos Personales" (aunque no tiene opciones por el momento)
        JMenu mnNewMenu_2 = new JMenu("Datos Personales");
        menuBar.add(mnNewMenu_2);
    }

    public void hacerVisible() {
    	setVisible(true);
    }
    
    
    
}