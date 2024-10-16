package condicionales;

import java.util.Scanner;

public class PedirNombreYContaseña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Usuario: ");
		String usuario = sc.nextLine();
		System.out.println("Contraseña: ");
		String pass = sc.nextLine();

		boolean usuarioValido = usuario.equals("pepe") ? true : false;
		boolean passValido = pass.equals("pepe2024") ? true : false;

		if (usuarioValido && passValido) {
			System.out.println("Usuario correcto");
		} else if (!usuarioValido && !passValido) {
			System.out.println("Usuario no válido: Usuario y contraseña incorrectas");
		} else if (!usuarioValido && passValido) {
			System.out.println("Usuario no válido: Usuario incorrecto");
		} else {
			System.out.println("Usuario no válido: Contraseña incorrecta");
		}

		sc.close();
	}

}
