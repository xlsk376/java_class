package E5_배열5_알고리즘;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열5_알고리즘_시험지나눠주기_문제 {

	public static void main(String[] args) {
		/*
		 * [시험지나눠주기]
		  
		  	아래 2차원배열은 3학년1반의 학생수를 표현한다.
		   	세로 4 가로 5의 총 학생수는 20명이고,
		   	각각의 값들은 각학생별 시험을보기위한 필요한 페이지 수이다. 
		   	학생마다 필요한 페이지수가 다르다. 	
		   	시험지를 나눠줄려고 한다. 인덱스위치 (0,0) 부터 나눠줄려고하는데	
			
		   	나눠주기 편하게하기위해서 지그재그로 나눠줄려고 한다. 		
			첫번째줄은 앞에서 부터 뒤로 이동한다. 3,1,5,4,1 
			두번째줄은 뒤에서 부터 앞으로 이동한다. 8,2,4,6,1
			다시 세번째줄은 앞에서부터 뒤로이동한다. 2,3,5,5,2 
			다시 네번째줄은 뒤에서부터 앞으로 이동한다. 2,1,7,1,6 
			  
			랜덤으로 학생수 1~20을 저장하고 , 각학생별 필요한 페이지수의 합을 출력한다.
			 예) 7 ==> {3 + 1 + 5 + 4 + 1} + {8 + 2}
			 예) 12 ==> {3 + 1 + 5 + 4 + 1} + {8 + 2 + 4 + 6 + 1} + {2 + 3}
		*/
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int darr[][] = {
				{3,1,5,4,1},
				{1,6,4,2,8},
				{2,3,5,5,2},
				{6,1,7,1,2},
		};
		
//		for(int i = 0; i < 4; i++) {
//			System.out.println(Arrays.toString(darr[i]));
//		}
//		int index = 0;
//		int arr[] = new int[20];
//		
//		for(int i = 0; i < 4; i++ ) {
//			if(i % 2 == 0) {
//				for(int j = 0; j < 5; j++) {
//					arr[index] = darr[i][j];
//					index += 1;
//				}
//			}else {
//				for(int j = 4; j >= 0; j--) {
//					arr[index] = darr[i][j];
//					index += 1;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		System.out.print("학생번호를 입력하세요 : ");
//		int num = scan.nextInt(); // 인덱스 번호 입력
//		int total = 0;
//		for(int i = 0; i < 20; i++) { // 20명은 안됨, 인덱스 번호로 해두었기 때문에
//			if(arr[num] == i) { // 인덱스
//				for(int j = 0; j < num; j++) {
//					total += arr[j];
//					System.out.println(total);
//				}
//			}
//		}
//		System.out.println("합 : "+total);
		
		
		//새로 작성 정렬 사용
		int d[] = new int[20];
		int index = 0;
		for(int i = 0; i < 4; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < 5; j++) {
					//System.out.print(darr[i][j]+ " ");
					d[index] = darr[i][j];
					index += 1;
//					if(j % 5 == 4) {
//						System.out.println();
//					}
				}
			}else {
				for(int j = 4; j >= 0; j--) {
					//System.out.print(darr[i][j]+ " ");
					d[index] = darr[i][j];
					index += 1;
//					if(j % 5 == 0) {
//						System.out.println();
//					}
				}
			}
		}
		System.out.println(Arrays.toString(d));
		int r = ran.nextInt(20)+1;
		System.out.println(r);
		int a = 0;
		for(int i = 0; i < r; i++) {
			a += d[i];
			System.out.printf("%d ", d[i]);
		}
		System.out.println();
		System.out.println("합 : "+a);
		
		
		// 순서대로 더해주기
//		int r = ran.nextInt(20)+1;
//		System.out.println("r : " + r);
//		int total = 0;
//		int count = r;
//		int a = count / 10;
//		boolean check = false;
//		for(int i = 0; i < 4; i++) {
//			if(i % 2 == 0) {
//				for(int j = 0; j < 5; j++) {
//					System.out.print(darr[i][j] + " ");
//					total += darr[i][j];
//					count -= 1;
//					if(count == 0) {
//						check = true;
//						break;
//					}
//				}
//			}else {
//				int index = 4;
//				for(int j = 0; j < 5; j++) {
//					System.out.print(darr[i][index] + " ");
//					total += darr[i][index];
//					index -= 1;
//					count -= 1;
//					if(count == 0) {
//						check = true;
//						break;
//					}
//					//System.out.println("count : "+count);
//				}
//			}
//			//System.out.println("count : "+count);
//			if(check == true) {
//				break;
//			}
//		}
//		System.out.println();
//		System.out.println(total);
		
		
		

	}

}
