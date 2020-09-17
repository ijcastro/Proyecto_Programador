package com.ejemplo.dominio;

/**
 *
 * @author Nacho
 */
public class Empleado extends Trabajador{
    //Atributos:
    private float sueldo;
    private int horasExtra;
    
    //Constructor: por defecto
    public Empleado(){
        super();
        sueldo = 0;
        horasExtra = 0;        
    }
    
    //Constructor: por parámetros
    public Empleado(int legajo, String nombre, String fechaContratacion, String puesto, float sueldo, int horasExtra) {
        super(legajo, nombre, fechaContratacion, puesto);
        this.sueldo = sueldo;
        this.horasExtra = horasExtra;
    }
    
    //Getters y Setters:
    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
    
    //Métodos propios:
    @Override
    public float calcularPaga(){
        float aux = 0;
        if (horasExtra >= 20){
            aux = sueldo + (20 * 300);
        } else {
            aux = sueldo + (horasExtra * 300);
        }               
        return aux;
    }

    @Override
    public String toString() {
        return "Datos Empleado: " + super.toString() + ", sueldo= " + sueldo + ", horasExtra= " + horasExtra +
                ", sueldo final: " + calcularPaga();
    }
    
    
    
    
}
