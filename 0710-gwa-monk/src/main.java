import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		 //과목 별 변수 선언
	      int a = 100;
	      int b = 100;
	      int c = 100;
	      int d = 100;
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("안녕하세요.");
	      System.out.println("특정 과목의 점수를 수정하시겠습니까?");
	      for(int i=0; i<3;i++) {
	         String input = "";
	         System.out.println("수정할 과목을 입력하세요.");
	         input = scanner.nextLine();
	         boolean isDone = false;
	         
	         if (input.equals("국어")) {
	            System.out.println("현재 국어 점수:" + a);
	            System.out.println("수정할 점수를 입력해주세요.");
	         input = scanner.nextLine();
	         a = Integer.parseInt(input);
	         }else if (input.equals("영어")) {
	            System.out.println("현재 영어 점수:" + b);
	            System.out.println("수정할 점수를 입력해주세요.");
	         
	         input = scanner.nextLine();
	         b = Integer.parseInt(input);
	         }else if (input.equals("수학")) {
	            System.out.println("현재 수학 점수:" + c);
	            System.out.println("수정할 점수를 입력해주세요.");
	         
	         input = scanner.nextLine();
	         c = Integer.parseInt(input);
	         }else if (input.equals("과학")) {
	            System.out.println("현재 과학 점수:" + d);
	            System.out.println("수정할 점수를 입력해주세요.");
	         input = scanner.nextLine();
	         d = Integer.parseInt(input);
	      }
	         else if(input.equals("exit")) {
	         isDone =true;
	      }

	         System.out.println("총점" + (a + b + c + d));
	         System.out.println("평균" + ((a + b + c + d) / 4));
	      }
	   }
	}
