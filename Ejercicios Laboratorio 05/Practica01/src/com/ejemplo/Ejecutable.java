package com.ejemplo;

import com.ejemplo.dominio.Biblioteca;
import com.ejemplo.dominio.Libro;
import com.ejemplo.dominio.Revista;
import java.util.Scanner;

public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de metodos
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        //Crear un objeto biblioteca: usando constructor por parámetro
        int cant;
        do {
            System.out.println("Ingrese la cantidad de publicaciones de la biblioteca: (>0");
            cant = entrada.nextInt();
        } while (cant <= 0);
        Biblioteca miBiblioteca = new Biblioteca(cant); //se crea arreglo miBiblioteca, de dimensión "cant".

        Libro libro1 = new Libro("15489752-89", "Harry Potter", "J.K Rowling", 500);//creado con el constructor, datos ingresados por mi

        System.out.println("Ingrese el ISBN del libro:");
        String isbn = entrada2.nextLine();
        System.out.println("Ingrese el titulo del libro:");
        String titulo = entrada2.nextLine();
        System.out.println("Ingrese el autor del libro:");
        String autor = entrada2.nextLine();
        System.out.println("Ingrese el N° de páginas del libro:");
        int numPaginas = entrada.nextInt();

        Libro libro2 = new Libro(isbn, titulo, autor, numPaginas);//creado con el constructor, datos ingresados por usuario
        
        Revista revista1;
        revista1 = new Revista(33, "Una revista de ejemplo", 60);
        
        //Resultados:
        //System.out.println(libro1.toString());
        //System.out.println(libro2.toString());
        
        //Agregamos libros a la biblioteca creada, que es el objeto miBiblioteca:
        if (miBiblioteca.agregarPublicacion(libro1) == true) { //de esta manera se usa el return que devuelve el método
            System.out.println("Libro agregado!");
        } else {
            System.out.println("No se pudo agregar el libro");
        }
        miBiblioteca.agregarPublicacion(libro2); /*acá no se usa para nada el return, y 
                                             la lógica del método corrió igual,
                                             el libro se agregó. No se lo puede comprobar 
                                             despues, xq si hicieramos con un if 
                                             miBiblioteca.agregarLibro(Libro2) == true
                                             no habría devolución xq el libro2 ya se agrega con esta línea
                                             no se conserva el valor del método para futuras consultas
                                             xq la lógica del método es más que solo conseguir un true o false*/
        miBiblioteca.agregarPublicacion(revista1); //mismo caso que agregarPublicacion(libro2)
        
        
        //Mostrar estado de la biblioteca:
        String listado = miBiblioteca.mostrarListado();
        System.out.println(listado);

//        if(libro1.getNumPaginas()>libro2.getNumPaginas()){
//            System.out.println("El libro " + libro1.getTitulo() + " tiene más páginas");
//        } else if (libro2.getNumPaginas() > libro1.getNumPaginas()){
//            System.out.println("El libro " + libro2.getTitulo() + " tiene más páginas");
//        } else {
//            System.out.println("Ambos libros tienen la misma cantidad de páginas");
//        }
    }

}
