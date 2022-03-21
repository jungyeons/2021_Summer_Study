import java.util.ArrayList;

public class list {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
//      ArrayList<Integer> arr2 = new ArrayList<>();
      System.out.println(arr.size());      
      arr.add("가");
      arr.add("나");
      arr.add("다");      
      arr.add("라");
      arr.add("마");
      //가 나 다 라 마
      
      arr.add(0 , "바");   // 바 가 나 다 라 마
      arr.set(0, "하하");  // 하하 가 나 다 라 마
   
      arr.remove(3);  // 하하 가 나 라 마
      
      System.out.println(arr.indexOf("라"));
   
      arr.clear(); //전부 삭제
      
      for (int i = 0; i < arr.size(); i++) {
         System.out.println(arr.get(i));
      }
      
	}

}
