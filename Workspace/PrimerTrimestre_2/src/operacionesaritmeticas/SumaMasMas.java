package operacionesaritmeticas;

public class SumaMasMas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;

		System.out.println(i); // 0
		i = i + 1;
		System.out.println(i); // 1

		i++;
		System.out.println(i); // 2

		++i;
		System.out.println(i); // 3

		System.out.println(i++); // 3 primero pinta y luego suma

		System.out.println(i); // 4

		System.out.println(++i); // 5 primero suma y luego pinta

		int b = 2 + i++;
		System.out.println(b); // 7
		System.out.println(i); // 6

		b = 2 + ++i;
		System.out.println(b); // 9
		System.out.println(i); // 7
		
		System.out.println(i = i + 1); //8
	}

}
