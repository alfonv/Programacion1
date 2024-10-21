package arrays;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//tabla creada con longitud y luego le doy valor
		int numeros[] = new int[5];//tamaño del 0 al 4
		System.out.println(numeros[0]);// se crea tabla con 0
		//modificacion de valores, darle valor a las posiciones
		numeros[0] = 5;
		numeros[1] = 3;
		numeros[4] = 1;

		//tabla 2, esta es creada con los valores
		int[] numero2 = { 20, 5, 98, 12 };
		System.out.println(numero2[2]);

		System.out.println("Longitud tabla: ");
		int longitud = sc.nextInt();
		int numeroUsuario[] = new int[longitud];
		
		System.out.println(numeroUsuario.length);//.length me dira longitud de una tabla

		System.out.println("Posicion 0");
		int posicion0 = sc.nextInt();
		numeroUsuario[0] =posicion0;
		
		numeroUsuario[0] = sc.nextInt();
	}

}
