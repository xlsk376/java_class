package E1_배열1_기본이론;

import java.util.Scanner;

public class E1_배열_기본이론4_학생성적5 {

	public static void main(String[] args) {
		/* numberList = {1001, 1002, 1003, 1004, 1005};
		 *	scoreList  = {  87,   11,   45,   98,   23};
		 * 
		 *  [문제] 학번을 입력받아 성적 출력한다. 
			 		단, 없는학번 입력 시 예외처리 하시오.
			 예)
			 학번 입력 : 1002		성적 : 11점
			 학번 입력 : 1000		해당학번은 존재하지 않습니다. 
		 */
//		int[] numberList = {1001, 1002, 1003, 1004, 1005};
//		int[] scoreList  = {  87,   11,   45,   98,   23};
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("학번 입력 : ");
//		int num = scan.nextInt();
//		int room = -1;
//		for(int i = 0; i < 5; i++) {
//			if(num == numberList[i]) {
//				room = i;
//			}
//		}
//		if(room == -1) { // room 을 찾지 못하면 -1 그대로 출력
//			System.out.println("해당학번은 존재하지 않습니다.");
//		}else {
//			System.out.println(numberList[room]);
//			System.out.println(scoreList[room]);
//		}
		
		int[] numberList = {1001, 1002, 1003, 1004, 1005};
		int[] scoreList  = {  87,   11,   45,   98,   23};
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("학번 입력 : ([종료] : -1000)");
			int number = scan.nextInt();
			if(number == -1000) {
				System.out.println("종료");
				break;
			}else {
				int room = -1; // 지정안하면 밑에 조건을 다시 작성해야함, 0을 넣으면 room값이 그대로 출력
				for(int i = 0; i < 5; i++) {
					if(number == numberList[i]) {
						room = i;
					}
				}
				if(room == -1) { // room 을 찾지 못하면 -1 그대로 출력된다.
					System.out.println("해당학번은 존재하지 않습니다.");
				}else {
					System.out.println(numberList[room]);
					System.out.println(scoreList[room]);
				}
			}			
		}	
		// ctrl + f11 ==> 테스트모드
		// f11 ==> 실행모드 (에러내용 을 알려주지않고 debug 로바뀐다.)
		
		
		
		

	}

}
