
package LogicaNegocio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prueba extends Menu{

    String escritorio;
    String biblioteca;
    String repisa;
    
    Integer opcion4;
    
    private List<String> listas=new ArrayList<String>();
    private Scanner teclado=new Scanner(System.in);
    private boolean bandera=false;
    
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    public Prueba() {
    }
    
    public Prueba(String vEscritorio, String vBiblioteca, String vRepisa){
        escritorio=vEscritorio;
        biblioteca=vBiblioteca;
        repisa=vRepisa;     
    }

    public String getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(String escritorio) {
        this.escritorio = escritorio;
    }

    public String getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(String biblioteca) {
        this.biblioteca = biblioteca;
    }

    public String getRepisa() {
        return repisa;
    }

    public void setRepisa(String repisa) {
        this.repisa = repisa;
    }
    
    
    public void menuPrueba()

    {
    do{
        try{
            System.out.println("    MENU DE PRUEBA     ");
            System.out.println("1. Ingresar Datos");
            System.out.println("2. Imprimir Datos");
            System.out.println("3. Eliminar Datos");
            System.out.println("4. Modificar Datos");
            System.out.println("5. Buscar Datos");
            System.out.println("6. Regresar al menu principal");



            opcion4= Integer.parseInt(br.readLine());

            }catch(Exception ex)
                {
                    System.out.println("error de entrada" + ex);
                }

    switch (opcion4)

    {
        case 1:oficinaDatos();break;
        case 2:imprimirOficina();break;
        case 3:eliminarDatos();break; 
        case 4:modificarDatos();break;
        case 5:buscarDatos(escritorio);break;
        case 6: menuP();break;
        default: System.out.println("Opcion no valida");

    }
    }while(opcion4!=3);
    }



    public void oficinaDatos()
    {
        try{
            System.out.println("¿EN SU COMPRA INCLUYE ESCRITORIO?");
            escritorio=br.readLine();
            System.out.println("¿EN SU COMPRA INCLUYE BIBLIOTECA?");
            biblioteca=br.readLine();
            System.out.println("¿EN SU COMPRA INCLUYE REPISAS?");
            repisa=br.readLine();

        }catch(Exception ex)
        {
            System.out.println("error de entrada" + ex);
        }
    }

     public void imprimirOficina()
    {
        try{
            System.out.println("ESCRITORIO: " + escritorio);
            System.out.println("BIBLIOTECA: " + biblioteca);
            System.out.println("REPISAS: "    + repisa);
        }catch(Exception ex)
        {
            System.out.println("error de entrada" + ex);
        }
    }

      
      public void modificarDatos (){
        this.escritorio=(null);
        this.biblioteca=(null);
        this.repisa=(null);
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
        
        Prueba objPrueba=new Prueba();
    }

}


