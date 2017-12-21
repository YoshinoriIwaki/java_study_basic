package java_basic_study;
import java.util.Date;

public class FormatSample {

	public static void main(String[] args) {
		int a = 10;
		double b = 3.24;
		System.out.printf("%10d\n", a);
		System.out.printf("×%8.5f\n", b);
		System.out.printf("------\n");
		System.out.printf("%10f\n\n", a * b);

		Date c = new Date();
		System.out.printf("%tH hour %tM Minutes %tS Second\n", c, c, c);

	}

}
