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
		Quiz q1 = new Quiz("�ѱ��� ������?", "����", "�λ�", "��õ", "����", "1");
		quesArr.add(q1);

		Quiz q2 = new Quiz("10  + 10 =", "-10", "20", "-1", "0", "2");
		quesArr.add(q2);

		Quiz q3 = new Quiz("Cat�� ����", "ȣ����", "������", "��", "�����", "4");
		quesArr.add(q3);

		// ù ��° ���� ����
		ranNum = rd.nextInt(quesArr.size());
		Quiz temp = quesArr.get(ranNum);
		System.out.println("����. " + temp.question);
		System.out.println("  1) " + temp.ch1);
		System.out.println("  2) " + temp.ch2);
		System.out.println("  3) " + temp.ch3);
		System.out.println("  4) " + temp.ch4);
		String answer = temp.ans;

		input = scan.nextLine();
		if (input.equals(answer)) {
			System.out.println("����!! ");
		} else {
			System.out.println("Ʋ�ȴ� �ٺ���!! ");
		}

		// �� ��° ���� ����
		ranNum = rd.nextInt(quesArr.size());
		temp = quesArr.get(ranNum);
		System.out.println("����. " + temp.question);
		System.out.println("  1) " + temp.ch1);
		System.out.println("  2) " + temp.ch2);
		System.out.println("  3) " + temp.ch3);
		System.out.println("  4) " + temp.ch4);
		answer = temp.ans;

		input = scan.nextLine();
		if (input.equals(answer)) {
			System.out.println("����!!");
		} else {
			System.out.println("Ʋ�ȴ� �ٺ���!!");
		}

	}

}


