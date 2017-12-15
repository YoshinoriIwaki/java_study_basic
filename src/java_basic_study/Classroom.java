package java_basic_study;

class Test{
	String subject;
	int point;

	void setPoint(String s, int p) {
		subject = s;
		point = p;
	}

	String getPoint() {
		return subject + ":" + point;
	}
}

class Student{
	int id;
	String name;
	int subnum;
	Test[] test;

	Student(int i, String n, int s){
		id = i;
		name = n;
		subnum = s;
		test = new Test[s];

		for(int j = 0; j < s; j++)
			test[j] = new Test();
	}

	String getName() {
		return id + ":" + name;
	}

	int getGrade() {
		int sum = 0;
		for(int i = 0; i < subnum; i++)
			sum += test[i].point;

		return sum;
	}

	int getGrade(int a) {
		int base = 100 * subnum / a;
		int rank = getGrade() / base + 1;

		return (rank > a) ? a : rank;
	}

	void printScore() {
		System.out.println(getName());
		for(int i = 0; i < subnum; i++)
			System.out.println(test[i].getPoint() + " ");

		System.out.println();
		System.out.println("sum point " + getGrade());
		int rank = 10;
		System.out.println(rank + "rank score " + getGrade(rank));
		System.out.println();
	}
}

public class Classroom {

	public static void main(String[] args) {

		Student taro = new Student(10, "taro", 3);
		taro.test[0].setPoint("Japanese", 95);
		taro.test[1].setPoint("Math", 83);
		taro.test[2].setPoint("English", 92);
		taro.printScore();

		Student jiro = new Student(7, "jiro", 3);
		jiro.test[0].setPoint("Japanese", 87);
		jiro.test[1].setPoint("Math", 76);
		jiro.test[2].setPoint("English", 87);
		jiro.printScore();
	}

}
