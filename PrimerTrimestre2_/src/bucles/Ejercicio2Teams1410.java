package bucles;

import java.util.Scanner;
//Pedir números hasta un 0 y mostrar una vez que se sale del bucle, el resultado de multiplicar todos los números introducidos
public class Ejercicio2Teams1410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int numero ;
		int resultado = 1;
		int contador = 0;
		do {
			System.out.println("Numero ");
			numero = sc.nextInt();
			if(numero !=0) {
				resultado = resultado * numero;
				contador++;
			}
		}while (numero !=0);
		
		System.out.println("Se ha introducido" + contador + "numero");
		System.out.println("El resultado de la multiplicación es " + resultado);
		sc.close();
			}
		
}
