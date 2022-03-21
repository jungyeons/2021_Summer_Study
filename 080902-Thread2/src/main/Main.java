package main;

public class Main {

	public static void main(String[] args) {
		Thread2 th2 = new Thread2();
		Thread3 th3 = new Thread3();
		ShareData share = new ShareData();
		th2.share = share;
		th3.share = share;
		th2.start();
		th3.start();

		boolean isDone = false;

	}

}
