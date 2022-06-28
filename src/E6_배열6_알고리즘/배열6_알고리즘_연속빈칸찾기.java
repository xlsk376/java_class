package E6_배열6_알고리즘;

import java.util.Arrays;

public class 배열6_알고리즘_연속빈칸찾기 {

	public static void main(String[] args) {
		/*

		 [1] 배열 arr 은 1과 0으로 되어있다.
		 [2] 숫자1 은 이미 채워진 자리이고 0은 비어있는자리이다.
		 [3] input 변수에 값을 입력받고 아래 내용대로 구현 
		  	예) input => 3 ==> 인덱스 2부터 연속으로 3칸이 비어있으므로, 
		 		{0,1,1,1,1,1,0,0};	
		 		
		 	예) input => 4 ==> 연속으로4칸 비어있는자리가 없으므로 "x"
		 		{0,1,0,0,0,1,0,0};
		 		
		 	예) input => 1 ==> 인덱스 0의 자리가 비어있으므로 
		 		{1,1,0,0,0,1,0,0};	
		 */
		
		//내 생각과 선생님의 어드바이스
//		int arr[] = {0,1,0,0,0,1,0,0};			
//		int input = 2;
//		int count = 0;
//		int index = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == 0) {
//				count += 1;
//				if(count == input) {
//					index = i;
//					System.out.println(index);
//					while(true) {
//						arr[index] = 1;
//						index -= 1;
//						count -= 1;
//						if(count == 0) {
//							break;
//						}
//					}
//					break;
//				}
//			}else if(arr[i] == 1) {
//				count = 0;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		int arr[] = {0,1,0,0,0,1,0,0};			
		int input = 1;		
		int count = 0;
		int startIndex = -1;
		boolean check = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				if(count == 0) {
					startIndex = i;
				}
				count += 1;
				if(count == input) {	
					check = true;
					break;
				}
			}else {
				count = 0;
			}
		}
		System.out.println();
		if(check == false) {
			System.out.println("빈칸이없다.");
		}else {
			System.out.println("빈칸이 있다 " + startIndex);
		}
		
		
		
		
		

	}

}
