import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Iterator;

public class MyCanvas extends Canvas {

	Image buffImage;
	Graphics buffg;
	Ball ball;
	Enemy enemy;
	ArrayList<Fire> fireArr = new ArrayList<Fire>();

	public MyCanvas() {
		enemy = new Enemy(200, 50, 200, 50);
		ball = new Ball(0, 0, 5, 5, 50, 50);
		repaint();
		new MyThread().start();
	}

	@Override
	public void paint(Graphics g) {
		if (buffg == null) {
			buffImage = createImage(getWidth(), getHeight());
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

			// 나
			buffg.setColor(Color.red);
//			buffg.fillOval(ball.posX, ball.posY, 50, 50);
			Image img = (Toolkit.getDefaultToolkit()).getImage("my.png");
			buffg.drawImage(img, ball.posX, ball.posY, ball.width, ball.height, this);

			// 총알
			buffg.setColor(Color.yellow);
			for (int i = 0; i < fireArr.size(); i++) {
				Fire fire = fireArr.get(i);
				buffg.fillRect(fire.posX, fire.posY, fire.width, fire.height);
			}

			// 적
			buffg.setColor(Color.white);
			buffg.fillRect(enemy.posX, enemy.posY, enemy.width, enemy.height);

			g.drawImage(buffImage, 0, 0, this);
		}
	}

	boolean isUp = false;
	boolean isDown = false;
	boolean isLeft = false;
	boolean isRight = false;

	public void up(boolean value) {
		isUp = value;
	}

	public void left(boolean value) {
		isLeft = value;
	}

	public void right(boolean value) {
		isRight = value;
	}

	public void down(boolean value) {
		isDown = value;
	}

	public void addFire() {
		int posX = ball.posX;
		int posY = ball.posY;
		fireArr.add(new Fire(posX, posY - 20, 5, 20));
	}

	class MyThread extends Thread {
		@Override
		public void run() {
			while (true) {
				for (int i = 0; i < fireArr.size(); i++) {
					Fire fire = fireArr.get(i);
					fire.move();
					if (fire.posY < -100) {
						fireArr.remove(i);
						i--;
					}
				}

				if (isUp) {
					ball.posY -= 5;
				}
				if (isDown) {
					ball.posY += 5;
				}
				if (isLeft) {
					ball.posX -= 5;
				}
				if (isRight) {
					ball.posX += 5;
				}

				// 충돌확인
				for (int i = 0; i < fireArr.size(); i++) {
					Fire fire = fireArr.get(i);
					Rectangle rectA = new Rectangle(fire.posX, fire.posY, fire.width, fire.height);
					Rectangle rectB = new Rectangle(enemy.posX, enemy.posY, enemy.width, enemy.height);

					if (rectA.intersects(rectB)) {
						fireArr.remove(i);
						i--;
						enemy.life--;
						if(enemy.life == 0) {
							enemy.posX = -1000;
						}
					}
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
