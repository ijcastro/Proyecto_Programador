package com.ejemplo.dominio;

/**
 *
 * @author Nacho
 */
public class Password {
    //Atributos:
    private int longitud;
    private String contraseña;
    
    
    //Constructor: por defecto:
    public Password(){
        longitud = 8;
        contraseña = "";
    }
    
    //Constructor: por atributo:
    public Password(int longitud){
        this.longitud = longitud;
    }
    
    //Getters y Setters:
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    //Métodos propios:
    public String generarPassword(){
        String contraseña = PasswordGenerator.getPassword(longitud);
        return contraseña;
    }
    
    public boolean esFuerte(){
        boolean aux = false;
        //TODO terminar este método y desarrollar Ejecutable
        return aux;
    }
    
    
    
    
}
