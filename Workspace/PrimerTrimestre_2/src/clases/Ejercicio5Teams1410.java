package clases;

import java.util.Scanner;

public class Ejercicio5Teams1410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int NUMERO_VECES = 10;
		
		// Genera número aleatorio
		int max = 100; // Máximo
        int min = 0; // Mínimo
        int range = (max - min) + 1;
        int numeroAleatorio = (int) ((range * Math.random()) + min);
        int numeroUsuario;
        int contador = 0; 
        System.out.println(numeroAleatorio);
        do {
	        System.out.println("Introduce un número entre el 0 y el 100:  ");
	        numeroUsuario = sc.nextInt();
	        
	        if (numeroUsuario == numeroAleatorio) {
	        	System.out.println("Lo acertaste!!!!");
	        } else if (numeroUsuario < numeroAleatorio) {
	        	System.out.println("El número introducido es menor que el número secreto");
	        } else {
	        	System.out.println("El número introducido es mayor que el número secreto");
	        }
	        contador++;
        } while (numeroAleatorio != numeroUsuario && contador < NUMERO_VECES);
        
        if (contador == NUMERO_VECES) {
        	System.out.println("Has fallado!!");
        }
        
        
        
        sc.close();
        
	}

}
