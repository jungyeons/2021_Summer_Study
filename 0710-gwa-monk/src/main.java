import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		 //���� �� ���� ����
	      int a = 100;
	      int b = 100;
	      int c = 100;
	      int d = 100;
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("�ȳ��ϼ���.");
	      System.out.println("Ư�� ������ ������ �����Ͻðڽ��ϱ�?");
	      for(int i=0; i<3;i++) {
	         String input = "";
	         System.out.println("������ ������ �Է��ϼ���.");
	         input = scanner.nextLine();
	         boolean isDone = false;
	         
	         if (input.equals("����")) {
	            System.out.println("���� ���� ����:" + a);
	            System.out.println("������ ������ �Է����ּ���.");
	         input = scanner.nextLine();
	         a = Integer.parseInt(input);
	         }else if (input.equals("����")) {
	            System.out.println("���� ���� ����:" + b);
	            System.out.println("������ ������ �Է����ּ���.");
	         
	         input = scanner.nextLine();
	         b = Integer.parseInt(input);
	         }else if (input.equals("����")) {
	            System.out.println("���� ���� ����:" + c);
	            System.out.println("������ ������ �Է����ּ���.");
	         
	         input = scanner.nextLine();
	         c = Integer.parseInt(input);
	         }else if (input.equals("����")) {
	            System.out.println("���� ���� ����:" + d);
	            System.out.println("������ ������ �Է����ּ���.");
	         input = scanner.nextLine();
	         d = Integer.parseInt(input);
	      }
	         else if(input.equals("exit")) {
	         isDone =true;
	      }

	         System.out.println("����" + (a + b + c + d));
	         System.out.println("���" + ((a + b + c + d) / 4));
	      }
	   }
	}
