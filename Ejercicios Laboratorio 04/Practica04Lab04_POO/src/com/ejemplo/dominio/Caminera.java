package com.ejemplo.dominio;

/**
 *
 * @author Nacho
 */
public class Caminera {
    //Atributos:
    private Multa multas[];
    private int ultimaCarga;
    
    //Constructor:
    public Caminera(int cantidad){
        multas = new Multa[cantidad];
        ultimaCarga = 0;
    }
    
    public boolean registrarMulta(Multa multa){
        boolean aux = false;
        if(ultimaCarga < multas.length){
            multas[ultimaCarga] = multa;
            ultimaCarga++;
            aux = true;
        }
        return aux;
    }
    
    public float calcularTotal(){
        float aux = 0;
        for (Multa multa: multas){
            if(multa != null){
                aux += multa.calcularMonto();
            }
        }          
        return aux;
    }
    
    public int[] contabilizarCodigosMulta(){ //con int[] declaramos que devuelve un vector de enteros
        int conteo[] = new int [20]; //se tiene que inicializar sí o sí xq sino no compila
        int pos;
        for (int i = 0; i < multas.length; i++) {
            pos = multas[i].getCodigo()-1;
            conteo[pos]++; /*como sabemos que los valores de codigos[] van de 1 a 20
                                    restamos 1 para que se guarde en la posicion de conteo[] correspondiente*/
        }
        return conteo;
    }
    
    public String mostrarMayorCodigo(){
        String aux = "";
        int conteo[] = this.contabilizarCodigosMulta();
        int may = conteo[0];
        int codMay = 1;
        for (int i = 1; i < conteo.length; i++) {
            if(conteo[i] > may){
                may = conteo[i];
                codMay = i + 1;
            }
        }
        aux = "Código de infracción más frecuente: " + codMay + ", con: " + may + " actas labradas";
        return aux;
    }
    
    
    
    
}
