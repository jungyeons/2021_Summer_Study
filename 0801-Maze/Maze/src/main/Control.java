package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Control {
	
	private boolean canMove(int direction, Player p) {
		boolean isMove = false;
		if(direction ==4) {
			if(p.level < 30) {
				System.out.println("레벨 30이상만 가능");
			}else {
				isMove= true;
			}
		}else if (direction == 2) {
			if (p.redKey) {
				isMove= true;
				System.out.println("use red key");
			} else {
				System.out.println("u need red key");
			}
		} else if (direction == 3) {
			if (p.blueKey) {
				isMove = true;
				System.out.println("use blue key");
			} else {
				System.out.println("u need blue key");
			}
		} else if (direction == 1) {
			isMove = true;
		} else {
			System.out.println("못 간다 이눔스키");
		}
		return isMove;
	}
	
	public void start() {
		String input = "";
		Scanner scan = new Scanner(System.in);

		Room[][] map = new Room[5][4];
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				map[i][j] = new Room();
			}
		}

		map[0][0].isRight = 1;
		map[1][0].isLeft = 4;
		map[1][0].isRight = 1;
		map[2][0].isLeft = 1;
		map[2][0].isRight = 1;
		map[2][0].isDown = 1;
		map[3][0].isLeft = 1;
		map[3][0].isRight = 1;
		map[4][0].isLeft = 1;
		map[2][1].isDown = 1;
		map[2][1].isUp = 1;
		map[0][2].isDown = 2;
		map[2][2].isUp = 1;
		map[2][2].isDown = 1;
		map[2][2].isRight = 2;
		map[3][2].isLeft = 1;
		map[0][3].isUp = 2;
		map[0][3].isRight = 1;
		map[1][3].isRight = 1;
		map[1][3].isLeft = 1;
		map[2][3].isUp = 1;
		map[2][3].isRight = 1;
		map[2][3].isLeft = 1;
		map[3][3].isRight = 1;
		map[3][3].isLeft = 1;
		map[4][3].isLeft = 1;
		map[4][3].isUp = 3;

		map[4][0].eventType = 1;
		map[0][2].eventType = 2;
		map[4][2].eventType = -1;
		map[0][0].eventType = 3;
		map[0][0].targetX = 4;
		map[0][0].targetY = 2;
		
		int idx =0;
		ArrayList<Player> playerArr = new ArrayList<Player>();
		for (int i = 0; i < 50; i++) {
			playerArr.add(new Player(2, 2, "개똥이 "+i));
			playerArr.add(new Player(2, 2, "소똥이 "+i));	
		}				
		
		Player p;		

		while (true) {
			p = playerArr.get(idx);
			System.out.println();
			System.out.println(p.name + "뭐할래?");
			System.out.println("현재 위치 [" + p.posX + "][" + p.posY + "]");
			System.out.println("1. 위  2. 아래  3. 왼쪽 4. 오른쪽");
			System.out.println("------------");
			input = scan.nextLine();
			if (input.equals("1")) {
				if(canMove(map[p.posX][p.posY].isUp, p) ) {
					p.up();					
				}
			} else if (input.equals("2")) {
				if( canMove(map[p.posX][p.posY].isDown, p)  ) {
					p.down();
				}
			} else if (input.equals("3")) {
				if(canMove(map[p.posX][p.posY].isLeft, p)) {
					p.left();
				}
			} else if (input.equals("4")) {
				if(canMove(map[p.posX][p.posY].isRight, p)) {
					p.right();
				}		
			} // 이동 후
			System.out.println(p.name+"의 현재 위치 ["+p.posX+"]["+p.posY+"]");
			System.out.println();

			// 이벤트 확인
			if (map[p.posX][p.posY].eventType == 3) {
				int tempX = map[p.posX][p.posY].targetX;
				int tempY = map[p.posX][p.posY].targetY;				
				p.posX = tempX;
				p.posY = tempY;
				System.out.println("비밀통로! ["+p.posX+"]["+p.posY+"]");
			}
			
			if (map[p.posX][p.posY].eventType == 1) {
				p.redKey = true;
				System.out.println("got a Red key");
			}
			if (map[p.posX][p.posY].eventType == 2) {
				p.blueKey = true;
				System.out.println("got a Blue key");
			}
			if (map[p.posX][p.posY].eventType == -1) {
				System.out.println("clear!!");
				break;
			}
			
			idx++;
			if(idx == playerArr.size()) {
				idx = 0;
			}
		}
	}
}
