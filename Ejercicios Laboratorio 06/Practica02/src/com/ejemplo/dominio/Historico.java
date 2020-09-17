package com.ejemplo.dominio;

/**
 *
 * @author Nacho
 */
public class Historico extends Elemento{
    //Atributos:
    private String zona;
    private String origen;
    
    //Constructor: por defecto
    public Historico(){
        super();
        zona = "Sin definir";
        origen = "Sin definir";
    }
    
    //Constructor: por parámetros
    public Historico(int codigo, String nombre, int año, String zona, String origen) {
        super(codigo, nombre, año);
        this.zona = zona;
        this.origen = origen;
    }
    
    //Getters y setters:
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    public String accesarNombre(){
        String aux;
        aux = super.getNombre() + " (" + this.getZona() + ")";
        return aux;
    }

    @Override
    public String toString() {
        return "Historico{" + super.toString() + ", zona=" + zona + ", origen=" + origen + '}';
    }
    
    
    
    
    
    
    
}
