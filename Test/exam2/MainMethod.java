package exam2;

import java.util.Arrays;
import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		// sum and product of given number

		Scanner input = new Scanner(System.in);
		String rechoice = "";
		do {
			System.out.println(
					"1. Sum and Multiplication of given numbers.\n2.First prime number.\n3.Fibonacci number.\n4. Ascending order\n5. Reverse of an array\n");

			int choice = input.nextInt();

			switch (choice) {

			case 1:
				AllMethods a = new AllMethods();
				a.sumMul(input);
				break;

			case 2:
				int prime = AllMethods.firstPrime(input);
				System.out.println("First prime number after our input number is " + prime);
				break;

			case 3:
				String fibonacciSeries = AllMethods.fibonacci(input);
				System.out.println("Fibonacci series: " + fibonacciSeries);
				break;

			case 4:
				int[] array = AllMethods.ascendingOrder(input);
				System.out.println("Arrray in ascending order: " + Arrays.toString(array));
				break;

			case 5:
				String[] reverseVal = AllMethods.reverse(input);
				System.out.println("Reverse array: " + Arrays.toString(reverseVal));
				break;

			default:
				System.out.println("No options!!!");

			}
			System.out.println("Enter Y to continue: ");
			rechoice = input.next();
		} while (rechoice.equalsIgnoreCase("y"));
		{
			System.out.println("Selection over! Bye!!");
			input.close();
		}

	}
}