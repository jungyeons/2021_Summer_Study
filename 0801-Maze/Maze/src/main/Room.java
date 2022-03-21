package main;

public class Room {
	int isUp;  // 0 없음 1 일반 2 빨간 3 파란  4 노란(렙 30이상 통과)
	int isDown;
	int isLeft;
	int isRight;
	
	int targetX;
	int targetY;
	
	//-1 F, 0 없음,  1 A, 2 B, 3 순간이동
	int eventType;   
}