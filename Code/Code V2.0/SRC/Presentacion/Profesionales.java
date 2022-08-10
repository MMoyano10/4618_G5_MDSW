
package Presentacion;

import LogicaNegocio.Menu;
import LogicaNegocio.DatosProfesionales;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Profesionales extends javax.swing.JFrame {

 //--------- atributos = DATOS MIEMBRO-------
    private DatosProfesionales DatosProfesionales=new DatosProfesionales();
    private ArrayList<DatosProfesionales> listaDatosProfesionales=new ArrayList<DatosProfesionales>();
    private Menu archivos=new Menu();
    private DefaultTableModel dtmDatosProfesionales=new DefaultTableModel();
    private DefaultListModel dlmDatosProfesionales=new DefaultListModel();
    private JComboBox combo;
    private Object[] datos=new Object[4];
    private ArrayList arregloLista=new ArrayList();
    private File archivo =new File ("DatosProfesional.txt");
    private FileReader fr;// = new FileReader (archivo);
    private BufferedReader  br; // = new BufferedReader(fr);
    private FileWriter fw; //=new FileWriter("estudiantes.txt", true);
    
    //----- CONSTRUCTORES -------
     public Profesionales() {
        initComponents();
        dtmDatosProfesionales=(DefaultTableModel) tablaDatosProfesionales.getModel();
    }
  
    public void inicializarArchivoEscritura() throws IOException 
    {
        fw = new FileWriter("DatosProfesional.txt", true);//ubica y abre el archivo MODO APPEND no OVERRIDE
        BufferedWriter bw = new BufferedWriter(fw); //activa Buffer memoria con puntero de EscribirArchivo
    }
    public void inicializarArchivoLectura() throws IOException 
    {
        fr = new FileReader("DatosProfesional.txt");//ubica y abre el archivo MODO READ
        BufferedReader bw = new BufferedReader(fr); //activa Buffer memoria con puntero de LeerArchivo
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblDatosComedores = new javax.swing.JLabel();
        lblIDP = new javax.swing.JLabel();
        lblNombreP = new javax.swing.JLabel();
        lblCorreoP = new javax.swing.JLabel();
        txtIDP = new javax.swing.JTextField();
        txtNombreP = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        txtCedulaP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatosProfesionales = new javax.swing.JTable();
        btnGuardarArchivo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnTablaformulario = new javax.swing.JButton();
        lblCedulaP = new javax.swing.JLabel();
        txtCorreoU = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDatosComedores.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        lblDatosComedores.setText("DATOS DE PROFESIONALES");

        lblIDP.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        lblIDP.setText("ID DEL PROFESIONAL");

        lblNombreP.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        lblNombreP.setText("NOMBRE DEL PROFESIONAL");

        lblCorreoP.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        lblCorreoP.setText("CORREO DEL PROFESIONAL");

        txtIDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDPActionPerformed(evt);
            }
        });
        txtIDP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDPKeyTyped(evt);
            }
        });

        txtNombreP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrePKeyTyped(evt);
            }
        });

        btnActualizar.setText("Eliminar Fila");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        txtCedulaP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaPKeyTyped(evt);
            }
        });

        tablaDatosProfesionales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        tablaDatosProfesionales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "CÉDULA", "CORREO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaDatosProfesionales);

        btnGuardarArchivo.setText("Guardar Archivo");
        btnGuardarArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarArchivoMouseClicked(evt);
            }
        });
        btnGuardarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarArchivoActionPerformed(evt);
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

        btnTablaformulario.setText("Formulario a Tabla");
        btnTablaformulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablaformularioActionPerformed(evt);
            }
        });

        lblCedulaP.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        lblCedulaP.setText("CÉDULA DEL PROFESIONAL");

        txtCorreoU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoUActionPerformed(evt);
            }
        });
        txtCorreoU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoUKeyTyped(evt);
            }
        });

        jButton2.setText("VALIDAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btnActualizar)
                                .addGap(41, 41, 41)
                                .addComponent(btnGuardarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnTablaformulario))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblIDP)
                                            .addComponent(lblNombreP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblCorreoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblCedulaP, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(62, 62, 62)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtCedulaP, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                            .addComponent(txtNombreP, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIDP)
                                            .addComponent(txtCorreoU)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(112, 112, 112)
                                        .addComponent(lblDatosComedores, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblDatosComedores)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIDP, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txtIDP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNombreP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtCedulaP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCorreoU, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCedulaP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCorreoP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir)
                    .addComponent(btnTablaformulario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDPActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
     try{
            JOptionPane.showMessageDialog(null, "Elimina 1 registro ");
            dtmDatosProfesionales.removeRow(tablaDatosProfesionales.getSelectedRow());
        }catch(ArrayIndexOutOfBoundsException ae)
        {
            JOptionPane.showMessageDialog(null, "final del archivo "+ ae.getMessage());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnGuardarArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarArchivoMouseClicked
       guardarTablaArchivo();
    }//GEN-LAST:event_btnGuardarArchivoMouseClicked

    private void btnGuardarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarArchivoActionPerformed
         guardarTablaArchivo();
    // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarArchivoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnTablaformularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablaformularioActionPerformed
        llenarTablaComedores();        // TODO add your handling code here:
    }//GEN-LAST:event_btnTablaformularioActionPerformed

    private void txtIDPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDPKeyTyped
         char c = evt.getKeyChar ();
        
         if(txtIDP.getText().length() == 10)  evt.consume();
    }//GEN-LAST:event_txtIDPKeyTyped

    private void txtCorreoUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoUKeyTyped
        
    }//GEN-LAST:event_txtCorreoUKeyTyped

    private void txtCedulaPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaPKeyTyped
        char c = evt.getKeyChar ();
        
        if(c<'0' || c>'9') evt.consume();
        
        if(txtCedulaP.getText().length() == 10)  evt.consume();

    }//GEN-LAST:event_txtCedulaPKeyTyped

    private void txtNombrePKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePKeyTyped
        char c = evt.getKeyChar ();
        
        if((c<'a' || c>'z') && (c<'A' | c>'z')) evt.consume();

    }//GEN-LAST:event_txtNombrePKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        validar();  
        verificar ();
        verificarC ();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCorreoUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoUActionPerformed
       
    }//GEN-LAST:event_txtCorreoUActionPerformed

    private void validar (){
            try{
                if(!txtIDP.getText().isEmpty()){
                    if(!txtNombreP.getText().isEmpty()){
                            if(!txtCedulaP.getText().isEmpty()){ 
                                if(!txtCorreoU.getText().isEmpty()){
                        
                        }else{
                            JOptionPane.showMessageDialog(this, "INGRESE EL CORREO","Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                        }
                            }else{
                            JOptionPane.showMessageDialog(this,  "INGRESE LA CÉDULA", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                        }
                }else {
                   JOptionPane.showMessageDialog(this, "INGRESE EL NOMBRE","Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                }
             }else{
          JOptionPane.showMessageDialog(this,  "INGRESE EL ID", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
         }
                JOptionPane.showMessageDialog(null, "DATOS CORRECTOS");
            }catch (Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
   
   private void verificar (){
            try{
                if(txtCedulaP.getText().length() == 10){
                    
                }else{
                        JOptionPane.showMessageDialog(this, "VERIFIQUE LA CÉDULA","Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                    }
            }catch (Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
           }
  
   }
   
  
   private void verificarC (){
            try{
                  if(!txtCorreoU.getText().isEmpty()){
                        
                        }else if (txtCorreoU.getText().contains("@") || txtCorreoU.getText().contains(".com"))
                                {
                            JOptionPane.showMessageDialog(this, "VERIFIQUE EL CORREO","Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                        }
            }catch (Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
           }
   }
   
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Profesionales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profesionales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profesionales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profesionales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profesionales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnGuardarArchivo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTablaformulario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedulaP;
    private javax.swing.JLabel lblCorreoP;
    private javax.swing.JLabel lblDatosComedores;
    private javax.swing.JLabel lblIDP;
    private javax.swing.JLabel lblNombreP;
    private javax.swing.JTable tablaDatosProfesionales;
    private javax.swing.JTextField txtCedulaP;
    private javax.swing.JTextField txtCorreoU;
    private javax.swing.JTextField txtIDP;
    private javax.swing.JTextField txtNombreP;
    // End of variables declaration//GEN-END:variables

     public void limpiarTabla()
    {
        try{
            tablaDatosProfesionales.removeAll();
            JOptionPane.showMessageDialog(null, "Tabla Registro # : ");
            for(int i=0; i<=tablaDatosProfesionales.getRowCount(); i++)
            {
                JOptionPane.showMessageDialog(null, "Tabla Registro # : "+i);
                dtmDatosProfesionales.removeRow(i);
            }
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Revisar : "+ ex.getMessage());
        }
            
    }
     
     public void cargarLista()
    {
        String vID, vNombre, vCédula, vCorreo;
            for(int i=0; i<tablaDatosProfesionales.getRowCount(); i++)
            {
                vID=dtmDatosProfesionales.getValueAt(i,0).toString();
                vNombre=dtmDatosProfesionales.getValueAt(i,1).toString();
                vCédula=dtmDatosProfesionales.getValueAt(i,2).toString();
                vCorreo=dtmDatosProfesionales.getValueAt(i,3).toString();
                listaDatosProfesionales.add(new DatosProfesionales(vID, vNombre, vCédula, vCorreo));
            }  
            JOptionPane.showMessageDialog(null, "desplegar lista ");
            for(DatosProfesionales DatosProfesionales : listaDatosProfesionales)
            {
                vID=DatosProfesionales.getID();
                vNombre=DatosProfesionales.getNombre();
                vCédula=DatosProfesionales.getCedula();
                vCorreo=DatosProfesionales.getCorreo();
                JOptionPane.showMessageDialog(null, "---> " +
                        vID + "="+ vNombre +  "="+ vCédula +"="+ vCorreo);
            }
            JOptionPane.showMessageDialog(null, "JTable ---> Lista ok ");
    }
       

public void cargarTablaLista()
    {
        String vID, vNombre, vCédula, vCorreo, vlista;
        try{
            String titulos[] = {"ID","NOMBRE","CÉDULA", "CORREO"};
            dtmDatosProfesionales.setColumnIdentifiers(titulos);
             for(DatosProfesionales DatosProfesionales : listaDatosProfesionales)
            {
                datos[0]=DatosProfesionales.getID();
                datos[1]=DatosProfesionales.getNombre();
                datos[2]=DatosProfesionales.getCedula();
                datos[3]=DatosProfesionales.getCorreo();
                dtmDatosProfesionales.addRow(datos);
            }
            tablaDatosProfesionales.setModel(dtmDatosProfesionales);
            JOptionPane.showMessageDialog(null, "Lista---> Tabla ok");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"mensaje obtiene ROL",JOptionPane.ERROR_MESSAGE);
        }
    }
 

    private void guardarTablaArchivo() {
          try{
            inicializarArchivoEscritura();
            for(int i=0; i<tablaDatosProfesionales.getRowCount(); i++)
            {
                fw.write(dtmDatosProfesionales.getValueAt(i,0).toString()+ "\n");
                fw.write(dtmDatosProfesionales.getValueAt(i,1).toString()+ "\n");
                fw.write(dtmDatosProfesionales.getValueAt(i,2).toString()+ "\n");
                fw.write(dtmDatosProfesionales.getValueAt(i,3).toString()+ "\n");
            }
            fw.close();
            JOptionPane.showMessageDialog(null, "ARCHIVO GUARDADO SATISFACTORIAMENTE");
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Revisar : "+ ex.getMessage());
        }
}

        public void actualizarTablaArchivo() throws IOException
    {
            JOptionPane.showConfirmDialog(null, "cargar Tabal--> lista");
            cargarLista();
            JOptionPane.showConfirmDialog(null, "limpiar tabla");
            limpiarTabla();
            JOptionPane.showConfirmDialog(null, "cargar lista---> Tabla");
            cargarTablaLista();
            JOptionPane.showConfirmDialog(null, "guardar Tabla--> Archivo");
            guardarTablaArchivo();
    }  
        
      public void llenarTablaComedores() {
        
        try{
            String titulos[] = {"ID","NOMBRE","CÉDULAS","CORREO"};
            dtmDatosProfesionales.setColumnIdentifiers(titulos);
            datos[0]=txtIDP.getText();
            datos[1]=txtNombreP.getText();
            datos[2]=txtCedulaP.getText();
            datos[3]=txtCorreoU.getText();
            dtmDatosProfesionales.addRow(datos);
            tablaDatosProfesionales.setModel(dtmDatosProfesionales);
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"mensaje obtiene ROL",JOptionPane.ERROR_MESSAGE);
        }
        limpiar();
             
    }  

    private void limpiar() {
            txtIDP.setText(" ");
            txtNombreP.setText(" ");
            txtCedulaP.setText(" ");
            txtCorreoU.setText(" ");
    }
    
   public void llenarTablaArchivo()
    {
            String ID, Nombre, Cédula, Correo;
        try {
            inicializarArchivoLectura();
            String titulos[] = {"ID","NOMBRE","CÉDULAS", "CORREO"};
            dtmDatosProfesionales.setColumnIdentifiers(titulos);
            Scanner registro=null;
            registro=new Scanner(archivo);
          
            while(registro.hasNextLine())
            {
                ID=registro.nextLine();
                Nombre=registro.nextLine();
                Cédula=registro.nextLine();
                Correo=registro.nextLine();
                dtmDatosProfesionales.addRow(new Object[]{ID, Nombre, Cédula, Correo});
            }
      }
      catch(Exception e){
         e.printStackTrace();
      }
    }   
    
     public void tomarDatosTabla(){
        int columna =tablaDatosProfesionales.getSelectedRow();
        String  codigo= (tablaDatosProfesionales.getValueAt(columna,0).toString());
        
        txtIDP.setText(tablaDatosProfesionales.getValueAt(columna,0).toString());
        txtNombreP.setText(tablaDatosProfesionales.getValueAt(columna,1).toString());
        txtCedulaP.setText(tablaDatosProfesionales.getValueAt(columna,2).toString());
        txtCorreoU.setText(tablaDatosProfesionales.getValueAt(columna,3).toString());
      }

}
