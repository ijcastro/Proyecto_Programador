package com.ejemplo;

import com.ejemplo.dominio.Automovil;
import java.util.Scanner;

public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        //objeto auto
        Automovil auto = new Automovil();
                
        System.out.println(auto.getNivelTanque());
        
        System.out.println("Ingrese distancia a recorrer: ");
        float distancia = entrada.nextFloat();
        if(auto.conducir(distancia) == true){
            System.out.println("Se puede hacer el recorrido");
            System.out.println("El tanque queda en "+ auto.getNivelTanque() + " lts.");
        } else {
            System.out.println("El combustible no alcanza para el recorrido");
        }
        
        switch (auto.chequearCombustible()){
            case (1):
                System.out.println("Tanque en reserva! Reponer combustible de inmediato");
                break;
            case (25):
                System.out.println("El tanque se encuentra al 25%");
                break;
            case (50):
                System.out.println("El tanque se encuentra al 50%");
                break;
            case (75):
                System.out.println("El tanque se encuentra al 75%");
                break;
            case (100):
                System.out.println("Tanque lleno");
                break;
        }
        
        System.out.println("Ingrese litros de carga");
        float litrosCarga = entrada.nextFloat();
        
        if (auto.cargarCombustible(litrosCarga) == 0){
            System.out.println("Carga completa. Nivel del tanque: " + auto.getNivelTanque() + " lts.");
        } else {
            System.out.println("Se derramaron " + auto.getTanqueDC()+ " lts. El nivel del tanque es: " + 
                    auto.getNivelTanque() + " lts.");
        }
        
        
        
        
        
        
    }
    
}
