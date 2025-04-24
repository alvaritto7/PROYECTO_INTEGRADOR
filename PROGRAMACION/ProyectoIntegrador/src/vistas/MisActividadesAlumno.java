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
        JRadioButton rdbtnNewRadioButton = new JRadioButton("");  // Botón de selección
        JScrollBar scrollBar = new JScrollBar(); // Scroll lateral

        // Botón para inscribirse en la actividad
        JButton btnInscribirse = new JButton("Inscribirse");
        btnInscribirse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        // Layout del contenido usando GroupLayout
        //TODO comentar
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
                            .addGap(48)
                            .addComponent(list, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.RELATED)))
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addComponent(textFecha, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFecha, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                            .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                .addGroup(groupLayout.createSequentialGroup()
                                    .addComponent(lblHora, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                                    .addGap(10)
                                    .addComponent(lblActividad, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                                    .addGap(101))
                                .addGroup(groupLayout.createSequentialGroup()
                                    .addComponent(textHora, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(ComponentPlacement.RELATED)
                                    .addComponent(textField, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(ComponentPlacement.RELATED)))
                            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSala, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnInscribirse)))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(75)
                            .addComponent(list_1, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)))
                    .addGap(39)
                    .addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(32))
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(30)
                    .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(lblHora, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblActividad, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSala, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFecha, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
                            .addGap(18)
                            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textHora, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addComponent(rdbtnNewRadioButton))
                    .addGap(41)
                    .addComponent(list_1, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
                    .addGap(11)
                    .addComponent(list, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                    .addComponent(btnInscribirse)
                    .addGap(50))
                .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                    .addContainerGap(58, Short.MAX_VALUE)
                    .addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
                    .addGap(82))
        );
        getContentPane().setLayout(groupLayout); // Establece el layout a la ventana

        // Menú superior
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
    
    
   //TODO comprobar si es por la version o xque está mal
    public void hacerVisible() {
    	
    	setVisible(true);
    }
}