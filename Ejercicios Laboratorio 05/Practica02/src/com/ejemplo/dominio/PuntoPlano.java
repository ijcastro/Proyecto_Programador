package com.ejemplo.dominio;

/**
 *
 * @author Nacho
 */
public class PuntoPlano {
    //Atributos:
    private int coordenadaX;
    private int coordenadaY;
    
    //Constructor por defecto:
    public PuntoPlano (){
        coordenadaX = 0;
        coordenadaY = 0;
    }
    
    //Constructor por parámetros:
    public PuntoPlano(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }
    
    //getters y setters:
    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
    
    //Metodos propios:
    public double calcularDistancia(){
        double distancia = (Math.sqrt(Math.pow(coordenadaX, 2)+Math.pow(coordenadaY, 2)));
        return distancia;
    }
    
    public int calcularCuadrante(){
        int aux = 1;
        if(coordenadaX > 0 && coordenadaY > 0){
            aux = 1;
        } else if (coordenadaX > 0 && coordenadaY < 0){
            aux = 2;
        } else if (coordenadaX < 0 && coordenadaY < 0){
            aux = 3;
        } else if (coordenadaX < 0 && coordenadaY > 0){
            aux = 4;
        } else {
            aux = 0;
        }
        return aux;
    }

    @Override
    public String toString() {
        return "Las coordenadas del punto son: (" + coordenadaX + ";" + coordenadaY + ").";
    }
    
    
            
    
    
}
