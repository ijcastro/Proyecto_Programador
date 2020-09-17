/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PRACTICA04.java."

import java.io.*;

public class practica04 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double gasto;
		double km;
		double kml;
		double lts;
		double pr;
		// Entrada de datos
		System.out.println("Los kilometros recorridos son");
		km = Double.parseDouble(bufEntrada.readLine());
		System.out.println("El precio del litro de combustible es");
		pr = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Los kilometros recorridos por litro son");
		kml = Double.parseDouble(bufEntrada.readLine());
		// Procesos
		lts = km/kml;
		gasto = pr*lts;
		// Salidas
		System.out.println("La cantidad de litros consumidos es de "+lts);
		System.out.println("El importe gastado en combustible es $ "+gasto);
	}


}

