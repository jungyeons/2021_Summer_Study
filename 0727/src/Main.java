import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	void insertVoca(ArrayList<Voca> vocaArr) {
		Scanner  scan = new Scanner(System.in);
		String input ="";
		Voca v = new Voca();
        System.out.println("영어를 입력해 주세요");
        input = scan.nextLine();
        v.setEng(input);
        System.out.println("한글을 입력해 주세요");
        input = scan.nextLine();
        v.setKor(input);
        vocaArr.add(v);
	}

	public static void main(String[] args) {
		
			
		
		 /**
	       * 무엇을 하시겠습니까? 1. 단어 추가 2. 단어 삭제 3. 단어 수정 4. 종료 1. 스크램블 2. 행맨
	       **/
		Scanner  scan = new Scanner(System.in);
		String input ="";
		ArrayList<Voca> vocaArr  = new ArrayList<Voca>();
		
	      while(true) {
	         System.out.println("------------");
	         System.out.println("총 "+vocaArr.size() + "개");
	         for (int i = 0; i < vocaArr.size(); i++) {
	            System.out.println((i+1)+". " +vocaArr.get(i).eng + " : " + vocaArr.get(i).kor);
	         }
	         System.out.println("------------");
	         System.out.println();
	         System.out.println("무엇을 하시겠습니까?");
	         System.out.println("1. 단어 추가  2. 단어 삭제  3. 단어 수정 4. 종료");
	         input = scan.nextLine();
	         
	         if(input.equals("1")) {
	        	 insertVoca( vocaArr);
	           
	         }else if(input.equals("2")) {
	            System.out.println("몇 번을 삭제 할래?");
	            input = scan.nextLine();
	            int temp = Integer.parseInt(input)-1;
//	            engArr.remove(temp);
//	            korArr.remove(temp);
	            vocaArr.remove(temp);
	            
	         }else if(input.equals("3")) {
	            System.out.println("몇 번을 수정 할래?");
	            input = scan.nextLine();
	            int temp = Integer.parseInt(input)-1;
	            System.out.println("영어를 입력해 주세요");
	            input = scan.nextLine();            
	            Voca v = vocaArr.get(temp);
	            v.eng = input;
	            
	            System.out.println("한글을 입력해 주세요");
	            input = scan.nextLine();
	            v.kor = input;

//	            vocaArr.set(temp,  v  );            
	         }else if(input.equals("4")) {
	            System.out.println("프로그램을 종료 합니다");
	            break;
	         }
	      }
	      

	}

}
