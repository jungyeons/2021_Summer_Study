import java.util.ArrayList;

public class list {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
//      ArrayList<Integer> arr2 = new ArrayList<>();
      System.out.println(arr.size());      
      arr.add("��");
      arr.add("��");
      arr.add("��");      
      arr.add("��");
      arr.add("��");
      //�� �� �� �� ��
      
      arr.add(0 , "��");   // �� �� �� �� �� ��
      arr.set(0, "����");  // ���� �� �� �� �� ��
   
      arr.remove(3);  // ���� �� �� �� ��
      
      System.out.println(arr.indexOf("��"));
   
      arr.clear(); //���� ����
      
      for (int i = 0; i < arr.size(); i++) {
         System.out.println(arr.get(i));
      }
      
	}

}
