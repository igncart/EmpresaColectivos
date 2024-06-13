
package empresacolectivos.vistas;




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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuPasajerosView = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuRutasView = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuHorarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

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
        GestionPasajeros gestionPasajeros = new GestionPasajeros();
        gestionPasajeros.setVisible(true);
        jDesktopPane1.add(gestionPasajeros);
    }//GEN-LAST:event_jMenuPasajerosViewActionPerformed

    private void jMenuHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHorariosActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        GestionHorarios gestionHorarios = new GestionHorarios();
        gestionHorarios.setVisible(true);
        jDesktopPane1.add(gestionHorarios);
        
    }//GEN-LAST:event_jMenuHorariosActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuRutasViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRutasViewActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        GestionRutas gestionRutas = new GestionRutas();
        gestionRutas.setVisible(true);
        jDesktopPane1.add(gestionRutas);
    }//GEN-LAST:event_jMenuRutasViewActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuHorarios;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuPasajerosView;
    private javax.swing.JMenuItem jMenuRutasView;
    // End of variables declaration//GEN-END:variables
}
