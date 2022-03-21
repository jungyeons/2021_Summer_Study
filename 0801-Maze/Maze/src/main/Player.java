package main;

public class Player {
	int posX;
	int posY;
	String name;
	int level;
	int  moveType;
	boolean redKey = false;
	boolean blueKey = false;
	
	public Player(int posX, int posY, String name) {		
		this.posX = posX;
		this.posY = posY;
		this.name = name;
	}
	public void right() {
		if(moveType ==0) {
			posX++;
		}else if(moveType ==1) {
			posX += 2;
		}else if(moveType ==2) {
			posX++;
			posY++;
		}
	}
	public void left() {
		posX--;
	}
	
	public void down() {
		posY++;
	}
	
	public void up() {
		posY--;
	}
	
}
