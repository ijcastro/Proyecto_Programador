package Practica04;

import java.util.Scanner;

public class Practica04 {

    public static void main(String[] args) {
        //Declaracion de variables y métodos:
        Scanner entrada = new Scanner(System.in);
        int n, i, totalRecaudado, cod1, cod2, cod3, cod4, cod5, cod6, cod7, cod8, cod9, cod10, cod11, cod12, cod13, cod14, cod15, cod16, cod17, cod18, cod19, cod20;
        int codMasUsado;        

        //Inicialización:
        totalRecaudado = cod1 = cod2 = cod3 = cod4 = cod5 = cod6 = cod7 = cod8 = cod9 = cod10 = cod11 = cod12 = cod13 = cod14 = cod15 = cod16 = cod17 = cod18 = cod19 = cod20 = 0;
        codMasUsado = 0;
        
        //Entradas:
        do{
        System.out.println("Ingrese el total de multas labradas");
        n = entrada.nextInt();
        } while (n <= 0);
        
        int codigos[] = new int[n]; //se declara y dimensiona el arreglo
        float importes[] = new float[n]; //se declara y dimensiona el arreglo

        //Procesos:
        for (i = 0; i < n; i++) {//ciclo de carga de códigos
            do { //para validar que sean códigos entre 1 y 20
                System.out.println("Ingrese el código de infracción");
                codigos[i] = entrada.nextInt();
            } while (codigos[i] < 1 || codigos[i] > 20);
        }
        for (i = 0; i < n; i++) {//ciclo de carga de importes
            System.out.println("Ingrese el importe de la multa");
            importes[i] = entrada.nextFloat();
            totalRecaudado += importes[i];//obtencion de total recaudado
        }
        for (i = 0; i < codigos.length; i++) {//ciclo para conteo de codigos de multa
            switch (codigos[i]) {
                case 1:
                    cod1 = cod1 + 1;
                    break;
                case 2:
                    cod2 = cod2 + 1;
                    break;
                case 3:
                    cod3 = cod3 + 1;
                    break;
                case 4:
                    cod4 = cod4 + 1;
                    break;
                case 5:
                    cod5 = cod5 + 1;
                    break;
                case 6:
                    cod6 = cod6 + 1;
                    break;
                case 7:
                    cod7 = cod7 + 1;
                    break;
                case 8:
                    cod8 = cod8 + 1;
                    break;
                case 9:
                    cod9 = cod9 + 1;
                    break;
                case 10:
                    cod10 = cod10 + 1;
                    break;
                case 11:
                    cod11 = cod11 + 1;
                    break;
                case 12:
                    cod12 = cod12 + 1;
                    break;
                case 13:
                    cod13 = cod13 + 1;
                    break;
                case 14:
                    cod14 = cod14 + 1;
                    break;
                case 15:
                    cod15 = cod15 + 1;
                    break;
                case 16:
                    cod16 = cod16 + 1;
                    break;
                case 17:
                    cod17 = cod17 + 1;
                    break;
                case 18:
                    cod18 = cod18 + 1;
                    break;
                case 19:
                    cod19 = cod19 + 1;
                    break;
                case 20:
                    cod20 = cod20 + 1;
                    break;
            }
        }//fin ciclo conteo de codigos de multa
        
        
        //nuevo vector para rastrear el código más usado
        int codigos2 [] = {cod1, cod2, cod3, cod4, cod5, cod6, cod7, cod8, cod9, cod10, cod11, cod12, cod13, cod14, cod15, cod16, cod17, cod18, cod19, cod20};
        for(i = 0; i < codigos2.length-1; i++){
            if(codigos2[i+1] > codigos2[i]){
                codMasUsado = codigos2[i+1];
            }
        }

    }

}
