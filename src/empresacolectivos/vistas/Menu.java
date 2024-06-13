/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package empresacolectivos.vistas;


/**
 *
 * @author IGNACIO
 */
public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Menu");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuPasajerosView = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuRutasView = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuHorarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 204));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sol (1).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 470));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.png"))); // NOI18N
        jMenu1.setText("Ventas");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem1.setText("Gestion de Ventas");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenu2.setText("Pasajeros");

        jMenuPasajerosView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuPasajerosView.setText("Gestion de Pasajeros");
        jMenuPasajerosView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPasajerosViewActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuPasajerosView);

        jMenuItem2.setText("Gestión Colectivos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenu3.setText("Rutas");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuRutasView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenuRutasView.setText("Gestion de rutas");
        jMenuRutasView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRutasViewActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuRutasView);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenu4.setText("Horarios");

        jMenuHorarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuHorarios.setText("Gestion de Horarios");
        jMenuHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHorariosActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuHorarios);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuPasajerosViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPasajerosViewActionPerformed
         jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        Pasajeros_View pasajerosView = new Pasajeros_View();
        pasajerosView.setVisible(true);

        jDesktopPane1.add(pasajerosView);
        
    }//GEN-LAST:event_jMenuPasajerosViewActionPerformed

    private void jMenuHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHorariosActionPerformed
         jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        Horarios_View horariosView = new Horarios_View();
        horariosView.setVisible(true);

        jDesktopPane1.add(horariosView);
        
    }//GEN-LAST:event_jMenuHorariosActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuRutasViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRutasViewActionPerformed
         jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        Rutas_View rutasView = new Rutas_View();
        rutasView.setVisible(true);

        jDesktopPane1.add(rutasView);
    }//GEN-LAST:event_jMenuRutasViewActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ColectivoView coleView = new ColectivoView();
        coleView.setVisible(true);

        jDesktopPane1.add(coleView);
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuHorarios;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuPasajerosView;
    private javax.swing.JMenuItem jMenuRutasView;
    // End of variables declaration//GEN-END:variables
}
