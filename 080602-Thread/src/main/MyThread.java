package main;

public class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("¾²·¹µå "+i);
			   try {
		            Thread.sleep(1000);
		         } catch (InterruptedException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		         }
		      
		}
	}
}
