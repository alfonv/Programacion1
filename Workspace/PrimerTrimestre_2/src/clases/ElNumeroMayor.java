package clases;

import java.util.Scanner;

public class ElNumeroMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num;
		int mayor = 0;
		System.out.println("Introduce numeros: ");

		do {
			num = sc.nextInt();
			if (num > mayor) {
				mayor = num;
			}

		} while (num != 0);

		System.out.println("El numero más alto ha sido: " + mayor);

	}
}
