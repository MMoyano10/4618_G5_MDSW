
package LogicaNegocio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu {
    
    Integer opcion;
    
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    
    public static DatosUsuario       obj1=new DatosUsuario();
    public static DatosProfesionales obj2= new DatosProfesionales();
    public static DatosPrenda        obj3= new DatosPrenda();
    public static Prueba             obj4= new Prueba();

         
    public void menuP() 
    {
    do{
        try{
            System.out.println("    MENU DE LAS CATEGORÍAS  ");
            System.out.println("        1. DATOS DE USUARIO");
            System.out.println("        2. DATOS DEL PROFESIONAL");
            System.out.println("        3. DATOS DE LA PRENDA");
            System.out.println("        4. PRUEBA");
            System.out.println("        5. SALIR");
            
            opcion= Integer.parseInt(br.readLine());
            
            }catch(Exception ex)
                {
                    System.out.println("*ERROR*" + ex);
                }
   
     
    switch (opcion)

    {
        
        case 1:System.out.println("DATOS DE USUARIO");
                obj1.menuDatosUsuario();
                break;        
        case 2:System.out.println("DATOS DEL PROFESIONAL");
                obj2.menuDatosProfesionales();
                break;
        case 3:System.out.println("DATOS DE LA PRENDA");
                obj3.menuDatosPrenda();
                break;
        case 4:System.out.println("PRUEBA");
                obj4.menuPrueba();
                break;
        case 5:exit();
    }
    
    }while(opcion!=6);
    }
    
    
    public void exit()
    {
        try{
            System.out.println("GRACIAS POR USAR EL SERVICIO");

        }catch(Exception ex)
        {
            System.out.println("ERROR" + ex);
        }
    }

    public static void main(String[] args) {
        
        Menu objMenu=new Menu();
        objMenu.menuP();

    }
}