package arrays;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// tabla creada con longitud y luego le doy valor
		int numeros[] = new int[5];// tamaño del 0 al 4
		System.out.println(numeros[0]);// se crea tabla con 0
		// modificacion de valores, darle valor a las posiciones
		numeros[0] = 5;
		numeros[1] = 3;
		numeros[4] = 1;

		// tabla 2, esta es creada con los valores
		int[] numero2 = { 20, 5, 98, 12 };
		System.out.println(numero2[2]);

		System.out.println("Longitud tabla: ");
		int longitud = sc.nextInt();
		int numeroUsuario[] = new int[longitud];

		for (int i = 0; i < longitud; i++) { // para repetir algo siempre este for
			System.out.println("Número " + (i + 1) + ":");
			int numeroIntroducido = sc.nextInt();
			numeroUsuario[i] = numeroIntroducido;
		}
		for (int i = 0; i < longitud; i++) {
			System.out.println("Numero introducido en la poscición " + i + " es: " + numeroUsuario[i]);
			if (numeroUsuario[i] != 0) {
				if (numeroUsuario[i] % 2 == 0) {
					System.out.println("Par");
				} else {
					System.out.println("Impar");
				}
			} else {
				System.out.println("El 0 no es par ni impar");
			}

		}
		for (int numero : numeroUsuario) { // otra forma de hacer for
			System.out.println(numero);
		}

	}

}
