package main;

public class Thread2 extends Thread {
	ShareData share;
	
	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			for (int j = 0; j < 10000; j++) {
				if (j % 2 == 0) {
					share.result += 100;
				} else {
					share.result -= 100;
				}
			}
		}
		share.result = -1;
		System.out.println("³¡");
	}

}
