package clases;

import java.util.Scanner;

public class Ejercicio3Teams1410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Cadena: ");
		String cadena = sc.nextLine();
		int posicion = 0;
		String nuevaCadena = "";
		while (posicion < cadena.length()) {
			char c = cadena.charAt(posicion);
			// System.out.println("Interacción " + posicion);
			// System.out.println("Leo caracter: " + c);
			if (c >= 'A' && c <= 'Z') {
				// System.out.println("El carcater está en mayuscula");
				c = (char) (c + 32);
				// System.out.println("Convierto a minusculas: " + c);
			}
			nuevaCadena += c; // Acumulo la cadena de texto
			posicion++;
		}
		System.out.println("La cadena en minusculas es " + nuevaCadena);
		sc.close();
	}
}
