package condicionales;

import java.util.Scanner;

public class DosNumerosCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Numero 1: ");
		int num1 = teclado.nextInt();

		System.out.println("Numero 2: ");
		int num2 = teclado.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + " > " + num2);
		} else {
			System.out.println(num1 + "<=" + num2);

			if (num1 < num2) {
				System.out.println(num1 + " < " + num2);
			} else {
				System.out.println(num1 + "=" + num2);
			}
			teclado.close();
		}

	}
}
