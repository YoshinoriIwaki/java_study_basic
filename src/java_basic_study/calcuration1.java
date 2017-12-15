package java_basic_study;

abstract class Calc1{
	int a;
	int b;
	abstract void answer();

	void setData(int m, int n) {
		a = m;
		b = n;
	}
}

class Plus extends Calc1{
	void answer() {
		System.out.println(a + " + " + b + " = " + (a + b));
	}
}

public class calcuration1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Plus plus = new Plus();
		plus.setData(27, 32);
		plus.answer();
	}
}
