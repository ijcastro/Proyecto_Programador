package com.ejemplo.dominio;

/**
 *
 * @author Nacho
 */
public class Empresa {
    //Atributos:
    private String cuit;
    private String razonSocial;
    private Trabajador trabajador[];
    private int ultimoAgregado;
    
    //Constructor: por defecto
    public Empresa(){
        cuit = "sin definir";
        razonSocial = "sin definir";
        trabajador = new Trabajador[30];
        ultimoAgregado = 0;
    }
    
    //Constructor: por parámetros
    public Empresa(String cuit, String razonSocial, Trabajador[] trabajador, int ultimoAgregado) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.trabajador = trabajador;
        this.ultimoAgregado = ultimoAgregado;
    }
    
    //Getters y setters:
    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Trabajador[] getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador[] trabajador) {
        this.trabajador = trabajador;
    }
    
    //Métodos propios:
    //Agregar Empleado
    public boolean agregarEmpleado(Trabajador empleado){
        boolean aux = false;
        if(ultimoAgregado < trabajador.length){
            for (int i = 0; i < trabajador.length; i++) {
                if (trabajador[i] == null){
                    trabajador[i] = empleado;
                    ultimoAgregado++;
                    aux = true;
                    break;
                }                
            }
        }
        return aux;
    }
    //Incrementar Sueldo
    Empleado empleado = new Empleado();// no entiendo lo que hizo el profe, pedirle que explique en clase
    public void incrementarSueldo(float porc){
        empleado.setSueldo(empleado.getSueldo() * (1 + (porc/100)));
    }
    //Presupuesto Mensual
    public float presupuestoMensual(){
        float aux = 0;
        //for each
        for (Trabajador trabajador1 : trabajador) {
            aux += trabajador1.calcularPaga();
        }      
        return aux;
    }
    //Arreglo auxiliar con orden alfabetico
    private void ordenar() {
        //Ordenar arreglo
        int n = trabajador.length;
        Trabajador e = null;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (trabajador[i] != null && trabajador[j] != null) {
                    if (trabajador[i].getNombre().compareTo(trabajador[j].getNombre()) > 0) {
                        e = trabajador[i];
                        trabajador[i] = trabajador[j];
                        trabajador[j] = e;  
                    }
                }
            }
        }
    }
    //Mostra nomina
    public String mostrarNomina(){
        String aux = "Nómina de trabajadores: \n";
        ordenar();
        for (Trabajador trabajador1 : trabajador) {
            if(trabajador1 != null){
                aux += trabajador1.toString() + "\n";
            }
        }
        return aux;
    }
    
    
    
}
