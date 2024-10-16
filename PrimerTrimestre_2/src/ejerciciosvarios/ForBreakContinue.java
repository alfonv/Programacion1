package ejerciciosvarios;

public class ForBreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("BREAK");
		for (int i = 1; i <= 100; i++) {
			if (i == 50) {
				break; //break vuelve al for pero lee el Syso
			}
			System.out.println(i);
		}
		System.err.println("CONTINUE");
		for (int i = 1; i <= 100; i++) {
			if (i %2 != 0) {
				continue; //continue vuelve al for sin leer Syso
			}
			System.out.println(i);
		}
		System.out.println("Fin del programa");
	}

}
