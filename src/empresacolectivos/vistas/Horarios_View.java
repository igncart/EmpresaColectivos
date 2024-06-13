/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package empresacolectivos.vistas;

import empresacolectivos.Entidades.Horario;
import empresacolectivos.Entidades.Ruta;
import empresacolectivos.accesoADatos.RutaData;
import empresacolectivos.accesoADatos.HorarioData;
import java.util.List;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Horarios_View extends javax.swing.JInternalFrame {

    private RutaData rutaData;
    private HorarioData horarioData;
    
    private void cargarHorarios() {
        jCBuscarHorario.removeAllItems();
        for (int i = 0; i < 24; i++) {
            String hora = String.format("%02d:00", i);
            jCBuscarHorario.addItem(hora);
        }
    }

    public Horarios_View() {
        initComponents();
        rutaData = new RutaData();
    horarioData = new HorarioData();
    cargarHorariosFijos();
    mostrarHorariosEnTabla(horarioData.listarHorarios());
    cargarHorarios();
    cargarComboBoxRutas();
    cargarComboBusquedaRutas();
    }

    private void cargarComboBoxRutas() {
    List <Ruta> rutas = rutaData.listarRutas();
    jCRuta.removeAllItems();
    for (Ruta ruta : rutas) {
        jCRuta.addItem(ruta);
    }
}
    
    private void cargarComboBusquedaRutas() {
    List<Ruta> rutas = rutaData.listarRutas();
    jCBuscarRuta.removeAllItems();
    for (Ruta ruta : rutas) {
        jCBuscarRuta.addItem(ruta); 
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMostrarRutasYHorarios = new javax.swing.JTable();
        jBAñadir = new javax.swing.JButton();
        jBBuscarHorario = new javax.swing.JButton();
        jLHoraRuta = new javax.swing.JLabel();
        jCRuta = new javax.swing.JComboBox();
        jLHasta = new javax.swing.JLabel();
        jLDesde = new javax.swing.JLabel();
        jCHoraInicio = new javax.swing.JComboBox<>();
        jCHoraFinal = new javax.swing.JComboBox<>();
        jLBuscarHorario = new javax.swing.JLabel();
        jCBuscarHorario = new javax.swing.JComboBox();
        jLBuscarRuta = new javax.swing.JLabel();
        jCBuscarRuta = new javax.swing.JComboBox();
        jBBuscarRuta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setResizable(true);

        jTMostrarRutasYHorarios.setBackground(new java.awt.Color(255, 255, 204));
        jTMostrarRutasYHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTMostrarRutasYHorarios);

        jBAñadir.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBAñadir.setText("Añadir");
        jBAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAñadirActionPerformed(evt);
            }
        });

        jBBuscarHorario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBBuscarHorario.setText("Buscar");
        jBBuscarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarHorarioActionPerformed(evt);
            }
        });

        jLHoraRuta.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLHoraRuta.setText("Añada un horario de ruta:");

        jCRuta.setBorder(null);

        jLHasta.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLHasta.setText("Hasta");

        jLDesde.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLDesde.setText("Desde");

        jCHoraInicio.setBorder(null);

        jCHoraFinal.setBorder(null);

        jLBuscarHorario.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLBuscarHorario.setText("Busqueda por HS. de salida");

        jCBuscarHorario.setBorder(null);

        jLBuscarRuta.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLBuscarRuta.setText("Busqueda por ruta");

        jCBuscarRuta.setBorder(null);

        jBBuscarRuta.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBBuscarRuta.setText("Buscar");
        jBBuscarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarRutaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBAñadir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBBuscarHorario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLHoraRuta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCRuta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLHasta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLDesde, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCHoraInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCHoraFinal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLBuscarHorario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCBuscarHorario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLBuscarRuta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCBuscarRuta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBBuscarRuta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLHoraRuta)
                                    .addComponent(jLBuscarRuta)
                                    .addComponent(jLBuscarHorario))
                                .addGap(5, 5, 5)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCBuscarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCBuscarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(244, 244, 244)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jBBuscarRuta)
                                            .addComponent(jBBuscarHorario)))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jCRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLDesde)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLHasta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jButton1)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLHasta)
                    .addComponent(jLDesde)
                    .addComponent(jCRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAñadir)
                    .addComponent(jCHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLHoraRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBuscarHorario)
                    .addComponent(jCBuscarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarHorario))
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBuscarRuta)
                    .addComponent(jCBuscarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarRuta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAñadirActionPerformed
        Ruta rutaSeleccionada = (Ruta) jCRuta.getSelectedItem();
        LocalTime horaInicio = LocalTime.parse((String) jCHoraInicio.getSelectedItem());
        LocalTime horaFinal = LocalTime.parse((String) jCHoraFinal.getSelectedItem());

        if (horaInicio.equals(horaFinal)) {
            JOptionPane.showMessageDialog(this, "Nosotros no ofrecemos servicio de teletransporte. El horario de salida y llegada no pueden ser iguales.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Horario horario = new Horario(rutaSeleccionada, horaInicio, horaFinal, true);
        horarioData.registrarHorario(horario);
        mostrarHorariosEnTabla(horarioData.listarHorarios());
    }//GEN-LAST:event_jBAñadirActionPerformed

    private void jBBuscarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarHorarioActionPerformed
        String horaSeleccionada = (String) jCBuscarHorario.getSelectedItem();
        Horario horarioEncontrado = horarioData.buscarHorarioPorSalida(LocalTime.parse(horaSeleccionada));
        if (horarioEncontrado != null) {
            JOptionPane.showMessageDialog(this, "El horario de salida existe.");
        } else {
        }
    }//GEN-LAST:event_jBBuscarHorarioActionPerformed

    private void jBBuscarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarRutaActionPerformed
        Ruta rutaSeleccionada = (Ruta) jCBuscarRuta.getSelectedItem();
        Horario horarioEncontrado = horarioData.buscarHorarioPorRuta(rutaSeleccionada);
        if (horarioEncontrado != null) {
            JOptionPane.showMessageDialog(this, "La ruta " + rutaSeleccionada + " tiene los siguientes horarios: \n"
                + horarioEncontrado.getHora_Salida() + " - " + horarioEncontrado.getHora_Llegada());
        } else {
            JOptionPane.showMessageDialog(this, "La ruta " + rutaSeleccionada + " no tiene horarios asociados.");
        }
    }//GEN-LAST:event_jBBuscarRutaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

        private void mostrarHorariosEnTabla(List<Horario> horarios) {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Ruta");
    model.addColumn("Hora de salida");
    model.addColumn("Hora de llegada");

    for (Horario horario : horarios) {
        Object[] row = {
            horario.getRuta().getOrigen() + " - " + horario.getRuta().getDestino(),
            horario.getHora_Salida(),
            horario.getHora_Llegada()
        };
        model.addRow(row);
    }

    jTMostrarRutasYHorarios.setModel(model);
}
    
    private void cargarHorariosFijos() {
       for (int i = 0; i < 24; i++) {
        String hora = String.format("%02d:00", i);
        jCHoraInicio.addItem(hora);
        jCHoraFinal.addItem(hora);
       }
    }
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAñadir;
    private javax.swing.JButton jBBuscarHorario;
    private javax.swing.JButton jBBuscarRuta;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jCBuscarHorario;
    private javax.swing.JComboBox jCBuscarRuta;
    private javax.swing.JComboBox<String> jCHoraFinal;
    private javax.swing.JComboBox<String> jCHoraInicio;
    private javax.swing.JComboBox jCRuta;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLBuscarHorario;
    private javax.swing.JLabel jLBuscarRuta;
    private javax.swing.JLabel jLDesde;
    private javax.swing.JLabel jLHasta;
    private javax.swing.JLabel jLHoraRuta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTMostrarRutasYHorarios;
    // End of variables declaration//GEN-END:variables
}
