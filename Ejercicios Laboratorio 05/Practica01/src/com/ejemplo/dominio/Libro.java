package com.ejemplo.dominio;

/**
 *
 * @author Nacho
 */
public class Libro extends Publicacion{ //Todo libro es tambien una Publicacion

    //Atributos:
    private String isbn;
    private String autor;
    
    //Constructor: por defecto
    public Libro(){
        super();
        this.isbn = "";
        this.autor = "Desconocido";
    }
    
    //Constructor: por parámetros
    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        //Se agrega super() en caso de que no se llame a ningún constructor de la clase base
        super(titulo, numPaginas);        
        this.isbn = isbn;
        this.autor = autor;
        }

    //Getters y Setters:
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Comportamientos propios:
    @Override
    public String toString() { // Se "redefine" el comportamiento toString();
        return "El libro " + getTitulo() + " con ISBN = " + isbn + " creado por "
                + autor + ", tiene " + getPaginas() + " paginas";
    }
    
    

}
