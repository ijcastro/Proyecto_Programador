package practica41;

import java.util.Scanner;

public class Practica41 {

    public static void main(String[] args) {
        //Ejercicio Temperaturas

        //Declaramos variables y métodos
        Scanner entrada = new Scanner(System.in);
        int n, i;
        i = n = 0;
        float promedio;
        float acumulador = promedio = 0;//declaro e inicializo acumulador
        boolean avisoMenos10 = false;

        //Entrada:
        do {
            System.out.println("Ingrese cantidad de temperaturas a procesar");
            n = entrada.nextInt();
        } while (n <= 0);

        float temperaturas[] = new float[n];//declaracion y dimensionamiento del arreglo o array. Se hace ahora y no antes xq sino, sin valor de n, no funciona.

        //Procesos:
        for (i = 0; i < temperaturas.length; i++) {//en vez de n, tambien se podria usar el largo, temperaturas.length
            System.out.println("Ingrese la temperatura " + (i + 1));//ponemos i+1 xq i arranca en cero, no esta bueno preguntarle al usuario que ponga la temperatura cero...
            temperaturas[i] = entrada.nextFloat();

            acumulador = acumulador + temperaturas[i];//suma de temperaturas para promedio

            if (temperaturas[i] <= -10) {//búsqueda de valor -10
                avisoMenos10 = true;
            }
        }
        float aux;
        //Ordenar de mayor a menor y mostrar
        for (i = 0; i < temperaturas.length - 1; i++) {
            for (int j = 1 + i; j < temperaturas.length; j++) {
                if (temperaturas[i] < temperaturas[j]) {
                    aux = temperaturas[i];
                    temperaturas[i] = temperaturas[j];
                    temperaturas[j] = aux;
                }
            }
        }

        promedio = acumulador / n;

        //Salidas:
        System.out.println("La temperatura promedio es de: " + promedio + "°C");
        if (avisoMenos10 == true) {
            System.out.println("Pasó al menos una temperatura menor o igual a -10°C");
        }
        for (i = 0; i < temperaturas.length; i++) {
            System.out.println("Temperatura " + (i + 1) + ": " + temperaturas[i]);
        }

    }

}
