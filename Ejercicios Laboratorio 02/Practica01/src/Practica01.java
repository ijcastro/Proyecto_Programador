
import java.util.Scanner;

/**
 *
 * @author Nacho
 */
public class Practica01 {

    public static void main(String[] args) {
        //Declaramos la entrada por teclado
        Scanner entrada = new Scanner(System.in);
        //Declaramos Variables
        int cantTotalSeg, cantHoras, cantMin;
        int cantRestMin, cantRestHoras;
        //Entrada:
        System.out.println("Ingrese la cantidad de segundos");
        cantTotalSeg = entrada.nextInt();
        //Procesos:
        cantMin = (cantTotalSeg / 60);
        cantHoras = (cantMin / 60);
        cantRestHoras = (cantMin % 60);
        cantRestMin = (cantTotalSeg % 60);
        //Salida:
        System.out.println("El tiempo transcurrido es de " + cantHoras
                + (" hs, ") + (cantRestHoras) + (" minutos y ") + cantRestMin + (" segundos"));
        //It´s ok!!!
        //Vamooo Nachoooo!!!
    }

}
