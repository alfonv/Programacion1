package condicionales;

import java.util.Scanner;

public class HombreMujer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce sexo: ");
	String sexo = sc.nextLine(); 
	System.out.println("Introduce edad: ");
	int edad = sc.nextInt(); 
	
	String mensaje;
	
	// Se cumple que edad esté comprendido entre 1 y 100 y que el sexo sea H o M
	if ((edad >= 1 && edad <= 100) // Compruebo edad
			&& (sexo.equals("H") || sexo.equals("M"))) { // Compruebo sexo
		mensaje = "Hola. Eres ";
		if (sexo.equals("H")) { // Si el sexo es H
			mensaje = mensaje + "hombre y tienes " + edad + " años.";
			if (edad >= 18) { // Si es mayor de edad 
				mensaje = mensaje + "Eres mayor de edad";
			}
		} else { // Si el sexo es M
			mensaje = mensaje + "mujer y tienes " + edad + " años";
		}
		
	} else { // No se cumplen las condiciones
		mensaje = "Ha habido un error en los datos introducidos";
	}
	
	
	System.out.println(mensaje);
	sc.close();

}

}