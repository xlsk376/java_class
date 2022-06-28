package E7_배열7_알고리즘;

import java.util.Arrays;

public class 배열7_알고리즘_여행 {

	public static void main(String[] args) {
		/*
		 철수는 여행을떠났다. 
		 8은 철수이고 7은 벽이고 0은 이동가능한곳이다.
		 dir 은 철수가 바라보는 방향이고 0~3까지 북동남서 의 방향을 표현한다. 	
		 input의 데이터는 1은 한칸전진이고 2는 좌회전(90도) 3은 우회전(90도)이다.
		  회전은 방향만 바뀌고 움직이는건 없다.
		 input을 전부 입력받고 해당내용을 전부 출력하시요.
		*/
		int map[][] = {
				{0,0,0,0,0,0,0},	
				{0,7,7,7,7,0,0},	
				{0,7,0,0,7,0,0},	
				{0,7,0,8,7,0,0},	
				{0,0,0,0,7,0,0},	
				{0,0,0,0,7,7,0},	
				{0,0,0,0,0,0,0}
		};		
		int dir = 0;		
		int input[] = {1,1,2,1,1,2,1,1,3,1,1};
		int y = 3;
		int x = 3;
		
		for(int i = 0; i < map.length; i++) {
			System.out.println(Arrays.toString(map[i]));
		}
		System.out.println();
		for (int k = 0; k < input.length; k++) {
			// System.out.println(y + " " + x);
			if (input[k] == 1) {
				if (dir == 0 && map[y-1][x] == 0 && y > 0 && y < map.length) {
					map[y][x] = 0;
					y -= 1;
					map[y][x] = 8;
				} else if (dir == 1 && map[y][x+1] == 0 && x > 0 && x < map.length) {
					map[y][x] = 0;
					x += 1;
					map[y][x] = 8;
				} else if (dir == 2 && map[y+1][x] == 0 && y > 0 && y < map.length) {
					map[y][x] = 0;
					y += 1;
					map[y][x] = 8;
				} else if (dir == 3 && map[y][x-1] == 0 && x > 0 && x < map.length) {
					map[y][x] = 0;
					x -= 1;
					map[y][x] = 8;
				}
				System.out.println(y + " " + x);
			} else if (input[k] == 2) { // 좌회전 / 0:북 , 1:동 , 2:남 , 3:서
				if (dir == 0) {
					dir = 3;
				} else if (dir == 1) {
					dir = 0;
				} else if (dir == 2) {
					dir = 1;
				} else if (dir == 3) {
					dir = 2;
				}
			} else if (input[k] == 3) {// 우회전
				if (dir == 0) {
					dir = 1;
				} else if (dir == 1) {
					dir = 2;
				} else if (dir == 2) {
					dir = 3;
				} else if (dir == 3) {
					dir = 0;
				}
			}
			for(int i = 0; i < map.length; i++) {
				System.out.println(Arrays.toString(map[i]));
			}
			System.out.println();
		}
		

	}
}
