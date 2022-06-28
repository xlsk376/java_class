package E7_배열7_알고리즘;

import java.util.Arrays;

public class 배열7_알고리즘_숫자9의개수_문제 {

	public static void main(String[] args) {
		/* 
		   mine = {0,9,0},
				  {9,0,9},
				  {0,0,9}
				  
		  	위 mine배열의 숫자 0의 자리에 숫자를 저장할려고한다.
		 	저장할숫자는 주변 8방향을 검사후 9의 개수를 저장후출력.
				
			 예) 아래와 같이 출력  
			   {2,9,2},
			   {9,4,9},
			   {1,3,9}
		
		 */
			int mine[][] = {
					{0,9,0},
					{9,0,9},
					{0,0,9}
			};
			int sy = mine.length;
			int sx = mine[0].length;
			for(int i = 0; i < mine.length; i++) {
				for(int j = 0; j < mine[i].length; j++) {
					if(mine[i][j] == 0) {
						System.out.println(i + " " + j);
						int y = i;
						int x = j;
						System.out.println("------------------");
						int count = 0;
						for(int k = y-1; k <= y + 1; k++) { // 현재값 기준으로 주변검색 y-1 ~ y+1 , x-1 ~ x+1
							for(int h = x -1; h <= x + 1; h++) {
								if(k < 0 || h < 0 || k >= sy || h >= sx ) {
									System.out.print("[   ]");
									continue;
								}
								System.out.print("["+k + " " + h+"]");
								if(mine[k][h]==9) {
									count += 1;
								}
							}
							System.out.println();				
						}
						mine[i][j] = count;
						
					}
				}
			}
			for(int i = 0; i < mine.length; i++) {
				System.out.println(Arrays.toString(mine[i]));
			}

	}

}
