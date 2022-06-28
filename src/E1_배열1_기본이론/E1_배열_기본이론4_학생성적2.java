package E1_배열1_기본이론;

import java.util.Scanner;

public class E1_배열_기본이론4_학생성적2 {

	public static void main(String[] args) {
		/*
		 * 	 array = { 87, 11, 45, 98, 23 };
		  
			 [문제1] 인덱스를 입력받아 성적 출력
			 [정답1] 인덱스 입력 : 1 성적 : 11점
		
			 [문제2] 성적을 입력받아 인덱스 출력
			 [정답2] 성적 입력 : 11 인덱스 : 1
		 */
		Scanner scan = new Scanner(System.in);
		
		int[] array = {87,11,45,98,23};
//		System.out.println("인덱스를 입력하세요 : ");
//		int num = scan.nextInt();
//		if(num == 1) { // num을 배열인덱스로 넣으면 손쉽게 구할수 있음 array[num]
//			System.out.println(array[0]);
//		}else if(num == 2) {
//			System.out.println(array[1]);
//		}else if(num == 3) {
//			System.out.println(array[2]);
//		}else if(num == 4) {
//			System.out.println(array[3]);
//		}else if(num == 5) {
//			System.out.println(array[4]);
//		}
//		System.out.println("-------------------------------");
//		System.out.println("성적을 입력하세요 : ");
//		int num = scan.nextInt();
//		if(num == 87) {
//			System.out.println(1);
//		}else if(num == 11) {
//			System.out.println(2);
//		}else if(num == 45) {
//			System.out.println(3);
//		}else if(num == 98) {
//			System.out.println(4);
//		}else if(num == 23) {
//			System.out.println(5);
//		}
		System.out.println("인덱스 입력 : ");
		int index = scan.nextInt();
		
		System.out.println(array[index]); //방번호를 모르고 값만 알때
		
		System.out.println("성적을 입력 : ");
		int score = scan.nextInt();  //예) 11 -> array[1]
		int room = 0; // 잘못입력하였을때 출력되는 값
		for(int i = 0; i < 5; i++) {
			if(array[i] == score) { //입력받은 점수를 방번호와 비교하여 찾기
				room = i;
			}
		}
		System.out.println(room);
		
		
		
		
		

	}

}
