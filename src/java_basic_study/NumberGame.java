package java_basic_study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberGame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int a, b = 7;
			System.out.println("Input your name");
			String name = in.readLine();

			System.out.println("please input number from 0 to 9");
			String c = in.readLine();

			a = Integer.parseInt(c);

			while(a != b) {
				if((a == b-1) || (a == b+1))
					System.out.println("near!");
				else if(a > b+1)
					System.out.println("less");
				else if(a < b-1)
					System.out.println("more");
				c = in.readLine();
				a = Integer.parseInt(c);
			}
			System.out.println("That's right! " + name + " Congraturations!");

		} catch(Exception ie) {
			System.out.println("error");
		}

	}

}
