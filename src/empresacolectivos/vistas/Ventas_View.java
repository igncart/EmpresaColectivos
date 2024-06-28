package empresacolectivos.vistas;

import empresacolectivos.Entidades.*;
import empresacolectivos.accesoADatos.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Ventas_View extends javax.swing.JInternalFrame {

    private List<Pasajero> listaPasajeros;
    private List<Ruta> listaRutas;
    private List<Colectivo> listaColectivos;
    
    private PasajeroData pasajerData;
    private RutaData rutData;
    private ColectivoData coleData;
    private PasajeData pasajeData;
    private Pasaje pasajeActual = new Pasaje();
    
    public Ventas_View() {
        initComponents();
        
        
        pasajerData = new PasajeroData();
        listaPasajeros = pasajerData.listarPasajeros();
        rutData = new RutaData();
        listaRutas =  rutData.listarRutas();
        coleData = new ColectivoData();
        listaColectivos = coleData.listarColectivo();
        pasajeData = new PasajeData();
        
        cargarPasajeros();
        cargarRutas();
        cargarColectivos();
        cargarHorarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtxBuscarXid = new javax.swing.JTextField();
        jbBuscarXid = new javax.swing.JButton();
        jcbColectivo = new javax.swing.JComboBox<>();
        jftFechaViaje = new javax.swing.JFormattedTextField();
        jbEliminar = new javax.swing.JButton();
        jlAsiento = new javax.swing.JLabel();
        jftHoraViaje = new javax.swing.JFormattedTextField();
        jcbAsiento = new javax.swing.JComboBox<>();
        jftPrecio = new javax.swing.JFormattedTextField();
        jlFechaViaje = new javax.swing.JLabel();
        jbVenderPasaje = new javax.swing.JButton();
        jlPasajero = new javax.swing.JLabel();
        jcbPasajero = new javax.swing.JComboBox<>();
        jlRuta = new javax.swing.JLabel();
        jcbRuta = new javax.swing.JComboBox<>();
        jlHoraViaje = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jlBuscarXid = new javax.swing.JLabel();
        jlPrecio = new javax.swing.JLabel();
        jlColectivo = new javax.swing.JLabel();
        jbLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jcbBuscarPasajeros = new javax.swing.JComboBox<>();
        jbMostrarPasajes = new javax.swing.JButton();
        jbFiltrarRuta = new javax.swing.JButton();
        jcbBuscarHorarios = new javax.swing.JComboBox<>();
        jbFiltrarPasajero = new javax.swing.JButton();
        jbFiltrarHorario = new javax.swing.JButton();
        jcbBuscarRutas = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jRadioButton1.setText("jRadioButton1");

        setResizable(true);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("GESTIÓN DE VENTAS");

        jbBuscarXid.setText("Buscar");
        jbBuscarXid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarXidActionPerformed(evt);
            }
        });

        jcbColectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbColectivoActionPerformed(evt);
            }
        });

        jftFechaViaje.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/MM/dd"))));

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jlAsiento.setText("Asiento N°:");

        jftHoraViaje.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        jcbAsiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jftPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jlFechaViaje.setText("Fecha del viaje:");

        jbVenderPasaje.setText("Vender pasaje");
        jbVenderPasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVenderPasajeActionPerformed(evt);
            }
        });

        jlPasajero.setText("Pasajero:");

        jlRuta.setText("Ruta:");

        jlHoraViaje.setText("Hora del viaje:");

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jlBuscarXid.setText("Buscar por ID:");

        jlPrecio.setText("Precio:");

        jlColectivo.setText("Colectivo:");

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jbVenderPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbLimpiar)
                            .addComponent(jbEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlPasajero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlRuta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlColectivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlAsiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlFechaViaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlHoraViaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlBuscarXid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbPasajero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbRuta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbColectivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jftHoraViaje, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jftFechaViaje, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbAsiento, javax.swing.GroupLayout.Alignment.LEADING, 0, 93, Short.MAX_VALUE)
                                    .addComponent(jftPrecio))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtxBuscarXid, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbBuscarXid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBuscarXid)
                    .addComponent(jtxBuscarXid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarXid))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPasajero)
                    .addComponent(jcbPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRuta)
                    .addComponent(jcbRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlColectivo)
                    .addComponent(jcbColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAsiento)
                    .addComponent(jcbAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFechaViaje)
                    .addComponent(jftFechaViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlHoraViaje)
                    .addComponent(jftHoraViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPrecio)
                    .addComponent(jftPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jbVenderPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbEliminar)
                                .addGap(6, 6, 6)
                                .addComponent(jbLimpiar)))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)
                        .addGap(46, 46, 46))))
        );

        jbMostrarPasajes.setText("Mostrar todos los pasajes vendidos");
        jbMostrarPasajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarPasajesActionPerformed(evt);
            }
        });

        jbFiltrarRuta.setText("Filtrar por ruta");
        jbFiltrarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFiltrarRutaActionPerformed(evt);
            }
        });

        jbFiltrarPasajero.setText("Filtrar por pasajero");
        jbFiltrarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFiltrarPasajeroActionPerformed(evt);
            }
        });

        jbFiltrarHorario.setText("Filtrar por horario");
        jbFiltrarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFiltrarHorarioActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbMostrarPasajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbBuscarPasajeros, 0, 224, Short.MAX_VALUE)
                            .addComponent(jcbBuscarRutas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbBuscarHorarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbFiltrarHorario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addComponent(jbFiltrarRuta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jbFiltrarPasajero, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane2))
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jbMostrarPasajes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbFiltrarRuta)
                    .addComponent(jcbBuscarRutas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbFiltrarHorario)
                    .addComponent(jcbBuscarHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbFiltrarPasajero)
                    .addComponent(jcbBuscarPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
       dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarXidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarXidActionPerformed
        int id = Integer.parseInt(jtxBuscarXid.getText());
        pasajeActual = pasajeData.buscarPasajePorId(id);
        
        if (pasajeActual != null) {
            
            jtxBuscarXid.setText(""+pasajeActual.getId_Pasaje());
            Pasajero pasajero = pasajeActual.getPasajero();
            jcbPasajero.setSelectedItem(pasajero);
            Ruta ruta = pasajeActual.getRuta();
            jcbRuta.setSelectedItem(ruta);
            Colectivo colectivo = pasajeActual.getColectivo();
            jcbColectivo.setSelectedItem(colectivo);
            jcbAsiento.setSelectedItem(String.valueOf(pasajeActual.getAsiento()));
    
            LocalDate fechaViaje = pasajeActual.getFecha_Viaje();
            LocalTime horaViaje = pasajeActual.getHora_Viaje();
            
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");

            jftFechaViaje.setText(dateFormat.format(fechaViaje));
            jftHoraViaje.setText(timeFormat.format(horaViaje));

            jftPrecio.setValue(pasajeActual.getPrecio());            
        }
    }//GEN-LAST:event_jbBuscarXidActionPerformed

    private void jcbColectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbColectivoActionPerformed
           Colectivo colectivoSeleccionado = (Colectivo) jcbColectivo.getSelectedItem();
           if (colectivoSeleccionado != null) {
              cargarAsientosDisponibles(colectivoSeleccionado.getId_Colectivo(), colectivoSeleccionado.getCapacidad());
        }
    }//GEN-LAST:event_jcbColectivoActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
            limpiarCampos();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbVenderPasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVenderPasajeActionPerformed
    if (jcbPasajero.getSelectedIndex() == -1) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar un pasajero", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (jcbRuta.getSelectedIndex() == -1) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar una ruta", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (jcbColectivo.getSelectedIndex() == -1) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar un colectivo", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (jcbAsiento.getSelectedIndex() == -1) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar un asiento", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String fechaViajeStr = jftFechaViaje.getText();
    LocalDate fechaViaje;

    try {
        fechaViaje = LocalDate.parse(fechaViajeStr, DateTimeFormatter.ofPattern("yyyy/MM/dd"));

        LocalDate fechaActual = LocalDate.now();
        if (fechaViaje.isBefore(fechaActual)) {
            JOptionPane.showMessageDialog(this, "La fecha de viaje no puede ser anterior a la fecha actual.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (DateTimeParseException e) {
        JOptionPane.showMessageDialog(this, "Fecha de viaje inválida o campo vacío. Ejemplo de fecha: 2024/09/27", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String horaViajeStr = jftHoraViaje.getText();
    LocalTime horaViaje;

    try {
        horaViaje = LocalTime.parse(horaViajeStr, DateTimeFormatter.ofPattern("HH:mm"));

        LocalDateTime ahora = LocalDateTime.now();
        LocalDateTime fechaHoraViaje = LocalDateTime.of(fechaViaje, horaViaje);
        if (fechaHoraViaje.isBefore(ahora)) {
            JOptionPane.showMessageDialog(this, "La hora de viaje no puede ser anterior a la hora actual.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (DateTimeParseException e) {
        JOptionPane.showMessageDialog(this, "Hora de viaje inválida o campo vacío. Ejemplo de hora: 18:30", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Object precioObj = jftPrecio.getValue();
    if (precioObj == null || !(precioObj instanceof Number)) {
        JOptionPane.showMessageDialog(this, "Precio inválido o campo vacío. Ejemplo de precio: 3000,00", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    double precio = ((Number) precioObj).doubleValue();

    Pasajero pasajero = (Pasajero) jcbPasajero.getSelectedItem();
    Ruta ruta = (Ruta) jcbRuta.getSelectedItem();
    Colectivo colectivo = (Colectivo) jcbColectivo.getSelectedItem();
    int asiento = Integer.parseInt((String) jcbAsiento.getSelectedItem());

    Pasaje pasaje = new Pasaje(pasajero, colectivo, ruta, fechaViaje, horaViaje, asiento, precio);

    pasajeData.registrarPasaje(pasaje);
    limpiarCampos();
    }//GEN-LAST:event_jbVenderPasajeActionPerformed

    private void jbMostrarPasajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarPasajesActionPerformed
            
    List<Pasaje> pasajes = pasajeData.listarPasajes();
    
    
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID");
    modelo.addColumn("Pasajero");
    modelo.addColumn("DNI");
    modelo.addColumn("Origen");
    modelo.addColumn("Destino");
    modelo.addColumn("Colectivo");
    modelo.addColumn("Fecha Viaje");
    modelo.addColumn("Hora Viaje");
    modelo.addColumn("Asiento");
    modelo.addColumn("Precio");
    
    for (Pasaje pasaje : pasajes) {
        Object[] fila = {
            pasaje.getId_Pasaje(),
            pasaje.getPasajero().getNombre(),
            pasaje.getPasajero().getDni(),
            pasaje.getRuta().getOrigen(),
            pasaje.getRuta().getDestino(),
            pasaje.getColectivo().getModelo(),
            pasaje.getFecha_Viaje(),
            pasaje.getHora_Viaje(),
            pasaje.getAsiento(),
            pasaje.getPrecio()
        };
        modelo.addRow(fila);
    }
    
    jTable2.setModel(modelo);
    }//GEN-LAST:event_jbMostrarPasajesActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
            
    int id = Integer.parseInt(jtxBuscarXid.getText().trim());
    
   
    int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar el pasaje?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
    
    if (confirmacion == JOptionPane.YES_OPTION) {
        
        pasajeData.eliminarPasaje(id);
        
        limpiarCampos();
        jbMostrarPasajesActionPerformed(evt);
    }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbFiltrarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFiltrarRutaActionPerformed

        Ruta rutaSeleccionada = (Ruta) jcbBuscarRutas.getSelectedItem();
        
        if (rutaSeleccionada != null) {

            List<Pasaje> pasajes = pasajeData.listarPasajesPorRuta(rutaSeleccionada);
            
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID Pasaje");
            modelo.addColumn("Pasajero");
            modelo.addColumn("DNI");
            modelo.addColumn("Origen");
            modelo.addColumn("Destino");
            modelo.addColumn("Colectivo");
            modelo.addColumn("Fecha Viaje");
            modelo.addColumn("Hora Viaje");
            modelo.addColumn("Asiento");
            modelo.addColumn("Precio");
            
            for (Pasaje pasaje : pasajes) {
                modelo.addRow(new Object[] {
                    pasaje.getId_Pasaje(),
                    pasaje.getPasajero().getNombre(),
                    pasaje.getPasajero().getDni(),
                    pasaje.getRuta().getOrigen(),
                    pasaje.getRuta().getDestino(),
                    pasaje.getColectivo().getModelo(),
                    pasaje.getFecha_Viaje(),
                    pasaje.getHora_Viaje(),
                    pasaje.getAsiento(),
                    pasaje.getPrecio()
                });
            }
            
            jTable2.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una ruta.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbFiltrarRutaActionPerformed

    private void jbFiltrarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFiltrarPasajeroActionPerformed
   
        Pasajero pasajeroSeleccionado = (Pasajero) jcbBuscarPasajeros.getSelectedItem();
        
        if (pasajeroSeleccionado != null) {
            
            List<Pasaje> pasajes = pasajeData.listarPasajesPorPasajero(pasajeroSeleccionado);
            
            
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID Pasaje");
            modelo.addColumn("Pasajero");
            modelo.addColumn("DNI");
            modelo.addColumn("Origen");
            modelo.addColumn("Destino");
            modelo.addColumn("Colectivo");
            modelo.addColumn("Fecha Viaje");
            modelo.addColumn("Hora Viaje");
            modelo.addColumn("Asiento");
            modelo.addColumn("Precio");
            
            
            for (Pasaje pasaje : pasajes) {
                modelo.addRow(new Object[] {
                    pasaje.getId_Pasaje(),
                    pasaje.getPasajero().getNombre(),
                    pasaje.getPasajero().getDni(),
                    pasaje.getRuta().getOrigen(),
                    pasaje.getRuta().getDestino(),
                    pasaje.getColectivo().getModelo(),
                    pasaje.getFecha_Viaje(),
                    pasaje.getHora_Viaje(),
                    pasaje.getAsiento(),
                    pasaje.getPrecio()
                });
            }
            
            
            jTable2.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un pasajero.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbFiltrarPasajeroActionPerformed

    private void jbFiltrarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFiltrarHorarioActionPerformed
  
    String horarioSeleccionadoStr = (String) jcbBuscarHorarios.getSelectedItem();
    

    LocalTime horarioSeleccionado = LocalTime.parse(horarioSeleccionadoStr, DateTimeFormatter.ofPattern("HH:mm"));
    
   
    List<Pasaje> pasajes = pasajeData.listarPasajesPorHorario(horarioSeleccionado);
    
    
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Pasaje");
    modelo.addColumn("Pasajero");
    modelo.addColumn("DNI");
    modelo.addColumn("Origen");
    modelo.addColumn("Destino");
    modelo.addColumn("Colectivo");
    modelo.addColumn("Fecha Viaje");
    modelo.addColumn("Hora Viaje");
    modelo.addColumn("Asiento");
    modelo.addColumn("Precio");
    
  
    for (Pasaje pasaje : pasajes) {
        modelo.addRow(new Object[] {
            pasaje.getId_Pasaje(),
            pasaje.getPasajero().getNombre(),
            pasaje.getPasajero().getDni(),
            pasaje.getRuta().getOrigen(),
            pasaje.getRuta().getDestino(),
            pasaje.getColectivo().getModelo(),
            pasaje.getFecha_Viaje(),
            pasaje.getHora_Viaje(),
            pasaje.getAsiento(),
            pasaje.getPrecio()
        });
    }
    
    
    jTable2.setModel(modelo);
    }//GEN-LAST:event_jbFiltrarHorarioActionPerformed


    
    private void cargarPasajeros(){   
        for (Pasajero pasajero : listaPasajeros) {
            jcbPasajero.addItem(pasajero);
            jcbBuscarPasajeros.addItem(pasajero);
        }
    }
   
    private void cargarRutas(){   
        for (Ruta ruta : listaRutas) {
            jcbRuta.addItem(ruta);
            jcbBuscarRutas.addItem(ruta);
        }
    }
      
    private void cargarColectivos() {
        jcbColectivo.removeAllItems();
        for (Colectivo colectivo : listaColectivos) {
            jcbColectivo.addItem(colectivo);
        }
    }
    
    private void cargarAsientosDisponibles(int idColectivo, int capacidadTotal) {
        List<Integer> asientosDisponibles = coleData.obtenerAsientosDisponibles(idColectivo, capacidadTotal);

        jcbAsiento.removeAllItems();
        for (Integer asiento : asientosDisponibles) {
            jcbAsiento.addItem(asiento.toString());
        }
    }
        
    private void limpiarCampos() {
        jtxBuscarXid.setText("");
        jcbPasajero.setSelectedIndex(0); 
        jcbRuta.setSelectedIndex(0); 
        jcbColectivo.setSelectedIndex(0); 
        jcbAsiento.removeAllItems(); 
        jftFechaViaje.setText(""); 
        jftHoraViaje.setText(""); 
        jftPrecio.setValue(null); 
    }
    
    private void cargarHorarios() {
    jcbBuscarHorarios.removeAllItems();
    
    
    for (int hora = 0; hora < 24; hora++) {
        
        String horaCompleta = String.format("%02d:00", hora);
        jcbBuscarHorarios.addItem(horaCompleta);
        
        
        for (int minuto = 15; minuto <= 45; minuto += 15) {
            String horaIntervalo = String.format("%02d:%02d", hora, minuto);
            jcbBuscarHorarios.addItem(horaIntervalo);
        }
    }
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbBuscarXid;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbFiltrarHorario;
    private javax.swing.JButton jbFiltrarPasajero;
    private javax.swing.JButton jbFiltrarRuta;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbMostrarPasajes;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbVenderPasaje;
    private javax.swing.JComboBox<String> jcbAsiento;
    private javax.swing.JComboBox<String> jcbBuscarHorarios;
    private javax.swing.JComboBox<Pasajero> jcbBuscarPasajeros;
    private javax.swing.JComboBox<Ruta> jcbBuscarRutas;
    private javax.swing.JComboBox<Colectivo> jcbColectivo;
    private javax.swing.JComboBox<Pasajero> jcbPasajero;
    private javax.swing.JComboBox<Ruta> jcbRuta;
    private javax.swing.JFormattedTextField jftFechaViaje;
    private javax.swing.JFormattedTextField jftHoraViaje;
    private javax.swing.JFormattedTextField jftPrecio;
    private javax.swing.JLabel jlAsiento;
    private javax.swing.JLabel jlBuscarXid;
    private javax.swing.JLabel jlColectivo;
    private javax.swing.JLabel jlFechaViaje;
    private javax.swing.JLabel jlHoraViaje;
    private javax.swing.JLabel jlPasajero;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JLabel jlRuta;
    private javax.swing.JTextField jtxBuscarXid;
    // End of variables declaration//GEN-END:variables
}
