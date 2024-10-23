package arrays;

import java.util.Scanner;

public class EjercicioMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int NUMERO_ALUMNOS = 4;

		int opcion;
		String[] alumnos = new String[NUMERO_ALUMNOS];
		int[] edades = new int[NUMERO_ALUMNOS];

		int contador = 0;
		System.out.println("Bienvenido a mi aplicación");

		do {
			System.out.println("Este es el menu disponible");
			System.out.println("\t1. Introducir dato");
			System.out.println("\t2. Ver datos");
			System.out.println("\t3. Ver datos al reves");
			System.out.println("\t4. Buscar datos");
			System.out.println("\t5. Salir");
			System.out.println("Seleccione una opción:");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				if (contador < NUMERO_ALUMNOS) {
					System.out.println("Introduzca un nombre: ");
					sc.nextLine();
					alumnos[contador] = sc.nextLine();
					System.out.println("Introduzca edad");
					edades[contador] = sc.nextInt();
					contador++;
				} else {
					System.out.println("Registro completo: ");
				}
				break;
			case 2:
				for (int i = contador; i < NUMERO_ALUMNOS; i++) {
					if (alumnos[i] != null) {
						System.out.println(alumnos[i] + "-" + edades[i]);
					}
				}
				break;
			case 3:
				for (int i = contador-1; i> NUMERO_ALUMNOS; i--) {
					if (alumnos[i] != null) {
						System.out.println(alumnos[i] + "-" + edades[i]);
					}
				}
			case 4:
				boolean encontrado = false;
				int contadorEncontrados = 0;
				System.out.println("Introduce nombre que buscar: ");
				sc.nextLine();
				String nombreBuscar = sc.nextLine();
				for (int i = 0; i < NUMERO_ALUMNOS; i++) {
					if (nombreBuscar.equals(alumnos[i])) {
						System.out.println(alumnos[i] + "-" + edades[i]);
					}
				}
				if (!encontrado) { //contadorEncontrados == 0
					System.out.println("No existen datos con ese valor");
				}else {
					System.out.println("Se han encontrado " + contadorEncontrados + " alumnos");
				}
			case 5:
				System.out.println("Estas saliendo de la aplicación...");
				break;
			default:
				System.out.println("Opción incorrecta");

			}
		} while (opcion != 3);
		System.out.println("Fin del programa.");
		sc.close();

	}

}
