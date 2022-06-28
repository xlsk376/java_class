package E3_배열3_프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열3_프로젝트_미니마블 {

	public static void main(String[] args) {
		/*
		 [미니마블]
		 
		 * 1. 플레이어는 [p1]과 [p2] 2명이다. 한번씩 번갈아 가면서 행동한다. 
		 * 2. [1.주사위][2.패스] 를 선택할수있다. 주사위는 (1~4)의 랜덤값을 가진다. 
		 * 3. 주사위숫자만큼 현재위치에서 앞으로 이동한다. 
		 * 4. 이동한자리가 다른 플레이어와 같은 위치에 놓이게 되면,
		 *    상대 플레이어는 잡히게 되어 맨앞(인덱스 0) 으로 강제 이동된다.
		 * 5. 상대를 잡은 위치가 맨앞(인덱스 0)의 위치에 있을때는 안전지대이다.(잡히지않는다.)
		 * 6. 이동거리가 배열의 마지막위치를 초과하면,
		 *    맨앞(인덱스 0)으로 이동하고 초과한숫자만큼 추가이동한다.
		 * 7. 먼저 3바퀴를 돌면 이긴다.
		 * 
		 *  
		 *  [p1] 주사위 : 1
		 *  1 0 0 0 0 0 0 0 0 0
		 *  2 0 0 0 0 0 0 0 0 0
		 *  
		 *  [p2] 주사위 : 3
		 *  0 1 0 0 0 0 0 0 0 0
		 *  0 0 0 2 0 0 0 0 0 0
		 *  
		 *  [p1] 주사위 : 2
		 *  [p1]이 [p2]를 잡았다!
		 *  0 0 0 0 1 0 0 0 0 0
		 *  2 0 0 0 0 0 0 0 0 0 
		 */
		Scanner scan = new Scanner(System.in);
		
		int[] map1   = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] map2   = {2, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int p1 = 0;
		int p2 = 0;
		int p1Count = 0;
		int p2Count = 0;
		int turn = 1;
		while(true) {
			System.out.println("p1 : " + p1Count + "바퀴");
			System.out.println("p2 : " + p2Count + "바퀴");
			System.out.println(Arrays.toString(map1));
			System.out.println(Arrays.toString(map2));
			
			if(p1Count == 3 || p2Count == 3) {
				if(p1Count == 3) {
					System.out.println("p1 승리");
				}else {
					System.out.println("p2 승리");
				}
				break;
			}
			System.out.println("[1]주사위 [2]패스");
			if(turn % 2 == 1) {
				int n = scan.nextInt();
				if(n == 1) {
					n = scan.nextInt();
					map1[p1] = 0; // 자기위치를 '0'으로 변경
					p1 += n;
					if(p1 >= map1.length) { // map 이동거리를 초과할 경우
						p1 -= map1.length; // 처음으로 이동
						p1Count += 1; // 바퀴 체크
					}
					map1[p1] = 1; // 이동한 자리를 '1' 로 변경
					System.out.println(n + "만큼 이동합니다.");
				}else {
					System.out.println("패스합니다.");
				}
				turn += 1;
			}else {
				int n = scan.nextInt();
				if(n == 1) {
					n = scan.nextInt();
					map2[p2] = 0;
					p2 += n;
					if(p2 >= map2.length) {
						p2 -= map2.length;
						p2Count += 1;
					}
					map2[p2] = 2;
					System.out.println(n + "만큼 이동합니다.");
				}else {
					System.out.println("패스합니다.");
				}
				turn += 1;
			}
			if(p1 == p2 && p1 != 0 && p2 != 0) {
				if(turn % 2 == 1) {
					System.out.println("p1 잡힘");
					map1[p1] = 0;
					p1 = 0;
					map1[p1] = 1;
					
				}else {
					System.out.println("p2 잡힘");
					map2[p2] = 0;
					p2 = 0;
					map2[p2] = 2;
				}
			}
			
		}

	}

}
