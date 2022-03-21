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
//			System.out.println("실행 11");
//		}
//		if (str3.equals(str5)) {
//			System.out.println("실행 22");
//		}
//		if (str4.equals(str5)) {
//			System.out.println("실행 33");
//		}
//
//		int num = 50;
//		System.out.println("시작");

//       if 문은 독립적 쓸 수 있다
//	       else if, else 는 if 과 같이 사용해야만 한다
//	       && 조건이 전부 참 일때,  || 조건들 중 하나라도 참 일때
//	       문자열을 비교할 떄는 .

//		if (num > 30) {
//			System.out.println("num은 30보다 크다");
//		} else if (num > 20) {
//			System.out.println("num은 20보다 크다");
//		} else if (num > 10) {
//			System.out.println("num은 10보다 크다");
//		} else {
//			System.out.println("num은 10 이하");
//		}

//	      System.out.println("끝");
		// 1.첫번째 숫자를 입력
		// 2.사칙연산 기호 중 하나를 입력
		// 3.두번째 숫자를 입력
		// 4. 입력한 연산 기호에 따른 결과값 도출
		
		////평균 점수 내기/////
//		int kor = 100;
//		int eng = 100;
//		int mat = 100;
//		int sci = 100;
//		Scanner scan = new Scanner(System.in);
//		String input = "";
//		System.out.println(" 점수 뭐 수정할래?");
//		input = scan.nextLine();
//		if (input.equals("국어")) {
//			System.out.println("현재 국어 점수: " + kor);
//			System.out.println("수정할 점수 입력 하셈");
//			input = scan.nextLine();
//			kor = Integer.parseInt(input);
//
//			System.out.println("총점: " + (kor + eng + mat + sci));
//			System.out.println("평균: " + ((kor + eng + mat + sci) / 4));
//		}


		Scanner scan1 = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요.");
		String input1 = scan1.nextLine();
		int num1 = Integer.parseInt(input1);
		System.out.println("사칙연산 기호 중 하나를 입력하세요.");
		String input2 = scan1.nextLine();
		System.out.println("두 번째 숫자를 입력하세요.");
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
				System.out.println("0을 나눌 수는 없습니다");
			} else {
				System.out.println((float) num1 / (float) num2);
			}
		}
	}

}

