package com.ejemplo.dominio;

/**
 *
 * @author Nacho
 */
public class Carta {
    //Atributos:
    private int numero[]= new int[10];
    private String palo[] = new String[4];
    
    //Constructor: por defecto
    public Carta(){
        int numero[]= {1,2,3,4,5,6,7,10,11,12};
        String palo[] = {"espada","basto","oro","copa"};
    }
    
    //Getters (Sin setters por ser arreglos):
    public int[] getNumero() {
        return numero;
    }

        public String[] getPalo() {
        return palo;
    }
    //toString:
    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }
        
    
    
    
    
    
}
    
    
