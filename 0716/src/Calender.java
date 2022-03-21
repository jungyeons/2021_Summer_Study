import java.util.Calendar;
import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
//		int[] arr = new int[50];
//		for (int i = 0; i < arr.length; i++) {
//		}
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("원하는 년도를 입력해주세요.");
//		String input1 = "";
//		input1 = scanner.nextLine();
//		System.out.println("원하는 월을 입력해주세요." );
//		String input2 = "";
//		input2 = scanner.nextLine();
//		Calendar cal = Calendar.getInstance(); // 20210716
//
//		      int year = cal.set(Calendar.YEAR);
//		      int month = cal.get(Calendar.MONTH);  //0(1월) 11(12월)
//		      int date = cal.get(Calendar.DATE);
//		      int dow = cal.get(Calendar.DAY_OF_WEEK); // 1 일요일  7 토요일
//		      int max = cal.getActualMaximum(Calendar.DATE);
//		      System.out.println(year + "-" + (month+1) + "-" + date + "  "  + dow + "  " + max);
//		      
//		      cal.add(Calendar.MONTH, 2);  // 20210916
//		      cal.add(Calendar.MONTH, -2);  // 20210716
//		      
//		      cal.set(Calendar.DATE, 1);   // 20210701
//		      
//		      year = cal.get(Calendar.YEAR);
//		      month = cal.get(Calendar.MONTH); 
//		      date = cal.get(Calendar.DATE);
//		      System.out.println(year + "-" + (month+1) + "-" + date );
		Calendar cal = Calendar.getInstance();
		Scanner scanner = new Scanner(System.in);

		System.out.println("년도를 입력하세요 : ");
		int year = scanner.nextInt(); // 년도
		System.out.println("월을 입력하세요 : ");
		int month = scanner.nextInt(); // 월

		cal.set(Calendar.YEAR, year); // 입력받은 년도로 세팅
		cal.set(Calendar.MONTH, month); // 입력받은 월로 세팅

		System.out.println("---------[" + year + "년 " + month + "월]---------");
		System.out.println("  일  월   화   수   목   금   토");

		cal.set(year, month - 1, 1); // 입력받은 월의 1일로 세팅
										// month는 0이 1월이므로 -1을 해준다

		int end = cal.getActualMaximum(Calendar.DATE); // 해당 월 마지막 날짜
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 해당 날짜의 요일(1:일요일 … 7:토요일)

		for (int i = 1; i <= end; i++) {
			if (i == 1) {
				for (int j = 1; j < dayOfWeek; j++) {
					System.out.print("    ");
				}
			}
			if (i < 10) { // 한자릿수일 경우 공백을 추가해서 줄맞추기
				System.out.print(" ");
			}
			System.out.print(" " + i + " ");
			if (dayOfWeek % 7 == 0) { // 한줄에 7일씩 출력
				System.out.println();
			}
			dayOfWeek++;
		}
		

	}

}
	


	


