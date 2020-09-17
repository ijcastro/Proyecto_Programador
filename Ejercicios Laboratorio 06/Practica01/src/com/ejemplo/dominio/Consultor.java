package com.ejemplo.dominio;

/**
 *
 * @author Nacho
 */
public class Consultor extends Trabajador{
    //Atributos:
    private int cantidadHoras;
    private int valorHora;
    
    //Constructor: por defecto
    public Consultor(){
        super();
        cantidadHoras = 0;
        valorHora = 0;
    }
    
    //Constructor: por parámetros
    public Consultor(int legajo, String nombre, String fechaContratacion, String puesto, int cantidadHoras, int valorHora){
        super(legajo, nombre, fechaContratacion, puesto);
        this.cantidadHoras = cantidadHoras;
        this.valorHora = valorHora;
    }
    
    //Getters y Setters:
    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
    
    //Métodos propios:
    @Override
    public float calcularPaga(){
        float aux = 0;
        aux = cantidadHoras * valorHora;        
        return aux;
    }

    @Override
    public String toString() {
        return "Datos Consultor: " + super.toString()+ ", cantidadHoras= " + cantidadHoras + ", valorHora= " 
                + valorHora + ", sueldo final: " + calcularPaga();
    }
    
    
    
}
