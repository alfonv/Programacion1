package clases;

import java.util.Scanner;

public class CalcularPotencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int base = 2;
		int resultado = 1;
		int contador = 0;
		int exponente = 5;

		while (contador < exponente) {
			resultado = base * resultado;
			contador++;
		}

		System.out.println("resultado");
	}
}
