
import java.util.Calendar;
import java.util.Scanner;



/**
 *
 * @author Nacho
 */
public class Practica03 {

    
    public static void main(String[] args) {
        //Metodo de entrada
        Scanner entrada = new Scanner(System.in);
        //Variables
        int añoNacim;
        int añoActual = Calendar.getInstance().get(Calendar.YEAR);
        
        //Entradas
        System.out.println("Ingrese año de nacimiento");
        añoNacim = entrada.nextInt();
        
        //Proceso
        int edad = añoActual - añoNacim;
        
        //Salida
        System.out.println("Su edad al final del año sera " + edad);
        
    }
    
}
