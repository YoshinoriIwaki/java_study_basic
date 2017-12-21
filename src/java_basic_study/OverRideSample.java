package java_basic_study;

class SuperZ{
	Number num() {
		return null;
	}
}

class SubX extends SuperZ{
	Double num() {
		return new Double(10);
	}
}

public class OverRideSample {

	public static void main(String[] args) {
		SubX xx = new SubX();
		System.out.println(xx.num());
	}
}
