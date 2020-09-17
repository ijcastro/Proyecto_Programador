package com.ejemplo.dominio;

/**
 *
 * @author Nacho
 */
public class CuentaBanco {

    //1. atributos:
    private int codigo;
    private float saldo;
    private String titular;

    //2. constructores: se llama igual que la clase y no tiene tipo de retorno
    //Se pueden "sobrecargar" con todas las definiciones que necesitemos    
    //Constructor por defecto (no tiene parámetros):
    public CuentaBanco() {
        //codigo = 0; al estar comentados, o sea no inicializados, Java los va a inicializar en cero,
        //saldo = 0; no se va a crear el objeto sólo con el atributo "titular"
        titular = "Sin definir";
    }

    //Constructor con parámetros (tiene al menos un parámetro):
    public CuentaBanco(String titular) { //acá, titular pasa a ser un parámetro
        codigo = 0;
        saldo = 0;
        this.titular = titular; //usamos el "this", ya que si ponemos titular=titular, el valor de la variable es la
                                //variable, lo cual no tiene sentido. "this" referencia al objeto actual.
    }

    //este lo generó solo el NetBeans: click derecho + Insert code + constructor.
    public CuentaBanco(int codigo, float saldo, String titular) {
        this.codigo = codigo;
        this.saldo = saldo;
        this.titular = titular;
    }

    //3. comportamientos: de acceso, o accesores
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int cod) {
        codigo = cod;
    }

    public float getSaldo() {
        return saldo;
    }
    //No se usa setSaldo() xq el saldo no es conveniente que se toque de afuera
    //saldo se va a modificar con métodos de deposito y extracción

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //4. Comportamientos propios (los que no son getters, setters, o constructores): depositar() y extraer()
    public void depositar(float monto) {
        if (monto > 0) {
            saldo = saldo + monto;
        }

    }

    public void extraer(float monto) {
        if (monto > 0 && saldo >= monto) {
            saldo = saldo - monto;
        }

    }

    public String mostrarDatos() {
        String estado = "Cuenta N°: " + codigo + " |Titular: " + titular + " |Saldo actual: $" + saldo;
        return estado;
    }
    //getDeclaredFields es el método por convencion que se puede usar en lugar de mostrarDatos?
}
