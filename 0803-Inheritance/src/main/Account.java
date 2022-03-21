package main;

public abstract class Account {

	String AccNum; // ���� �ѹ�
	String AccName; // ���� �̸�
	int balance; // �ܾ�

	public Account(String AccNum, String AccName, int balance) {
		this.AccNum = AccNum;
		this.AccName = AccName;
		this.balance = balance;
	}

	void deposit(int amount) { // �Ա�
		balance += amount;
	}
	
	abstract void post();
	abstract void delete();

	int withdraw(int amount) { // ���
		if (amount > balance) {
			System.out.println("�ܾ� ����");
			return 0;
		} else {
			balance -= amount;
			return amount;
		}
	}

}
