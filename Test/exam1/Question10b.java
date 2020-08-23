package exam1;

import java.util.Scanner;

public class Question10b {

	public static void main(String[] args) {
		// Calculate area
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of side a: ");
		double a = input.nextDouble();
		
		System.out.println("Enter the value of side b: ");
		double b = input.nextDouble();
		
		System.out.println("Enter the value of side c: ");
		double c = input.nextDouble();
		
		double s = (a+b+c)/3;
		
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("Area of triangle with side "+ a+ " , " + b+ " , " +c + " is: " + area);
		
		input.close();

	}

}
