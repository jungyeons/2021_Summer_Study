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
		System.out.println("�� ���� ���� �ҷ�?");
		input = scan.nextLine();
		int temp = Integer.parseInt(input) - 1;
		System.out.println("��� �Է��� �ּ���");
		input = scan.nextLine();
		Voca v = vocaArr.get(temp);
		v.setEng(input);

		System.out.println("�ѱ��� �Է��� �ּ���");
		input = scan.nextLine();
		v.setKor(input);
	}

	void deleteVoca() {
		System.out.println("�� ���� ���� �ҷ�?");
		input = scan.nextLine();
		int temp = Integer.parseInt(input) - 1;
		vocaArr.remove(temp);
	}

	void insertVoca() {
		Voca v = new Voca();
		System.out.println("��� �Է��� �ּ���");
		input = scan.nextLine();
		v.setEng(input);

		System.out.println("�ѱ��� �Է��� �ּ���");
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
			System.out.println("���� ����");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void load() {
		File file = new File("c:/temp/voca.txt");
		if (file.exists() == true) {
			try {
				// �� �پ� �б�
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
		 * ������ �Ͻðڽ��ϱ�? 1. �ܾ� �߰� 2. �ܾ� ���� 3. �ܾ� ���� 4. ���� 1. ��ũ���� 2. ���
		 **/

		load();

		while (true) {
			System.out.println("------------");
			System.out.println("�� " + vocaArr.size() + "��");
			for (int i = 0; i < vocaArr.size(); i++) {
				System.out.println((i + 1) + ". " + vocaArr.get(i).getEng() + " : " + vocaArr.get(i).getKor());
			}
			System.out.println("------------");
			System.out.println();
			System.out.println("������ �Ͻðڽ��ϱ�?");
			System.out.println("1. �ܾ� �߰�  2. �ܾ� ����  3. �ܾ� ���� 4. ���� 5. �ѱ�<->���� �ܾ� ����6.10�� �ð� ���� �ܾ� ����");
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
				System.out.println("���α׷��� ���� �մϴ�");
				break;
			} else if (input.equals("5")) {
				System.out.println("�ѱ�<->���� �ܾ� ������ ���� �մϴ�.");
				for (int i = 0; i < vocaArr.size(); i++) {
					System.out.println((i + 1) + ". " + vocaArr.get(i).getKor());
					System.out.println("�ش� �ѱۿ� �ش��ϴ� �����?");
					input = scan.nextLine();
					if (input.equals(vocaArr.get(i).getEng())) {
						System.out.println("�¾ҽ��ϴ�.����!");
					} else {
						
						System.out.println("Ʋ�Ƚ��ϴ�.");
					}
				}
			} else if (input.equals("6")) {
				MyThread th = new MyThread();
				th.start();
				System.out.println("10�� �ð� ���� �ܾ� ������ ���� �մϴ�.");
				vocaGame();
			}

		}
	}

	private void vocaGame() {
		for (int i = 0; i < vocaArr.size(); i++) {
			System.out.println((i + 1) + ". " + vocaArr.get(i).getKor());
			System.out.println("�ش� �ѱۿ� �ش��ϴ� �����?");
			input = scan.nextLine();
			if (input.equals(vocaArr.get(i).getEng())) {
				System.out.println("�¾ҽ��ϴ�.����!");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
		}
	}
}
