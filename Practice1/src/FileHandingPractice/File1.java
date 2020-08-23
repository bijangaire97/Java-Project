package FileHandingPractice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class File1 {

	public static void main(String[] args) throws IOException {
		File sf = new File("C:\\Users\\Bijan Gaire\\Desktop\\apple.txt");
		File of = new File("C:\\Users\\Bijan Gaire\\Desktop\\demo13.txt");
		/*
		 * FileInputStream fis = null; FileOutputStream fos = null;
		 * 
		 * try { fis = new FileInputStream(sf); fos = new FileOutputStream(of); byte[]
		 * buffer = new byte[1024]; int length; while ((length = fis.read(buffer)) !=
		 * -1) { fos.write(buffer, 0, length); }
		 * 
		 * } catch (IOException ioe) { ioe.printStackTrace(); } finally { try {
		 * fis.close(); fos.close(); } catch (IOException e) {
		 * 
		 * e.printStackTrace(); }
		 * 
		 * }
		 */

		Files.copy(sf.toPath(), of.toPath());
		System.out.println("Success!!!!");

	}

}
