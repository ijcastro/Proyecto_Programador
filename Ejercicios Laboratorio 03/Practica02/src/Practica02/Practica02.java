/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica02;

import java.util.Scanner;

/**
 *
 * @author Nacho
 */
public class Practica02 {

    public static void main(String[] args) {
        //Definimos variables y método de entrada:
        int año, centAño, unidadAño;
        Scanner entrada = new Scanner(System.in);

        //Entrada:
        System.out.println("Ingrese el año");
        año = entrada.nextInt();

        //Procesos:
        centAño = año - (año % 100);
        unidadAño = (año % 100);

        if (año % 4 != 0) {
            System.out.println("El año NO es bisiesto");
        } else if ((año % 100 == 0) && (año % 400 != 0)) {
            System.out.println("El año NO es bisiesto");
        } else {
            System.out.println("El año es bisiesto");
        }

    }

}



