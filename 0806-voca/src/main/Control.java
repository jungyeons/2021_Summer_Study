package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Control {
	String input = "";
	ArrayList<Voca> vocaArr = new ArrayList<Voca>();
	Scanner scan = new Scanner(System.in);

	void update() {
		System.out.println("몇 번을 수정 할래?");
		input = scan.nextLine();
		int temp = Integer.parseInt(input) - 1;
		System.out.println("영어를 입력해 주세요");
		input = scan.nextLine();
		Voca v = vocaArr.get(temp);
		v.setEng(input);

		System.out.println("한글을 입력해 주세요");
		input = scan.nextLine();
		v.setKor(input);
	}

	void deleteVoca() {
		System.out.println("몇 번을 삭제 할래?");
		input = scan.nextLine();
		int temp = Integer.parseInt(input) - 1;
		vocaArr.remove(temp);
	}

	void insertVoca() {
		Voca v = new Voca();
		System.out.println("영어를 입력해 주세요");
		input = scan.nextLine();
		v.setEng(input);

		System.out.println("한글을 입력해 주세요");
		input = scan.nextLine();
		v.setKor(input);
		vocaArr.add(v);
	}

	private void save() {
		FileWriter fw;
		try {
			fw = new FileWriter("c:/temp/voca.txt");
			for (int i = 0; i < vocaArr.size(); i++) {
				String data = vocaArr.get(i).getEng() + "," + vocaArr.get(i).getKor() + "\r\n";
				fw.write(data);
			}
			fw.close();
			System.out.println("정상 실행");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void load() {
		File file = new File("c:/temp/voca.txt");
		if (file.exists() == true) {
			try {
				// 한 줄씩 읽기
				BufferedReader br = new BufferedReader(new FileReader("c:/temp/voca.txt"));
				while (true) {
					String line = br.readLine();
					if (line == null)
						break;
					String[] arr = line.split(",");
					String eng = arr[0];
					String kor = arr[1];
					vocaArr.add(new Voca(eng, kor));
				}
				br.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void start() {
		/**
		 * 무엇을 하시겠습니까? 1. 단어 추가 2. 단어 삭제 3. 단어 수정 4. 종료 1. 스크램블 2. 행맨
		 **/

		load();

		while (true) {
			System.out.println("------------");
			System.out.println("총 " + vocaArr.size() + "개");
			for (int i = 0; i < vocaArr.size(); i++) {
				System.out.println((i + 1) + ". " + vocaArr.get(i).getEng() + " : " + vocaArr.get(i).getKor());
			}
			System.out.println("------------");
			System.out.println();
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1. 단어 추가  2. 단어 삭제  3. 단어 수정 4. 종료 5. 한글<->영어 단어 게임6.10초 시간 제한 단어 게임");
			input = scan.nextLine();

			if (input.equals("1")) {
				insertVoca();
				save();
			} else if (input.equals("2")) {
				deleteVoca();
				save();
			} else if (input.equals("3")) {
				update();
				save();
			} else if (input.equals("4")) {
				System.out.println("프로그램을 종료 합니다");
				break;
			} else if (input.equals("5")) {
				System.out.println("한글<->영어 단어 게임을 시작 합니다.");
				for (int i = 0; i < vocaArr.size(); i++) {
					System.out.println((i + 1) + ". " + vocaArr.get(i).getKor());
					System.out.println("해당 한글에 해당하는 영어는?");
					input = scan.nextLine();
					if (input.equals(vocaArr.get(i).getEng())) {
						System.out.println("맞았습니다.따본!");
					} else {
						
						System.out.println("틀렸습니다.");
					}
				}
			} else if (input.equals("6")) {
				MyThread th = new MyThread();
				th.start();
				System.out.println("10초 시간 제한 단어 게임을 시작 합니다.");
				vocaGame();
			}

		}
	}

	private void vocaGame() {
		for (int i = 0; i < vocaArr.size(); i++) {
			System.out.println((i + 1) + ". " + vocaArr.get(i).getKor());
			System.out.println("해당 한글에 해당하는 영어는?");
			input = scan.nextLine();
			if (input.equals(vocaArr.get(i).getEng())) {
				System.out.println("맞았습니다.따본!");
			} else {
				System.out.println("틀렸습니다.");
			}
		}
	}
}
