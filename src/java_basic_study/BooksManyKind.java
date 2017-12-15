package java_basic_study;

class BookManyKind{
	String title;
	String writer;

	BookManyKind(String t, String w){
		title = t;
		writer = w;
	}

	BookManyKind(BookManyKind copy){
		title = copy.title;
		writer = copy.writer;
	}

	void print() {
		System.out.println("title:" + title);
		System.out.println("writer:" + writer);
	}
}

public class BooksManyKind {

	public static void main(String[] args) {
		BookManyKind book1 = new BookManyKind("sample1", "writer1");
		book1.print();
		BookManyKind book2 = new BookManyKind(book1);
		book2.title = "sample2";
		book2.print();
	}

}
