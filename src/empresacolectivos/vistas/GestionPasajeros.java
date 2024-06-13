
package empresacolectivos.vistas;

import empresacolectivos.Entidades.Pasajero;
import empresacolectivos.accesoADatos.PasajeroData;
import javax.swing.*;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;



public class GestionPasajeros extends javax.swing.JInternalFrame {

      private DefaultTableModel modeloTabla;
      private PasajeroData pasajeroData;
    
    public GestionPasajeros() {
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

        jLGestion.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLGestion.setText("Gestion de pasajeros");

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

        jLRegistro.setText("Registro de nuevo pasajero:");

        jLNombre.setText("Ingrese el nombre");

        jLabel1.setText("Ingrese el apellido");

        jLDNI.setText("Ingrese DNI");

        jLCorreo.setText("Ingrese un correo");

        jLabel2.setText("Ingrese su celular");

        jCheckEstado.setText("Activo");

        jLEstado.setText("Estado");

        jBGuardarPasajero.setText("Guardar");
        jBGuardarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarPasajeroActionPerformed(evt);
            }
        });

        jLBuscarNombre.setText("Buscar por nombre:");

        jLBuscarApellido.setText("Buscar por apellido:");

        jLBuscarDNI.setText("Buscar por D.N.I:");

        jBBuscarPorNombre.setText("Buscar");
        jBBuscarPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarPorNombreActionPerformed(evt);
            }
        });

        jBBuscarPorApellido.setText("Buscar");
        jBBuscarPorApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarPorApellidoActionPerformed(evt);
            }
        });

        jBBuscarPorDniAction.setText("Buscar");
        jBBuscarPorDniAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarPorDniActionActionPerformed(evt);
            }
        });

        jBVisualizarTodosPasajeros.setText("Mostrar todos los pasajeros");
        jBVisualizarTodosPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisualizarTodosPasajerosActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPApellidoLayout = new javax.swing.GroupLayout(jPApellido);
        jPApellido.setLayout(jPApellidoLayout);
        jPApellidoLayout.setHorizontalGroup(
            jPApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPApellidoLayout.createSequentialGroup()
                .addGroup(jPApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPApellidoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLRegistro)
                            .addGroup(jPApellidoLayout.createSequentialGroup()
                                .addGroup(jPApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPApellidoLayout.createSequentialGroup()
                                        .addComponent(jLBuscarApellido)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                        .addComponent(jTBuscarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPApellidoLayout.createSequentialGroup()
                                        .addComponent(jLBuscarNombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPApellidoLayout.createSequentialGroup()
                                        .addComponent(jLBuscarDNI)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTBuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(43, 43, 43)
                                .addGroup(jPApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBBuscarPorNombre)
                                    .addComponent(jBBuscarPorApellido)
                                    .addComponent(jBBuscarPorDniAction)))
                            .addGroup(jPApellidoLayout.createSequentialGroup()
                                .addGroup(jPApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPApellidoLayout.createSequentialGroup()
                                        .addComponent(jLCorreo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTCorreo))
                                    .addGroup(jPApellidoLayout.createSequentialGroup()
                                        .addComponent(jLNombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLGestion)
                                    .addGroup(jPApellidoLayout.createSequentialGroup()
                                        .addGroup(jPApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPApellidoLayout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPApellidoLayout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTCelular)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPApellidoLayout.createSequentialGroup()
                                                .addComponent(jLDNI)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(jPApellidoLayout.createSequentialGroup()
                                                .addComponent(jLEstado)
                                                .addGap(34, 34, 34)))
                                        .addGroup(jPApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckEstado)
                                            .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addComponent(jBGuardarPasajero))))))
                    .addGroup(jPApellidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBVisualizarTodosPasajeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(126, 126, 126))
            .addGroup(jPApellidoLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPApellidoLayout.setVerticalGroup(
            jPApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPApellidoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLGestion)
                .addGap(44, 44, 44)
                .addComponent(jLRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPApellidoLayout.createSequentialGroup()
                        .addGroup(jPApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNombre)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLDNI)
                            .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCorreo)
                            .addComponent(jTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckEstado)
                            .addComponent(jLEstado)))
                    .addComponent(jBGuardarPasajero, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLBuscarNombre)
                    .addComponent(jBBuscarPorNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBuscarApellido)
                    .addComponent(jTBuscarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarPorApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBuscarDNI)
                    .addComponent(jTBuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarPorDniAction))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jBVisualizarTodosPasajeros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
     
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionPasajeros().setVisible(true);
            }
        });
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
