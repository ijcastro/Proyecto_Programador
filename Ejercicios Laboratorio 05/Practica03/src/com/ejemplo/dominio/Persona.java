package com.ejemplo.dominio;

/**
 *
 * @author Nacho
 */
public class Persona {

    //Atributos:
    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private float peso;
    private float altura;

    //Metodos constructores
    //Por defecto:
    public Persona() {
        nombre = "";
        edad = 0;
        sexo = 'H';
        peso = 0;
        altura = 0;
        dni = generaDNI();
    }

    //Por parámetros:
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        peso = 0;
        altura = 0;
        dni = generaDNI();
    }

    //Todo por parámetro:
    public Persona(String nombre, int edad, int dni, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        dni = generaDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //Getters y Setters:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    //Metodos propios:
    public float calcularIMC(){
        int aux = 1;
        if ((peso/Math.pow(altura, 2)) < 20){
            aux = -1;
        } else if ((peso/Math.pow(altura, 2)) >= 20 && ((peso/Math.pow(altura, 2))<=25)){
            aux = 0;
        } else if ((peso/Math.pow(altura, 2)) > 25){
            aux = 1;
        }
        return aux;
    }
    
    public boolean esMayorDeEdad(){
        boolean mayorEdad = false;
        if (edad >= 18){
            mayorEdad = true;
        }
        return mayorEdad;
    }
    
    private char comprobarSexo(char sexo){
        char aux = 'H';
        if (sexo == 'H' || sexo == 'M'){
            aux = sexo;
        }
        return aux;
    }

    @Override
    public String toString() {
        return "La información de la Persona es :{" + "nombre=" + nombre + 
                ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso="
                + peso + ", altura=" + altura + '}';
    }
    
    private int generaDNI(){
        dni = (int) (Math.random() * (99999999-10000000+1) + 10000000);
        return dni;
    }
    

}
