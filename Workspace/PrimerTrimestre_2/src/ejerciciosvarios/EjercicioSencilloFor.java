package ejerciciosvarios;

import java.util.Scanner;

public class EjercicioSencilloFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique un número: ");
		int numero = sc.nextInt();
		int factorial = 1;
		
		for(int i= 1; i <= numero;i++) {
			factorial *=i;
		}
		System.out.println("El factorial de: " + numero + " es " + factorial);
		sc.close();
	}

}
