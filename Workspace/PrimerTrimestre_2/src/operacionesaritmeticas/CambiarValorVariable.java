package operacionesaritmeticas;

import java.util.Scanner;

public class CambiarValorVariable {public class Caracteres {
	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca una cadena: ");
		//char a = 's';
		String cadena = teclado.nextLine();
		System.out.println("La cadena introducida es: " + cadena);
		char a = cadena.charAt(0);
		
		
		System.out.println(a + ": " + (int)a);	
		
		
		char a1 = (char)(a + 1);
		char a2 = (char)(a + 2);
		char a3 = (char)(a + 3);
		
		System.out.println(a1 + ": " + (int)(a1));
		System.out.println(a2 + ": " + (int)(a2));
		System.out.println(a3 + ": " + (int)(a3));
		teclado.close();
	}
}

}