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
		 * ������ �Ͻðڽ��ϱ�? 1. �ܾ� �߰� 2. �ܾ� ���� 3. �ܾ� ���� 4. ���� 5. ��ũ���� 6. ���
		 */
		Scanner scan = new Scanner(System.in);
		String input = "";
		Random rd = new Random();
		ArrayList<String> engArr = new ArrayList<String>();
		ArrayList<String> korArr = new ArrayList<String>();
		while (true) {
			System.out.println("��" + engArr.size() + "��");
			for (int i = 0; i < engArr.size(); i++) {
				System.out.println((i + 1) + ":" + engArr.get(i) + ":" + korArr.get(i));
			}
			 
			System.out.println("������ �Ͻðڽ��ϱ�?");
			System.out.println("1. �ܾ� �߰� 2. �ܾ� ���� 3. �ܾ� ���� 4. ����  5. ��ũ���� ����");

			input = scan.nextLine();

			if (input.equals("1")) {
				// �ܾ� �Է� �ޱ�
				System.out.println("��� �Է����ּ���.");
				input = scan.nextLine();
				engArr.add(input);
				System.out.println("�ѱ�� �Է����ּ���.");
				input = scan.nextLine();
				korArr.add(input);

			}
			if (input.equals("2")) {
				// �ܾ� �Է� �ޱ�
				System.out.println("�� ���� �����ϰڽ��ϱ�?");
				input = scan.nextLine();
				int temp = Integer.parseInt(input) - 1;
				engArr.remove(temp);
				korArr.remove(temp);
				System.out.println("�ѱ�� �Է����ּ���.");
				input = scan.nextLine();
				korArr.add(input);

			}
			if (input.equals("3")) {
				// �ܾ� �Է� �ޱ�
				System.out.println("�� ���� �����ϰڽ��ϱ�?");
				input = scan.nextLine();
				int temp = Integer.parseInt(input) - 1;
				System.out.println("��� �Է����ּ���.");
				input = scan.nextLine();
				engArr.set(temp, input);
				System.out.println("�ѱ�� �Է����ּ���.");
				input = scan.nextLine();
				korArr.set(temp, input);

			}
			if (input.equals("4")) {
				System.out.println("���α׷��� ���� �մϴ�");
				break;
			}
			if (input.equals("5")) {
				System.out.println("��ũ���� ������ �����մϴ�");
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
