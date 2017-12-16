package java_basic_study;

interface GreetIn{
	void greet();
}

interface ByeIn extends GreetIn{
	void bye();
}

class GreetingIn implements ByeIn{
	public void greet() {
		System.out.println("yo");
	}

	public void bye() {
		System.out.println("GoodBye");
	}
}

public class MeetIn {

	public static void main(String[] args) {
		GreetingIn greeting = new GreetingIn();
		greeting.greet();
		greeting.bye();

	}

}
