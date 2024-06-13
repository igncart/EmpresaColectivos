
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
        jButton1 = new javax.swing.JButton();
        jLTituloIngreso = new javax.swing.JLabel();

        setResizable(true);

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

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLOrigen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLBuscarDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLBuscarOrigen))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLDestino)
                                .addGap(38, 38, 38)
                                .addComponent(jCDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(jBAñadirRuta))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCBusquedaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBBuscarPorDestino))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCBusquedaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBBuscarRutasOrigen))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jButton1)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLOrigen)
                    .addComponent(jCOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDestino)
                    .addComponent(jCDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAñadirRuta))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBuscarOrigen)
                    .addComponent(jCBusquedaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarRutasOrigen))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBuscarDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBusquedaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarPorDestino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addGap(40, 40, 40))
        );

        jLTituloIngreso.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLTituloIngreso.setText("Ingresos de nuevas rutas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLTituloIngreso))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTituloIngreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
  
    
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
    private javax.swing.JButton jButton1;
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
