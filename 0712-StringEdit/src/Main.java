import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//	String str = "���ѹα� �츮���� ����";
//	System.out.println(str.length());
	//���� �����ϴ�.(�� �� ��������)
//	System.out.println(str.trim());
	//�ٽ� ���� ����
//	System.out.println(str.length());
   // ���� ���ַ���
//	str = str.trim();
//	System.out.println(str.length());
//	
	 //���ڴ� 0��°���� ��
	// ���ڿ� �տ��� ���� ���� ã��
//	System.out.print	
		
//		
//		String str = "  ���ѹα� �츮���� ����   ";
//	      System.out.println(str.length());   // ���ڿ� ���̸� �����´�
//
//	      str = str.trim(); //���ڿ� �յڿ� ������ ����
//	      // "���ѹα� �츮���� ����"
//	      System.out.println(str.indexOf("��"));  // ���ڿ� �տ��� ���� ���� ã�´�
//	      System.out.println(str.lastIndexOf("��")); // ���ڿ� �ڿ��� ���� ���� ã�´�
//	      
//	      System.out.println(str.charAt(8)); // Ư�� ��ġ�� �ִ� ���� ã��
//	      
//	      str = str.replace("�츮", "�޷�");  //ġȯ
//	      // "���ѹα� �޷ճ��� ����"      
//	      
//	      str = str.substring(5); // �ش� ��ġ���� ���ڿ� ������ �ڸ���
//	      // "�޷ճ��� ����"   
//	      str = str.substring(1, 4);  // �ش� ��ġ���� ���� ��ġ���� �ڸ���
//	      System.out.println(str);
//	      
//	      str = "abcDEfG";
//	      str = str.toUpperCase();   //��� ���ڸ� �빮�ڷ�
//	      System.out.println(str);
//	      str = str.toLowerCase();   //��� ���ڸ� �ҹ��ڷ�
//	      System.out.println(str);
		
		Scanner scanner = new Scanner(System.in);
		String[] ques = new String[3];
		ques[0] = "�ڹٴ� ���� ���?";
		ques[1] = "int�� ����Ÿ��?";
		ques[2] = "�ڵ�����ȯ�� ������ � �������� � ������ ����ȯ�� �� ����?";
		String[] ch1 = new String[3];
		ch1[0] = "���� ���� ���";
		ch1[1] = "�Ǽ� Ÿ��";
		ch1[2] = "ū�������� ��������";
		String[] ch2 = new String[3];
		ch2[0] = "��ü ���� ���";
		ch2[1] = "���ڿ� Ÿ��";
		ch2[2] = "ū�������� ū����";
		String[] ch3 = new String[3];
		ch3[0] = "��ü ���� ���";
		ch3[1] = "���� Ÿ��";
		ch3[2] = "���� �������� ū����";
		String[] ch4 = new String[3];
		ch4[0] = "�ν��Ͻ� ���� ���";
		ch4[1] = "���� Ÿ��";
		ch4[2] = "���� �������� ���� ����";
		int[] ans = new int[3];
		ans[0] = 3;
		ans[1] = 4;
		ans[2] = 3;
		Random rd = new Random();
		int ranNum = rd.nextInt(3);

		if (ranNum == 0) {
			System.out.println(ques[0]);
			System.out.println(ch1[0]);
			System.out.println(ch2[0]);
			System.out.println(ch3[0]);
			System.out.println(ch4[0]);
			String number ="";
			System.out.println("���� �Է��ϼ���.");
			String number = scanner.nextLine();
			if(number.equals("3")) {
	            int score; score++;
	      }
			
		} else if (ranNum == 1) {
			System.out.println(ques[1]);
			System.out.println(ch1[1]);
			System.out.println(ch2[1]);
			System.out.println(ch3[1]);
			System.out.println(ch4[1]);
			String number ="";
			System.out.println("���� �Է��ϼ���.");
			String number = scanner.nextLine();
			if(number.equals("4")) {
	            int score; score++;
	      }
		} else if (ranNum == 2) {
			System.out.println(ques[2]);
			System.out.println(ch1[2]);
			System.out.println(ch2[2]);
			System.out.println(ch3[2]);
			System.out.println(ch4[2]);
			String number ="";
			System.out.println("���� �Է��ϼ���.");
			String number = scanner.nextLine();
			if(number.equals("3")) {
	            int score; score++;
	      }
		}
		int ranNum2 = rd.nextInt(3);

		if (ranNum2 == 0) {
			System.out.println(ques[0]);
			System.out.println(ch1[0]);
			System.out.println(ch2[0]);
			System.out.println(ch3[0]);
			System.out.println(ch4[0]);
			String number ="";
			System.out.println("���� �Է��ϼ���.");
			String number = scanner.nextLine();
			if(number.equals("3")) {
	            int score; score++;
	      }
		} else if (ranNum2 == 1) {
			System.out.println(ques[1]);
			System.out.println(ch1[1]);
			System.out.println(ch2[1]);
			System.out.println(ch3[1]);
			System.out.println(ch4[1]);
			System.out.println("���� �Է��ϼ���.");
			String number = scanner.nextLine();
			if(number.equals("4")) {
	             score++;
	      }
		} else if (ranNum2 == 2) {
			System.out.println(ques[2]);
			System.out.println(ch1[2]);
			System.out.println(ch2[2]);
			System.out.println(ch3[2]);
			System.out.println(ch4[2]);
			System.out.println("���� �Է��ϼ���.");
			String number = scanner.nextLine();
			if(number.equals("3")) {
	            int score; score++;
	      }
			System.out.println("������ " + score + " �̿���.");
			
		   }
		}
	}



