package com.ejemplo;

import com.ejemplo.dominio.Elemento;
import com.ejemplo.dominio.Historico;
import com.ejemplo.dominio.Obra;
import com.ejemplo.dominio.Sala;
import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Crear dos objetos de exposición:
        Elemento obj1 = new Historico(1, "Fosil Africa", -1500, "Africa", "Desconocido");
        Elemento obj2 = new Obra(2, "Los Girasoles", 1888, "Van Gogh", "Holanda");
        
        //Crear una sala y asociar objetos de exposición en dicha sala:
        Sala sala = new Sala();
        sala.addElemento(obj1);
        sala.addElemento(obj2);
        
        //Mostrar datos de los objetos en exposición:
        System.out.println(sala.mostrarObjetos());
        System.out.println("Total de objetos: " + sala.getTotalObjetos());
        
        //Ingresar un valor de antiguedad:
        int antiguedad;
        do{
            System.out.println("\nIngrese antigüedad de consulta");
            antiguedad = entrada.nextInt();
        } while (antiguedad <= 0);
        
        System.out.print("Total de objetos con antigüedad superior a: " + antiguedad);
        System.out.println(" años: " + sala.calcularCantObjetos(antiguedad));
        
                
    }
    
}
