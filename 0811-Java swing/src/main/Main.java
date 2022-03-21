package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
		System.out.println(screen.width + "," + screen.height);
		JFrame frame = new JFrame("첫번째 Swing");
		frame.setLocation(screen.width / 2 - 500 + 1920, screen.height / 2 - 350);
		frame.setSize(1000, 700);
		frame.setResizable(false);
		frame.setLayout(null);

		Font font = new Font("serif", Font.BOLD, 30);
		JLabel idLb = new JLabel("아이디");
		idLb.setLocation(100, 80);
		idLb.setSize(150, 50);
		idLb.setOpaque(true);
		idLb.setBackground(Color.MAGENTA);
		idLb.setFont(font);
		frame.add(idLb);

		JLabel pwLb = new JLabel("암호");
		pwLb.setLocation(100, 140);
		pwLb.setSize(150, 50);
		pwLb.setOpaque(true);
		pwLb.setBackground(Color.MAGENTA);
		frame.add(pwLb);

		JTextField idTf = new JTextField();
		idTf.setLocation(260, 80);
		idTf.setSize(250, 50);
		frame.add(idTf);

		JTextField pwTf = new JTextField();
		pwTf.setLocation(260, 140);
		pwTf.setSize(250, 50);
		frame.add(pwTf);

		JButton loginBt = new JButton("로그인");
		loginBt.setLocation(520, 80);
		loginBt.setSize(110, 110);
		frame.add(loginBt);

		JFrame listFrame = new JFrame("으라차차차");
		listFrame.setLocation(1920 + 1500, 200);
		listFrame.setSize(400, 550);
		listFrame.setLayout(null);

		DefaultListModel arr = new DefaultListModel();

		arr.addElement("가");
		arr.addElement("나");
		arr.addElement("다");
		arr.addElement("라");

		JList list = new JList(arr);
		list.addListSelectionListener(new ListSelectionListener() {			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				System.out.println(list.getSelectedIndex());
			}
		});
		
		JScrollPane sp = new JScrollPane(list);
		sp.setLocation(10, 5);
		sp.setSize(365, 480);
		listFrame.add(sp);
		listFrame.setVisible(true);

		loginBt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				System.out.println(list.getSelectedIndex());
				
//				arr.clear();                  //전체 제거
//				arr.remove(1);			 //해당 위치 제거				
//				arr.addElement("A");  // 추가
				
//				String str = pwTf.getText();
//				pwTf.setText("");
//				pwLb.setText(str);
			}
		});

		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

}
