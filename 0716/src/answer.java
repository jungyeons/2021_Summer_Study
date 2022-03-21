import java.util.Calendar;
public class answer {

	public static void main(String[] args) {
		int idx = 0;
	      int[] calArr = new int[49];
	      Calendar cal =Calendar.getInstance();
	      //테스트 날짜 세팅
	      cal.set(Calendar.MONTH,  10);
	      
	      cal.set(Calendar.DATE, 1);
	      int dow = cal.get(Calendar.DAY_OF_WEEK); //4
	      int count = dow -1; //3
	      
	      cal.add(Calendar.MONTH, -1);
	      int max = cal.getActualMaximum(Calendar.DATE);  // 31
	      
	      for (int i = 0; i < count; i++) {
//	         System.out.println(max - count + i+1);      
	         calArr[idx] = max - count + i+1;
	         idx++;
	      }
	   
	      cal.add(Calendar.MONTH, 1);
	      max = cal.getActualMaximum(Calendar.DATE);
	      for (int i = 0; i < max; i++) {
//	         System.out.println(i+1);
	         calArr[idx] = i+1;
	         idx++;
	      }
	      
	      cal.set(Calendar.DATE, max);
	      dow = cal.get(Calendar.DAY_OF_WEEK); 
	      count = 7 - dow;      
	         
	      for (int i = 0; i < count; i++) {
//	         System.out.println(i+1);
	         calArr[idx] = i+1;
	         idx++;
	      }      
	      
	      for (int i = 0; i < calArr.length; i++) {
	         String str = calArr[i] < 10 ? "0"+calArr[i]:""+calArr[i];
	         //if(calArr[i]<10 ){
	         "0" +calArr[i]:"}"
	         		+ "
	         System.out.print(str+ " ");
	         if(i % 7 ==6) {
	            System.out.println();
	         }
	      }
	}

}
