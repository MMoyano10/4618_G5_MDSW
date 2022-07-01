
package LogicaNegocio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DatosProfesionales extends Menu{
    
    String ID;
    String Nombre;
    String Cedula;
    String Correo;
    
    Integer opcion2;
    
    private List<String> listas=new ArrayList<String>();
    private Scanner teclado=new Scanner(System.in);
    private static DatosProfesionales listasFunciones=new DatosProfesionales();
    private Scanner tecladito=new Scanner(System.in);
    private boolean bandera=false;
    
    
    InputStreamReader isr=new InputStreamReader(System.in);

    BufferedReader br=new BufferedReader(isr);

    public DatosProfesionales() {
    }
   
    public DatosProfesionales(String vID, String vNombre, String vCedula, String vCorreo){
        ID=vID;
        Nombre=vNombre;
        Cedula=vCedula; 
        Correo=vCorreo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
    
    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
  
    
    public void menuDatosProfesionales()    
    {
    do{
        try{
        
        
            System.out.println("    MENU DE DATOS DE PROFESIONALES   ");
            System.out.println("1. Ingresar Datos");
            System.out.println("2. Imprimir Datos");
            System.out.println("3. Eliminar Datos");
            System.out.println("4. Modificar Datos");
            System.out.println("5. Buscar Datos");
            System.out.println("6. Regresar al menu principal");

          
            opcion2= Integer.parseInt(br.readLine());
            
            }catch(Exception ex)
                {
                    System.out.println("error de entrada" + ex);
                }
   
    switch (opcion2)

    {
        case 1:escribirDatos();break;
        case 2:adjuntarDatos();break;
        case 3:eliminarDatos();break; 
        case 4:modificarDatos();break;
        case 5:buscarDatos(ID);break;
        case 6: menuP();break;
        default: System.out.println("Opcion no valida");
            
    }
    }while(opcion2!=3);
    }
  
    public void escribirDatos()
    {
        try{
            System.out.println("EL ID DEL USUARIO ES: ");
            ID=br.readLine();
            System.out.println("EL NOMBRE DEL USUARIO ES: ");
            Nombre=br.readLine();
            System.out.println("LA CEDULA DEL USUARIO ES: ");
            Cedula=br.readLine();
            System.out.println("EL CORREO DEL USUARIO ES: ");
            Correo=br.readLine();
            

        }catch(Exception ex)
        {
            System.out.println("*ERROR*" + ex);
        }
    }

     public void adjuntarDatos()
    {
        try{
            System.out.println("ID: " + ID);
            System.out.println("NOMBRE: " + Nombre);
            System.out.println("CEDULA: " + Cedula);
            System.out.println("CORREO: " + Correo);
            

        }catch(Exception ex)
        {
            System.out.println("*ERROR*" + ex);
        }
    }

     
      public void modificarDatos (){
        this.ID=ID;
        this.Nombre=Nombre;
        this.Cedula=Cedula;
        this.Correo=Correo;
        }
      
     public boolean buscarDatos(String buscado)
      {
          for (String cadena: listas) 
        {
            if(cadena.equals(buscado)){
                System.out.print("  SI ");   
                bandera=true;
            }
            else
            {
                System.out.print("  NO  ");   
            }
             System.out.println(cadena + " Es igual " + buscado + " Resultado = " + bandera);
            
        }
          return bandera;
          
      }

     public void eliminarDatos(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("datos.txt"));
            bw.write("");
            System.out.println("SE LIMPIARON LOS DATOS");
            bw.close();
        } catch (Exception e) {
        }
    }
     
    public static void main(String[] args) {

        DatosProfesionales objDatosProfesionales=new DatosProfesionales();
        
    }

    private void Menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

