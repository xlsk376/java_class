package E1_배열1_알고리즘;

import java.util.Scanner;

public class 배열1_알고리즘_검색_문제 {

	public static void main(String[] args) {
		/*
		 *  array = {1001, 20, 1002, 45, 1003, 54};
		 *  
		 *  학번과 점수가 한쌍이다. ==>  1001:20 , 1002:45 , 1003:54
		 *  (array[0], array[1]), (array[2], array[3]),(array[4], array[5])
		 *  [문제] 학번을 입력하면 점수 출력한다.
		 *  [예] 1001==>20 , 1003 ==> 54
		 *  
		 *  [문제] 점수를 입력하면 학번 출력한다. 
		 *  [예] 20 ==> 1001 , 45 ==> 1002
		 */
		// ↓내가 작성
//		int array[] = {1001, 20, 1002, 45, 1003, 54};
//		Scanner scan = new Scanner(System.in);
//		System.out.println("학번 입력 : ");
//		int num = scan.nextInt();
//		int a = 0;
//		int b = 0;
//		for(int i = 0; i < 6; i++) {
//			if(num == array[i]) {
//				i += 1; // 방에 더할수도 있음
//				System.out.println(array[i]); // 지금은 5번에 조건이 적어서 에러가 없지만 최종적으로 출력되는 자리에 배치해야 올바른값나옴
//			}
//		}
		
		int array[] = {1001, 20, 1002, 45, 1003, 54};
		
		int num = 1003;
		int score = 0;
		for(int i = 0; i < 6; i++) { 
			if(num == array[i]) { // 학번 입력시 점수 출력
				score = array[i + 1]; // 다음방이므로 방번호에 +1을 해준뒤 출력
			}
		}
		System.out.println(score );
		score = 45;
		
		for(int i = 0; i < 6; i++) {
			if(score == array[i]) { //점수 입력시 학번 출력
				num = array[i - 1]; //전방이므로 방번호에 -1을 해준뒤 출력
			}
		}
		System.out.println(num);
		
			

	}

}
