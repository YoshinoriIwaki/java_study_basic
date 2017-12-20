//package java_basic_study.jar_test;

//class HelloRedef {
//	void hello() {
//		System.out.println("Hello");
//	}
//}
//
//class ByeRedef {
//	void bye() {
//		System.out.println("Bye");
//	}
//}

public class Greeting {

	public static void main(String[] args) {
		Hello h = new Hello();
		Bye b = new Bye();
		h.hello();
		b.bye();
	}
}
