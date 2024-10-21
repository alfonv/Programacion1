package arrays;

import java.util.Scanner;

public class PedirNumeroAlUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("De un valor del 1 al 5: ");
		int valor = sc.nextInt();
		
		int num[]=new int[5];
		System.out.println("Longitud tabla: ");
		int longitud = sc.nextInt();
		int numeroUsuario[] = new int[longitud];
		
		System.out.println(numeroUsuario.length);//.length me dira longitud de una tabla

	}

}
