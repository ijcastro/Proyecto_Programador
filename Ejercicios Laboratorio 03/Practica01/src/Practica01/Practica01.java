/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica01;

import java.util.Scanner;

/**
 *
 * @author Nacho
 */
public class Practica01 {

    public static void main(String[] args) {
        //Voy a hacerlo con un ciclo solamente xq es lo que estamos viendo en esta parte
        //Definimos variables y método de entrada
        int horas, minutos;
        Scanner entrada = new Scanner(System.in);

        //Entradas:
        System.out.println("Ingrese las horas del día");
        horas = entrada.nextInt();
        System.out.println("Ingrese los minutos del día");
        minutos = entrada.nextInt();

        //Proceso:
        while (horas < 24 && minutos < 60) {
            if (horas > 11) {
                horas = horas - 12;
                System.out.println("La hora actual es " + horas + ":" + minutos + "PM");
            } else {
                System.out.println("La hora actual es " + horas + ":" + minutos + "AM");
            }
            //Se pide dentro del ciclo los datos de entrada
            System.out.println("Ingrese las horas del día");
            horas = entrada.nextInt();
            System.out.println("Ingrese los minutos del día");
            minutos = entrada.nextInt();
        }
        
        //Salida:
        System.out.println("Formato incorrecto!");

    }

}
