
package Presentacion;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnUsuario = new javax.swing.JButton();
        btnComedores = new javax.swing.JButton();
        btnSalas = new javax.swing.JButton();
        btnOficina = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblMaderas = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setName("MENU "); // NOI18N
        setPreferredSize(new java.awt.Dimension(686, 481));
        getContentPane().setLayout(null);

        btnUsuario.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        btnUsuario.setForeground(new java.awt.Color(0, 0, 153));
        btnUsuario.setText("DATOS DE USUARIO");
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuario);
        btnUsuario.setBounds(60, 140, 280, 31);

        btnComedores.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        btnComedores.setForeground(new java.awt.Color(0, 0, 153));
        btnComedores.setText("DATOS DEL PROFESIONAL");
        btnComedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComedoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnComedores);
        btnComedores.setBounds(58, 193, 280, 31);

        btnSalas.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        btnSalas.setForeground(new java.awt.Color(0, 0, 204));
        btnSalas.setText("DATOS DE LA PRENDA");
        btnSalas.setMaximumSize(new java.awt.Dimension(149, 31));
        btnSalas.setMinimumSize(new java.awt.Dimension(149, 31));
        btnSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalasActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalas);
        btnSalas.setBounds(58, 242, 280, 30);

        btnOficina.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        btnOficina.setForeground(new java.awt.Color(0, 0, 204));
        btnOficina.setText("OFERTAS ");
        btnOficina.setMinimumSize(new java.awt.Dimension(149, 31));
        btnOficina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOficinaActionPerformed(evt);
            }
        });
        getContentPane().add(btnOficina);
        btnOficina.setBounds(58, 283, 280, 31);

        btnSalir.setBackground(new java.awt.Color(255, 204, 204));
        btnSalir.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(204, 0, 0));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(402, 325, 109, 40);

        lblMaderas.setBackground(new java.awt.Color(204, 255, 204));
        lblMaderas.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        lblMaderas.setText("COMPRA-VENTA DE APARATOS TECNOLÓGICOS");
        lblMaderas.setAutoscrolls(true);
        lblMaderas.setMaximumSize(new java.awt.Dimension(100, 14));
        lblMaderas.setMinimumSize(new java.awt.Dimension(100, 14));
        lblMaderas.setPreferredSize(new java.awt.Dimension(700, 58));
        getContentPane().add(lblMaderas);
        lblMaderas.setBounds(100, 60, 440, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComedoresActionPerformed
        Profesionales ventana2 = new Profesionales();
        ventana2.setVisible(true);
    }//GEN-LAST:event_btnComedoresActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         this.dispose(); 
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        Usuario ventana1 = new Usuario();
        ventana1.setVisible(true);
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalasActionPerformed
        Prenda ventana3 = new Prenda();
        ventana3.setVisible(true);
    }//GEN-LAST:event_btnSalasActionPerformed

    private void btnOficinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOficinaActionPerformed
        DatosPrueba ventana4 = new DatosPrueba();
        ventana4.setVisible(true);
    }//GEN-LAST:event_btnOficinaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuMuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComedores;
    private javax.swing.JButton btnOficina;
    private javax.swing.JButton btnSalas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMaderas;
    // End of variables declaration//GEN-END:variables

}
