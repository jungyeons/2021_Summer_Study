
public class Main {

	public static void main(String[] args) {

		Storage.nickName = "����";
		System.out.println(Storage.nickName);
		 chkWord("�ٺ�");
		
	
	}

	 static void chkWord(String oriStr) {
			String result = oriStr;
			result = result.replace("�ٺ�", "**");
			result = result.replace("��û��", "***");
			result = result.replace("1818", "�ú������㽺Ű");
			
		
	}

}
