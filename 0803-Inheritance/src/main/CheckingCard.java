package main;

public class CheckingCard extends Account { // Account를 상속받으므로써 Account의 데이터를 물려받음
//상속은 extends 상속할 클래스명으로 사용
	String cardNo;
//	String AccNum;
//	String AccName;
//	int balance;
//상속 관계에서 부모가 생성자가 있을경우
//자식은 무조건 부모의 생성자를 호출해야한다. 

	int pay(String cardNo, int amount) {
		deposit(100);
		if (!this.cardNo.equals(cardNo)) {
			System.out.println("잘못된 카드 정보");
			return 0;
		} else {
			return withdraw(amount);
		}
	}

	public CheckingCard(String cardNo, String AccNum, String AccName, int balance) {
		super(AccNum, AccName, balance); // 부모에 생성자있으면 자식은 무조건 그 생성자를 호출해야한다. 
		                                 //이게 호출해주는 방법 super()
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

//	void deposit(int amount) { //입금
//		balance += amount;
//	}
//
//	int withdraw(int amount) {  //출금
//		if(amount> balance) {
//			System.out.println("잔액 없음");
//			return 0;
//		}
//		else {
//			balance -= amount;
//			return amount;
//		}
//	}
}
