/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.dominio;

/**
 *
 * @author Nacho
 */
public abstract class Carga implements Comparable<Carga>{
   private String contenido;

    public Carga(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
   
    public abstract float peso();

    @Override
    public String toString() {
        return "Contenido: " + contenido;
    }

    @Override
    public int compareTo(Carga t) {
        return (int)(this.peso() - t.peso());
    }
    
}
