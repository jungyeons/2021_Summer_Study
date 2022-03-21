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
		frame.setLocation(screen.width / 2 - 500, screen.height / 2 - 350);
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
				if(e.getKeyCode() == 37) {
					can.left(false);
				}else if(e.getKeyCode() ==38) {
					can.up(false);
				}else if(e.getKeyCode() ==39) {
					can.right(false);
				}else if(e.getKeyCode() ==40) {
					can.down(false);
				}				
			}			
			@Override
			public void keyPressed(KeyEvent e) {		
				if(e.getKeyCode() == 32) {
					can.addFire();
				}else if(e.getKeyCode() == 37) {
					can.left(true);
				}else if(e.getKeyCode() ==38) {
					can.up(true);
				}else if(e.getKeyCode() ==39) {
					can.right(true);
				}else if(e.getKeyCode() ==40) {
					can.down(true);
				}				
			}
		});
		frame.add(can);
		
		frame.setVisible(true);
	}


}
