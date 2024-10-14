package operacionesaritmeticas;

import java.util.Scanner;

public class PedirLongitud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Cadena de texto: ");
		String cadena = sc.nextLine();

		System.out.println("Longitud: " + cadena.length());

		System.out.println("Primer carácter: " + cadena.charAt(0));

		System.out.println("Último carácter: " + cadena.charAt(cadena.length() - 1));

		sc.close();

	}

}
