
/**
 *
 * @author Nacho
 */
public class Practica02 {

    public static void main(String[] args) {
        //Bloque 1
        short t = 5;
        int y = 10;
        System.out.println(t + y);
        float i = t + y;
        System.out.println(i + y);

        //Bloque 2
        int a = 12;
        int j = 13;
        System.out.println(++a);
        System.out.println(a+j);
        
        //Bloque 3
        int num1 = 143;
        int num2 = 57;
        byte num3 = (byte)(num1 + num2);
        System.out.println("Suma num1 + num2 como byte: " + num3);
        
        //Bloque 4
        int x = 11, w = 5;
        int z = x*w - x++ + --x/w;
        System.out.println("Resultado: " + z);
        
        //Bloque 5
        int d = 30, e = 20;
        System.out.println("Porcentaje: " + e/d*100);
        
        
    }

}
