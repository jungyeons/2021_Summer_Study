package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MyThread th = new MyThread();
		th.start();
		String input = "";
		ArrayList<Voca> vocaArr = new ArrayList<Voca>();
		Scanner scan = new Scanner(System.in);
		
		if (input.equals("6")) {
			MyThread th1 = new MyThread();
			th1.start();
			System.out.println("10�� �ð� ���� �ܾ� ������ ���� �մϴ�.");
			for (int i1 = 0; i1 < vocaArr.size(); i1++) {
				System.out.println((i1 + 1) + ". " + vocaArr.get(i1).getKor());
				System.out.println("�ش� �ѱۿ� �ش��ϴ� �����?");
				input = scan.nextLine();
				if (input.equals(vocaArr.get(i1).getEng())) {
					System.out.println("�¾ҽ��ϴ�.����!");
				} else {
					System.out.println("Ʋ�Ƚ��ϴ�.");
				}

			}
		}

	}

}
