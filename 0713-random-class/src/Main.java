import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rd = new Random();
		//0~9���� ���� ��������
		
	      int randnum1 = 51 + rd.nextInt(50);
	      System.out.println("ù ��° ����: "+randnum1);
	      int randnum2 = 11 + rd.nextInt(5);
	      System.out.println("�� ��° ����: "+randnum2);
	      
	      int ranchar = rd.nextInt(4);
	      
	      if(ranchar == 0) {
	         System.out.println("��Ģ ���� ��ȣ: +");
	         System.out.println("��� ��: "+(randnum1+randnum2));
	      }
	      else if(ranchar == 1) {
	         System.out.println("��Ģ ���� ��ȣ��: -");
	         System.out.println("��� ��: "+(randnum1-randnum2));
	      }
	      else if(ranchar == 2) {
	         System.out.println("��Ģ ���� ��ȣ: *");
	         System.out.println("��� ��: "+(randnum1*randnum2));
	      }
	      else if(ranchar == 3) {
	         System.out.println("��Ģ ���� ��ȣ: /");
	         System.out.println("��� ��: "+(randnum1/randnum2));
	}
	}}

