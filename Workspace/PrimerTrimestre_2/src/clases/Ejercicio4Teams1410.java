package clases;

import java.util.Scanner;

public class Ejercicio4Teams1410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crear un menú con 3 opciones:
		    1. Mostrar área de un cuadrado: Si se entra a esta opción (1) se pide al usuario la longitud del lado y se muestra el resultado. El área de un cuadrado es: lado*lado
		    2. Mostrar perímetro de un cuadro: Si se entra a esta opción (2) se pide al usuario la longitud del lado y se muestra el resultado. El perímetro de un cuadrado es: lado*4
		    3. Salir: Cuando se selecciona la opción Salir se sale del bucle*/
				Scanner sc = new Scanner(System.in);
				
				int opcion; 
				System.out.println("Bienvenido a mi aplicación"); 
				
				do {
					System.out.println("Este es el menú disponible");
					System.out.println("\t1. Área");
					System.out.println("\t2. Perímetro");
					System.out.println("\t3. Salir");
					System.out.println("Seleccione una opción:");
					
					opcion = sc.nextInt(); 
					switch(opcion) {
						case 1:
							System.out.println("Introduzca el lado del cuadrado:");
							int lado = sc.nextInt();
							System.out.println("Área = " + (lado * lado));
							break;
						case 2: 
							System.out.println("Introduzca el lado del cuadrado:");
							lado = sc.nextInt();
							System.out.println("Perímetro = " + (lado * 4));
							break;
						case 3: 
							System.out.println("Hasta otra!!");
							break;
						default: 
							System.out.println("Opción incorrecta");
					}
					
				} while (opcion != 3);
				sc.close();
				
			}
		
		
		
	}


