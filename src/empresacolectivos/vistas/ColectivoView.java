/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresacolectivos.vistas;

import empresacolectivos.Entidades.Colectivo;
import empresacolectivos.accesoADatos.ColectivoData;
import javax.swing.JOptionPane;

public class ColectivoView extends javax.swing.JInternalFrame {

    private ColectivoData coleData = new ColectivoData();
    private Colectivo coleActual = new Colectivo();
    public ColectivoView() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jtMatricula = new javax.swing.JTextField();
        jtMarca = new javax.swing.JTextField();
        jtModelo = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jsCapacidad = new javax.swing.JSpinner();
        jrEstado = new javax.swing.JRadioButton();
        jbLimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Eras Light ITC", 3, 24)); // NOI18N
        jLabel1.setText("Registro de Colectivos");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0)));
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 270, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese Matricula:");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Marca:");
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Modelo:");
        jDesktopPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Capacidad:");
        jDesktopPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Estado:");
        jDesktopPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 130, 40));
        jDesktopPane1.add(jtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 117, -1));
        jDesktopPane1.add(jtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 117, -1));
        jDesktopPane1.add(jtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 117, -1));

        jbBuscar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 100, 40));

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 80, 20));
        jDesktopPane1.add(jsCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 80, 30));
        jDesktopPane1.add(jrEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 90, 40));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 204));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 204));
        jDesktopPane1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 550, 20));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 510, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       
        String matricula = jtMatricula.getText().toUpperCase();
        if(matricula.isEmpty()){
        JOptionPane.showMessageDialog(this, "DEBE AGREGAR MATRICULA");
        return;
    }
    String marca = jtMarca.getText();
    String modelo = jtModelo.getText();
    Integer capacidad = (int) jsCapacidad.getValue();
    if(capacidad <= 0){
        JOptionPane.showMessageDialog(this, "Ingrese capacidad de Colectivo");
        return;
    }
    Boolean estado = jrEstado.isSelected();

    if (coleActual == null || coleActual.getId_Colectivo() == 0) {
        coleActual = new Colectivo(matricula, marca, modelo, capacidad, estado);
        coleData.registrarColectivo(coleActual);
    } else {
        coleActual.setMatricula(matricula);
        coleActual.setMarca(marca);
        coleActual.setModelo(modelo);
        coleActual.setCapacidad(capacidad);
        coleData.modificarColectivo(coleActual);
    
}
            
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        String matricula= jtMatricula.getText();
        coleActual = coleData.buscarPorMatricula(matricula);
        if(coleActual != null){
            jtMarca.setText(coleActual.getMarca());
            jtModelo.setText(coleActual.getModelo());
            jsCapacidad.setValue(coleActual.getCapacidad());
            jrEstado.setSelected(coleActual.isEstado());
            
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        if(coleActual != null){
            coleData.eliminarColectivo(coleActual.getId_Colectivo());
            coleActual=null;
            limpiarCampos();
        }
        
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void limpiarCampos(){
        jtMatricula.setText("");
        jtMarca.setText("");
        jtModelo.setText("");
        jrEstado.setSelected(false);
        jsCapacidad.setValue(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JSpinner jsCapacidad;
    private javax.swing.JTextField jtMarca;
    private javax.swing.JTextField jtMatricula;
    private javax.swing.JTextField jtModelo;
    // End of variables declaration//GEN-END:variables
}
