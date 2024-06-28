
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

        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLOrigen.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLOrigen.setText("Origen");
        jPanel1.add(jLOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 87, -1, -1));

        jLBuscarOrigen.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLBuscarOrigen.setText("Busqueda por origen");
        jPanel1.add(jLBuscarOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 193, -1, -1));

        jPanel1.add(jCOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 87, 130, -1));

        jPanel1.add(jCDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 160, -1));

        jPanel1.add(jCBusquedaOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 193, -1, -1));

        jLDestino.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLDestino.setText("Destino");
        jPanel1.add(jLDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Busqueda de rutas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jTRutasDisponibles.setBackground(new java.awt.Color(204, 204, 204));
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 420, 110));

        jPanel1.add(jCBusquedaDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 258, -1, -1));

        jBAñadirRuta.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBAñadirRuta.setText("Añadir");
        jBAñadirRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAñadirRutaActionPerformed(evt);
            }
        });
        jPanel1.add(jBAñadirRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        jBBuscarRutasOrigen.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBBuscarRutasOrigen.setText("Buscar");
        jBBuscarRutasOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarRutasOrigenActionPerformed(evt);
            }
        });
        jPanel1.add(jBBuscarRutasOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 192, -1, -1));

        jBBuscarPorDestino.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBBuscarPorDestino.setText("Buscar");
        jPanel1.add(jBBuscarPorDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 257, -1, -1));

        jLBuscarDestino.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLBuscarDestino.setText("Buscar Por Destino");
        jPanel1.add(jLBuscarDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 254, 155, 28));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        jLTituloIngreso.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLTituloIngreso.setText("Ingresos de nuevas rutas");
        jPanel1.add(jLTituloIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
