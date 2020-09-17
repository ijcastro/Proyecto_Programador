package com.ejemplo.dominio;

/**
 *
 * @author Nacho
 */
public class Tanque {

    //Atributos:
    private float nivelTanque;
    private float litrosCarga;
    private float tanqueDC;

    //Constructor por defecto:
    public Tanque() {
        nivelTanque = 54.0f;
        litrosCarga = 0;
        tanqueDC = 0;
    }

    //Constructor por parámetros:
    public Tanque(float nivelTanque) {
        this.nivelTanque = nivelTanque;
    }

    //Getters y Setters:
    public float getNivelTanque() {
        return nivelTanque;
    }

    public void setNivelTanque(float nivelTanque) {
        this.nivelTanque = nivelTanque;
    }

    public float getTanqueDC() {
        return tanqueDC;
    }

    public void setTanqueDC(float tanqueDC) {
        this.tanqueDC = tanqueDC;
    }
    
    public float getLitrosCarga() {
        return litrosCarga;
    }

    public void setLitrosCarga(float litrosCarga) {
        this.litrosCarga = litrosCarga;
    }

    //Metodos propios:
    public boolean cargarCombustible(float litrosCarga) {
        boolean aux = false;
        nivelTanque = nivelTanque + litrosCarga;
        if (nivelTanque > 54) {
            nivelTanque = 54.0f;
        } else {
            aux = true;
        }
        return aux;
    }

    public int chequearCombustible() {
        int aux = 0;
        if (nivelTanque <= 5) {
            aux = 1;
        } else if (nivelTanque < (54/2) && nivelTanque >= (54/4)) {
            aux = 25;
        } else if (nivelTanque < ((54/4)*3) && nivelTanque > (54/2)){
            aux = 50;
        } else if (nivelTanque < 54 && nivelTanque >= ((54/4)*3)){
            aux = 75;
        } else if (nivelTanque == 54){
            aux = 100;
        }
        return aux;
    }

}
