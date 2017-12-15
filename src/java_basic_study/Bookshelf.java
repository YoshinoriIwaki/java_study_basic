package java_basic_study;

class BookExtends{
	String title;
	String genre;

	void printBook() {
		System.out.println("title:" + title);
		System.out.println("genre:" + genre);
	}
}

class Novel extends BookExtends{
	String writer;

	void printNov() {
		printBook();
		System.out.println("writer:" + writer);
	}
}

class Magazine extends BookExtends{
	int day;

	void printMag() {
		printBook();
		System.out.println("sale day:" + day + "day");
	}
}

public class Bookshelf {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Novel nov = new Novel();
		nov.title = "book_title";
		nov.genre = "genre1";
		nov.writer = "writer1";
		Magazine mag = new Magazine();
		mag.title = "title1";
		mag.genre = "genre2";
		mag.day = 20;
		nov.printNov();
		System.out.println();
		mag.printMag();
	}

}
