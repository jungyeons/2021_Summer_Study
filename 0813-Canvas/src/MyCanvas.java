import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;

public class MyCanvas extends Canvas {

	Image buffImage;
	Graphics buffg;
	Ball ball;
	ArrayList<Ball> ballarr = new ArrayList<Ball>();

	public MyCanvas() {		
		ballarr.add(new Ball(100, 0, -5, 5, 50, 50));
		ball = new Ball(0,0,5,5,50,50);
		ballarr.add(new Ball(100, 100, (new Random().nextInt(5)+1)*5, -5,100,50));
		ballarr.add(new Ball(200, 0, 15,10, 100, 100));
		ballarr.add(new Ball(400, 200, 10, -10,20, 20));
		repaint();
		new MyThread().start();
	}

	@Override
	public void paint(Graphics g) {
		if (buffg == null) {
			if (buffImage == null) {
				System.out.println("오프 스크린 생성 실패");
			} else {
				buffg = buffImage.getGraphics();
			}
		}
		update(g);
	}

	@Override
	public void update(Graphics g) {		
		if (buffg != null) {
			buffg.setColor(Color.BLUE);
			buffg.fillRect(0, 0, getWidth(), getHeight());
			

			buffg.setColor(Color.red);			
			for (int i = 0; i < ballarr.size(); i++) {
				Ball ball = ballarr.get(i);
				
				buffg.fillOval(ball.posX, ball.posY, ball.width, ball.height);
			}

			g.drawImage(buffImage, 0, 0, this);
		}
	}
	public void down() {
		ball.posX += 5;
	}

	
	class MyThread extends Thread {
		@Override
		public void run() {

			while (true) {
				for (int i = 0; i <ballarr.size(); i++) {
					Ball ball = ballarr.get(i);
					ball.move(getWidth(), getHeight());
				}
				
				repaint();

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
