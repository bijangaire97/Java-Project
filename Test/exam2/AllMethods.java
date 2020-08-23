package exam2;

import java.util.Arrays;
import java.util.Scanner;

public class AllMethods {

	public void sumMul(Scanner input) {

		System.out.println("Enter the number: ");
		int userNum = input.nextInt();

		int sum = 0;
		int mul = 1;

		while (userNum > 0) {
			int temp = userNum % 10;
			sum = sum + temp;
			mul = mul * temp;
			userNum = userNum / 10;

		}
		System.out.println("Sum: " + sum);
		System.out.println("Multiplication: " + mul);
	}

	public static int firstPrime(Scanner input)

	{

		System.out.println("Enter the number: ");
		int userNum = input.nextInt();

		while (true) {
			int counter = 0;
			for (int i = 2; i < userNum / 2; i++) {
				if (userNum % i == 0) {
					counter++;
				}

			}
			if (counter == 0) {

				return userNum;

			}

			userNum++;
		}

	}

	public static String fibonacci(Scanner input) {

		System.out.println("Enter the length of fibonacci series: ");
		int length = input.nextInt();

		String fibSeries = "1";
		int temp = 0;
		int another = 1;
		int sum = 0;

		for (int i = 0; i < length - 1; i++) {

			sum = temp + another;

			fibSeries = fibSeries + ", " + sum;

			temp = another;
			another = sum;

		}

		return fibSeries;
	}

	public static int[] ascendingOrder(Scanner input) {
		System.out.println("Enter the number of elements in an array: ");
		int length = input.nextInt();

		int[] array = new int[length];

		for (int i = 0; i < length; i++) {
			array[i] = input.nextInt();
		}

		for (int k = 0; k < length; k++) {
			for (int l = k + 1; l < length; l++) {

				if (array[l] < array[k]) {

					int temp = array[k];
					array[k] = array[l];
					array[l] = temp;
				}

			}
		}
		return array;
	}

	public static String[] reverse(Scanner input) {

		System.out.println("Enter the number of elements in an array: ");
		int length = input.nextInt();

		String[] array = new String[length];

		System.out.println("Enter the words: ");

		for (int i = 0; i < length; i++) {
			array[i] = input.next();
		}
		System.out.println("Original array: " + Arrays.toString(array));
		String revArray[] = new String[length];

		int k = 0;
		for (int j = length - 1; j >= 0; j--) {

			revArray[k] = array[j];

			k++;

		}
		return revArray;
	}

}
