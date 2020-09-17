package Practica04;

import java.util.Scanner;

/**
 *
 * @author Nacho
 */
public class Practica04 {

    public static void main(String[] args) {
        //Definicion de variables y metodo de entrada:
        Scanner entrada = new Scanner(System.in);
        int articulo, clave, precioOrig;
        double precioDesc;
        precioOrig = 100;
        String cadena2 = "Artículo:\nclave:\nprecioOrig:\n(precioDesc = precioOrig * 0.8):";
        String cadena1 = "Artículo:\nclave:\nprecioOrig:\n(precioDesc = precioOrig * 0.9):";
        
        //Entrada:
        System.out.println("Ingrese Nº de clave");
        clave = entrada.nextInt();
        
        //Proceso:
        
        while(clave <= 2){//inicia while
            if(clave == 1){
                System.out.println(cadena1);
            }else{
                if (clave == 2){
                    System.out.println(cadena2);
                }
                
            }
            //Se vuelve a solicitar instruccion para no caer en ciclo infinito:
            System.out.println("Ingrese Nº de clave");
            clave = entrada.nextInt();
            
        }//finaliza while
        
        //Salida:
        
        if(clave > 2){
            System.out.println("Error de carga");
        }
        
        
        
        
        

    }

}
