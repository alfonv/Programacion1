package clases;

import java.util.Scanner;

public class EjercicioDoWhile_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 		Scanner sc = new Scanner(System.in);
		int num;
		int contadorPar = 0;
		int contadorImpar = 0;

		do {
			System.out.println("Número: ");
			num = sc.nextInt();
			if (num != 0) {
			}
			if (num % 2 == 0) {
				System.out.println("El número: " + num + " es PAR");
				contadorPar++;
			} else {
				System.out.println("El número " + num + " es IMPAR");
				contadorImpar++;
			}

		} while (num != 6);
		System.out.println("Has introducido " + contadorPar + " números pares ");
		System.out.println("Has introducido " + contadorImpar + " números impares ");

		sc.close();

	}
}