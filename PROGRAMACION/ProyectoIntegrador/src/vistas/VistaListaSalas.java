package vistas;

import Modelo.*;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class VistaListaSalas extends JPanel {
    private JTable table;
    private JScrollPane scrollPane;
    private JLabel lblTitulo;
    private JButton btnNuevo;
    private JButton btnBorrar;

    public VistaListaSalas() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{37, 48, 242, 188, 105, 16, 0};
        gridBagLayout.rowHeights = new int[]{85,0, 100, 101, 0, 0, 29, 0, 0, 0};
        gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        setLayout(gridBagLayout);
                                        
                                                lblTitulo = new JLabel("Lista de Salas");
                                                lblTitulo.setMinimumSize(new Dimension(196, 60));
                                                lblTitulo.setMaximumSize(new Dimension(196, 60));
                                                lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
                                                GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
                                                gbc_lblTitulo.gridwidth = 2;
                                                gbc_lblTitulo.fill = GridBagConstraints.BOTH;
                                                gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
                                                gbc_lblTitulo.gridx = 2;
                                                gbc_lblTitulo.gridy = 0;
                                                add(lblTitulo, gbc_lblTitulo);
                                
                                        table = new JTable();
                                        scrollPane = new JScrollPane(table); 
                                        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
                                        gbc_scrollPane.gridheight = 5;
                                        gbc_scrollPane.gridwidth = 3;
                                        gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
                                        gbc_scrollPane.fill = GridBagConstraints.BOTH;
                                        gbc_scrollPane.gridx = 2;
                                        gbc_scrollPane.gridy = 1;
                                        add(scrollPane, gbc_scrollPane); 
                                
                                btnNuevo = new JButton("Nuevo");
                                GridBagConstraints gbc_btnNuevo = new GridBagConstraints();
                                gbc_btnNuevo.anchor = GridBagConstraints.EAST;
                                gbc_btnNuevo.insets = new Insets(0, 0, 0, 5);
                                gbc_btnNuevo.gridx = 3;
                                gbc_btnNuevo.gridy = 8;
                                add(btnNuevo, gbc_btnNuevo);
                                
                                btnBorrar = new JButton("Borrar");
                                GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
                                gbc_btnBorrar.insets = new Insets(0, 0, 0, 5);
                                gbc_btnBorrar.gridx = 4;
                                gbc_btnBorrar.gridy = 8;
                                add(btnBorrar, gbc_btnBorrar);

                                String[] columnas = {"ID", "Codigo Sala", "Tipo Sala", "Capacidad", "Utilizacion", "Ocupacion"};
                                DefaultTableModel modelo = new DefaultTableModel(columnas, 0);                    
                                table.setModel(modelo); 
                                
                                Object[][] salas = {
                                        {"1", "PPA1", "PABELLON", "40", "91.30", "29.88"},
                                        {"2", "PPA2", "PABELLON", "40", "36.12", "27.46"},
                                        {"3", "PPA3", "PABELLON", "40", "2.92", "63.19"},
                                        {"4", "PPIS", "PISCINA", "40", "2.06", "59.66"},
                                        {"5", "PPB1", "PISTAS DE BALONCESTO", "10", "2.27", "96.13"},
                                        {"6", "PPB2", "PISTAS DE BALONCESTO", "10", "0.18", "94.03"},
                                        {"7", "PPE1", "PISTAS ATLETISMO", "40", "2.11", "53.28"},
                                        {"8", "PPE2", "PISTAS ATLETISMO", "40", "0.76", "54.76"}
                                    };


                                for (Object[] fila :salas) {
                                    modelo.addRow(fila);
                                }
                         					
    }
    
    



 
}
