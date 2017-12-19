package java_basic_study;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class MyEditor {

	public static void main(String[] args) {

		try {
			FileWriter out = new FileWriter(args[0]);
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String data;

			int i = 1;
			System.out.println("please input data, (end:0)");

			while(!(data = in.readLine()).equals("0"))
				out.write(data + "\n");
			System.out.println("terminated");
			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
