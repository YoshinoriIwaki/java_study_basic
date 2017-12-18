package java_basic_study;

public class ErrorHandle {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			back(args[0]);
		} catch (Exception e) {
			System.out.println("no comand line argument");
		} finally {
			System.out.println("finished");
		}

	}

	static void back(String a) throws Exception{
		System.out.println(a);
	}

}
