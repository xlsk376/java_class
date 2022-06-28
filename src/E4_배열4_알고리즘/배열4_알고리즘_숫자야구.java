package E4_배열4_알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 배열4_알고리즘_숫자야구 {

	public static void main(String[] args) {
		/*
		 * [숫자 야구 게임]
		 * 1. me에 1~9 사이의 숫자 3개를 저장
		 *    (단, 중복되는 숫자는 저장 불가)
		 *    예) 1,1,1 
		 * 2. com과 me를 비교해 정답을 맞출 때까지 반복
		 * 3. 숫자와 자리가 같으면 		strike += 1
		 *    숫자만 같고 자리가 틀리면 	ball += 1
		 * 예)
		 * 정답 : 1 7 3
		 * 3 1 5		: 2b
		 * 1 5 6		: 1s
		 * ...
		 * 
		 */
		Random ran = new Random();
		
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];	
		
		while(true) {
			System.out.println("---------------------------");
			int meindex = 0;
			while(true) {
				if(meindex == 3) {
					break;
				}
				int r = ran.nextInt(9)+1;
				boolean check = false;
				for(int i = 0; i < meindex; i++) {
					if(r == me[i]) {
						check = true;
						break;
					}
				}
				if(check == false) {
					me[meindex] = r;
					meindex += 1;
					System.out.println(Arrays.toString(me));
				}else {
					System.out.println("중복 : " + r);
				}
			}
			System.out.println("----------------------------");
			int s = 0;
			int b = 0;
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(me[i] == com[j]) { //값이 같은지 여부
						if(i == j) { // 인덱스까지 일치시 스트라이크
							s += 1;
						}else {
							b += 1;
						}
					}
				}
			}
			System.out.println(Arrays.toString(com));
			System.out.println(Arrays.toString(me));
			System.out.println(s + " " + b);
			if(s == 3) {
				System.out.println("종료.");
				break;
			}
		}
		

	}

}
