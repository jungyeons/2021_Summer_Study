package main;

public abstract class Account {

	String AccNum; // °èÁÂ ³Ñ¹ö
	String AccName; // °èÁÂ ÀÌ¸§
	int balance; // ÀÜ¾×

	public Account(String AccNum, String AccName, int balance) {
		this.AccNum = AccNum;
		this.AccName = AccName;
		this.balance = balance;
	}

	void deposit(int amount) { // ÀÔ±İ
		balance += amount;
	}
	
	abstract void post();
	abstract void delete();

	int withdraw(int amount) { // Ãâ±İ
		if (amount > balance) {
			System.out.println("ÀÜ¾× ¾øÀ½");
			return 0;
		} else {
			balance -= amount;
			return amount;
		}
	}

}
