
package empresacolectivos.vistas;

import empresacolectivos.Entidades.Pasajero;
import empresacolectivos.accesoADatos.PasajeroData;
import javax.swing.*;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

public class Pasajeros_View extends javax.swing.JInternalFrame {

      private DefaultTableModel modeloTabla;
      private PasajeroData pasajeroData;
    
    public Pasajeros_View() {
        initComponents();
        pasajeroData = new PasajeroData();
        inicializarTabla();
        cargarPasajeros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPApellido = new javax.swing.JPanel();
        jLGestion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListaPasajeros = new javax.swing.JTable();
        jLRegistro = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jLDNI = new javax.swing.JLabel();
        jTDNI = new javax.swing.JTextField();
        jLCorreo = new javax.swing.JLabel();
        jTCorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTCelular = new javax.swing.JTextField();
        jCheckEstado = new javax.swing.JCheckBox();
        jLEstado = new javax.swing.JLabel();
        jBGuardarPasajero = new javax.swing.JButton();
        jLBuscarNombre = new javax.swing.JLabel();
        jLBuscarApellido = new javax.swing.JLabel();
        jLBuscarDNI = new javax.swing.JLabel();
        jTBuscarNombre = new javax.swing.JTextField();
        jTBuscarApellido = new javax.swing.JTextField();
        jTBuscarDni = new javax.swing.JTextField();
        jBBuscarPorNombre = new javax.swing.JButton();
        jBBuscarPorApellido = new javax.swing.JButton();
        jBBuscarPorDniAction = new javax.swing.JButton();
        jBVisualizarTodosPasajeros = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(true);

        jPApellido.setBackground(new java.awt.Color(204, 204, 204));
        jPApellido.setForeground(new java.awt.Color(153, 153, 153));
        jPApellido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLGestion.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLGestion.setText("Gestion de pasajeros");
        jPApellido.add(jLGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 40));

