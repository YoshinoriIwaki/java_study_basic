package java_basic_study;

class Animal{
	String name;
	int age;

	void printPet() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}
}

class CatSuper extends Animal{
	String variety;

	void printPet() {
		super.printPet();
		System.out.println("variety: " + variety);
	}
}

public class PetSuper {

	public static void main(String[] args) {
		CatSuper cat = new CatSuper();
		cat.name = "ran";
		cat.age = 5;
		cat.variety = "perusya";
		cat.printPet();
	}
}
