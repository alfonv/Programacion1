package ejerciciosvarios;

import java.util.Scanner;

public class VariableBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b= true;
		
		System.out.println(b);
		
		//b= false;	
		//System.out.println(b);
		
		int n1 = 5;
		int n2 = 3;
		
		b = n1==n2;
		System.out.println(b); 
		
		b = n1 > n2;
		System.out.println(b);
		
		char c1 = 'A';
		char c2 = 'B';
		
		b = c1==c2;
		System.out.println("c1 == c2 -> " + b);
		
		b = c1> c2;
		System.out.println("c1 > c2 -> "+ b);
		
		b = c1 < c2;
		System.out.println("c1 < c2 -> "+ b);
		
		b= c1>= c2;
		System.out.println("c1 >= c2 -> "+ b);
		
		b= c1<= c2;
	    System.out.println("c1 <= c2 -> "+ b);
	    
	    b= 'A' == 65;
	    System.out.println("'A' == 65 ->" + b );
	    
	    b=b == true;
	    System.out.println("b == true ->" + b);
				
	    b = n1 > n2 && n1 % n2 == 0; // false
	    b = n1 < n2 || n1 % n2 != 0; // true
	    b = n1 > n2 && n1 % n2 !=0 || n1 == 4; // true && true || true -> true
		
	    b = n1 > n2 && (n1 % n2 !=0 || n1 == 4); // true && ( true|| false)
	   
	}

}
