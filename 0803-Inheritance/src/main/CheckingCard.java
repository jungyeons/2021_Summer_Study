package main;

public class CheckingCard extends Account { // Account�� ��ӹ����Ƿν� Account�� �����͸� ��������
//����� extends ����� Ŭ���������� ���
	String cardNo;
//	String AccNum;
//	String AccName;
//	int balance;
//��� ���迡�� �θ� �����ڰ� �������
//�ڽ��� ������ �θ��� �����ڸ� ȣ���ؾ��Ѵ�. 

	int pay(String cardNo, int amount) {
		deposit(100);
		if (!this.cardNo.equals(cardNo)) {
			System.out.println("�߸��� ī�� ����");
			return 0;
		} else {
			return withdraw(amount);
		}
	}

	public CheckingCard(String cardNo, String AccNum, String AccName, int balance) {
		super(AccNum, AccName, balance); // �θ� ������������ �ڽ��� ������ �� �����ڸ� ȣ���ؾ��Ѵ�. 
		                                 //�̰� ȣ�����ִ� ��� super()
		this.cardNo = cardNo;

	}

	@Override
	void post() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void delete() {
		// TODO Auto-generated method stub
		
	}

//	void deposit(int amount) { //�Ա�
//		balance += amount;
//	}
//
//	int withdraw(int amount) {  //���
//		if(amount> balance) {
//			System.out.println("�ܾ� ����");
//			return 0;
//		}
//		else {
//			balance -= amount;
//			return amount;
//		}
//	}
}
