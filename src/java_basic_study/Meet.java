package java_basic_study;

interface Greet{
	void greet();
}

interface Talk{
	void talk();
}

class Morning implements Greet, Talk{
	public void greet() {
		System.out.println("Good morning!");
	}

	public void talk() {
		System.out.println("Good weather");
	}
}

public class Meet {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Morning morning = new Morning();
		morning.greet();
		morning.talk();
	}
}
