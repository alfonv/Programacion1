package clases;

import java.util.Scanner;

public class CadenaTextoSinA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Cadena: ");
		String cadena = sc.nextLine();

		char caracter = 0;
		int posicion = 0;

		while (caracter != 'a') {

			caracter = cadena.charAt(posicion);
			if (caracter != 'a') {
				System.out.println(caracter);
				
				posicion++;
			}
			sc.close();
		}

	}

}
