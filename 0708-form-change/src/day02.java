import java.util.Scanner;

public class day02 {

	public static void main(String[] args) {
		
		
		//////////////
		// print ����//
		/////////////

		// ��Ŭ���������� 'sysout' �̶�� �Է��ϰ� 'ctrl+space'�� ������
		// System.out.println()�� �ڵ� �Էµȴ�.
		// println�� ������ ����� �� �ڵ����� �ٹٲٴ� ����� �ִ�.
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		// ���ڿ��� ����ϱ� ���ؼ��� ū����ǥ�� ������� �Ѵ�.
		// ū ����ǥ ���� ���� ��� ���������� �ν��Ѵ�. (�Է��� �������� ���� ��� �����߻�)
		// ���ڿ��� �������� �Բ� ����� �� ������ �ݵ�� '+'�� ���������� �Ѵ�.
		System.out.println("���ڿ�");
		int a = 0;
		System.out.println(a);
		System.out.println("���ڿ�" + a);

		// print�� �׳� �ٿ��� ��µ�.
		System.out.print("�ȳ��ϼ���");
		System.out.print("�ȳ��ϼ���");

		/////////
		// ����//
		/////

		int number; // ���� ����
		number = 10;// ������ �ִ� ���� �������� ����

		int numScore; // �����̸��� �ѱ��ڰ� �ƴϸ� ������ �ι�° ���ڴ� �빮�ڷ�
		int number2 = 20; // ����� ������ ���ÿ�

		number = 20; // �̷��� �ϸ� �� ���� num�� ��

		boolean value = false; // true or false
		float num3 = 3.4f;
		System.out.println(num3);

		// reference Ÿ�������� primitive Ÿ�� ó�� ��.
		String str = "�ȳ��ϼ���";

		////////
		// �� ��ȯ//
		////////

		int num11 = 10;
		float num12 = 5.9f;
		String num13 = "20";

		num11 = (int) num12;// float -> int
		num12 = num11; // ������ ū�� �ڵ� ����ȯ

		num11 = Integer.parseInt(num13); // String -> int
		num12 = Float.parseFloat(num13); // String -> float

		num13 = String.valueOf(num11); // int -> String
		num13 = String.valueOf(num12); // float -> String

		/** ������ **/
		// ���ϱ�� * ������� / ���������� ����
		// % �� ������ ����
		int num21 = 10;
		int num22 = 7;
		int result = num21 * num22;

		/** Ű���� �Է� **/
		// reference Ÿ�� �Է¹޴� ��ġ
		System.out.println("���� �Է��Ͻÿ�.");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println("�Է��� ����:" + input);

		/**
		 * ù ��° ���ڸ� �Է��ϼ���
		 *  (Ű���� �Է�)
		 *   �� ��° ���ڸ� �Է��ϼ��� 
		 *   (Ű���� �Է�)
		 *    �� ���� ���� () �Դϴ�.
		 **/
		System.out.println("ù ��° ���ڸ� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.nextLine();
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
		String input2 = scanner.nextLine();
		int num1;
		num1 = Integer.parseInt(input1);
		int num2;
		num2 = Integer.parseInt(input2);

		System.out.println("�� ���� ����" + (num1 + num2) + "�Դϴ�.");

	}

}
