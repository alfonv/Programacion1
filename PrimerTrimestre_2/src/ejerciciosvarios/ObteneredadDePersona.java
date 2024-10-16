package ejerciciosvarios;

import java.util.Scanner;

public class ObteneredadDePersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		String fecha ="16/10/2024";
		System.out.println("Seleccione fecha de nacimiento: ");
		String nacimiento=sc.nextLine();
		
		System.out.println("1 o +");
		int dia = sc.nextInt();
		int mes= sc.nextInt();
		int año = sc.nextInt();
		int edad = 0;
		boolean opcionCorrecta = true;
		
		switch (edad) {
		case
			edad = dia + mes + año:
			break;
		default:
			opcionCorrecta = false;
	
		if(opcionCorrecta) {
			System.out.println("tienes: "+ edad + "años");
		}else {
			System.err.println("Opcion no correcta: ");
		}
		}
	}
}
	

