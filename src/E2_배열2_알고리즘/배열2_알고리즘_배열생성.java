package E2_배열2_알고리즘;

import java.util.Arrays;

public class 배열2_알고리즘_배열생성 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 *    [4의 배수만 저장]
		 * - 	[조건1] arr 배열에서 4의 배수만 골라 temp 배열에 저장
		 * - 단! temp 의 길이를 4의 배수의 개수 만큼만 설정한다.
		 * - 예) 4의배수 개수는 3개이므로 temp = new int[3];  
		 */
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null; // 0값, 아무것도 없음 nothing
		int room = 0;
		int count = 0;
		//int a[] = new int[3];
		for(int i = 0; i <arr.length; i++) {
			if(arr[i]%4 == 0) {
				count += 1;
				temp = new int[count];
				temp[room]= arr[i];
				//a[room] = temp[room];
				System.out.println(temp[room]);
				room += 1;
			}
		}
		System.out.println(Arrays.toString(temp)); // 배열은 저장되지만 값은 마지막값만 저장되어 출력된다.
		//System.out.println(Arrays.toString(a));
		
		// ---------------------------------------------------------------------------
		
		//새로 작성 4의 배수의 개수로 배열을 설정한뒤 4의 배수를 설정된 배열에 담는다
//		int[] arr = {44, 11, 29, 24, 76};
//		int[] temp = null;
//		int count = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] % 4 == 0) {
//				System.out.println(arr[i]);
//				count += 1;
//			}
//		}
//		temp = new int[count];
//		int index = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] % 4 == 0) {
//				temp[index] = arr[i];
//				index += 1;
//			}
//		}
//		System.out.println(Arrays.toString(temp));

	}

}
