package clases;

import java.util.Scanner;

public class CadenaTextoEjercicioHasta0 {

	public static void main(String[] args) {
		//final String PALABRA PARA SALIR = "Salir", para declarar constantes
		Scanner sc = new Scanner(System.in);
		String cadena;

		do {
			System.out.println("Cadena: ");
			cadena = sc.nextLine();
			if (cadena.length() > 0 && !cadena.equals("Salir")) {
				if (cadena.length()% 2 == 0 ) {
				System.out.println("La longitud es " + cadena.length()+ " y es par");
			} else {
				System.out.println("La longitud es "+ cadena.length()+ " y es impar");
			}
		}else {
			System.out.println("La cadena tiene una longitud 0,introduzca otra");
		}
		} while (!cadena.equals("Salir"));

		sc.close();

	}

}