package java_basic_study;

class Cat {
	String name;
	String place;
	int age;

	void setData(String n, String p, int a) {
		name = n;
		place = p;
		age = a;
	}

	void print() {
		System.out.println(place + ":" + name + " " + age + "old");
	}

	void print(String p, int a) {
		place = p;
		System.out.println(place + ":cat" + a + "are");
	}

	void print(String variety) {
		System.out.println(place + ":" + name + " " + age + "old" + variety);
	}
}

public class Pet {

	public static void main(String[] args) {
	
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		Cat cat3 = new Cat();

		cat1.setData("robin", "home", 8);
		cat2.setData("pochi", "home2", 3);
		cat1.print("kind1");
		cat2.print();
		cat3.print("name3", 0);
	}

}
