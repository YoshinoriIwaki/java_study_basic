package java_basic_study;

import java.util.Scanner;

public class ScannerSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.print("please input station name:");
		String station_name = sc.next();
		System.out.print("please input home number:");
		int bansen = sc.nextInt();

		sc.close();
		System.out.println(station_name + " station " + bansen + " home");
	}
}
