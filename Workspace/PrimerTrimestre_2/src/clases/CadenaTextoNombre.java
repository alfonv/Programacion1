package clases;

import java.util.Scanner;

public class CadenaTextoNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cadena: ");
		String cadena = sc.nextLine();
	   
		int posicion = 0;
	    while (posicion < cadena.length()){
	    	System.out.println(cadena.charAt(posicion));
	    	posicion++;
	   
	    	
	    }
	    	
	    	
	    	/* }
		do {
		System.out.println("Cadena de texto: ");
		String cadena = sc.nextLine();
		char a = cadena.charAt(0);
		
		char a1 = (char) (a + 1);
		char a2 = (char) (a + 2);
		char a3 = (char) (a + 3);
		
		System.out.println(cadena.charAt(0));
		System.out.println(cadena.charAt(1));
		System.out.println(cadena.charAt(2));
		System.out.println(cadena.charAt(3));
		}while (letra !=0);*/
		
		
			
	
	}
}
