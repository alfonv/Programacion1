package clases;

import java.util.Scanner;

public class NumeroParesSoloFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Numero: ");
		String cadena = sc.nextLine();
		int contador = 0;

		for (int i = 0; i <= 100; i += 0) {
			System.out.println(i);
			contador++;
		}
		System.out.println("Los numeros primos son: " + cadena);
		sc.close();
	}

}
