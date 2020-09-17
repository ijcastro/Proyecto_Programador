
import java.util.Scanner;


/**
 *
 * @author Nacho
 */
public class Practica05 {

        public static void main(String[] args) {
        //Metodo de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Variables
        double radio, volEsfera;
                
        //Entrada
        System.out.println("Ingrese la longitud del radio");
        radio = entrada.nextDouble();
        
        //Procesos
        double radioCubo = Math.pow(radio, 3);
        volEsfera = ((4*Math.PI*radioCubo)/3);
        
        //Salida
        System.out.println("El volumen de la esfera que corresponde a dicho radio es: " + volEsfera);
        
    }
    
}
