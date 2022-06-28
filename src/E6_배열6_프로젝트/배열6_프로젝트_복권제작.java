package E6_배열6_프로젝트;

import java.util.Arrays;
import java.util.Random;

public class 배열6_프로젝트_복권제작 {

	public static void main(String[] args) {
		/*
		 * [복권제작]
		 * 1. lottoSet 배열은 5 * 7 사이즈 배열이다. 
		 * 2. 복권1개당 7줄이고 , 총 5개의 복권을 만들려고 한다.  
		 * 3. 복권 1줄의 내용은 1또는 7을 랜덤을 저장한다. 
		 * 4. 복권 1줄은 7이 연속으로 3개이상이면 "당첨" 이고 그 미만은 "꽝" 이다.
		 * 5. 5개 복권중에 1개만 당첨이고 4개는 꽝인 복권을 랜덤으로 생성해보자.
		 * 
		 * 예) 아래와 같이 한줄만 "당첨" 이고 나머지 4개는 "꽝"이다.
		 * 1177117 (꽝)
		 * 1117771 (당첨)
		 * 7171117 (꽝)
		 * 7711771 (꽝)
		 * 7171717 (꽝)
		 * 
		 */
		int[][] lottoSet = new int[5][7];
		Random ran = new Random();
		
		// 4 : 1 을 벗어날 경우도 있음
//		while(true) {
//			int count = 0;
//			int count1 = 0;
//			for(int i = 0; i < lottoSet.length; i++) {
//				int c1 = 0;
//				int c7 = 0;
//				boolean check = false;
//				for(int j = 0; j < lottoSet[i].length; j++) {
//					int r = ran.nextInt(2);
//					if(r == 0 ) {
//						lottoSet[i][j] = 1;
//						c7 = 0;
//					}else{
//						lottoSet[i][j] = 7;
//						c7 += 1;
//					}
//					if(c7 >= 3) {
//						check = true;
//					}
//					System.out.print(lottoSet[i][j] + " ");
//				}
//				if(check == true) {
//					System.out.println("당첨");
//					count += 1;
//				}else {
//					System.out.println("꽝");
//					count1 += 1;
//				}
//			}
//			if(count == 1 && count1 == 4) {
//				break;
//			}
//		}
		
		int winCount = 0;
		for(int i = 0; i < 5; ) {
			
			for(int j = 0; j < lottoSet[i].length; j++) {
				int r = ran.nextInt(2);
				if(r == 0) {
					lottoSet[i][j] = 1;
				}else if(r == 1) {
					lottoSet[i][j] = 7;
				}
			}
			int count = 0;
			boolean check = false;
			for(int j = 0; j < lottoSet[i].length; j++) {
				if(lottoSet[i][j] == 7) {
					count += 1;
					if(count == 3) {
						check = true;
						break;
					}
				}else {
					count = 0;
				}
			}
			if(check == true && winCount == 0) {
				winCount = 1;
				i += 1;
			}else if(check == false && winCount == 1){
				i += 1;
			}			
		}	
		
		for(int i = 0; i < lottoSet.length; i++) {
			System.out.println(Arrays.toString(lottoSet[i]));
		}
		
		//1번에 당첨복권 나머지는 꽝인복권이기때문에 복권끼리 교환해준다.
		int r = ran.nextInt(lottoSet.length);
		
		int[] temp = lottoSet[0];
		lottoSet[0] = lottoSet[r];
		lottoSet[r] = temp;
		System.out.println("------------------");
		for(int i = 0; i < lottoSet.length; i++) {
			System.out.println(Arrays.toString(lottoSet[i]));
		}
		
		
		
		

	}

}
