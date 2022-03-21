import java.util.Random;

public class methodhomework {

	public static void main(String[] args) {
		/**
		 * h.w.1 2개의 숫자를 인자로 받아서 더하고 나서 그 값을 반환하는 메소드 만들기
		 *  h.w.2 길이가 10인 int형 배열을 선언하고
		 * 1~100 중에서 랜덤으로 숫자를 뽑아서 각 방에 저장을 하고 
		 * 해당하는 배열을 인자로 메소드에 던져서 큰 숫자대로 정렬하는 프로그램 만들기
		 **/

		// System.out.println(plus(2, 3));
		
		int[] arr = new int[10];
		Random rd = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(100) + 1;
		}
	}

	static void arr(int arr[]) {
		int temp;
		int temp2;
		for (int i = 0; i < 10; i++) {
			temp = arr[i];
			for (int j = i + 1; j < 10; j++) {
				if (temp < arr[j]) {
					temp = arr[j];
					temp2 = arr[i];
					arr[i] = temp;
					arr[j] = temp2;
				}
			}
		}
	}
}
