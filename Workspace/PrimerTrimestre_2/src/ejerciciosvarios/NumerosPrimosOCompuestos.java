package ejerciciosvarios;

import java.util.Scanner;

public class NumerosPrimosOCompuestos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Numero: ");
		int cadena = sc.nextInt();
		int contador = 0;

		for (int i = 0; i <= 100; i = 0) {
			System.out.println(i);
			contador++;
		}
		System.out.println("Los numeros primos son: " + cadena);
		sc.close();
	}

}
