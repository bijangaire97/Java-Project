package FileHandingPractice;

import java.io.File;
import java.util.Arrays;

public class ListFiles {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\Bijan Gaire\\Desktop\\Data Science ");
		String[] a = f.list();
		System.out.println(Arrays.deepToString(a));

		int count = 0;
		for (String s : a) {
			File b = new File(f, s);

			if (b.isDirectory()) {
				System.out.println(s);
				count++;

			}

		}
		System.out.println(count);
	}

}
