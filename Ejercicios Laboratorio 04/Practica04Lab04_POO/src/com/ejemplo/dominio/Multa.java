package com.ejemplo.dominio;

/**
 *
 * @author Nacho
 */
public class Multa {
    //Atributos:
    private int codigo;
    private long acta;
    private float monto;
    
    //Constructor: por defecto
    public Multa(){
        codigo = 0;
        acta = 0;
        monto = 0;
    }
    //Constructor: por parametros
    public Multa(int codigo, long acta, float monto) {
        this.codigo = codigo;
        this.acta = acta;
        this.monto = monto;
    }

    //Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public long getActa() {
        return acta;
    }

    public void setActa(long acta) {
        this.acta = acta;
    }

    //Comportamientos propios:
    public float calcularMonto(){
        return monto;
    }

    @Override
    public String toString() {
        return "Acta N°: " + acta + " |Código de infracción: " + codigo + " |Monto: $ " + monto;
    }
    
    
    
    
    
}
