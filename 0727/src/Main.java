import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	void insertVoca(ArrayList<Voca> vocaArr) {
		Scanner  scan = new Scanner(System.in);
		String input ="";
		Voca v = new Voca();
        System.out.println("��� �Է��� �ּ���");
        input = scan.nextLine();
        v.setEng(input);
        System.out.println("�ѱ��� �Է��� �ּ���");
        input = scan.nextLine();
        v.setKor(input);
        vocaArr.add(v);
	}

	public static void main(String[] args) {
		
			
		
		 /**
	       * ������ �Ͻðڽ��ϱ�? 1. �ܾ� �߰� 2. �ܾ� ���� 3. �ܾ� ���� 4. ���� 1. ��ũ���� 2. ���
	       **/
		Scanner  scan = new Scanner(System.in);
		String input ="";
		ArrayList<Voca> vocaArr  = new ArrayList<Voca>();
		
	      while(true) {
	         System.out.println("------------");
	         System.out.println("�� "+vocaArr.size() + "��");
	         for (int i = 0; i < vocaArr.size(); i++) {
	            System.out.println((i+1)+". " +vocaArr.get(i).eng + " : " + vocaArr.get(i).kor);
	         }
	         System.out.println("------------");
	         System.out.println();
	         System.out.println("������ �Ͻðڽ��ϱ�?");
	         System.out.println("1. �ܾ� �߰�  2. �ܾ� ����  3. �ܾ� ���� 4. ����");
	         input = scan.nextLine();
	         
	         if(input.equals("1")) {
	        	 insertVoca( vocaArr);
	           
	         }else if(input.equals("2")) {
	            System.out.println("�� ���� ���� �ҷ�?");
	            input = scan.nextLine();
	            int temp = Integer.parseInt(input)-1;
//	            engArr.remove(temp);
//	            korArr.remove(temp);
	            vocaArr.remove(temp);
	            
	         }else if(input.equals("3")) {
	            System.out.println("�� ���� ���� �ҷ�?");
	            input = scan.nextLine();
	            int temp = Integer.parseInt(input)-1;
	            System.out.println("��� �Է��� �ּ���");
	            input = scan.nextLine();            
	            Voca v = vocaArr.get(temp);
	            v.eng = input;
	            
	            System.out.println("�ѱ��� �Է��� �ּ���");
	            input = scan.nextLine();
	            v.kor = input;

//	            vocaArr.set(temp,  v  );            
	         }else if(input.equals("4")) {
	            System.out.println("���α׷��� ���� �մϴ�");
	            break;
	         }
	      }
	      

	}

}
