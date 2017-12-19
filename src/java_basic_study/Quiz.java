package java_basic_study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class QandA{
	String question;
	String[] answer;

	QandA(String question, String answerline){
		this.question = question;
		StringTokenizer token = new StringTokenizer(answerline, ",");
		answer = new String[token.countTokens()];
		for(int i = 0; token.hasMoreTokens(); i++)
			answer[i] = token.nextToken();
	}

	String[] getCorrect(String inputline) {
		StringTokenizer token = new StringTokenizer(inputline, ",");
		int inputnum = token.countTokens();
		String[] input = new String[inputnum];
		for(int i = 0; token.hasMoreTokens(); i++)
			input[i] = token.nextToken();

		for(int i = 1; i < inputnum; i++)
			for(int j = i-1; j >= 0; j--)
				if(input[i].equals(input[j]))
					input[i] = "0";

		int correctnum = 0;
		for(int i = 0; i < inputnum; i++)
			for(int j = 0; j < answer.length; j++)
				if(input[i].equals(answer[j]))
					correctnum++;

		String[] correct = new String[correctnum];
		int k = 0;
		for(int i = 0; i < inputnum; i++)
			for(int j = 0; j < answer.length; j++)
				if(input[i].equals(answer[j])) {
					correct[k] = input[i];
					k++;
				}
		return correct;
	}
}

public class Quiz {
	static String getInput() {
		String input = new String();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			input = in.readLine();
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			return input;
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		QandA qa = new QandA("day",
				"Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday");
		System.out.print("question" + qa.question + " punctuate , and answer this question \n>");

		int answernum = qa.answer.length;
		String input = getInput();
		String[] correct = qa.getCorrect(input);
		int correctnum = (correct == null) ? 0 : correct.length;

		if(correctnum > 0) {
			System.out.print("correct: ");
			for(int j = 0; j < correctnum; j++)
				System.out.print(correct[j] + " ");
			System.out.println();
		}
		System.out.print(correctnum + " / " + answernum + " right");

		if(correctnum == answernum)
			System.out.println("great!");
		else if(correctnum > answernum / 2)
			System.out.println("good!");
		else
			System.out.println("fight!");
	}
}
