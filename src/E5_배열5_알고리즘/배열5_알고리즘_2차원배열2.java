package E5_배열5_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 배열5_알고리즘_2차원배열2 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		for(int i = 0; i < 3; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		// 문제1) 인덱스 2개를 입력받아 값 출력
		// 예1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		int id1 = 1;
		int id2 = 2;
		System.out.println(arr[id1][id2]);
		
		// 문제2) 값을 입력받아 인덱스 2개 출력
		// 예2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		int value = 60;
		int id3 = -1; // -1인 이유는 값이 벗어날경우 값이 없다를 출력
		int id4 = -1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(value == arr[i][j]) {
					id3 = i;
					id4 = j;
				}
			}
		}
		if(id3 == -1 || id4 == -1) {
			System.out.println("없다.");
		}else {
			System.out.println(id3 + " " + id4);
		}
		
		// 문제3) 가장 큰 값의 인덱스 2개 출력
		// 정답3) 2 2
		
		int max = arr[0][0];
		int id5 = 0; // 가장큰값은 존재하므로 -1을 안해줌
		int id6 = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(max < arr[i][j]) {
					max = arr[i][j];
					id5 = i;
					id6 = j;
				}
			}
		}	
		System.out.println(id5 + " " + id6);
		
		// 문제4) 값 2개를 입력받아 값 교체
		int value1 = 60;
		int value2 = 80;
		int id7 = 0;
		int id8 = 0;
		int id9 = 0;
		int id10 = 0;
		int temp1 = 0;
		//int temp2 = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(value1 == arr[i][j]) {
					id7 = i;
					id8 = j;
				}
				if(value2 == arr[i][j]) {
					id9 = i;
					id10 = j;
				}
			}
		}
		temp1 = arr[id7][id8];
		arr[id7][id8] = arr[id9][id10];
		arr[id9][id10] = temp1;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		

	}

}
