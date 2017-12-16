package java_basic_study;

interface Cry{
	void cry();
}

class CatIm implements Cry{
	public void cry() {
		System.out.println("Nya");
	}
}

class DogIm {
	public void cry() {
		System.out.println("baw");
	}
}

public class CheckCry {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		CatIm catIm = new CatIm();
		DogIm dogIm = new DogIm();

		if(catIm instanceof Cry) {
			catIm.cry();
		}

		if(dogIm instanceof Cry) {
			dogIm.cry();
		}

	}

}
