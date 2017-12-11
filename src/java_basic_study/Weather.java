package java_basic_study;

class Wdata {
	int month;
	int day;
	String sky;
}

public class Weather {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Wdata today = new Wdata();
		today.month = 10;
		today.day = 5;
		today.sky = "funny";
		System.out.println(today.month + "month" + today.day + "day" + today.sky);

	}

}
