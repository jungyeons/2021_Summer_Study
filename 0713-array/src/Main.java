
public class Main {

	public static void main(String[] args) {
		/*Array �迭*/
		//Ÿ�� [] �̸� = new Ÿ��[�迭�� ��];
		int[] arr = new int[12];
		//�迭 ũ�Ⱑ 12���̰� �迭�� 0������� �����ϹǷ� 11������� ����.
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
		//�迭�� �׸� ��� ���
		System.out.println(arr[4]);
		//�迭�� ���� ��� ���
		System.out.println(arr.length);
		/*�迭�� �� ��������° �� ���� ���*/
		//0������� �迭�� �����ϱ� ������ -1�� ���ش�.
		System.out.println(arr[arr.length-1]);
 
		//String Ÿ���� �迭�� ����� ����!
		String[] arr2 = new String[5];
		arr2[0] = "�ȳ�!";
		arr2[1] = "����";

	}

}
