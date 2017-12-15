package java_basic_study;

class Drink{
	String name;
	int price;
	int count;

	Drink(String n, int p, int c){
		name = n;
		price = p;
		count = c;
	}

	int getTotalPrice() {
		return count * price;
	}

	static void printTitle() {
		System.out.println("name\t\tprice\tCount\tMount");
	}

	void printData() {
		System.out.println(name + "\t" + price + "\t" + count + "\t" + getTotalPrice());
	}
}

class Alcohol extends Drink{
	float alcper;

	Alcohol(String n, int p, int c, float a){
		super(n, p, c);
		alcper = a;
	}

	static void printTitle() {
		System.out.println("name(%)\tPrice\tCount\tMoney");
	}

	void printData() {
		System.out.println(name + "(" + alcper + ")" + "\t" + price + "\t" + count + "\t" + getTotalPrice());
	}
}

public class Payment {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Drink coffee = new Drink("coffee", 200, 3);
		Drink oolongtea = new Drink("oolongTea", 150, 2);
		Alcohol wine = new Alcohol("wine", 300, 2, 15.0f);

		Drink.printTitle();
		coffee.printData();
		oolongtea.printData();
		System.out.println();

		Alcohol.printTitle();
		wine.printData();
		int sum = coffee.getTotalPrice() + oolongtea.getTotalPrice() + wine.getTotalPrice();
		System.out.println("\n+++ sum money " + sum + "Yen ***");

	}

}
