package com.ejemplo;

import com.ejemplo.dominio.PuntoPlano;
import java.util.Scanner;

public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Metodos de entrada:
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        
        //Entradas:
        System.out.println("Ingrese coordenada X:");
        int coordenadaX = entrada.nextInt();
        System.out.println("Ingrese coordenada Y:");
        int coordenadaY = entrada.nextInt();
        
        //Creamos objeto
        
        PuntoPlano punto = new PuntoPlano(coordenadaX, coordenadaY);
        
        //Salidas:
        System.out.println(punto.toString());
        if (punto.calcularCuadrante()==0){
            System.out.println("El punto se encuentra sobre los ejes");
        } else {
            System.out.println("El punto se encuentra en el cuadrante " + punto.calcularCuadrante());
        }
        System.out.println("La distancia al eje de coordenadas es: " + punto.calcularDistancia());
    }
    
}
