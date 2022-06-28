package E1_배열1_프로젝트;

import java.util.Random;

public class 배열1_프로젝트_1과7만저장_문제 {

	public static void main(String[] args) {
		/*
		 * [문제] a 배열안에 1 또는 7만 랜덤으로 저장후 출력. 
		 * [예] 1,7,7,1,1,7,7
		 */
		int[] a = new int[7];
		
		Random ran = new Random();
		
//		for(int i = 0; i < 7; i++) {
//			int r = ran.nextInt(2); // 랜덤으로 0,1 둘중에 하나 나오게 하기
//			if(r == 0) {
//				a[i] = 1;
//			}else if(r == 1) {
//				a[i] = 7;
//			}
//		}
//		for(int i = 0; i < 7; i++) {
//			System.out.println(a[i]);
//		}
		
		// 추가문제 1 => 4개 , 7 =>3개 고정
		int c1 = 0;
		int c7 = 0;
		int index = 0; // 인덱스 지정이유는 해당되는 칸에 차면 다음칸에 넣기위해서
		while(true) {
			int r = ran.nextInt(2);
			if(r == 0 && c1 < 4) { //r이 0이면 1이 들어감 , 1이 총 4번 출력
				a[index] = 1; 
				index += 1; // 인덱스 지정이유는 해당되는 칸에 차면 다음칸에 넣기위해서
				c1 += 1;
			}else if(r == 1 && c7 < 3) {
				a[index] = 7;
				index += 1;
				c7 += 1;
			}
			if(c1 == 4 && c7 == 3) {
				break;
			}
		}
		for(int i = 0; i < 7; i++) {
			System.out.println(a[i]);
		}
		
		

	}

}
