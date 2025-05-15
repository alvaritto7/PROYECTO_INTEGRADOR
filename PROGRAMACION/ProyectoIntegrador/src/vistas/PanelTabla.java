package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.table.DefaultTableModel;

public class PanelTabla extends JPanel {
    private JTable table;

    public PanelTabla() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.rowHeights = new int[]{0, 266};
      
        setLayout(gridBagLayout);

        // 1. Modelo de tabla con columnas
        String[] columnas = {"DNI", "Nombre", "Apellido", "Profesión"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        // 2. Datos ficticios
        Object[][] datos = {
            {"12345678A", "Ana", "García", "Ingeniera"},
            {"23456789B", "Luis", "Martínez", "Abogado"},
            {"34567890C", "María", "López", "Doctora"},
            {"45678901D", "Juan", "Pérez", "Arquitecto"},
            {"56789012E", "Laura", "Ruiz", "Diseñadora"}
        };
        

        
        
        
        

        // Añadir filas al modelo
        for (Object[] fila : datos) {
            modelo.addRow(fila);
        }
        
                // 3. Crear tabla y meterla en JScrollPane
                table = new JTable(modelo);
                JScrollPane scrollPane = new JScrollPane(table);
                
                        // 4. Añadir JScrollPane al layout
                        GridBagConstraints gbc_table = new GridBagConstraints();
                        gbc_table.insets = new Insets(0, 0, 0, 5);
                        gbc_table.fill = GridBagConstraints.BOTH;
                        gbc_table.gridx = 1;
                        gbc_table.gridy = 1;
                        gbc_table.gridwidth = 2; // para que ocupe más columnas si hace falta
                        gbc_table.weightx = 1.0;
                        gbc_table.weighty = 1.0;
                        add(scrollPane, gbc_table);
                        
                        JLabel lblNewLabel = new JLabel("New label");
                        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
                        gbc_lblNewLabel.gridx = 3;
                        gbc_lblNewLabel.gridy = 1;
                        add(lblNewLabel, gbc_lblNewLabel);
    }
}
