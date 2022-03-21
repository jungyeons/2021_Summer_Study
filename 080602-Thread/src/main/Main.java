package main;

public class Main {

	public static void main(String[] args) {
		MyThread th = new MyThread();
	      th.start();
	      
	      for (int i = 0; i < 30; i++) {
	         System.out.println("¸ÞÀÎ "+i);
	      }
	}

}
