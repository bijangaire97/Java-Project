package exam1;

import java.util.Scanner;

public class question20 {

	public static void main(String[] args) {
		// switch case 
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a: ");
		int a = input.nextInt();
		
		System.out.println("Enter b: ");
		int b = input.nextInt();

		System.out.println("Select an operator (+ - * /): ");
		char c = input.next().charAt(0);
		
	
	
switch(c) {

case '+':
	System.out.println("Addition: "+ (a+b));
	break;
	
case '-':
	System.out.println("Difference: "+ (a-b));
	break;
	
case '*':
	System.out.println("Multiplication: "+ (a*b));
	break;
	
case '/':
	System.out.println("Divison: "+ (a/b));
	default:
	
	
}
	input.close();
}
	}
