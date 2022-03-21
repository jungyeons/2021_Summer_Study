package main;

public class MyThread extends Thread {
	@Override
	public void run() {
		int sec = 0;
		while (true) {
			System.out.println(sec+"√ ");
			sec++;
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


