package java_basic_study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InOut {

	public static void main(String[] args) {
		try {
			String filename = "file.dat";
			FileOutputStream out = new FileOutputStream(filename);
			FileInputStream file = new FileInputStream(filename);

			InputStreamReader in = new InputStreamReader(file);

			for (byte i = 1; i <= 10; i++) {
				out.write(i);
			}

			int c;
			while((c = in.read()) != -1) {
				System.out.print(c + " ");
			}

			in.close();
			out.close();

		} catch(IOException e) {
			System.out.println("file is not exist");
		}

	}

}
