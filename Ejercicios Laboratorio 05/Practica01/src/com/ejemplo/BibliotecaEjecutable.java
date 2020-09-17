package com.ejemplo;

import com.ejemplo.dominio.Libro;
import java.util.Scanner;

public class BibliotecaEjecutable {

    public static void main(String[] args) {
        //Metodos de entrada:
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        int cant;
        do {
            System.out.println("Ingrese la cantidad de libros de la biblioteca: (>0");
            cant = entrada.nextInt();
        } while (cant <= 0);

        //crear un arreglo o vector que represente un estante de biblioteca
        Libro estanteria[] = new Libro[cant];
        for (int i = 0; i < estanteria.length; i++) {
            System.out.println("Ingrese el ISBN del libro:");
            String isbn = entrada2.nextLine();

            System.out.println("Ingrese el titulo del libro:");
            String titulo = entrada2.nextLine();

            System.out.println("Ingrese el autor del libro:");
            String autor = entrada2.nextLine();

            System.out.println("Ingrese el N° de páginas del libro:");
            int numPaginas = entrada.nextInt();

            estanteria[i] = new Libro(isbn, titulo, autor, numPaginas);// cada vuelta crea un objeto nuevo (Libro),
            //y lo referencia mediante una componente del arreglo
        }

        for (int i = 0; i < estanteria.length; i++) {
            System.out.println("Libro " + (i + 1) + ": " + estanteria[i].toString());

        }

    }

}
