package clases;

import java.util.Scanner;

public class HolaAlReves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Cadena: ");
		String cadena = sc.nextLine();
		int i = cadena.length() - 1;

		while (i >= 0) {
			System.out.println(cadena.charAt(i));
			i--;
			sc.close();
		}
	}

}
