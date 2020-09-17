package practica07;

import java.util.Scanner;

/**
 *
 * @author Nacho
 */
public class Practica07 {

    public static void main(String[] args) {
        //Definir variables y método de entrada
        int n, x, y, cuad1, cuad3, distancia, distAnterior, mayorX, mayorY;
        Scanner entrada = new Scanner(System.in);
        cuad1 = cuad3 = x = y = distAnterior = mayorX = mayorY = 0; //inicializacion por asig. multiple de variables de conteo       
        
        //Pedido de cantidad de datos a ingresarse (Para el ciclo for):
        System.out.println("Ingrese el total de coordenadas a cargar: ");
        n = entrada.nextInt();        
        
        for (int i = 0; i < 7; i++) {//Inicio ciclo for
            //Toma de coordenadas:
            System.out.println("Ingrese la coordenada X");
            x = entrada.nextInt();
            if (x == 0) {
                System.out.println("Ingrese una coordenada distinta de cero");
                x = entrada.nextInt();
            }
            System.out.println("Ingrese la coordenada Y");
            y = entrada.nextInt();
            if (y == 0) {
                System.out.println("Ingrese una coordenada distinta de cero");
                y = entrada.nextInt();
            }
            //Conteo de cantidad de datos en cuadrantes 1 y 3:
            if (x > 0 && y > 0) {
                cuad1 = cuad1 + 1;
            }
            if (x < 0 && y < 0) {
                cuad3 = cuad3 + 1;
            }
            //Cálculo distancia
            distancia = (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            //Búsqueda mayor distancia
            if (distancia > distAnterior) {
                mayorX = x;
                mayorY = y;
            }

            distAnterior = distancia;

        }//Fin ciclo for

        System.out.println("La cantidad de puntos en el Cuadrante 1 es: " + cuad1);
        System.out.println("La cantidad de puntos en el Cuadrante 3 es: " + cuad3);
        System.out.println("El punto ubicado a mayor distancia es: (" + mayorX + "," + mayorY + ")");

    }

}
