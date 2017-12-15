package java_basic_study;

class Book {
	int price;
	int num = 0;
	String title;

	Book(String t, int p){
		title = t;
		price = p;
	}

	void print() {
		System.out.println("title:" + title);
		System.out.println("price:" + price);
		System.out.println("num:" + num);
		System.out.println("sum price:" + price * num);
	}
}

public class Books {

	public static void main(String[] args) {

		Book book = new Book("sample book", 2000);
		book.num = 5;
		book.print();
	}
}
