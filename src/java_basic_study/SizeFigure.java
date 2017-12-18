package java_basic_study;

abstract class Figure{
	abstract void area();
	abstract void around();

	void measure() {
		area();
		around();
		System.out.println();
	}
}

class Square extends Figure{
	double side;
	double height;

	Square(double s){
		side = height = s;
	}

	Square(double s, double h){
		side = s;
		height = h;
	}

	void area() {
		System.out.println("square area: " + (side * height));
	}

	void around() {
		System.out.println("square around: " + (2 * (side + height)));
	}
}

class Circle extends Figure{
	final double pi = 3.14;
	double radius;

	Circle(double r){
		radius = r;
	}

	void area() {
		System.out.println("circle area: " + (radius * radius * pi));
	}

	void around() {
		System.out.println("circle around: " + (2 * radius * pi));
	}
}

public class SizeFigure {

	public static void main(String[] args) {
		Figure fig1 = new Square(2, 5);
		Figure fig2 = new Square(2.3, 3.7);
		Figure fig3 = new Circle(3.6);

		fig1.measure();
		fig2.measure();
		fig3.measure();
	}
}
