package operacionesaritmeticas;

import java.util.Scanner;

public class Caracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado;
		teclado = new Scanner(System.in);
		/*char c = 'Z';
		System.out.println(c); // Z
		System.out.println((int) c); // 90
		System.out.println(c + 1); // 91
		System.out.println((char) (c + 1)); // [
		System.out.println((char) c + "->" + (int) c); //Z->90*/

		/*
		 * ((int) para print valor numerico del caracter (char) para print la letra char
		 * suma = 'una letra' + 'otra letra'; System.out.println((int) suma + "->" +
		 * (char) suma);
		 */

		// String cadena = teclado.nextLine();
		// despues hacer variable = cadena.charAt(0);

		System.out.println("Introduzca una cadena: ");
		String cadena = teclado.nextLine();
		System.out.println("La cadena introducida es: " + cadena);
		
		char a = cadena.charAt(0);
		System.out.println(a);
		
		System.out.println(a + ": " + (int) a);
		char a1 = (char) (a + 1);
		char a2 = (char) (a + 2);
		char a3 = (char) (a + 3);

		System.out.println(a1 + ":" + (int) (a1));
		System.out.println(a2 + ": " + (int) (a2));
		System.out.println(a3 + ": " + (int) (a3)); 

		System.out.println(cadena.charAt(0));
		System.out.println(cadena.charAt(1));
		System.out.println(cadena.charAt(2));
		System.out.println(cadena.charAt(3));
		teclado.close();

	}

}
