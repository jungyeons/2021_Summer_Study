package main;

public class MyThread extends Thread {
	@Override
	public void run(){
		while (true) {
			int sec=0;
			System.out.println(sec+"√ ");
			sec++;
		}
		
	}

}
