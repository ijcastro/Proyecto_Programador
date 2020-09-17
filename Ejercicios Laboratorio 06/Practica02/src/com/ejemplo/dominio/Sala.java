package com.ejemplo.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nacho
 */
public class Sala {
    //Atributos:
    private String nombre;
    private String ala;
    private List<Elemento> objetos; //declaración de una lista, creo...
    
    //Constructor: por defecto
    public Sala(){
        nombre = "Sin definir";
        ala = "Sin definir";
        objetos = new ArrayList<>(); //No es que se dimensione, sino que se indica tratar a la lista como un vector, creo...
    }
    
    //Getters y setters:

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAla() {
        return ala;
    }

    public void setAla(String ala) {
        this.ala = ala;
    }

    public void addElemento(Elemento objeto){
        objetos.add(objeto); //se agrega a la lista el objeto que se recibe como parámetro
    }
    
    @Override
    public String toString(){
        return nombre;
    }
    
    public String mostrarObjetos(){
        StringBuilder sb = new StringBuilder();
        sb.append("Sala: ");
        sb.append(nombre);
        sb.append(" |Ala: ");
        sb.append(ala);
        sb.append("\n");
        
        for (Elemento x : objetos) {
            sb.append(x.toString()); /* "x" va a recorrer todos los lugares de la lista objetos,
                                    y va a agregar los datos de ese elemento (mediante el toString())
                                    a la cadena sb, que es de tipo StringBuilder*/
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public int getTotalObjetos(){
        return objetos.size();
    }
    
    public int calcularCantObjetos(int antiguedad){
        int c = 0; //se usa como variable de conteo
        for (Elemento x : objetos) {
            if(x.antiguedad()>= antiguedad){ /* si el objeto recorrido por el for each tiene
                                                mayor antiguedad que el parámetro, simplemente
                                                se incrementa en 1 unidad la variable de conteo*/
                c++;
            }
        }
        return c;
    }
    
    public List<Elemento> getObjetos(){
        return objetos;
    }
    
}
