package com.ejemplo.dominio;

/**
 *
 * @author Nacho
 */
public class Obra extends Elemento{
    //Atributos:    
    private String autor;
    private String pais;
    
    //Constructor: por defecto
    public Obra(){
        super();
        autor = "Sin definir";
        pais = "Sin definir";
    }
    
    //Constructor: por parámetros
    public Obra(int codigo, String nombre, int año, String autor, String pais) {
        super(codigo, nombre, año);
        this.autor = autor;
        this.pais = pais;
    }
    
    //Getters y setters:
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    //Métodos propios:
    public String accesarNombre(){
        String aux;
        aux = super.getNombre() + " (" + this.getAutor() + ")";
        return aux;
    }

    @Override
    public String toString() {
        return "Obra{" + super.toString() + ", autor=" + autor + ", pais=" + pais + '}';
    }
    
    
    
    
}
