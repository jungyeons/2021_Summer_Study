import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Control {


	public void init() {
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
//		System.out.println(screen.width + "," + screen.height);
		JFrame frame = new JFrame("Äµ¹ö½º");
		frame.setLocation(screen.width / 2 - 500 , screen.height / 2 - 350);
		frame.setSize(1000, 700);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyCanvas can = new MyCanvas();
		can.setLocation(50, 50);
		can.setSize(900, 600);
		can.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("¶¼´Ù:"+e.getKeyCode());
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("´©¸£´Ù:"+e.getKeyCode());
				can.down();
			}
		});
		frame.add(can);
		
		frame.setVisible(true);
	}


}
