package com.ejemplo.dominio;

/**
 *
 * @author Nacho
 */
public class Revista extends Publicacion{
    //Atributos:
    private int codigo;
    
    //Constructor: por defecto
    public Revista(){
        super(); //es opcional, xq Java, si está el constructor por parametros, lo agrega igual.
        codigo = 1;
    }
    
    //Constructor: por parámetros
    public Revista(int codigo, String titulo, int paginas) {
        super(titulo, paginas); //Con "super" llamamos al constructo de la clase padre. Igual q el anterior, es opcional
        this.codigo = codigo;
    }
    
    //Getters Setters:

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    //Metodos propios:
    @Override
    public String toString() { //Se "especializa" el comportamiento toString();
        return "Revista " + super.toString();
    }
    
    
}
