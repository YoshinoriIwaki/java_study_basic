package java_basic_study;

class BookKind{
	String title;
	String genre;
	
	void printBook() {
		System.out.println("title:" + title);
		System.out.println("genre:" + genre);
	}
}

class Novel extends BookKind{
	String writer;
	
	void printNovel() {
		printBook();
		System.out.println("writer:" + writer);
	}
}

class Magazine extends BookKind{
	int day;
	
	void printMagazine() {
		printBook();
		System.out.println("sale day:" + day + "day");
	}
}

public class Bookshelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Novel novel = new Novel();
		novel.title = "title";
		novel.genre = "fantasy";
		novel.writer = "ank";
		
		Magazine magazine = new Magazine();
		magazine.title = "title2";
		magazine.genre = "computer";
		magazine.day = 20;
		
		novel.printNovel();
		System.out.println();
		magazine.printMagazine();
	}
}
