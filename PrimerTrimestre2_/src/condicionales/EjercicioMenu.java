package condicionales;

import java.util.Scanner;

public class EjercicioMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

	
		int a = 7;
		int b = 5;
		System.out.println("Opción");
		int opcion = teclado.nextInt();
		
		if (opcion== 1) {
			System.out.println("Sumar");
		} else if (opcion==2) {
			System.out.println("Restar");
			int c = 0;
		  
		if (a > b) {
			  c = a-b;
		  } else {
		  }
		}
		System.out.println("incorrecto");
		teclado.close();

		/*
		 * System.out.println("Indique un numero: "); int num=teclado.nextInt();
		 * 
		 * if(num==1) { System.out.println("sumar"); }else {if(num==2) {
		 * System.out.println("resta"); }else { if(num==3) {
		 * System.out.println("multiplicacion"); }else { if (num==4) {
		 * System.out.println("división"); }else { if(num>4) {
		 * System.out.println("Error");
		 */

		/*
		 * System.out.println("Indique un carácter"); char opcion =
		 * teclado.nextLine().charAt(0); //compruebo si el numero es 1 se pinta "suma"
		 * if (opcion == '1' || opcion == '+') { System.out.println("Suma"); } else if
		 * (opcion == '2' || opcion == '-') {
		 * 
		 * System.out.println("resta"); } else if (opcion == '3' || opcion == '*') {
		 * System.out.println("multiplicacion");
		 * 
		 * } else if (opcion == '4' || opcion == '/') { System.out.println("división");
		 * 
		 * } else if (opcion >= 5) { System.out.println("Error");
		 */

	}
}
