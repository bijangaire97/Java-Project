package FileHandingPractice;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\Bijan Gaire\\Desktop\\abc.docx");
			fw.write("apple");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
