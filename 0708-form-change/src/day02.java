import java.util.Scanner;

public class day02 {

	public static void main(String[] args) {
		
		
		//////////////
		// print 배우기//
		/////////////

		// 이클립스에서는 'sysout' 이라고 입력하고 'ctrl+space'를 누르면
		// System.out.println()이 자동 입력된다.
		// println은 내용을 출력한 후 자동으로 줄바꾸는 기능이 있다.
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		// 문자열을 출력하기 위해서는 큰따옴표로 묶어줘야 한다.
		// 큰 따옴표 없는 것은 모두 변수명으로 인식한다. (입력한 변수명이 없을 경우 에러발생)
		// 문자열과 변수명을 함께 사용할 수 있으나 반드시 '+'로 연결시켜줘야 한다.
		System.out.println("문자열");
		int a = 0;
		System.out.println(a);
		System.out.println("문자열" + a);

		// print는 그냥 붙여서 출력됨.
		System.out.print("안녕하세요");
		System.out.print("안녕하세요");

		/////////
		// 변수//
		/////

		int number; // 변수 선언
		number = 10;// 우측에 있는 것을 좌측으로 대입

		int numScore; // 변수이름이 한글자가 아니면 저렇게 두번째 글자는 대문자로
		int number2 = 20; // 선언과 대입을 동시에

		number = 20; // 이렇게 하면 뒷 수가 num에 들어감

		boolean value = false; // true or false
		float num3 = 3.4f;
		System.out.println(num3);

		// reference 타입이지만 primitive 타입 처럼 씀.
		String str = "안녕하세요";

		////////
		// 형 변환//
		////////

		int num11 = 10;
		float num12 = 5.9f;
		String num13 = "20";

		num11 = (int) num12;// float -> int
		num12 = num11; // 작은데 큰거 자동 형변환

		num11 = Integer.parseInt(num13); // String -> int
		num12 = Float.parseFloat(num13); // String -> float

		num13 = String.valueOf(num11); // int -> String
		num13 = String.valueOf(num12); // float -> String

		/** 연산자 **/
		// 곱하기는 * 나누기는 / 덧셈뺄셈은 동일
		// % 는 나머지 연산
		int num21 = 10;
		int num22 = 7;
		int result = num21 * num22;

		/** 키보드 입력 **/
		// reference 타입 입력받는 장치
		System.out.println("값을 입력하시오.");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println("입력합 값은:" + input);

		/**
		 * 첫 번째 숫자를 입력하세요
		 *  (키보드 입력)
		 *   두 번째 숫자를 입력하세요 
		 *   (키보드 입력)
		 *    두 수의 합은 () 입니다.
		 **/
		System.out.println("첫 번째 숫자를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.nextLine();
		System.out.println("두 번째 숫자를 입력하세요.");
		String input2 = scanner.nextLine();
		int num1;
		num1 = Integer.parseInt(input1);
		int num2;
		num2 = Integer.parseInt(input2);

		System.out.println("두 수의 합은" + (num1 + num2) + "입니다.");

	}

}
