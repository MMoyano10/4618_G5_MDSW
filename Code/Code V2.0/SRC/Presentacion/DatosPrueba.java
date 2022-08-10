
package Presentacion;

import LogicaNegocio.Prueba;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DatosPrueba extends javax.swing.JFrame {
    
    private Prueba DPrueba=new Prueba();
    private ArrayList<Prueba> listaPrueba=new ArrayList<Prueba>();
    private DefaultTableModel dtmPrueba=new DefaultTableModel();
    private DefaultListModel dlmPrueba=new DefaultListModel();
    private JComboBox combo;
    private Object[] datos=new Object[3];
    private ArrayList arregloLista=new ArrayList();
    private File archivo =new File ("Datos.txt");
    private FileReader fr;// = new FileReader (archivo);
    private BufferedReader  br; // = new BufferedReader(fr);
    private FileWriter fw; //=new FileWriter("estudiantes.txt", true);
    
    //----- CONSTRUCTORES -------
     public DatosPrueba() {
        initComponents();
    }
  
    public void inicializarArchivoEscritura() throws IOException 
    {
        fw = new FileWriter("Datos.txt", true);//ubica y abre el archivo MODO APPEND no OVERRIDE
        BufferedWriter bw = new BufferedWriter(fw); //activa Buffer memoria con puntero de EscribirArchivo
    }
    public void inicializarArchivoLectura() throws IOException 
    {
        fr = new FileReader("Datos.txt");//ubica y abre el archivo MODO READ
        BufferedReader bw = new BufferedReader(fr); //activa Buffer memoria con puntero de LeerArchivo
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblEscritorio = new javax.swing.JLabel();
        lblBiblioteca = new javax.swing.JLabel();
        lblRepisa = new javax.swing.JLabel();
        txtEscritorio = new javax.swing.JTextField();
        txtBiblioteca = new javax.swing.JTextField();
        txtRepisa = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel1.setText("DATOS OFERTA");

        lblEscritorio.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        lblEscritorio.setText("Descuento");

        lblBiblioteca.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        lblBiblioteca.setText("Temporada");

        lblRepisa.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        lblRepisa.setText("Gasto en oferta");

        txtEscritorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEscritorioActionPerformed(evt);
            }
        });
        txtEscritorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEscritorioKeyTyped(evt);
            }
        });

        txtBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBibliotecaActionPerformed(evt);
            }
        });
        txtBiblioteca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBibliotecaKeyTyped(evt);
            }
        });

        txtRepisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepisaActionPerformed(evt);
            }
        });
        txtRepisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRepisaKeyTyped(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 204, 204));
        btnSalir.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(204, 0, 0));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jButton1.setText("VALIDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(lblBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(lblRepisa, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtBiblioteca)
                            .addComponent(txtRepisa))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(47, 47, 47))))
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txtEscritorio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRepisa, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtRepisa))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEscritorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEscritorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEscritorioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        validar ();
        verificar ();
        verificarG ();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtEscritorioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEscritorioKeyTyped
        char c = evt.getKeyChar ();
        
        if(c<'0' || c>'9') evt.consume();
        if(txtEscritorio.getText().length() == 2)  evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEscritorioKeyTyped

    private void txtBibliotecaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBibliotecaKeyTyped
        char c = evt.getKeyChar ();
        
        if((c<'a' || c>'z') && (c<'A' | c>'z')) evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBibliotecaKeyTyped

    private void txtRepisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRepisaKeyTyped
        char c = evt.getKeyChar ();
        
        if(c<'0' || c>'9') evt.consume();
        
         if(txtRepisa.getText().length() == 3)  evt.consume();
            // TODO add your handling code here:
    }//GEN-LAST:event_txtRepisaKeyTyped

    private void txtBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBibliotecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBibliotecaActionPerformed

    private void txtRepisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepisaActionPerformed

     private void validar (){
            try{
                    if(!txtEscritorio.getText().isEmpty()){
                        if(!txtBiblioteca.getText().isEmpty()){
                            if(!txtRepisa.getText().isEmpty()){ 
                            
                        }else{
                            JOptionPane.showMessageDialog(this,  "INGRESE LA CANTIDAD", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "INGRESE EL TIPO","Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                    }
                }else {
                   JOptionPane.showMessageDialog(this, "INGRESE EL VALOR","Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                }
             
                JOptionPane.showMessageDialog(null, "DATOS CORRECTOS");
            }catch (Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
   
 private void verificar (){
            try{
                if(txtEscritorio.getText().length() == 2){
                    
                }else{
                        JOptionPane.showMessageDialog(this, "VERIFIQUE EL VALOR","Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                    }
            }catch (Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
           }
     }
   
  private void verificarG (){
            try{
                if(txtRepisa.getText().length() == 3){
                    
                }else{
                        JOptionPane.showMessageDialog(this, "VERIFIQUE EL GASTO","Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                    }
            }catch (Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
           }
     }
  
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
            java.util.logging.Logger.getLogger(DatosOficina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosOficina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosOficina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosOficina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosPrueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBiblioteca;
    private javax.swing.JLabel lblEscritorio;
    private javax.swing.JLabel lblRepisa;
    private javax.swing.JTextField txtBiblioteca;
    private javax.swing.JTextField txtEscritorio;
    private javax.swing.JTextField txtRepisa;
    // End of variables declaration//GEN-END:variables


}
