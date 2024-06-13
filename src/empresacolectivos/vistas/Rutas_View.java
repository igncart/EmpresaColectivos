
package empresacolectivos.vistas;

import empresacolectivos.accesoADatos.RutaData;
import empresacolectivos.Entidades.Ruta;
import java.time.LocalTime;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Rutas_View extends javax.swing.JInternalFrame {

    private final RutaData rutaData;
    private final String[] ciudadesCapitales = {"Buenos Aires", "Córdoba", "Rosario", "Mendoza", "Tucumán", "La Plata", "Mar del Plata", "Salta", "Santa Fe", "San Juan", "San Luis", "Resistencia", "Neuquén", "Formosa", "San Salvador de Jujuy", "Bahía Blanca", "Posadas", "Paraná", "Santiago del Estero", "Corrientes", "Concordia"};
    
    public Rutas_View() {
        initComponents();
        rutaData = new RutaData();
        mostrarRutasDisponibles();
        cargarCiudadesCapitales();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLOrigen = new javax.swing.JLabel();
        jLBuscarOrigen = new javax.swing.JLabel();
        jCOrigen = new javax.swing.JComboBox();
        jCDestino = new javax.swing.JComboBox<>();
        jCBusquedaOrigen = new javax.swing.JComboBox();
        jLDestino = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTRutasDisponibles = new javax.swing.JTable();
        jCBusquedaDestino = new javax.swing.JComboBox();
        jBAñadirRuta = new javax.swing.JButton();
        jBBuscarRutasOrigen = new javax.swing.JButton();
        jBBuscarPorDestino = new javax.swing.JButton();
        jLBuscarDestino = new javax.swing.JLabel();
        jLTituloIngreso = new javax.swing.JLabel();

        jLOrigen.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLOrigen.setText("Origen");

        jLBuscarOrigen.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLBuscarOrigen.setText("Busqueda por origen");

        jLDestino.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLDestino.setText("Destino");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Busqueda de rutas");

        jTRutasDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Origen", "Destino"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTRutasDisponibles);

        jBAñadirRuta.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBAñadirRuta.setText("Añadir");
        jBAñadirRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAñadirRutaActionPerformed(evt);
            }
        });

        jBBuscarRutasOrigen.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBBuscarRutasOrigen.setText("Buscar");
        jBBuscarRutasOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarRutasOrigenActionPerformed(evt);
            }
        });

        jBBuscarPorDestino.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBBuscarPorDestino.setText("Buscar");

        jLBuscarDestino.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLBuscarDestino.setText("Buscar Por Destino");

        jLTituloIngreso.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLTituloIngreso.setText("Ingresos de nuevas rutas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLBuscarOrigen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCBusquedaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBBuscarRutasOrigen)
                                .addGap(109, 109, 109)
                                .addComponent(jLBuscarDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(jLOrigen)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(102, 102, 102)
                                        .addComponent(jLDestino))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(322, 322, 322)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jCDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))))
                                .addGap(46, 46, 46)
                                .addComponent(jBAñadirRuta)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBusquedaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBBuscarPorDestino))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLTituloIngreso)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTituloIngreso)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLOrigen)
                    .addComponent(jCOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDestino)
                    .addComponent(jBAñadirRuta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBuscarOrigen)
                    .addComponent(jCBusquedaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBusquedaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarRutasOrigen)
                    .addComponent(jBBuscarPorDestino)
                    .addComponent(jLBuscarDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAñadirRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAñadirRutaActionPerformed
        String origen = jCOrigen.getSelectedItem().toString();
        String destino = jCDestino.getSelectedItem().toString();

        if (origen.equals(destino)) {
            JOptionPane.showMessageDialog(null, "El origen y el destino no pueden ser iguales.");
            return;
        }

        // Aca genero un numero entre 4 y 12 a forma de ejemplo para el ejercicio tampoco seleccionen san luis y mendoza porque les puede salir 12hs no sean asi >:C

        int duracionEstimadaHoras = (int) (Math.random() * (12 - 4 + 1)) + 4;
        LocalTime duracionEstimada = LocalTime.of(duracionEstimadaHoras, 0);
        Ruta nuevaRuta = new Ruta(origen, destino, duracionEstimada, true);      // Aca defini el estado de la ruta siempre en true
        rutaData.registrarRuta(nuevaRuta);
        mostrarRutasDisponibles();

    }//GEN-LAST:event_jBAñadirRutaActionPerformed

    private void jBBuscarRutasOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarRutasOrigenActionPerformed

    }//GEN-LAST:event_jBBuscarRutasOrigenActionPerformed
  
    
    private void mostrarRutasDisponibles() {
        DefaultTableModel modelo = (DefaultTableModel) jTRutasDisponibles.getModel();
        modelo.setRowCount(0);

        List<Ruta> rutas = rutaData.listarRutas();

        for (Ruta ruta : rutas) {
            Object[] fila = {ruta.getOrigen(), ruta.getDestino()};
            modelo.addRow(fila);
        }
    }
   
    private void cargarCiudadesCapitales() {
        jCOrigen.setModel(new DefaultComboBoxModel<>(ciudadesCapitales));
        jCDestino.setModel(new DefaultComboBoxModel<>(ciudadesCapitales));
    }
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAñadirRuta;
    private javax.swing.JButton jBBuscarPorDestino;
    private javax.swing.JButton jBBuscarRutasOrigen;
    private javax.swing.JComboBox jCBusquedaDestino;
    private javax.swing.JComboBox jCBusquedaOrigen;
    private javax.swing.JComboBox<String> jCDestino;
    private javax.swing.JComboBox jCOrigen;
    private javax.swing.JLabel jLBuscarDestino;
    private javax.swing.JLabel jLBuscarOrigen;
    private javax.swing.JLabel jLDestino;
    private javax.swing.JLabel jLOrigen;
    private javax.swing.JLabel jLTituloIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTRutasDisponibles;
    // End of variables declaration//GEN-END:variables
}
