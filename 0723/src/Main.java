import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner scan = new Scanner(System.in);
		String input = "";
		int ranNum = 0;

		ArrayList<Quiz> quesArr = new ArrayList<Quiz>();
		Quiz q1 = new Quiz();
		q1.question = "한국의 수도는?";
		q1.ch1 = "서울";
		q1.ch2 = "부산";
		q1.ch3 = "인천";
		q1.ch4 = "독도";
		q1.ans = "1";
		
		//서랍장에 서랍을 넣는 행위. 꼭 필요한 행위이다.
		quesArr.add(q1);
		
		Quiz q2 = new Quiz();
		q2.question = "10  + 10 =";
		q2.ch1 = "-10";
		q2.ch2 = "20";
		q2.ch3 = "-1";
		q2.ch4 = "0";
		q2.ans = "2";
		quesArr.add(q2);
		
		Quiz q3 = new Quiz();
		q3.question = "Cat의 뜻은";
		q3.ch1 = "호랑이";
		q3.ch2 = "개구리";
		q3.ch3 = "소";
		q3.ch4 = "고양이";
		q3.ans = "4";
		quesArr.add(q3);		

		// 첫 번째 랜덤 문제
		ranNum = rd.nextInt(quesArr.size());
		Quiz temp = quesArr.get(ranNum);
		System.out.println("문제. " + temp.question);
		System.out.println("  1) " + temp.ch1);
		System.out.println("  2) " + temp.ch2);
		System.out.println("  3) " + temp.ch3);
		System.out.println("  4) " + temp.ch4);
		String answer = temp.ans;

		input = scan.nextLine();
		if (input.equals(answer)) {
			System.out.println("정답!! ");
		} else {
			System.out.println("틀렸다 바보야!! ");
		}

		// 두 번째 랜덤 문제
		ranNum = rd.nextInt(quesArr.size());
		temp = quesArr.get(ranNum);
		System.out.println("문제. " + temp.question);
		System.out.println("  1) " + temp.ch1);
		System.out.println("  2) " + temp.ch2);
		System.out.println("  3) " + temp.ch3);
		System.out.println("  4) " + temp.ch4);
		answer = temp.ans;

		input = scan.nextLine();
		if (input.equals(answer)) {
			System.out.println("정답!!");
		} else {
			System.out.println("틀렸다 바보야!!");
		}

	}

}
