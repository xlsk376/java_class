package E5_배열5_알고리즘;

import java.util.Arrays;

public class 배열5_알고리즘_2차원배열3 {

	public static void main(String[] args) {
			int[][] arr = {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
			}; 
			
			int[] garo = new int[3];
			int[] sero = new int[4];
			
			for(int i = 0; i < arr.length; i++) {
				System.out.println(Arrays.toString(arr[i]));
			}
			
		// 문제 1) 가로 합 출력
		// 정답 1) 410, 810, 1210
			int index = 0;
			for(int i = 0; i < arr.length; i++) {
				if(i % 3 == 0) {
					for(int j = 0; j < arr[i].length; j++) {
						garo[index] += arr[i][j];
					}
				}if(i % 3 == 1) {
					for(int j = 0; j < arr[i].length; j++) {
						garo[index] += arr[i][j];
					}
				}if(i % 3 == 2) {
					for(int j = 0; j < arr[i].length; j++) {
						garo[index] += arr[i][j];
					}
				}
				index += 1;
				
			}
			System.out.println(Arrays.toString(garo));
		
		// 문제 2) 세로 합 출력
		// 정답 2) 603, 606, 609, 612
			for(int i = 0 ; i < arr.length; i++) {
				for(int j = 0; j <arr[i].length; j++) {
					if(j % 4 == 0) {			
						sero[j] += arr[i][j]; // index가 따로 필요없음
					}
					if(j % 4 == 1) {
						sero[j] += arr[i][j];
					}
					if(j % 4 == 2) {
						sero[j] += arr[i][j];
					}
					if(j % 4 == 3) {
						sero[j] += arr[i][j];
					}
				}
			}
			System.out.println(Arrays.toString(sero));
			
			
			// 새로 작성함
//			for(int i = 0; i < 3; i++) {
////				for(int j = 0; j < 4; j++) {
////					garo[i] += arr[i][j];
////				}
////			}
////			System.out.println(Arrays.toString(garo));
//			int index = 0;
//			for(int i = 0; i < 3; i++) {
//				for(int j = 0; j < 4; j++) {
//					sero[index] += arr[i][index];
//					index += 1;
//					if(j % 4 == 3) {
//						index = 0;
//					}
//				}
//			}
//			System.out.println(Arrays.toString(sero));
			
			
			//새로 작성
			// 문제 1) 가로 합 출력
			// 정답 1) 410, 810, 1210
//				for(int i = 0; i < 3; i++) {
//					for(int j = 0; j < 4; j++) {
//						garo[i] += arr[i][j];
//					}
//				}
//				System.out.println(Arrays.toString(garo));
			
			// 문제 2) 세로 합 출력
			// 정답 2) 603, 606, 609, 612
//				for(int i = 0; i < 3; i++) {
//					for(int j = 0; j < 4; j++) {
//						sero[j] += arr[i][j];
//					}
//				}
//				System.out.println(Arrays.toString(sero));
	}

}
