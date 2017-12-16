package java_basic_study;

abstract class Calc2{
	int a;
	int b;

	abstract int result();

	void printResult() {
		System.out.println(result());
	}

	void setData(int m, int n) {
		a = m;
		b = n;
	}
}

class PlusEx extends Calc2{
	int result() {
		return a + b;
	}
}

class MinusEx extends Calc2{
	int result() {
		return a - b;
	}
}

public class calcuration2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 54, y = 12;
		Calc2 calc1 = new PlusEx();
		Calc2 calc2 = new MinusEx();

		calc1.setData(x, y);
		calc2.setData(x, y);

		System.out.println(x + " + " + y + " = ");
		calc1.printResult();
		System.out.println(x + " - " + y + " = ");
		calc2.printResult();
	}
}
