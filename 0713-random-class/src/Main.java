import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rd = new Random();
		//0~9사이 숫자 뽑으려면
		
	      int randnum1 = 51 + rd.nextInt(50);
	      System.out.println("첫 번째 숫자: "+randnum1);
	      int randnum2 = 11 + rd.nextInt(5);
	      System.out.println("두 번째 숫자: "+randnum2);
	      
	      int ranchar = rd.nextInt(4);
	      
	      if(ranchar == 0) {
	         System.out.println("사칙 연산 기호: +");
	         System.out.println("계산 값: "+(randnum1+randnum2));
	      }
	      else if(ranchar == 1) {
	         System.out.println("사칙 연산 기호는: -");
	         System.out.println("계산 값: "+(randnum1-randnum2));
	      }
	      else if(ranchar == 2) {
	         System.out.println("사칙 연산 기호: *");
	         System.out.println("계산 값: "+(randnum1*randnum2));
	      }
	      else if(ranchar == 3) {
	         System.out.println("사칙 연산 기호: /");
	         System.out.println("계산 값: "+(randnum1/randnum2));
	}
	}}

