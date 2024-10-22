package arrays;

import java.util.Scanner;

public class EjercicioMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] alumnos = new String[20];
		int i=0;
		
		int opcion;
		System.out.println("Bienvenido a mi aplicación");

		do {
			System.out.println("Este es el menu disponible");
			System.out.println("\t1. Introducir dato");
			System.out.println("\t2. Ver dato");
			System.out.println("\t3. Salir");
			System.out.println("Seleccione una opción:");

			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				if (alumnos[i] !=0 ){
				System.out.println("Introduzca un nombre: ");
						
				i++;
				break;
			case 2:
				System.out.println("Los datos introducidos son");
				
				break;
			case 3:
				System.out.println("Esta saliendo de la aplición...");
				break;
			default:
				System.out.println("Hasta la proxima");
			
			}
		} while (opcion != 0);
		sc.close();

	}

}
