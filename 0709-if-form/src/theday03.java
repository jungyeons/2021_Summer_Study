import java.util.Scanner;

public class theday03 {

	public static void main(String[] args) {
//		//////////
//		scanner //
//		//////////
//		Scanner scan = new Scanner(System.in);
//		String str1 = "aa";
//		String str2 = "bb";
//		String str3 = str1 + str2;
//		String str4 = "aabb";
//		String str5 = scan.nextLine();
//		System.out.println(str3);
//		System.out.println(str4);
//		if (str3.equals(str5)) {
//			System.out.println("���� 11");
//		}
//		if (str3.equals(str5)) {
//			System.out.println("���� 22");
//		}
//		if (str4.equals(str5)) {
//			System.out.println("���� 33");
//		}
//
//		int num = 50;
//		System.out.println("����");

//       if ���� ������ �� �� �ִ�
//	       else if, else �� if �� ���� ����ؾ߸� �Ѵ�
//	       && ������ ���� �� �϶�,  || ���ǵ� �� �ϳ��� �� �϶�
//	       ���ڿ��� ���� ���� .

//		if (num > 30) {
//			System.out.println("num�� 30���� ũ��");
//		} else if (num > 20) {
//			System.out.println("num�� 20���� ũ��");
//		} else if (num > 10) {
//			System.out.println("num�� 10���� ũ��");
//		} else {
//			System.out.println("num�� 10 ����");
//		}

//	      System.out.println("��");
		// 1.ù��° ���ڸ� �Է�
		// 2.��Ģ���� ��ȣ �� �ϳ��� �Է�
		// 3.�ι�° ���ڸ� �Է�
		// 4. �Է��� ���� ��ȣ�� ���� ����� ����
		
		////��� ���� ����/////
//		int kor = 100;
//		int eng = 100;
//		int mat = 100;
//		int sci = 100;
//		Scanner scan = new Scanner(System.in);
//		String input = "";
//		System.out.println(" ���� �� �����ҷ�?");
//		input = scan.nextLine();
//		if (input.equals("����")) {
//			System.out.println("���� ���� ����: " + kor);
//			System.out.println("������ ���� �Է� �ϼ�");
//			input = scan.nextLine();
//			kor = Integer.parseInt(input);
//
//			System.out.println("����: " + (kor + eng + mat + sci));
//			System.out.println("���: " + ((kor + eng + mat + sci) / 4));
//		}


		Scanner scan1 = new Scanner(System.in);
		System.out.println("ù ��° ���ڸ� �Է��ϼ���.");
		String input1 = scan1.nextLine();
		int num1 = Integer.parseInt(input1);
		System.out.println("��Ģ���� ��ȣ �� �ϳ��� �Է��ϼ���.");
		String input2 = scan1.nextLine();
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
		String input3 = scan1.nextLine();
		int num2 = Integer.parseInt(input3);
		if (input2.equals("+")) {
			System.out.println(num1 + num2);
		} else if (input2.equals("-")) {
			System.out.println(num1 - num2);
		} else if (input2.equals("*")) {
			System.out.println(num1 * num2);
		} else if (input2.equals("/")) {
			if (num2 == 0) {
				System.out.println("0�� ���� ���� �����ϴ�");
			} else {
				System.out.println((float) num1 / (float) num2);
			}
		}
	}

}

