package com.ejemplo;

import com.ejemplo.dominio.Caminera;
import com.ejemplo.dominio.Multa;
import java.util.Scanner;

/**
 *
 * @author Nacho
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Metodos y variables:
        Scanner entrada = new Scanner(System.in);
        int n; //Total de multas a procesar
        float monto, total = 0; //acumulador
        int conteo[] = new int[20];
        Caminera oCaminera = null;
        int cod;
        long acta;
        Multa multa = null; //referencia a un objeto multa
        
        
        do{
            System.out.println("Ingrese la cantidad de actas a procesar:");
            n = entrada.nextInt();
        } while (n <= 0);
        
        oCaminera = new Caminera(n); 
                
        for (int i = 0; i < n; i++) {
            //Leer código de infracción
            do{
                System.out.println("Ingrese código de la multa: ");
                cod = entrada.nextInt();
            } while (cod < 1 || cod > 20);
            //Leer monto de la infracción
            System.out.println("Ingrese monto de la multa: ");
            monto = entrada.nextFloat();
            //Leer número de acta
            System.out.println("Ingrese N° de acta: ");
            acta = entrada.nextLong();
            
            multa = new Multa(cod, acta, monto); // se crea el objeto multa, que recibe los parámetros que se definen antes
            oCaminera.registrarMulta(multa); //se registra la multa en el objeto oCaminera
            
        }
               
        
        //Salidas:
        total = oCaminera.calcularTotal();
        System.out.println("Monto total recaudado: $ " + total);
        
        conteo = oCaminera.contabilizarCodigosMulta();
        for (int i = 0; i < conteo.length; i++) {
            if(conteo[i] > 0){ /* se usa >0 en vez de != null, xq conteo NO es un vector de objetos
                                sino de enteros, se usa el null cuando en el vector se guardan objetos*/
                System.out.println("Actas código: " + (i+1) + ": " + conteo[i]);
            }
        }
        
        System.out.println(oCaminera.mostrarMayorCodigo());
        
    }
    
}
