package com.ejemplo.dominio;

/**
 *
 * @author Nacho
 */
public class Automovil {

    //Atributos:
    private float distancia;
    private Tanque tanque = new Tanque();

    //Constructor por parámetros:
    public Automovil() {
        distancia = 0;
    }

    
    public boolean conducir(float distancia) {
        boolean aux = false;
        float litrosConsumidos = distancia / 11;
        if (tanque.getNivelTanque() >= litrosConsumidos) {
            float nivelTanque = (tanque.getNivelTanque() - litrosConsumidos);
            tanque.setNivelTanque(nivelTanque);
            aux = true;
            return aux;
        } else {
            return aux;
        }
    }

    public float getNivelTanque() {
        return tanque.getNivelTanque();
    }
    public int chequearCombustible(){
        return tanque.chequearCombustible();
    }
    public float getTanqueDC(){
        return tanque.getTanqueDC();
    }
    
    public float cargarCombustible(float litrosCarga) {
        float aux = 0;
        tanque.setNivelTanque((tanque.getNivelTanque() + litrosCarga));
        if (tanque.getNivelTanque() > 54) {
            tanque.setTanqueDC(tanque.getNivelTanque()-54);
            tanque.setNivelTanque(54.0f);
            aux = 1;
        } 
        return aux;
    }
    
    
}
