import java.util.Calendar;
import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
//		int[] arr = new int[50];
//		for (int i = 0; i < arr.length; i++) {
//		}
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("���ϴ� �⵵�� �Է����ּ���.");
//		String input1 = "";
//		input1 = scanner.nextLine();
//		System.out.println("���ϴ� ���� �Է����ּ���." );
//		String input2 = "";
//		input2 = scanner.nextLine();
//		Calendar cal = Calendar.getInstance(); // 20210716
//
//		      int year = cal.set(Calendar.YEAR);
//		      int month = cal.get(Calendar.MONTH);  //0(1��) 11(12��)
//		      int date = cal.get(Calendar.DATE);
//		      int dow = cal.get(Calendar.DAY_OF_WEEK); // 1 �Ͽ���  7 �����
//		      int max = cal.getActualMaximum(Calendar.DATE);
//		      System.out.println(year + "-" + (month+1) + "-" + date + "  "  + dow + "  " + max);
//		      
//		      cal.add(Calendar.MONTH, 2);  // 20210916
//		      cal.add(Calendar.MONTH, -2);  // 20210716
//		      
//		      cal.set(Calendar.DATE, 1);   // 20210701
//		      
//		      year = cal.get(Calendar.YEAR);
//		      month = cal.get(Calendar.MONTH); 
//		      date = cal.get(Calendar.DATE);
//		      System.out.println(year + "-" + (month+1) + "-" + date );
		Calendar cal = Calendar.getInstance();
		Scanner scanner = new Scanner(System.in);

		System.out.println("�⵵�� �Է��ϼ��� : ");
		int year = scanner.nextInt(); // �⵵
		System.out.println("���� �Է��ϼ��� : ");
		int month = scanner.nextInt(); // ��

		cal.set(Calendar.YEAR, year); // �Է¹��� �⵵�� ����
		cal.set(Calendar.MONTH, month); // �Է¹��� ���� ����

		System.out.println("---------[" + year + "�� " + month + "��]---------");
		System.out.println("  ��  ��   ȭ   ��   ��   ��   ��");

		cal.set(year, month - 1, 1); // �Է¹��� ���� 1�Ϸ� ����
										// month�� 0�� 1���̹Ƿ� -1�� ���ش�

		int end = cal.getActualMaximum(Calendar.DATE); // �ش� �� ������ ��¥
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // �ش� ��¥�� ����(1:�Ͽ��� �� 7:�����)

		for (int i = 1; i <= end; i++) {
			if (i == 1) {
				for (int j = 1; j < dayOfWeek; j++) {
					System.out.print("    ");
				}
			}
			if (i < 10) { // ���ڸ����� ��� ������ �߰��ؼ� �ٸ��߱�
				System.out.print(" ");
			}
			System.out.print(" " + i + " ");
			if (dayOfWeek % 7 == 0) { // ���ٿ� 7�Ͼ� ���
				System.out.println();
			}
			dayOfWeek++;
		}
		

	}

}
	


	


