package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MisActividadesMonitor extends JPanel {
    private Monitor monitorPrincipal;

    public MisActividadesMonitor(Monitor monitor) {
        this.monitorPrincipal = monitor;

        JLabel lblFecha = new JLabel("Fecha");
        lblFecha.setFont(new Font("Tahoma", Font.BOLD, 12));
        JTextField textFecha = new JTextField(10);

        JLabel lblHora = new JLabel("Hora");
        lblHora.setFont(new Font("Tahoma", Font.BOLD, 12));
        JTextField textHora = new JTextField(10);

        JLabel lblActividad = new JLabel("Actividad");
        lblActividad.setFont(new Font("Tahoma", Font.BOLD, 12));
        JTextField textActividad = new JTextField(20);

        JLabel lblSala = new JLabel("Sala");
        lblSala.setFont(new Font("Tahoma", Font.BOLD, 12));
        JTextField textSala = new JTextField(10);

        JButton btnNuevo = new JButton("Nuevo");
        JButton btnBorrar = new JButton("Borrar");
        JButton btnEditar = new JButton("Editar");

        btnEditar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                monitorPrincipal.mostrarVista("editar", "Editar Actividad");
            }
        });

        // Layout (igual al original)
        GroupLayout layout = new GroupLayout(this);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(28, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(lblFecha)
                                .addComponent(textFecha, 118, 118, 118))
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(lblHora)
                                .addComponent(textHora, 118, 118, 118))
                            .addGap(6)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(lblActividad)
                                .addComponent(textActividad, 198, 198, 198))
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(lblSala)
                                .addComponent(textSala, 119, 119, 119))
                            .addGap(10))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnEditar)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnNuevo)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnBorrar)
                            .addGap(126))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFecha)
                        .addComponent(lblHora)
                        .addComponent(lblActividad)
                        .addComponent(lblSala))
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textHora, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textActividad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textSala, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNuevo)
                        .addComponent(btnBorrar)
                        .addComponent(btnEditar))
                    .addGap(23))
        );

        setLayout(layout);
    }
}
