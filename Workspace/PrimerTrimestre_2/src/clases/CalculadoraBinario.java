package clases;

import java.util.Scanner;

public class CalculadoraBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
		
		int opcion;
		do {
		
			System.out.println("1. Decimal a binario");
			System.out.println("2. Binario a decimal");
			System.out.println("3. Salir");
			
			opcion = sc.nextInt(); 
			switch (opcion) {
				case 1: 
					System.out.println("Número decimal: ");
					int numero = sc.nextInt(); 
					int resultado;
					String binario = ""; 
					do {
						
						resultado = numero / 2; 
						 
						int resto = numero % 2; 
						binario = resto + binario;
						numero = resultado;
						
					} while (resultado != 0);
					
					
					
					System.out.println("El binario es: " + binario);
					break;
				case 2: 
					System.out.println("Binario: ");
					sc.nextLine();
					binario = sc.nextLine();
					resultado = 0;
					int posicion = 0; 
					while (posicion < binario.length()) {
						char c = binario.charAt(binario.length() - 1 - posicion);
						
						int valorCaracter = c - (int)'0';
						
						int valorPotencia = 1;
						int contador = 0; 
						int exponente = posicion;
						while (contador < exponente) {
							valorPotencia = 2 * valorPotencia; 
							contador++;
						}
						
						resultado = resultado + valorCaracter*valorPotencia;
						
						posicion++;
					}
					System.out.println("El decimal es: " + resultado);
					break;
				case 3: 
					System.out.println("Adios!!!");
					break;
				default: 
					System.out.println("Opción incorrecta");
			}
		}while (opcion != 3);
	
				
		sc.close(); 

	}
}