        jTListaPasajeros.setBackground(new java.awt.Color(204, 204, 204));
        jTListaPasajeros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTListaPasajeros);

        jPApellido.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 470, 100));

        jLRegistro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLRegistro.setText("Registro de nuevo pasajero:");
        jPApellido.add(jLRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLNombre.setText("Ingrese el nombre");
        jPApellido.add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jTNombre.setBorder(null);
        jPApellido.add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 80, -1));

        jLabel1.setText("Ingrese el apellido");
        jPApellido.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jTApellido.setBorder(null);
        jPApellido.add(jTApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 80, -1));

        jLDNI.setText("Ingrese DNI");
        jPApellido.add(jLDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        jTDNI.setBorder(null);
        jPApellido.add(jTDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 80, -1));

        jLCorreo.setText("Ingrese un correo");
        jPApellido.add(jLCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jTCorreo.setBorder(null);
        jPApellido.add(jTCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 80, -1));

        jLabel2.setText("Ingrese su celular");
        jPApellido.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jTCelular.setBorder(null);
        jPApellido.add(jTCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 80, 20));

        jCheckEstado.setBackground(new java.awt.Color(204, 204, 204));
        jCheckEstado.setText("Activo");
        jCheckEstado.setBorder(null);
        jPApellido.add(jCheckEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 70, 20));

        jLEstado.setText("Estado");
        jPApellido.add(jLEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 40, 20));

        jBGuardarPasajero.setBackground(new java.awt.Color(255, 255, 204));
        jBGuardarPasajero.setText("Guardar");
        jBGuardarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarPasajeroActionPerformed(evt);
            }
        });
        jPApellido.add(jBGuardarPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 80, -1));

        jLBuscarNombre.setText("Buscar por nombre:");
        jPApellido.add(jLBuscarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLBuscarApellido.setText("Buscar por apellido:");
        jPApellido.add(jLBuscarApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLBuscarDNI.setText("Buscar por D.N.I:");
        jPApellido.add(jLBuscarDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));
        jPApellido.add(jTBuscarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 80, -1));
        jPApellido.add(jTBuscarApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 80, -1));
        jPApellido.add(jTBuscarDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 80, -1));

        jBBuscarPorNombre.setBackground(new java.awt.Color(255, 255, 204));
        jBBuscarPorNombre.setText("Buscar");
        jBBuscarPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarPorNombreActionPerformed(evt);
            }
        });
        jPApellido.add(jBBuscarPorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        jBBuscarPorApellido.setBackground(new java.awt.Color(255, 255, 204));
        jBBuscarPorApellido.setText("Buscar");
        jBBuscarPorApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarPorApellidoActionPerformed(evt);
            }
        });
        jPApellido.add(jBBuscarPorApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        jBBuscarPorDniAction.setBackground(new java.awt.Color(255, 255, 204));
        jBBuscarPorDniAction.setText("Buscar");
        jBBuscarPorDniAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarPorDniActionActionPerformed(evt);
            }
        });
        jPApellido.add(jBBuscarPorDniAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jBVisualizarTodosPasajeros.setBackground(new java.awt.Color(255, 255, 204));
        jBVisualizarTodosPasajeros.setText("Mostrar todos los pasajeros");
        jBVisualizarTodosPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisualizarTodosPasajerosActionPerformed(evt);
            }
        });
        jPApellido.add(jBVisualizarTodosPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 470, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarPasajeroActionPerformed
        guardarPasajero();

    }//GEN-LAST:event_jBGuardarPasajeroActionPerformed

    private void jBBuscarPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarPorNombreActionPerformed
        String nombre = jTBuscarNombre.getText().trim();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre para buscar.");
            return;
        }

        if (!nombre.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "El nombre debe contener solo letras.");
            return;
        }

        Pasajero pasajero = pasajeroData.buscarPasajeroPorNombre(nombre);

        if (pasajero != null) {
            modeloTabla.setRowCount(0);
            modeloTabla.addRow(new Object[]{
                pasajero.getId_Pasajero(),
                pasajero.getNombre(),
                pasajero.getApellido(),
                pasajero.getDni(),
                pasajero.getCorreo(),
                pasajero.getTelefono(),
                pasajero.isEstado() ? "Activo" : "Inactivo"
            });
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró ningún pasajero con el nombre ingresado.");
        }
        limpiarCamposBusqueda();
    }//GEN-LAST:event_jBBuscarPorNombreActionPerformed

    private void jBBuscarPorApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarPorApellidoActionPerformed
        String apellido = jTBuscarApellido.getText().trim();
        if (apellido.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un apellido para buscar.");
            return;
        }

        if (!apellido.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "El apellido debe contener solo letras.");
            return;
        }

        Pasajero pasajero = pasajeroData.buscarPasajeroPorApellido(apellido);

        if (pasajero != null) {
            modeloTabla.setRowCount(0);
            modeloTabla.addRow(new Object[]{
                pasajero.getId_Pasajero(),
                pasajero.getNombre(),
                pasajero.getApellido(),
                pasajero.getDni(),
                pasajero.getCorreo(),
                pasajero.getTelefono(),
                pasajero.isEstado() ? "Activo" : "Inactivo"
            });
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró ningún pasajero con el apellido ingresado.");
        }
        limpiarCamposBusqueda();
    }//GEN-LAST:event_jBBuscarPorApellidoActionPerformed

    private void jBBuscarPorDniActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarPorDniActionActionPerformed
        String dni = jTBuscarDni.getText().trim();
        if (dni.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un DNI para buscar.");
            return;
        }

        if (!dni.matches("\\d{1,10}")) {
            JOptionPane.showMessageDialog(this, "El DNI debe contener solo números y tener máximo 10 dígitos.");
            return;
        }

        Pasajero pasajero = pasajeroData.buscarPasajeroPorDni(dni);

        if (pasajero != null) {
            modeloTabla.setRowCount(0);
            modeloTabla.addRow(new Object[]{
                pasajero.getId_Pasajero(),
                pasajero.getNombre(),
                pasajero.getApellido(),
                pasajero.getDni(),
                pasajero.getCorreo(),
                pasajero.getTelefono(),
                pasajero.isEstado() ? "Activo" : "Inactivo"
            });
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró ningún pasajero con el DNI ingresado.");
        }
        limpiarCamposBusqueda();
    }//GEN-LAST:event_jBBuscarPorDniActionActionPerformed

    private void jBVisualizarTodosPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisualizarTodosPasajerosActionPerformed
        limpiarTabla();
        cargarPasajeros();
    }//GEN-LAST:event_jBVisualizarTodosPasajerosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

        private void guardarPasajero() {
        String nombre = jTNombre.getText();
        String apellido = jTApellido.getText();
        String dni = jTDNI.getText();
        String correo = jTCorreo.getText();
        String celular = jTCelular.getText();
        boolean estado = jCheckEstado.isSelected();

        if (!nombre.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "El nombre solo debe contener letras.");
            return;
        }
        if (!apellido.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "El apellido solo debe contener letras.");
            return;
        }
        if (!dni.matches("\\d{1,10}")) {
            JOptionPane.showMessageDialog(this, "El DNI solo debe contener números y tener un máximo de 10 dígitos.");
            return;
        }
        if (!isValidEmail(correo)) {
            JOptionPane.showMessageDialog(this, "El correo electrónico no es válido.");
            return;
        }
        if (!celular.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "El celular solo debe contener números.");
            return;
        }

        Pasajero pasajero = new Pasajero(nombre, apellido, dni, correo, celular, estado);

        PasajeroData pasajeroData = new PasajeroData();
        pasajeroData.registrarPasajero(pasajero);
        
        limpiarCampos();
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
    
    private void limpiarCampos() {
        jTNombre.setText("");
        jTApellido.setText("");
        jTDNI.setText("");
        jTCorreo.setText("");
        jTCelular.setText("");
        jCheckEstado.setSelected(false);
    }
    
    private void limpiarCamposBusqueda() {
    jTBuscarNombre.setText("");
    jTBuscarApellido.setText("");
    jTBuscarDni.setText("");
}
    
    private void limpiarTabla() {
    modeloTabla.setRowCount(0);
}

    private void inicializarTabla() {
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("DNI");
        modeloTabla.addColumn("Correo");
        modeloTabla.addColumn("Celular");
        modeloTabla.addColumn("Estado");

        jTListaPasajeros.setModel(modeloTabla);
    }

    private void cargarPasajeros() {
        List<Pasajero> pasajeros = pasajeroData.listarPasajeros();

        for (Pasajero pasajero : pasajeros) {
            modeloTabla.addRow(new Object[]{
                pasajero.getId_Pasajero(),
                pasajero.getNombre(),
                pasajero.getApellido(),
                pasajero.getDni(),
                pasajero.getCorreo(),
                pasajero.getTelefono(),
                pasajero.isEstado() ? "Activo" : "Inactivo"
            });
        }
    }
     



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarPorApellido;
    private javax.swing.JButton jBBuscarPorDniAction;
    private javax.swing.JButton jBBuscarPorNombre;
    private javax.swing.JButton jBGuardarPasajero;
    private javax.swing.JButton jBVisualizarTodosPasajeros;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckEstado;
    private javax.swing.JLabel jLBuscarApellido;
    private javax.swing.JLabel jLBuscarDNI;
    private javax.swing.JLabel jLBuscarNombre;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLDNI;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLGestion;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPApellido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTBuscarApellido;
    private javax.swing.JTextField jTBuscarDni;
    private javax.swing.JTextField jTBuscarNombre;
    private javax.swing.JTextField jTCelular;
    private javax.swing.JTextField jTCorreo;
    private javax.swing.JTextField jTDNI;
    private javax.swing.JTable jTListaPasajeros;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables
}
