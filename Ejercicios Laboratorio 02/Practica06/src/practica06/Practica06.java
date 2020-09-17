package practica06;

import java.util.Scanner;

/**
 *
 * @author Nacho
 */
public class Practica06 {

    public static void main(String[] args) {
        //Definimos metodo entrada
        Scanner entrada = new Scanner(System.in);
        
        //Definimos Variables
        int a, b, c, area, sp;
        
        //Entradas
        System.out.println("Ingrese el valor del primer lado:");
        a = entrada.nextInt();
        System.out.println("Ingrese el valor del segundo lado:");
        b = entrada.nextInt();
        System.out.println("Ingrese el valor del tercer lado:");
        c = entrada.nextInt();
        
        //Procesos
        int p = a + b + c;
        sp = p/2;
        area = (int) Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        
        //Salida
        System.out.println("El área del triángulo es : " + area);
        
        
    }
    
}
