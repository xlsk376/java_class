package E3_배열3_알고리즘;

import java.util.Arrays;

public class 배열3_알고리즘_예매찾기2 {

	public static void main(String[] args) {
		/*
		 * 1) seatList 는 영화관 7자리를 나타낸다. 
		 * 2) seatList 의 값들은 영화관 예매한 회원번호를 나타낸다. 
		 * 3) numList 는 회원번호이다. 
		 * 4) countList 는 각회원들이 예매를 얼마나 했는지 개수를 표현한다. 
		 * 5) seatList 를 검사해서 각 회원들이 예매한 수를 countList에저장한다.
		 * 
		 * 예) int countList[] = {1,1,2,0};
		 */
		int seatList[] = { 1003, 1003, 0, 0, 1002, 0, 1001 };

		int numList[] = { 1001, 1002, 1003, 1004 };
		int countList[] = { 0, 0, 0, 0 };
		
		int count = 0;
		for(int i = 0; i < seatList.length; i++) {
			// 굳이 0일때는 numList를 검사할 필요없다.
			if(seatList[i] == 0) {
				continue; // 체크횟수를 줄일수 있다
			}
			for(int j = 0; j < numList.length; j++) {
				count += 1;
				if(seatList[i] == numList[j]) { // 회원번호는 고정이므로 체크후 반복문을 빠져나옴
					countList[j] += 1;
					break; //반복횟수를 줄일수 있다.
				}
			}
		}
		System.out.println(count); // 9번 체크
		System.out.println(Arrays.toString(countList));
		
		
		//복습후 코딩
//		int seatList[] = {1003,1003,0,0,1002,0,1001};
//		
//		int numList[] = {1001,1002,1003,1004};
//		int countList[] = {0,0,0,0};
//		for(int i = 0; i < numList.length; i++) {
//			int count = 0;
//			for(int j = 0; j < seatList.length; j++) {
//				if(numList[i] == seatList[j]) {
//					count += 1;
//				}
//			}
//			countList[i] = count;
//		}
//		System.out.println(Arrays.toString(countList));
		

	}

}
