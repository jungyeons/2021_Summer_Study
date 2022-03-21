import java.util.Scanner;

public class Control {
   public void start() {
	   int posX = 2;
		int posY = 2;
		boolean redKey = false;
		boolean blueKey = false;
      String input = "";
      Scanner scan = new Scanner(System.in);

      Room[][] map = new Room[5][4];
      for (int i = 0; i < map.length; i++) {
         for (int j = 0; j < map[0].length; j++) {
            map[i][j] = new Room();
         }
      }

      map[0][0].isRight = 1;
      map[1][0].isLeft = 1;
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
      Player p = new Player(2,2,"개똥이");
      while (true) {
         System.out.println();
         System.out.println("뭐할래?");
         System.out.println("현재 위치 [" + posX + "][" + posY + "]");
         System.out.println("1. 위  2. 아래  3. 왼쪽 4. 오른쪽");
         System.out.println("------------");
         input = scan.nextLine();
         if (input.equals("1")) {
            if (map[posX][posY].isUp == 2) {
               if (redKey) {
                  posY--;
                  System.out.println("use red key");
               } else {
                  System.out.println("u need red key");
               }
            }else if (map[posX][posY].isUp == 3) {
               if (blueKey) {
                  posY--;
                  System.out.println("use blue key");
               } else {
                  System.out.println("u need blue key");
               }
            } else if (map[posX][posY].isUp == 1) {
               posY--;
            } else {
               System.out.println("못 간다 이눔스키");
            }
         } else if (input.equals("2")) {
            if (map[posX][posY].isDown == 1) {
               posY++;
            } else {
               System.out.println("못 간다 이눔스키");
            }
         } else if (input.equals("3")) {
            if (map[posX][posY].isLeft == 1) {
               posX--;
            } else {
               System.out.println("못 간다 이눔스키");
            }
         } else if (input.equals("4")) {
            if (map[posX][posY].isRight == 2) {
               if (redKey) {
                  posX++;
                  System.out.println("use red key");
               } else {
                  System.out.println("u need red key");
               }
            }else if (map[posX][posY].isRight == 3) {
               if (blueKey) {                  
                  posX++;
                  System.out.println("use blue key");
               } else {
                  System.out.println("u need blue key");
               }
            } else if (map[posX][posY].isRight == 1) {
               posX++;
            } else {
               System.out.println("못 간다 이눔스키");
            }
         } // 이동 후

         // 이벤트 확인
         if (map[posX][posY].eventType == 1) {
            redKey = true;
            System.out.println("got a Red key");
         }
         if (map[posX][posY].eventType == 2) {
            blueKey = true;
            System.out.println("got a Blue key");
         }
         if (map[posX][posY].eventType == -1) {
            System.out.println("clear!!");
            break;
         }
      }
   }
}



