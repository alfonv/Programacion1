package clases;

import java.util.Scanner;

public class HolaAlRevesConFor {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Cadena: ");
		 String cadena = sc.nextLine();
		 
		 for(int posicion= cadena.length()-1;posicion >=0 ; posicion--) {
			 System.out.println(cadena.charAt(posicion));
		 }
		 System.out.println("Su longitud es: " + cadena.length());
		 sc.close();
	}

}
