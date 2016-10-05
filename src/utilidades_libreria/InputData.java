package utilidades_libreria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InputData {
    
     private static String pedirCadena(String mensaje){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena = "";
        boolean error;
        try{
            System.out.println(mensaje);
            cadena = br.readLine();
            error = false;
        }catch(IOException ex){
            System.out.println("Error de entrada");
            error = true;
                  
        }while(error);
       
        return cadena;
    }
    
    private static double pedirDouble(String mensaje){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double duracion = 0;
        boolean error;
        try{
            System.out.println(mensaje);
            duracion = Double.parseDouble(br.readLine());
            error = false;
        }catch(IOException ex){
            System.out.println("Error de entrada");
            error = true;
                  
        }while(error);
        
        return duracion;
    
    }
    
    private static int pedirEntero(String mensaje){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        boolean error;
        try{
            System.out.println(mensaje);
            numero = Integer.parseInt(br.readLine());
            error = false;
        }catch(IOException ex){
            System.out.println("Error de entrada");
            error = true;
        }catch(NumberFormatException ex){
            System.out.println("Escribe un numero");
            error = true;
            
        }while(error);
        
        return numero;
    }
    
}
