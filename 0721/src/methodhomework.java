import java.util.Random;

public class methodhomework {

	public static void main(String[] args) {
		/**
		 * h.w.1 2���� ���ڸ� ���ڷ� �޾Ƽ� ���ϰ� ���� �� ���� ��ȯ�ϴ� �޼ҵ� �����
		 *  h.w.2 ���̰� 10�� int�� �迭�� �����ϰ�
		 * 1~100 �߿��� �������� ���ڸ� �̾Ƽ� �� �濡 ������ �ϰ� 
		 * �ش��ϴ� �迭�� ���ڷ� �޼ҵ忡 ������ ū ���ڴ�� �����ϴ� ���α׷� �����
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
