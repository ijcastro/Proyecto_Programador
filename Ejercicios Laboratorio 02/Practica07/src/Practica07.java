
import java.util.Scanner;


/**
 *
 * @author Nacho
 */
public class Practica07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables y método de entrada:
        int num, centena, decena, unidad;
        Scanner input = new Scanner(System.in);

        //Entrada:
        System.out.println("Ingresar un número de 3 cifras");
        num = input.nextInt();

        //Procesos:
        centena = num / 100;
        decena = (num % 100) / 10;
        unidad = (num % 100) % 10;
        
        //Salidas:
        System.out.println("Centena: " + centena);
        System.out.println("Decena: " + decena);
        System.out.println("Unidad: " + unidad);
        
    }
    
}
