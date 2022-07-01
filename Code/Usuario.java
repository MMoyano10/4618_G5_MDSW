
package Presentacion;

import LogicaNegocio.DatosUsuario;
import LogicaNegocio.Menu;
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

public class Usuario extends javax.swing.JFrame {
    
    private DatosUsuario DatosUsuario=new DatosUsuario();
    private ArrayList<DatosUsuario> listaDatosUsuario=new ArrayList<DatosUsuario>();
    private Menu archivos=new Menu();
    private DefaultTableModel dtmDatosUsuario=new DefaultTableModel();
    private DefaultListModel dlmDatosUsuario=new DefaultListModel();
    private JComboBox combo;
    private Object[] datos=new Object[4];
    private ArrayList arregloLista=new ArrayList();
    private File archivo =new File ("Datos.txt");
    private FileReader fr;// = new FileReader (archivo);
    private BufferedReader  br; // = new BufferedReader(fr);
    private FileWriter fw; //=new FileWriter("estudiantes.txt", true);
    
    //----- CONSTRUCTORES -------
     public Usuario() {
        initComponents();
        dtmDatosUsuario=(DefaultTableModel) tablaDatosUsuario.getModel();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatosUsuario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblIDU = new javax.swing.JLabel();
        lblNombreU = new javax.swing.JLabel();
        lblDireccionU = new javax.swing.JLabel();
        lblCedulaU = new javax.swing.JLabel();
        btnTablaformulario = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardarArchivo = new javax.swing.JButton();
        txtIDU = new javax.swing.JTextField();
        txtNombreU = new javax.swing.JTextField();
        txtDireccionU = new javax.swing.JTextField();
        txtCedulaU = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnActualizar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaDatosUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        tablaDatosUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "DIRECCION", "CEDULA"
            }
        ));
        jScrollPane1.setViewportView(tablaDatosUsuario);

        jLabel1.setFont(new java.awt.Font("Bertha Melanie", 1, 24)); // NOI18N
        jLabel1.setText("DATOS DEL USUARIO");

        lblIDU.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        lblIDU.setText("ID DEL USUARIO");

        lblNombreU.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        lblNombreU.setText("NOMBRE DEL USUARIO");

        lblDireccionU.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        lblDireccionU.setText("DIRECCIÓN DEL USUARIO");

        lblCedulaU.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        lblCedulaU.setText("CÉDULA DEL USUARIO");

        btnTablaformulario.setText("Formulario a Tabla");
        btnTablaformulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablaformularioActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

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

        txtIDU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDUActionPerformed(evt);
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

        btnActualizar1.setText("Eliminar Fila");
        btnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblIDU, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombreU, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDireccionU)
                                    .addComponent(lblCedulaU, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(198, 198, 198)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtIDU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCedulaU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccionU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnActualizar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(btnGuardarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(btnTablaformulario)
                                .addGap(34, 34, 34)
                                .addComponent(btnSalir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIDU, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDireccionU, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccionU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedulaU)
                    .addComponent(txtCedulaU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir)
                    .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTablaformulario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTablaformularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablaformularioActionPerformed
        llenartablaDatosUsuario();
    }//GEN-LAST:event_btnTablaformularioActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        dtmDatosUsuario.addRow(new Object[] {"", "", "", "", ""});
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarArchivoMouseClicked
      
    }//GEN-LAST:event_btnGuardarArchivoMouseClicked

    private void btnGuardarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarArchivoActionPerformed
        guardarTablaArchivo();
            // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarArchivoActionPerformed

    private void txtIDUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDUActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar1ActionPerformed
     try{
            JOptionPane.showMessageDialog(null, "Elimina 1 registro ");
            dtmDatosUsuario.removeRow(tablaDatosUsuario.getSelectedRow());
        }catch(ArrayIndexOutOfBoundsException ae)
        {
            JOptionPane.showMessageDialog(null, "final del archivo "+ ae.getMessage());
        }
    }//GEN-LAST:event_btnActualizar1ActionPerformed

  
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DatosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnGuardarArchivo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTablaformulario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedulaU;
    private javax.swing.JLabel lblDireccionU;
    private javax.swing.JLabel lblIDU;
    private javax.swing.JLabel lblNombreU;
    private javax.swing.JTable tablaDatosUsuario;
    private javax.swing.JTextField txtCedulaU;
    private javax.swing.JTextField txtDireccionU;
    private javax.swing.JTextField txtIDU;
    private javax.swing.JTextField txtNombreU;
    // End of variables declaration//GEN-END:variables

     public void limpiarTabla()
    {
        try{
            tablaDatosUsuario.removeAll();
            JOptionPane.showMessageDialog(null, "Tabla Registro # : ");
            for(int i=0; i<=tablaDatosUsuario.getRowCount(); i++)
            {
                JOptionPane.showMessageDialog(null, "Tabla Registro # : "+i);
                dtmDatosUsuario.removeRow(i);
            }
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Revisar : "+ ex.getMessage());
        }
            
    }
     
     public void cargarLista()
    {
        String vID, vNombre, vDirección, vCédula;
            for(int i=0; i<tablaDatosUsuario.getRowCount(); i++)
            {
                vID=dtmDatosUsuario.getValueAt(i,0).toString();
                vNombre=dtmDatosUsuario.getValueAt(i,1).toString();
                vDirección=dtmDatosUsuario.getValueAt(i,2).toString();
                vCédula=dtmDatosUsuario.getValueAt(i,3).toString();
                listaDatosUsuario.add(new DatosUsuario(vID, vNombre, vDirección, vCédula));
                
            }  
            JOptionPane.showMessageDialog(null, "desplegar lista ");
            for(DatosUsuario DatosUsuario : listaDatosUsuario)
            {
                vID=DatosUsuario.getID();
                vNombre=DatosUsuario.getNombre();
                vDirección=DatosUsuario.getDirección();
                vCédula=DatosUsuario.getCédula();       
                JOptionPane.showMessageDialog(null, "---> " +
                        vID + "="+ vNombre +  "="+ vDirección +  "="+ vCédula);
            }
            JOptionPane.showMessageDialog(null, "JTable ---> Lista ok ");
    }
       

