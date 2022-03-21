
public class Ball {
	int posX;	
	int posY;
	int speedX;
	int speedY;
	int width;
	int height;
	
	public Ball(int posX, int posY, int speedX, int speedY, int width, int height) {
		this.posX = posX;
		this.posY = posY;
		this.speedX = speedX;
		this.speedY = speedY;
		this.width = width;
		this.height = height;
	}



	public void move(int canWidth, int canHeight) {
		posX += speedX;
		if (posX >= canWidth - width || posX <= 0) {
			speedX *= -1;
		}
		posY += speedY;
		if (posY >= canHeight - height || posY <= 0) {
			speedY *= -1;
		}
	}
	
}
