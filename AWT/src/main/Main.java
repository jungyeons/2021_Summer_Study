package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;




public class Main {

	public static void main(String[] args) {
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println(screen.width+","+screen.height);
		Frame frame = new Frame("첫번째 AWT");
		frame.setLocation(screen.width/2-500-1280, screen.height/2-500);
		frame.setSize(1000, 700);
		frame.setResizable(true);
		frame.setLayout(null);
		
		JLabel idLb = new JLabel("아이디");
		idLb.setLocation(100, 80);
		idLb.setSize(150, 50);
		idLb.setOpaque(true);
		idLb.setBackground(Color.PINK);
		frame.add(idLb);
		
		JLabel pwLb = new JLabel("비밀번호");
		pwLb.setLocation(100, 140);
		pwLb.setSize(150, 50);
		pwLb.setOpaque(true);
		pwLb.setBackground(Color.PINK);
		frame.add(pwLb);
		
		JTextField idTf = new JTextField();
		idTf.setLocation(260, 80);
		idTf.setSize(250, 50);
		frame.add(idTf);
		
		JTextField pwTf = new JTextField();
		pwTf.setLocation(260, 140);
		pwTf.setSize(250, 50);
		frame.add(pwTf);
		
		frame.setVisible(true);
		
		JButton loginBt = new JButton("로그인");
		loginBt.setLocation(520, 80);
		loginBt.setSize(110, 110);
		loginBt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = pwTf.getText();
				pwTf.setText("");
				pwLb.setText(str);
			}
		});
		
		
		
		frame.add(loginBt);
		
		JFrame listFrame = new JFrame("성공");
		listFrame.setLocation(1500, 200);
		listFrame.setSize(400,500);
		listFrame.setLocale(null);
		listFrame.setVisible(true);
		
		DefaultListModel arr = new DefaultListModel();
		for(int i=0; i<20; i++) {
			arr.addElement("진");
			arr.addElement("짜");
			arr.addElement("잘");
			arr.addElement("된");
			arr.addElement("다");
		}
		
		 JList list = new JList(arr);
		 list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		 JScrollPane sp = new JScrollPane(list);
		 sp.setLocation(10,5);
		 sp.setSize(365,480);
		 listFrame.add(sp);
		 listFrame.setVisible(true);
		
		
		
		
		frame.addWindowListener(new WindowListener() {
			
			public void windowOpened(WindowEvent e) {

			}
			
			public void windowIconified(WindowEvent e) {
				
			}

			public void windowDeiconified(WindowEvent e) {
				
			}
			
			public void windowDeactivated(WindowEvent e) {
				
			}
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			public void windowClosed(WindowEvent e) {
				
			}
			
			public void windowActivated(WindowEvent e) {
		
				
			}
		});
	}

}
