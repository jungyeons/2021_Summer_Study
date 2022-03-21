
public class method {

	public static void main(String[] args) {
		 /**
	       * 메소드 1 구구단 2-9 출력
	       * 메소드 2 파라메터 숫자를 던져서 해당하는 숫자 구구단 보여주는 메소드
	       * 오버로딩 - 파라메터에 따라 메소드가 달라지는 것
	       * 2개의 숫자를 받아서 그 합을 반환해주는 메소드 만들기
	       * **/

		gugudan();
		gugudan2(2);
		plus(2,3);
	}
	
	static String chkWord(String oriStr) {
		String result  = oriStr;
		result = result.replace("바보", "**");
		result = result.replace("멍청이", "***");
		result = result.replace("1818", "시베리안허스키");
		return result;
	}

	static void gugudan() {
		for (int num = 2; num < 10; num++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(num + "*" + i + "=" + (num * i));
			}
		}
	}

	static void gugudan2(int a) {

		for (int i = 1; i < 10; i++) {
			System.out.println(a + "*" + i + "=" + (a * i));
		}
	}
	static int plus(int a,int b) {
		int c;
		c =  a + b;
       
		return c;
	}
}

