package E1_배열1_기본이론;

import java.util.Scanner;

public class E1_배열_기본이론4_학생성적3 {

	public static void main(String[] args) {
		/*
		 * numberList = { 1001, 1002, 1003, 1004, 1005 }; scoreList = { 87, 11, 45, 98,
		 * 23 }; [문제] 학번을 입력받아 성적 출력 [정답] 학번 입력 : 1003 성적 : 45점
		 */
		Scanner scan = new Scanner(System.in);

//		int[] numberList = { 1001, 1002, 1003, 1004, 1005 };
//		int[] scoreList = { 87, 11, 45, 98, 23 };
//		int[] number = new int[5];
//		int[] score = new int[5];
//		System.out.println("학번을 입력하세요 : ");
//		int num = scan.nextInt();
//		int temp = 0;
//		for (int i = 0; i < 5; i++) {
//			if (num == numberList[i]) {
//				System.out.println(numberList[i]);
//				temp = num;
//
//			}
//		}
//
//		// System.out.println("학번 : " + numberList[i] + "성적 : " + scoreList[i]);
		
		int[] numberList = { 1001, 1002, 1003, 1004, 1005 };
		int[] scoreList = { 87, 11, 45, 98, 23 };
		
		System.out.println("학번을 입력하세요 : ");
		int number = scan.nextInt();
		int room = -1;
		for(int i = 0; i < 5; i++) {
			if(number == numberList[i]) {
				room = i;
			}
		}
		System.out.println(scoreList[room]);
		
		
		// ↓ 재구성
//		int[] numberList = { 1001, 1002, 1003, 1004, 1005 };
//		int[] scoreList = { 87, 11, 45, 98, 23 };
//		Scanner scan = new Scanner(System.in);
//		System.out.println("학번 입력 : ");
//		int a = scan.nextInt();
		
//		// 1001(numberList[0])입력 -> 87(scoreList[0])출력
		
//		for(int i = 0; i < 5; i++) { // 각방들과 내가 입력한 인덱스번호와 비교하기
//			if(a == numberList[i]) {
//				System.out.println(scoreList[i]);
//			}
//		}

	}

}
