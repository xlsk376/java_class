package E5_배열5_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 배열5_알고리즘_다음소수찾기 {

	public static void main(String[] args) {
		/*
		 *  [다음 소수 찾기]
		 * 1. 숫자를 한 개 입력받는다.
		 * 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
		 * 
		 * 예) Enter Number ? 1000
		 *    1000보다 큰 첫번재 소수는 1009
		 * 예) Enter Number ? 500
		 *    500보다 큰 첫번째 소수는 503
		 */
		
		// 소수 입력시 다음 소수나오게 하기
		
		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("Enter Number ? ");
//		int number = scan.nextInt();
//		int count = 0;
//		int combo = 0;
//		int a = 0;
//		while(true) {
//			count = 0;
//			for(int i = 1; i <= number; i++) {
//				if(number % i == 0) {
//					//System.out.println(i);
//					count += 1;
//				}
//			}
//			a = number; // 출력할 숫자
//			number += 1; // 입력한 숫자를 계속 증가
//			if(count == 2) {
//				//System.out.println("소수");
//				combo += 1; // 입력한 숫자가 소수인지 확인 완료면 +1
//			}
//			if(combo == 1 ) { // 입력받은 숫자보다 큰 첫 번째 소수를 확인
//				break;
//			}
//		}
//		System.out.println(a);
		
		
		// 새로 작성, 위에 코딩은 입력한 소수보다 큰 소수 출력
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("Enter Number ? ");
//		int number = scan.nextInt(); 
//		int count = 0;
//		
//		while(true) {
//			count = 0;
//			for(int i = 1; i <= number; i++) {
//				if(number % i == 0) {
//					//System.out.println(i);
//					count += 1;
//				}
//			}
//			if(count == 2) {
//				//System.out.println("소수");
//				System.out.println(number);
//				break;
//			}else if(count > 2){
//				//System.out.println("아님");
//				number += 1;
//			}
//		}
		
		// 소수 입력시 다음 소수나오게 하기
		System.out.print("Enter Number ? ");
		int n = scan.nextInt();
		int a = n;
		while(true) {
			int count = 0;
			a += 1;
			for(int i = 1; i <= a; i++) {
				if(a % i == 0) {
					count += 1;
				}
			}
			if(count == 2) {
				System.out.println(a);
				break;
			}
		}
		
		
 		
			
			
		
		
		
		

	}

}
