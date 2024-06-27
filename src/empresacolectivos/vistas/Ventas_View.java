/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package empresacolectivos.vistas;

import empresacolectivos.Entidades.*;
import empresacolectivos.accesoADatos.*;
import java.util.List;

/**
 *
 * @author IGNACIO
 */
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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        jftFechaViaje.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jbEliminar.setText("Eliminar");

        jlAsiento.setText("Asiento N°:");

        jftHoraViaje.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        jcbAsiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jftPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        jlFechaViaje.setText("Fecha del viaje:");

        jbVenderPasaje.setText("Vender pasaje");

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                                .addComponent(jbBuscarXid, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)))))
                .addGap(70, 70, 70))
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
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jbVenderPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbEliminar)
                        .addGap(6, 6, 6)
                        .addComponent(jbSalir)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            
            
            
            
        }
    }//GEN-LAST:event_jbBuscarXidActionPerformed


    
   private void cargarPasajeros(){   
        for (Pasajero pasajero : listaPasajeros) {
            jcbPasajero.addItem(pasajero);
        }
    }
   
      private void cargarRutas(){   
        for (Ruta ruta : listaRutas) {
            jcbRuta.addItem(ruta);
        }
    }
      
      private void cargarColectivos(){   
        for (Colectivo colectivo : listaColectivos) {
            jcbColectivo.addItem(colectivo);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JButton jbBuscarXid;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbVenderPasaje;
    private javax.swing.JComboBox<String> jcbAsiento;
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
