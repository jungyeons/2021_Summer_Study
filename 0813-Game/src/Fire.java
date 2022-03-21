
public class Fire {
	int posX;	
	int posY;
	int width;
	int height;
	public Fire(int posX, int posY, int width, int height) {		
		this.posX = posX;
		this.posY = posY;
		this.width = width;
		this.height = height;
	}
	
	public void move() {
		posY -=10;
	}
	
}
