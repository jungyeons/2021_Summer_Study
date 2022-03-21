package main;

public class Thread3 extends Thread {
	ShareData share;

	@Override
	public void run() {
		System.out.println(share.result);
	}

}
