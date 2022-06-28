package E2_배열2_프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열2_프로젝트_즉석복권 {

	public static void main(String[] args) {
		/*
		 *  즉석복권문제) 사이즈가 7인 배열이 있다. 
		 *   - [1. 복권 결과확인] 입력시 "당첨" 또는 "꽝" 출력 
		 *   - 1 또는 7을  랜덤으로 배열에 저장한다.   [예] 1,7,7,1,1,1,7
		 *   - 7이연속으로 3개이상이면 "당첨" 아니면 "꽝" 이다.
		 *   - 당첨이되면 3000원 획득한다.
		 *   - 꽝이되면 1000원 감소한다.
		 *   
		 *   [조건] 반드시 7은 3개이상 있어야한다. 
		 */
//		Random ran = new Random();
//		Scanner scan = new Scanner(System.in);
//		int[] lotto = new int[7];
//		int money = 1000;
//		while(true) {
//			int c7 = 0;
//			for(int i = 0; i < 7; i++) {
//				int r = ran.nextInt(2);
//				if(r == 0) {
//					lotto[i] = 1; // 
//				}else if(r == 1) {
//					lotto[i] = 7; // 7이 3개이상인 조건
//					c7 += 1;
//				}
//			}
//	//		System.out.println(Arrays.toString(lotto));
//			if(c7 >= 3) { //7이 3개이상나오면 탈출
//				break;
//			}								
//		}
//		
//		int c7 = 0;
//		boolean win = false;
//		for(int i = 0;  i < 7; i++) {
//			if(lotto[i] == 7) { // 연속으로 7이 맞는지 확인
//				c7 += 1;
//				if(c7 >= 3) {
//					win = true;
//					break;
//				}
//			}else {
//				c7 = 0;
//			}
//		}
//		System.out.println(Arrays.toString(lotto));
//		System.out.println(win);		
		
		/*
		 *  즉석복권문제) 사이즈가 7인 배열이 있다. 
		 *   - [1. 복권 결과확인] 입력시 "당첨" 또는 "꽝" 출력 
		 *   - 1 또는 7을  랜덤으로 배열에 저장한다.   [예] 1,7,7,1,1,1,7
		 *   - 7이연속으로 3개이상이면 "당첨" 아니면 "꽝" 이다.
		 *   - 당첨이되면 3000원 획득한다.
		 *   - 꽝이되면 1000원 감소한다.
		 *   
		 *   [조건] 반드시 7은 3개이상 있어야한다. 
		 */

			Scanner scan = new Scanner(System.in);
			Random ran = new Random();
			int[] lotto = new int[7];
			int money = 1000;
			
			boolean run = true;
			while(run) {
				System.out.println("[잔액 : " + money + "원]");
				System.out.println("[1. 복권 결과확인]");
				System.out.println("[2. 돈충전]");
				System.out.println("[0. 종료]");
				int sel = scan.nextInt();

				if (sel == 1) {
					while(true) {
						int c7 = 0;
						for(int i = 0; i < 7; i++) {
							int r = ran.nextInt(2);
							if(r == 0) {
								lotto[i] = 1;
							}else if(r == 1) {
								lotto[i] = 7;
								c7 += 1;
							}
						}
				//		System.out.println(Arrays.toString(lotto));
						if(c7 >= 3) {
							break;
						}								
					}
					
					int c7 = 0;
					boolean win = false;
					for(int i = 0;  i < 7; i++) {
						if(lotto[i] == 7) {
							c7 += 1;
							if(c7 >= 3) {
								win = true;
								break;
							}
						}else {
							c7 = 0;
						}
					}
					System.out.println(Arrays.toString(lotto));
					System.out.println(win);				
				}
				else if(sel == 2) {
					
				}
				else if(sel == 0){
					break;
				}

			}
	

	}

}
