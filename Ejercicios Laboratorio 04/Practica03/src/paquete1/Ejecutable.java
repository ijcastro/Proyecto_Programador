package paquete1;

import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        //Declaración de variables y métodos
        int tiempos[] = new int[20];//se declara y dimensiona el arreglo
        int i, cantAbandonos, tiempoGanador, sumaTiempos, tiempoAux;
        Scanner entrada = new Scanner(System.in);

        //Inicialización
        cantAbandonos = i = sumaTiempos = tiempoAux = tiempoGanador = i = 0;

        //Entradas:
        for (i = 0; i < tiempos.length; i++) {
            System.out.println("Ingrese el tiempo en minutos");
            tiempos[i] = entrada.nextInt();
        }

        //Procesos:
        for (i = 0; i < tiempos.length; i++) {
            //sumatoria de tiempos para promedio
            sumaTiempos = sumaTiempos + tiempos[i];
            //busqueda de abandonos
            if (tiempos[i] == 0) {
                cantAbandonos += 1;
            }

        }

        //Orden de menor a mayor sin ceros
        for (i = 0; i < tiempos.length - 1; i++) {
            if (tiempos[i] > 0) {
                for (int j = i + 1; j < tiempos.length; j++) {
                    if (tiempos[i] > tiempos[j]) {
                        tiempoAux = tiempos[i];
                        tiempos[i] = tiempos[j];
                        tiempos[j] = tiempoAux;
                    }
                }
            }
        }

        //tiempo ganador. Uso resolución profesor. Busca el primer tiempo != de 0, con el arreglo ya ordenado
        for (i = 0; i < tiempos.length - 1; i++) {
            if (tiempos[i] > 0) {
                tiempoGanador = tiempos[i];
                break;
            }
        }

        //Salidas:
        System.out.println("El tiempo promedio de carrera es: " + (sumaTiempos / 20) + " minutos");
        System.out.println("Los tiempos en orden ascendente son: ");
        System.out.print("[");
        for (i = 0; i < tiempos.length; i++) {
            if (i == 19) {
                System.out.print(tiempos[i]);
            } else {
                System.out.print(tiempos[i] + "|");
            }
        }
        System.out.println("]");

    }

}
