package java_basic_study.jar_test;

class HelloRedef {
	void hello() {
		System.out.println("Hello");
	}
}

class ByeRedef {
	void bye() {
		System.out.println("Bye");
	}
}

public class Greeting {

	public static void main(String[] args) {
		HelloRedef h = new HelloRedef();
		ByeRedef b = new ByeRedef();
		h.hello();
		b.bye();
	}
}
