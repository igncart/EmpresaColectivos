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

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 268, 456, 114));

        jBAñadir.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBAñadir.setText("Añadir");
        jBAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAñadirActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jBAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 99, 79, -1));

        jBBuscarHorario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBBuscarHorario.setText("Buscar");
        jBBuscarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarHorarioActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jBBuscarHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 165, -1, -1));

        jLHoraRuta.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLHoraRuta.setText("Añada un horario de ruta:");
        jDesktopPane1.add(jLHoraRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, 25));

        jCRuta.setBorder(null);
        jDesktopPane1.add(jCRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 180, -1));

        jLHasta.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLHasta.setText("Hasta");
        jDesktopPane1.add(jLHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 72, -1, -1));

        jLDesde.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLDesde.setText("Desde");
        jDesktopPane1.add(jLDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 72, -1, -1));

        jCHoraInicio.setBorder(null);
        jDesktopPane1.add(jCHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 73, -1, -1));

        jCHoraFinal.setBorder(null);
        jDesktopPane1.add(jCHoraFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 73, -1, -1));

        jLBuscarHorario.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLBuscarHorario.setText("Busqueda por HS. de salida");
        jDesktopPane1.add(jLBuscarHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 166, -1, -1));

        jCBuscarHorario.setBorder(null);
        jDesktopPane1.add(jCBuscarHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 167, -1, -1));

        jLBuscarRuta.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLBuscarRuta.setText("Busqueda por ruta");
        jDesktopPane1.add(jLBuscarRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 209, -1, -1));

        jCBuscarRuta.setBorder(null);
        jDesktopPane1.add(jCBuscarRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 190, -1));

        jBBuscarRuta.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBBuscarRuta.setText("Buscar");
        jBBuscarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarRutaActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jBBuscarRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 208, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jDesktopPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 468, 12));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 394, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
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
