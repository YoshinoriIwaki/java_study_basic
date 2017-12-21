package java_basic_study;

import java.util.ArrayList;
import java.util.List;

public class ForLoopSample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List list = new ArrayList();
		list.add(new String("0"));
		list.add(new String("1"));
		list.add(new String("2"));

		for(Object obj : list) {
			System.out.println((String)obj);
		}
	}
}