public void cargarTablaLista()
    {
        String vnombre, vid, vlista;
        try{
            String titulos[] = {"ID","NOMBRE","DIRECCION", "CEDULA"};
            dtmDatosUsuario.setColumnIdentifiers(titulos);
             for(DatosUsuario DatosUsuario: listaDatosUsuario)
            {
                datos[0]=DatosUsuario.getID();
                datos[1]=DatosUsuario.getNombre();
                datos[2]=DatosUsuario.getDirección();
                datos[3]=DatosUsuario.getCédula();
                dtmDatosUsuario.addRow(datos);
            }
            tablaDatosUsuario.setModel(dtmDatosUsuario);
            JOptionPane.showMessageDialog(null, "Lista---> Tabla ok");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"mensaje obtiene ROL",JOptionPane.ERROR_MESSAGE);
        }
    }
 

    private void guardarTablaArchivo() {
          try{
            inicializarArchivoEscritura();
            for(int i=0; i<tablaDatosUsuario.getRowCount(); i++)
            {
                fw.write(dtmDatosUsuario.getValueAt(i,0).toString()+ "\n");
                fw.write(dtmDatosUsuario.getValueAt(i,1).toString()+ "\n");
                fw.write(dtmDatosUsuario.getValueAt(i,2).toString()+ "\n");
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
        
      public void llenartablaDatosUsuario() {
        
        try{
            String titulos[] = {"ID","NOMBRE","DIRECCIÓN", "CEDULA"};
            dtmDatosUsuario.setColumnIdentifiers(titulos);
            datos[0]=txtIDU.getText();
            datos[1]=txtNombreU.getText();
            datos[2]=txtDireccionU.getText();
            datos[3]=txtCedulaU.getText();
            dtmDatosUsuario.addRow(datos);
            tablaDatosUsuario.setModel(dtmDatosUsuario);
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"mensaje obtiene ROL",JOptionPane.ERROR_MESSAGE);
        }
        limpiar();
             
    }  

    private void limpiar() {
            txtIDU.setText(" ");
            txtNombreU.setText(" ");
            txtDireccionU.setText(" ");
            txtCedulaU.setText(" ");
    }
    
   public void llenarTablaArchivo()
    {
            String Nombre, ID, Dirección, Cédula;
        try {
            inicializarArchivoLectura();
            String titulos[] = {"ID", "NOMBRE", "DIRECCIÓN", "CEDULA"};
            dtmDatosUsuario.setColumnIdentifiers(titulos);
            Scanner registro=null;
            registro=new Scanner(archivo);
          
            while(registro.hasNextLine())
            {
                Nombre=registro.nextLine();
                ID=registro.nextLine();
                Dirección=registro.nextLine();
                Cédula=registro.nextLine();
                dtmDatosUsuario.addRow(new Object[]{Nombre, ID, Dirección, Cédula });
            }
      }
      catch(Exception e){
         e.printStackTrace();
      }
    }  
    
     public void tomarDatosTabla(){
        int columna =tablaDatosUsuario.getSelectedRow();
        String  codigo= (tablaDatosUsuario.getValueAt(columna,0).toString());
        
        txtIDU.setText(tablaDatosUsuario.getValueAt(columna,0).toString());
        txtNombreU.setText(tablaDatosUsuario.getValueAt(columna,1).toString());
        txtDireccionU.setText(tablaDatosUsuario.getValueAt(columna,2).toString());
        txtCedulaU.setText(tablaDatosUsuario.getValueAt(columna,3).toString());
      }

}
