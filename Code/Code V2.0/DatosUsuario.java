
package LogicaNegocio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DatosUsuario extends Menu{

    String ID;
    String Nombre;
    String Dirección;
    String Cédula;
    
    Integer opcion1;
    
    private List<String> listas=new ArrayList<String>();
    private Scanner teclado=new Scanner(System.in);
    private boolean bandera=false;
    
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
  
    public DatosUsuario() {
    }
    
    public DatosUsuario(String vID, String vNombre, String vDirección, String vCédula){
        ID=vID;
        Nombre=vNombre;
        Dirección=vDirección;
        Cédula=vCédula;     
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

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public String getCédula() {
        return Cédula;
    }

    public void setCédula(String Cédula) {
        this.Cédula = Cédula;
    }

    public void menuDatosUsuario()     
    {
    do{
        try{
            System.out.println("    MENU DE COMEDORES   ");
            System.out.println("1. Ingresar Datos");
            System.out.println("2. Imprimir Datos");
            System.out.println("3. Eliminar Datos");
            System.out.println("4. Modificar Datos");
            System.out.println("5. Buscar Datos");
            System.out.println("6. Regresar al menu principal");


            opcion1= Integer.parseInt(br.readLine());
            
            }catch(Exception ex)
                {
                    System.out.println("error de entrada" + ex);
                }
   
    switch (opcion1)

    {
        case 1:ingresarDatos();break;
        case 2:imprimirDatosUsuario();break;
        case 3:eliminarDatos();break; 
        case 4:modificarDatos();break;
        case 5:buscarDatos(ID);break;
        case 6: menuP();break;
        default: System.out.println("Opcion no valida");
            
    }
    }while(opcion1!=3);
    }
       
    public void ingresarDatos()
    {
        try{
            System.out.println("INGRESE EL ID DEl USUARIO");
            ID=br.readLine();
            System.out.println("INGRESE EL NOMBRE DEl USUARIO");
            Nombre=br.readLine();
            System.out.println("INGRESE LA DIRECCION DEl USUARIO");
            Dirección=br.readLine();
            System.out.println("INGRESE LA CÉDULA DEl USUARIO");
            Cédula=br.readLine();
            
        }catch(Exception ex)
        {
            System.out.println("ERROR EN DATOS INGRESADOS" + ex);
        }
    }

     public void imprimirDatosUsuario()
    {
        try{
            System.out.println("EL ID ES: "          + ID);
            System.out.println("EL NOMBRE ES: "      + Nombre);
            System.out.println("LA DIRECCIÓN ES: "   + Dirección );
            System.out.println("LA CÉDULA ES: "      + Cédula);


        }catch(Exception ex)
        {
            System.out.println("ERROR EN IMPRESIÓN" + ex);
        }
    }

      public void modificarDatos (){
        this.ID=(null);
        this.Nombre=(null);
        this.Dirección=(null);
        this.Cédula=(null);
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
            bw.write(" ");
            System.out.println("SE LIMPIARON LOS DATOS");
            bw.close();
        } catch (Exception e) {
        }
    }
      
 public static void main(String[] args) {
        
        DatosUsuario objDatosUsuario=new DatosUsuario();
    }

}
