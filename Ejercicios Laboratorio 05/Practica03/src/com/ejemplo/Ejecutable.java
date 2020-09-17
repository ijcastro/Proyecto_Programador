package com.ejemplo;

import com.ejemplo.dominio.Persona;
import java.util.Scanner;

public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Metodos de entrada:
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        int dni = 0;
        
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = entrada2.nextLine();
        System.out.println("Ingrese la edad de la persona:");
        int edad = entrada.nextInt();
        System.out.println("Ingrese el sexo de la persona:");
        char sexo = entrada.next().charAt(0);
        System.out.println("Ingrese el peso de la persona");
        float peso = entrada.nextFloat();
        System.out.println("Ingrese altura de la persona");
        float altura = entrada.nextFloat();
        
        //Creación de objetos de la clase Persona:
        Persona persona1 = new Persona(nombre, edad, dni, sexo, peso, altura);
        
        System.out.println("Ingrese el nombre de la persona:");
        nombre = entrada2.nextLine();
        System.out.println("Ingrese la edad de la persona:");
        edad = entrada.nextInt();
        System.out.println("Ingrese el sexo de la persona:");
        sexo = entrada.next().charAt(0);
        Persona persona2 = new Persona(nombre, edad, sexo);
        
        Persona persona3 = new Persona();
        
        persona3.setNombre("Pedro");
        persona3.setEdad(18);
        persona3.setSexo('H');
        persona3.setPeso(65.7f);
        persona3.setAltura(1.76f);
        
        //Información de objeto persona1:
        if (persona1.calcularIMC() == -1){
            System.out.println(persona1.getNombre() + " está debajo de su peso ideal");
        } else if (persona1.calcularIMC() == 0){
            System.out.println(persona1.getNombre()+ " está en su peso ideal");
        } else if (persona1.calcularIMC() == 1){
            System.out.println(persona1.getNombre()+ " está sobre su peso ideal");
        }
        
        if (persona1.esMayorDeEdad() == true){
            System.out.println(persona1.getNombre() +  " es mayor de edad.");
        } else {
            System.out.println(persona1.getNombre() + " es menor de edad");
        }
        
        System.out.println(persona1.toString());
        
        //informacion de objeto persona2:
        if (persona2.calcularIMC() == -1){
            System.out.println(persona2.getNombre() + " está debajo de su peso ideal");
        } else if (persona2.calcularIMC() == 0){
            System.out.println(persona2.getNombre()+ " está en su peso ideal");
        } else if (persona2.calcularIMC() == 1){
            System.out.println(persona2.getNombre()+ " está sobre su peso ideal");
        }
        
        if (persona2.esMayorDeEdad() == true){
            System.out.println(persona2.getNombre() +  " es mayor de edad.");
        } else {
            System.out.println(persona2.getNombre() + " es menor de edad");
        }
        
        System.out.println(persona2.toString());
        
        //informacion de objeto persona3:
        if (persona3.calcularIMC() == -1){
            System.out.println(persona3.getNombre() + " está debajo de su peso ideal");
        } else if (persona3.calcularIMC() == 0){
            System.out.println(persona3.getNombre()+ " está en su peso ideal");
        } else if (persona3.calcularIMC() == 1){
            System.out.println(persona3.getNombre()+ " está sobre su peso ideal");
        }
        
        if (persona3.esMayorDeEdad() == true){
            System.out.println(persona3.getNombre() +  " es mayor de edad.");
        } else {
            System.out.println(persona3.getNombre() + " es menor de edad");
        }
        
        System.out.println(persona3.toString());
        
    }
    
    
        
        
        
        
    
    
}
