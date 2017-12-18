package java_basic_study;

import java.io.FileWriter;

public class WriteText {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			FileWriter out = new FileWriter("math.txt");
			int a = 10, b = 5;
			out.write("plus: ");
			out.write(a + "+" + b + "=" + (a + b) + "\n");
			out.write("minus: ");
			out.write(a + "-" + b + "=" + (a - b) + "\n");
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
