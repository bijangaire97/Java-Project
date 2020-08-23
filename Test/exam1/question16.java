package exam1;

import java.util.Scanner;

public class question16 {

	public static void main(String[] args) {
		// Even/Odd
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a: ");
		int a = input.nextInt();

		if (a % 2 == 0) {

			System.out.println(a + "is an even number.");
		}

		else {
			System.out.println(a + " is an odd number.");

		}
		input.close();

	}

}
