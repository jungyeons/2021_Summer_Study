
public class Main {

	public static void main(String[] args) {
		/*Array 배열*/
		//타입 [] 이름 = new 타입[배열의 수];
		int[] arr = new int[12];
		//배열 크기가 12개이고 배열은 0번방부터 시작하므로 11번방까지 만듦.
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = -20;
		arr[3] = -7;
		arr[4] = 0;
		arr[5] = 1000;
		arr[6] = 100;
		arr[7] = 23;
		arr[8] = 21;
		arr[9] = 1;
		arr[10] = 5;
		arr[11] = -1;
		//배열의 항목 출력 방법
		System.out.println(arr[4]);
		//배열의 길이 출력 방법
		System.out.println(arr.length);
		/*배열의 맨 마지막번째 방 접근 방법*/
		//0번방부터 배열이 시작하기 때문에 -1을 해준다.
		System.out.println(arr[arr.length-1]);
 
		//String 타입의 배열도 만들어 보자!
		String[] arr2 = new String[5];
		arr2[0] = "안녕!";
		arr2[1] = "링링";

	}

}
