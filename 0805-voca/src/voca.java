import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class voca {

	public static void main(String[] args) {
		FileTest fileTest = new FileTest();
		fileTest.createFile();
		/**
		 * 무엇을 하시겠습니까? 1. 단어 추가 2. 단어 삭제 3. 단어 수정 4. 종료 5. 스크램블 6. 행맨
		 */
		Scanner scan = new Scanner(System.in);
		String input = "";
		Random rd = new Random();
		ArrayList<String> engArr = new ArrayList<String>();
		ArrayList<String> korArr = new ArrayList<String>();
		while (true) {
			System.out.println("총" + engArr.size() + "개");
			for (int i = 0; i < engArr.size(); i++) {
				System.out.println((i + 1) + ":" + engArr.get(i) + ":" + korArr.get(i));
			}
			 
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1. 단어 추가 2. 단어 삭제 3. 단어 수정 4. 종료  5. 스크램블 게임");

			input = scan.nextLine();

			if (input.equals("1")) {
				// 단어 입력 받기
				System.out.println("영어를 입력해주세요.");
				input = scan.nextLine();
				engArr.add(input);
				System.out.println("한국어를 입력해주세요.");
				input = scan.nextLine();
				korArr.add(input);

			}
			if (input.equals("2")) {
				// 단어 입력 받기
				System.out.println("몇 번을 삭제하겠습니까?");
				input = scan.nextLine();
				int temp = Integer.parseInt(input) - 1;
				engArr.remove(temp);
				korArr.remove(temp);
				System.out.println("한국어를 입력해주세요.");
				input = scan.nextLine();
				korArr.add(input);

			}
			if (input.equals("3")) {
				// 단어 입력 받기
				System.out.println("몇 번을 수정하겠습니까?");
				input = scan.nextLine();
				int temp = Integer.parseInt(input) - 1;
				System.out.println("영어를 입력해주세요.");
				input = scan.nextLine();
				engArr.set(temp, input);
				System.out.println("한국어를 입력해주세요.");
				input = scan.nextLine();
				korArr.set(temp, input);

			}
			if (input.equals("4")) {
				System.out.println("프로그램을 종료 합니다");
				break;
			}
			if (input.equals("5")) {
				System.out.println("스크램블 게임을 시작합니다");
				int ranNum = rd.nextInt(engArr.size());
				String answer = engArr.get(ranNum);
				ArrayList<String> temp = new ArrayList<String>();
				for (int i = 0; i < answer.length(); i++) {
					temp.add(answer.substring(i, i + 1));
				}
				String quiz = "";
				while (temp.size() > 0) {
					ranNum = rd.nextInt(temp.size());
					quiz = quiz + temp.get(ranNum);
					temp.remove(ranNum);

				}
				System.out.println(quiz);
			}

		}
	

	}

}
