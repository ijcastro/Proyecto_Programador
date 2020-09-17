package ejemplo;

import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        //Declaracion de variables y métodos
        int n;//para cantidad de actas labradas
        float total = 0;
        Scanner entrada = new Scanner(System.in);

        //Entrada: Cantidad de actas labradas
        do {
            System.out.println("Ingrese la cantidad de actas labradas (>0):");
            n = entrada.nextInt();
        } while (n <= 0);

        /*Arreglos: cuando tienen informacion relacionada en las componentes
        homólogas (con el mismo índice), se los llama arreglos paralelos
         */
        int codigos[] = new int[n];
        float importes[] = new float[n];

        //carga de los arreglos con los datos de las actas:
        for (int i = 0; i < n; i++) {
            do {//validamos que los codigos ingresados esten entre 1 y 20
                System.out.println("Ingrese código de infracción [entre 1 y 20]:");
                codigos[i] = entrada.nextInt();
            } while (codigos[i] < 1 || codigos[i] > 20);

            System.out.println("ingrese monto de la infracción:");
            importes[i] = entrada.nextFloat();
            total += importes[i];//se acumula a medida que se ingresan los montos
        }

        //Se declara vector auxiliar de conteo para la cantidad de multas por concepto
        //Se resuelve de manera más simple lo que yo hice con un switch
        int conteo[] = new int[20]; //Se dimensiona con 20, por cada uno de los códigos de infracción

        /*Se inicia ciclo for para recorrer el vector de codigos y contar cantidad de ocurrencias
        de cada código de infracción labrado
         */
        for (int i = 0; i < n; i++) {
            //Para contar se utiliza la técnica de acceso directo
            conteo[codigos[i] - 1]++;
            /*Ejemplo: si codigo[i] = 4, entonces se suma una unidad
                                    en la posición 4 - 1 = 3 del vector de conteo.
                                    Por lo que entiendo, lo que hace es colocar en el vector conteo
                                    una unidad por cada codigo (del 1 al 20) que se va repitiendo.
                                    Y cada posición del vector conteo corresponde a un código de infracción.
                                    La posición cero corresponde al código 1, la posición uno al código 2, etc.
                                    Es decir, con el vector código como subíndice, se van tomando los codigos de
                                    infracción, con el ++ se acumula una unidad en la memoria de cada posición,
                                    y con el -1 se ubica el código en la posición que corresponde en el vector conteo
             */
        }

        //Busqueda de la posición del mayor valor en el vector de conteo:
        int mayor = conteo[0];
        int posicion = 1;

        for (int i = 1; i < conteo.length; i++) {
            if (conteo[i] > mayor) {
                mayor = conteo[i];
                posicion = i + 1; //Si se encuentra en la posición 4
                                  //entonces corresponde al codigo de infraccion 5
            }
        }

        //Mostrar resultados:
        System.out.println("Total facturado en el último fin de semana: $" + total);
        System.out.println("Códigos de acta labrados: ");
        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] > 0) {
                System.out.println("Código " + (i + 1) + ":" + conteo[i]);
            }
        }
        System.out.println("Código de infracción más frecuente: " + posicion);

    }

}
