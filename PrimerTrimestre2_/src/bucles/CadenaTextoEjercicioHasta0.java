package bucles;

import java.util.Scanner;
//Pedir cadenas de texto y mostrar por pantalla si la longitud de la cadena es par o impar. Salir del bucle cuando se introduzca la cadena Salir
public class CadenaTextoEjercicioHasta0 {

	public static void main(String[] args) {
		//final String PALABRA PARA SALIR = "Salir", para declarar constantes
		Scanner sc = new Scanner(System.in);
		String cadena;

		do {
			System.out.println("Cadena: ");
			cadena = sc.nextLine();
			if (cadena.length() > 0 && !cadena.equals("Salir")) {
				if (cadena.length()% 2 == 0 ) {
				System.out.println("La longitus es " + cadena.length()+ " y es par");
			} else {
				System.out.println("La longitud es "+ cadena.length()+ " y es impar");
			}
		}else {
			System.out.println("La cadena tiene una longitud 0,introduzca otra");
		}
		} while (!cadena.equals("Salir"));

		sc.close();

	}

}