package java_basic_study;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {

	public static void main(String[] args) {
		try {
			FileReader in = new FileReader(args[0]);
			int c;
			String s = new String();
			while((c = in.read()) != -1)
				s = s + (char)c;
			System.out.print(s);
			in.close();
		} catch(IOException ie) {
			System.out.println("file is not exist");
		} catch(Exception e) {
			System.out.println("file is not directed");
		}
	}
}
