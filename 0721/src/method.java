
public class method {

	public static void main(String[] args) {
		 /**
	       * �޼ҵ� 1 ������ 2-9 ���
	       * �޼ҵ� 2 �Ķ���� ���ڸ� ������ �ش��ϴ� ���� ������ �����ִ� �޼ҵ�
	       * �����ε� - �Ķ���Ϳ� ���� �޼ҵ尡 �޶����� ��
	       * 2���� ���ڸ� �޾Ƽ� �� ���� ��ȯ���ִ� �޼ҵ� �����
	       * **/

		gugudan();
		gugudan2(2);
		plus(2,3);
	}
	
	static String chkWord(String oriStr) {
		String result  = oriStr;
		result = result.replace("�ٺ�", "**");
		result = result.replace("��û��", "***");
		result = result.replace("1818", "�ú������㽺Ű");
		return result;
	}

	static void gugudan() {
		for (int num = 2; num < 10; num++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(num + "*" + i + "=" + (num * i));
			}
		}
	}

	static void gugudan2(int a) {

		for (int i = 1; i < 10; i++) {
			System.out.println(a + "*" + i + "=" + (a * i));
		}
	}
	static int plus(int a,int b) {
		int c;
		c =  a + b;
       
		return c;
	}
}

