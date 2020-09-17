package com.ejemplo.dominio;

/**
 *
 * @author Nacho
 */
public abstract class Trabajador {
    //Atributos:
    private int legajo;
    private String nombre;
    private String fechaContratacion;
    private String puesto;
    
    //Constructor: por defecto
    public Trabajador(){
        legajo = 0;
        nombre = "Sin definir";
        fechaContratacion = "01-01-1999";
        puesto = "Sin asignar";
    }
    
    //Constructor: por parámetros
    public Trabajador(int legajo, String nombre, String fechaContratacion, String puesto){
        this.legajo = legajo;
        this.nombre = nombre;
        this.fechaContratacion = fechaContratacion;
        this.puesto = puesto;
    }
    
    //Getters y Setters:
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public abstract float calcularPaga();
    
    @Override
    public String toString() {
        return "Trabajador: |" + "legajo= " + legajo + ", nombre= " + nombre + ", fecha de contratacion= " + 
                fechaContratacion + ", puesto= " + puesto + ", sueldo final= " + this.calcularPaga();
    }
    
    
    
    
}
