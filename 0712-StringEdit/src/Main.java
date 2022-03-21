import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//	String str = "대한민국 우리나라 대장";
//	System.out.println(str.length());
	//공백 없습니다.(앞 뒤 공백제거)
//	System.out.println(str.trim());
	//다시 공백 있음
//	System.out.println(str.length());
   // 공백 없애려면
//	str = str.trim();
//	System.out.println(str.length());
//	
	 //글자는 0번째부터 셈
	// 문자열 앞에서 부터 글자 찾기
//	System.out.print	
		
//		
//		String str = "  대한민국 우리나라 대장   ";
//	      System.out.println(str.length());   // 문자열 길이를 가져온다
//
//	      str = str.trim(); //문자열 앞뒤에 공백을 제거
//	      // "대한민국 우리나라 대장"
//	      System.out.println(str.indexOf("대"));  // 문자열 앞에서 부터 글자 찾는다
//	      System.out.println(str.lastIndexOf("대")); // 문자열 뒤에서 부터 글자 찾는다
//	      
//	      System.out.println(str.charAt(8)); // 특정 위치에 있는 문자 찾기
//	      
//	      str = str.replace("우리", "메롱");  //치환
//	      // "대한민국 메롱나라 대장"      
//	      
//	      str = str.substring(5); // 해당 위치부터 문자열 끝까지 자르기
//	      // "메롱나라 대장"   
//	      str = str.substring(1, 4);  // 해당 위치부터 다음 위치까지 자르기
//	      System.out.println(str);
//	      
//	      str = "abcDEfG";
//	      str = str.toUpperCase();   //모든 문자를 대문자로
//	      System.out.println(str);
//	      str = str.toLowerCase();   //모든 문자를 소문자로
//	      System.out.println(str);
		
		Scanner scanner = new Scanner(System.in);
		String[] ques = new String[3];
		ques[0] = "자바는 무슨 언어?";
		ques[1] = "int는 무슨타입?";
		ques[2] = "자동형변환은 범위가 어떤 범위에서 어떤 범위로 형변환될 때 가능?";
		String[] ch1 = new String[3];
		ch1[0] = "절차 지향 언어";
		ch1[1] = "실수 타입";
		ch1[2] = "큰범위에서 작은범위";
		String[] ch2 = new String[3];
		ch2[0] = "주체 지향 언어";
		ch2[1] = "문자열 타입";
		ch2[2] = "큰범위에서 큰범위";
		String[] ch3 = new String[3];
		ch3[0] = "객체 지향 언어";
		ch3[1] = "문자 타입";
		ch3[2] = "작은 범위에서 큰범위";
		String[] ch4 = new String[3];
		ch4[0] = "인스턴스 지향 언어";
		ch4[1] = "정수 타입";
		ch4[2] = "작은 범위에서 작은 범위";
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
			System.out.println("답을 입력하세요.");
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
			System.out.println("답을 입력하세요.");
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
			System.out.println("답을 입력하세요.");
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
			System.out.println("답을 입력하세요.");
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
			System.out.println("답을 입력하세요.");
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
			System.out.println("답을 입력하세요.");
			String number = scanner.nextLine();
			if(number.equals("3")) {
	            int score; score++;
	      }
			System.out.println("점수는 " + score + " 이에요.");
			
		   }
		}
	}



