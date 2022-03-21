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
			System.out.println("10초 시간 제한 단어 게임을 시작 합니다.");
			for (int i1 = 0; i1 < vocaArr.size(); i1++) {
				System.out.println((i1 + 1) + ". " + vocaArr.get(i1).getKor());
				System.out.println("해당 한글에 해당하는 영어는?");
				input = scan.nextLine();
				if (input.equals(vocaArr.get(i1).getEng())) {
					System.out.println("맞았습니다.따본!");
				} else {
					System.out.println("틀렸습니다.");
				}

			}
		}

	}

}
