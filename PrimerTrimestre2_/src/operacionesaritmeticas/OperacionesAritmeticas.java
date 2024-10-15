package operacionesaritmeticas;

import java.util.Scanner;

public class OperacionesAritmeticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado;
		teclado = new Scanner(System.in);
		// Int para enteros ,Double si quisiera sacar los decimales, se podrian hacer
		// dos programas distintos
		System.out.println("Hola, dime un número");
		int numero1 = teclado.nextInt();
		System.out.println("Dime otro numero");
		int numero2 = teclado.nextInt();
		System.out.println("Otro número más");
		int numero3 = teclado.nextInt();
		System.out.println("El último");
		int numero4 = teclado.nextInt();
		int sumaentero = ((numero1 + numero2 + numero3) / numero4);
		System.out.println("El resultado entero es: " + (sumaentero));

		System.out.println("Hola, dime un número");
		double numero5 = teclado.nextInt();
		System.out.println("Dime otro numero");
		double numero6 = teclado.nextInt();
		System.out.println("Otro número más");
		double numero7 = teclado.nextInt();
		System.out.println("El último");
		double numero8 = teclado.nextInt();
		double sumadecimal = ((numero5 + numero6 + numero7) / numero8);
		System.out.println("El resultado decimal es: " + (sumadecimal));

		System.out.println("Perimetro cuadrado");
		System.out.println("Cuanto mide el lado: ");
		int ml = teclado.nextInt();
		int numero = 4;
		int lado = ( ml* numero);
		System.out.println("El perimetro cuadrado es: " + lado);
		
		teclado.close();
	}

}
