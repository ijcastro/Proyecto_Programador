/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PRACTICA03.java."

import java.io.*;
import java.math.*;

public class practica03 {

	public static void main(String args[]) {
		int numcartaj1;
		int numcartaj2;
		int palocartaj1;
		int palocartaj2;
		int puntosj1;
		int puntosj2;
		int ronda;
		// Definicion de variables:
		ronda = 1;
		puntosj1 = 0;
		puntosj2 = 0;
		do {
			// Se sacan las cartas
			numcartaj1 = Math.floor(Math.random()*11);
			palocartaj1 = Math.floor(Math.random()*5);
			numcartaj2 = Math.floor(Math.random()*11);
			palocartaj2 = Math.floor(Math.random()*5);
			System.out.println("Jugador 1 saca "+numcartaj1+" de "+palocartaj1);
			System.out.println("Jugador 2 saca "+numcartaj2+" de "+palocartaj2);
			if (numcartaj1>numcartaj2) {
				puntosj1 = puntosj1+numcartaj1+numcartaj2;
			} else {
				if ((numcartaj2>numcartaj1)) {
					puntosj2 = puntosj2+numcartaj1+numcartaj2;
				} else {
					if (numcartaj1==numcartaj2) {
						if (palocartaj1==4) {
							puntosj1 = puntosj1+numcartaj1+numcartaj2;
						} else {
							if (palocartaj2==4) {
								puntosj2 = puntosj2+numcartaj1+numcartaj2;
							} else {
								puntosj1 = puntosj1+numcartaj1;
								puntosj2 = puntosj2+numcartaj2;
							}
						}
					}
				}
			}
			ronda = ronda+1;
		} while (ronda<=2);
		// Salida
		if (puntosj1>puntosj2) {
			System.out.println("Gana el jugador 1 con "+puntosj1);
		} else {
			System.out.println("Gana el jugador 2 con "+puntosj2);
		}
	}


}

