package Practica06;

import java.util.Scanner;

/**
 *
 * @author Nacho
 */
public class Practica06 {

    public static void main(String[] args) {
        // Entradas: nombre, tipo, monto
        /* Salidas: total anual pagado x c/ tipo de buque, nombre velero que mas paga y valor,
        promedio pagado por todas las embarcaciones en conjunto
         */

        String nombre, nombreMV;
        int n, tipo, monto, montoMV, velero, lancha, totalVelero, totalLancha, montoAnterior;
        double cuotaProm;
        Scanner entrada = new Scanner(System.in);
        Scanner entradaCadena = new Scanner(System.in);

        //inicializamos variables:
        velero = 0;
        lancha = 0;
        totalVelero = 0;
        totalLancha = 0;
        montoAnterior = 0;
        montoMV = 0;
        nombreMV = "";

        //Pedido de cantidad de datos a ingresarse (Para el ciclo for):
        //Usamos ciclo do-while para validar que el usuario ingrese un dato válido:
        //Si pone un N° negativo no sirve! Entonces usamos un do-while para que se tenga que
        //ingresar el nro de barcos hasta tanto no se ingrese un nro positivo (lógica contraria que le dicen...)
        do {
            System.out.println("Ingrese el total de embarcaciones a procesar: ");
            n = entrada.nextInt();
        } while (n <= 0); //Mientras el valor sea negativo o cero, se vuelve a pedir

        //Procesos:
        for (int i = 1; i <= n; i++) {
            //Se piden datos de entrada del barco
            System.out.println("Ingrese nombre del barco");
            nombre = entradaCadena.nextLine();
            //Vamos a usar otra vez do-while para validar:
            do {
                System.out.println("Ingrese el tipo de barco: 1 - Velero |2 - Lancha");
                tipo = entrada.nextInt();
                //Anuncio de dato erróneo (misma condición de while, o sea que si se ingresa bien valor no se muestra)
                if (tipo < 1 || tipo > 2) {
                    System.out.println("Valor Incorrecto. Ingrese 1 o 2");
                }
            } while (tipo < 1 || tipo > 2); //tipo menor a 1 o tipo mayor a 2
            System.out.println("Ingrese el monto del abono mensual");
            monto = entrada.nextInt();

            //Buscamos cantidades totales pagadas por tipo y cantidad total de c/ tipo:
            if (tipo == 1) {
                velero = velero + 1;
                totalVelero = totalVelero + (monto * 12); //Otra forma de escribirlo es totalVelero += monto * 12
            } else {
                if (tipo == 2) {
                    lancha = lancha + 1;
                    totalLancha = totalLancha + (monto * 12);
                }
            }
            //Buscamos nombre de velero de mayor cuota y monto de la cuota
            if (monto > montoAnterior) {
                nombreMV = nombre;
                montoMV = monto;
            }

            montoAnterior = monto;

        }//Termina ciclo for

        //Salidas:
        cuotaProm = ((totalVelero + totalLancha) / 12) / (velero + lancha);

        System.out.println("El total anual aportado por los veleros es: " + totalVelero);
        System.out.println("El total anual aportado por las lanchas es: " + totalLancha);
        System.out.println("El nombre del velero que mayor cuota paga es: " + nombreMV + ". Su cuota mensual es: " + montoMV);
        System.out.println("La cuota promedio pagada por las embarcaciones es: " + cuotaProm);

    }

}
