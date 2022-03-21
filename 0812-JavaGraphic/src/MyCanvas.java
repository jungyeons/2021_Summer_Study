import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class MyCanvas extends Canvas {

	Image buffImage;
	Graphics buffg;
	
	public MyCanvas() {
		
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
			buffg.fillRect(0, 0, getWidth()-1, getHeight()-1);
			
			buffg.setColor(Color.red);
//			buffg.drawOval(100, 100, 100, 100);
			buffg.fillOval(posX, 100, 50, 50);
			
			g.drawImage(buffImage, 0, 0, this);
		}
	}
	int posX =100;
	class MyThread extends Thread{
		@Override
		public void run() {
			while(true) {
				posX  += 3;
				repaint();
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
