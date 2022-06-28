package E3_배열3_알고리즘;

import java.util.Arrays;

public class 배열3_알고리즘_왼쪽오른쪽 {

	public static void main(String[] args) {
		/*
		 * [왼쪽오른쪽]
		 * 
		 *   아래 번호를 입력받고 각방향 으로 0 이아닌숫자를 모으시요.
			 1)left 2)right 	
			 예) 1) left ==> arr = {2,3,4,5,0,0,0,0,0};
			 예) 1) right ==> arr = {0,0,0,0,0,2,3,4,5};
		 */
		
		int arr[] = {0,2,0,3,4,0,0,5,0};
		
		int select = 2;
		int index = arr.length - 1; // 뒤에서 부터
		System.out.println(index);
		int index2 = index; // 바꿀 위치 기억
//		if(select == 2) {
//			for(int i = 0; i < arr.length; i++) {
//				if(arr[index] != 0 ) {
//					int temp = arr[index];
//					arr[index] = arr[index2];
//					arr[index2] = temp;
//					index2 -= 1;
//					//System.out.println(Arrays.toString(arr));
//				}
//				index -= 1;
//			}
//		}
		//System.out.println(Arrays.toString(arr));
		select = 1;
		index = 0; // 앞에서 부터 시작
		index2 = index; // 바꿀위치 기억
		System.out.println(Arrays.toString(arr));
		if(select == 1) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[index] != 0) {
					int temp = arr[index];
					arr[index] = arr[index2];
					arr[index2] = temp;
					index2 += 1;
					System.out.println(Arrays.toString(arr));
				}
				index += 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		//왼쪽으로 정렬
//		int arr[] = {0,2,0,3,4,0,0,5,0};	
//		int index = 0;
//		for(int i = 0; i< arr.length; i++) {
//			if(arr[i] != 0) {
//				arr[index] = arr[i];
//				index += 1;
//				arr[i] = 0;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		//오른쪽 정렬
//		int arr[] = {0,2,0,3,4,0,0,5,0};	
//		int index = arr.length-1;
//		for(int i = arr.length-1; i >= 0; i--) {
//			if(arr[i] != 0) {
//				arr[index] = arr[i];
//				index -= 1;
//				arr[i] = 0;
//			}
//		}
//		System.out.println(Arrays.toString(arr));

	}

}
