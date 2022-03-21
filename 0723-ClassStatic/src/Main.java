
public class Main {

	public static void main(String[] args) {

		Storage.nickName = "링링";
		System.out.println(Storage.nickName);
		 chkWord("바보");
		
	
	}

	 static void chkWord(String oriStr) {
			String result = oriStr;
			result = result.replace("바보", "**");
			result = result.replace("멍청이", "***");
			result = result.replace("1818", "시베리안허스키");
			
		
	}

}
