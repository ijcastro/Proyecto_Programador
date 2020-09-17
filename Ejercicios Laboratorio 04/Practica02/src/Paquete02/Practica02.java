package Paquete02;

import java.util.Scanner;

public class Practica02 {

    public static void main(String[] args) {
        //Declarar variables y métodos de entrada
        Scanner entrada = new Scanner(System.in);
        int n = 0;
        int i = 0;
        int lanzamientoImpar;
        int mismoValor = lanzamientoImpar = 0;
        
        boolean sumaImpar = false;

        //Entrada
        System.out.println("Ingrese cantidad de veces que se lanzarán los dados");
        n = entrada.nextInt();
        
        int dado1[] = new int[n];//declaracion y dimensionamiento del arreglo o array
        int dado2[] = new int[n];//declaracion y dimensionamiento del arreglo o array

        for (i = 0; i < n; i++) {//inicia primer ciclo de carga
            do {
                System.out.println("Ingrese valores del primer dado");
                dado1[i] = entrada.nextInt();
            } while (dado1[i] < 1 || dado1[i] > 6);
        }
        for (i = 0; i < n; i++) {//inicia segundo ciclo de carga
            do {
                System.out.println("Ingrese valores del segundo dado");
                dado2[i] = entrada.nextInt();
            } while (dado2[i] < 1 || dado2[i] > 6);
        }

        //Procesos
        for (i = 0; i < n; i++) {//ciclo para contar veces que salio mismo valor
            if (dado1[i] == dado2[i]) {
                mismoValor += 1;
            }
        }

        for (i = 0; i < n; i++) {//ciclo para buscar primer suma impar
            if ((dado1[i] + dado2[i]) % 2 != 0) {
                lanzamientoImpar = i + 1;
                sumaImpar = true;
                break;
            }
        }
        
        //Salidas:
        //Mostrar los resultados de los lanzamientos
        System.out.println("Los lanzamientos del primer dado son: ");
        System.out.print("[");
        for (i = 0; i < dado1.length; i++) {
            if (i == (dado1.length - 1)) {
                System.out.print(dado1[i]);
            } else {
                System.out.print(dado1[i] + "|");
            }
        }
        System.out.print("]");

        System.out.println("Los lanzamientos del segundo dado son: ");
        System.out.print("[");
        for (i = 0; i < dado2.length; i++) {
            if (i == (dado2.length - 1)) {
                System.out.print(dado2[i]);
            } else {
                System.out.print(dado2[i] + "|");
            }
        }
        System.out.print("]");

        //Cuántas veces mismo valor en ambos dados, porcentaje sobre el total de lanzamientos
        if (mismoValor > 0) {
            System.out.println("Los dados dieron el mismo valor " + mismoValor + " veces");
            System.out.println("Dando un % de " + ((mismoValor / n) * 100));
        }

        //En qué lanzamiento se dio por primera vez una suma impar entre ambos dados
        if (sumaImpar = true) {
            System.out.println("La primer suma impar se dio en el lanzamiento: " + lanzamientoImpar);
        }

    }

}
