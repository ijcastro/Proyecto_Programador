package Paquete01;

import java.util.Scanner;

public class Practica01 {

    public static void main(String[] args) {
        //Declaramos métodos y variables
        Scanner entrada = new Scanner(System.in);
        double promPos, promNeg;
        int cantPos, cantNeg, sumaPos, sumaNeg, i;
        int vector[] = new int[100];//declaracion y dimensionamiento del arreglo o array

        //Inicializacion
        i = cantPos = cantNeg = sumaPos = sumaNeg = 0;

        //Entrada:
        for (i = 0; i < 100; i++) {//ciclo de carga
            System.out.println("Ingrese número entero");
            vector[i] = entrada.nextInt();
        }//finaliza ciclo de carga cuando se hayan cargado los 100 N°s

        //Procesos:
        //Recorrido por el vector para obtener valores del promedio
        for (i = 0; i < vector.length; i++) {//iniciamos ciclo de búsqueda
            if (vector[i] >= 0) {
                cantPos += 1;
                sumaPos = sumaPos + vector[i];
            } else {
                cantNeg += 1;
                sumaNeg = sumaNeg + vector[i];
            }
        }
        promPos = sumaPos / cantPos;
        promNeg = sumaNeg / cantNeg;

        //Salidas:
        System.out.println("El promedio de los valores positivos es: " + promPos);
        System.out.println("El promedio de los valores negativos es: " + promNeg);

    }

}
