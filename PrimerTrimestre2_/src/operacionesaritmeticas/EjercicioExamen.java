package operacionesaritmeticas;

import java.util.Scanner;

public class EjercicioExamen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int num1 = 5;
		int num2 = 2;
		
		int c = num1;
		num1 = num2;
		num2 = c;
		
		int a= num2;
		num2= num1;
		num1= a;
		System.out.println("el valor de numero 2 es: "+ num1);
		System.out.println("el valor de numero 1 es: " + num2);
	}

}