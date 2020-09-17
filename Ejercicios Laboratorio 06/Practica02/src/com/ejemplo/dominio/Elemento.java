package com.ejemplo.dominio;

import java.util.Calendar;

/**
 *
 * @author Nacho
 */
public abstract class Elemento implements Comparable<Elemento>{
    //Atributos:
    private int codigo;
    private String nombre;
    private int año;
    
    //Constructor: por defecto
    public Elemento(){
        codigo = 0;
        nombre = "Sin definir";
        año = 0;
    }
    
    //Constructor: por parámetros
    public Elemento(int codigo, String nombre, int año) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.año = año;
    }
    
    //Getters y setters:
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public String accesarNombre(){
        String aux;
        aux = this.getNombre();
        return aux;
    }

    @Override
    public String toString() {
        return "Elemento{" + "codigo=" + codigo + ", nombre=" + nombre + ", a\u00f1o=" + año + '}';
    }

    public int antiguedad(){
        int actual = Calendar.getInstance().get(Calendar.YEAR);
        int ant;
        if (this.año < 0){ //si es A.C
            ant = actual + Math.abs(this.año); //Cálculo de antiguedad
        } else {
            ant = actual - this.año;
        }return ant;
    }
    
    @Override
    public int compareTo(Elemento elemento2){ //se entrega por parámetro el objeto con el que se va a comparar
        return this.antiguedad() - elemento2.antiguedad();
    }
    
}
