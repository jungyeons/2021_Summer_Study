package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
		/**
		 * 무엇을 하시겠습니까? 1. 단어 추가 2. 단어 삭제 3. 단어 수정 4. 종료 5. 스크램블 6. 행맨
		 */
		JFrame frame = new JFrame("단어장");
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(screen.width / 2 - 500 + 1920, screen.height / 2 - 350);
		frame.setSize(1000, 700);
		frame.setResizable(false);
		frame.setLayout(null);
		Font font = new Font("serif", Font.BOLD, 30);
		JLabel idLb = new JLabel("영어");
		idLb.setLocation(100, 80);
		idLb.setSize(150, 50);
		idLb.setOpaque(true);
		idLb.setBackground(Color.PINK);
		idLb.setFont(font);
		frame.add(idLb);

		JLabel pwLb = new JLabel("한글");
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

		JButton loginBt = new JButton("정답");
		loginBt.setLocation(520, 80);
		loginBt.setSize(110, 110);
		frame.add(loginBt);
		
		JFrame listFrame = new JFrame("단어장");
		listFrame.setLocation(1920 + 1500, 200);
		listFrame.setSize(400, 550);
		listFrame.setLayout(null);

		DefaultListModel arr = new DefaultListModel();

		arr.addElement("Cat 고양이");
		arr.addElement("Dog 강아지");
		arr.addElement("Tree 나무");
		arr.addElement("Apple 사과");

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
		
		
		
		Scanner scan = new Scanner(System.in);
		String input = "";
		Random rd = new Random();
		ArrayList<String> engArr = new ArrayList<String>();
		ArrayList<String> korArr = new ArrayList<String>();
		while (true) {
			System.out.println("총" + engArr.size() + "개");
			for (int i = 0; i < engArr.size(); i++) {
				System.out.println((i + 1) + ":" + engArr.get(i) + ":" + korArr.get(i));
			}
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1. 단어 추가 2. 단어 삭제 3. 단어 수정 4. 종료 5. 스크램블 게임");

			input = scan.nextLine();

			if (input.equals("1")) {
				// 단어 입력 받기
				System.out.println("영어를 입력해주세요.");
				input = scan.nextLine();
				engArr.add(input);
				System.out.println("한국어를 입력해주세요.");
				input = scan.nextLine();
				korArr.add(input);

			}
			if (input.equals("2")) {
				// 단어 입력 받기
				System.out.println("몇 번을 삭제하겠습니까?");
				input = scan.nextLine();
				int temp = Integer.parseInt(input) - 1;
				engArr.remove(temp);
				korArr.remove(temp);
				System.out.println("한국어를 입력해주세요.");
				input = scan.nextLine();
				korArr.add(input);

			}
			if (input.equals("3")) {
				// 단어 입력 받기
				System.out.println("몇 번을 수정하겠습니까?");
				input = scan.nextLine();
				int temp = Integer.parseInt(input) - 1;
				System.out.println("영어를 입력해주세요.");
				input = scan.nextLine();
				engArr.set(temp, input);
				System.out.println("한국어를 입력해주세요.");
				input = scan.nextLine();
				korArr.set(temp, input);

			}
			if (input.equals("4")) {
				System.out.println("프로그램을 종료 합니다");
				break;
			}
			if (input.equals("5")) {
				System.out.println("스크램블 게임을 시작합니다");
				int ranNum = rd.nextInt(engArr.size());
				String answer = engArr.get(ranNum);
				ArrayList<String> temp = new ArrayList<String>();
				for (int i = 0; i < answer.length(); i++) {
					temp.add(answer.substring(i, i + 1));
				}
				String quiz = "";
				while (temp.size() > 0) {
					ranNum = rd.nextInt(temp.size());
					quiz = quiz + temp.get(ranNum);
					temp.remove(ranNum);

				}
				System.out.println(quiz);
			}

		}

	}

}
