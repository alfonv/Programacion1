package clases;

import java.util.Scanner;

public class PedirAlUsuarioHasta0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		String cadena;
		
		do {
		System.out.println("Introduzca un numero: ");
		num = sc.nextInt();
		if (num ) {
			num++;
		}
		
		}while (num == 0);
			sc.close();
		}
	}