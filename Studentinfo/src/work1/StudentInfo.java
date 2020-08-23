package work1;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size::");
		int size = sc.nextInt();

		info(size);

		sc.close();

	}

	static void info(int a) {

		String[][] data = new String[a][3];

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < a; i++) {

			System.out.print("Enter the name of student: ");
			data[i][0] = input.nextLine();
			System.out.println("Address:::");
			data[i][1] = input.nextLine();
			System.out.println("age::");
			data[i][2] = input.nextLine();

		}

		for (int x = 0; x < data.length; x++) {
			for (int y = 0; y < data[x].length; y++) {
				System.out.print(data[x][y]+"     ");
			}
			System.out.println();
		}

		input.close();

	}
}
