package E4_배열4_알고리즘;

import java.util.Arrays;

public class 배열4_알고리즘_배열비교2 {

	public static void main(String[] args) {
		/*
		 * [배열비교]
		  
		     arr1 배열과 input 배열을 비교한다.
		     서로같은 값이 있는지 체크한다.
		     같은값을 찾으면 arr1의 값이 있는 인덱스를 b에 저장한다.    
			 input 숫자가 arr1 에 없으면 인덱스 대신 -1 저장한다.
				  [예]  input[] ==> { 30, 40, 1, 10, 2 }
				  [예]  arr1[] = {10, 20, 30, 40};
				  
					   1) 30 은 arr1[2] 이므로 2저장 
					   2) 40 은 arr1[3] 이므로 3저장
					   3) 1 은 arr1에 없으므로 -1 저장
					   4) 10 은 arr1[0] 이므로 0 저장
					   5) 2는 arr1에 없으므로 -1  저장 	
					   
			 	  [예] b = { 2, 3, -1, 0, -1}
		 */
//		int input[] = {30, 40, 1, 10, 2};
//		int arr[] = {10, 20, 30, 40};
//		
//		int b[] = {-1, -1, -1, -1, -1};
//		int index = 0;
//		int count = 0;
////		for(int i = 0; i < 5; i++) {
////			System.out.println(b[i]);
////		}
//		for(int i = 0; i < input.length; i++) {
//			for(int j = 0; j < arr.length; j++) {
//				if(input[i] == arr[j]) {
//					index = j;
//					b[i] = j;
//					count += 1;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(b));
//		System.out.println(count);
		
		int arr[] = {10, 20, 30, 40};		
		int input[] = {30, 40, 1, 10, 2};		
		int b[] = {-1, -1, -1, -1, -1};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < input.length; j ++) {
				if(arr[i] == input[j]) { // 있는값들만 모아서 저장하려면 새로운 인덱스에 차곡차곡 쌓임
					b[j] = i;			// 있는값들을 해당되는 인덱스에 저장하기 위해서는 같이 돌림
				}
			}
		}		
		for(int i = 0; i < 5; i++) {
			System.out.println(b[i]);
		}

	}

}
