package E4_배열4_알고리즘;

import java.util.Arrays;

public class 배열4_알고리즘_중복제거_문제 {

	public static void main(String[] args) {
		/*
		 *  [문제] arr1 배열 안의 값들중에서 b배열의 값이 있으면 
			      b와 arr1의 각각 겹치는값을  0으로 변경	
			[조건] 겹치는 값이 여러개 있으면 전부 0으로 변경 	
			 예) arr1[] = {0,0,30,40,0};
			 예) b[] = {0,3,0,0,0,50};
		 */
		int arr1[] = {10,20,30,40,20};
		int b[] = {10,3,20,10,20,50};
		
		for(int i = 0; i < arr1.length; i++) {
			int value = arr1[i]; // arr1의 배열값을 value에 저장, value를 저장해두고 비교
			for(int j = 0; j < b.length; j++) {
				if(value == b[j]) { // value에 저장된 값을 b의 배열값과 같은값을 찾기
					b[j] = 0; 
					for(int k = i; k < arr1.length; k++) { 
						if(value == arr1[k]) { // value에 저장된 값을 arr1의 배열값과 같은값을 찾기
							arr1[k] = 0;
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(b));

	}

}
