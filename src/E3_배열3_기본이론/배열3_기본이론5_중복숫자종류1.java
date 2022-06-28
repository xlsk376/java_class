package E3_배열3_기본이론;

import java.util.Arrays;
import java.util.Random;

public class 배열3_기본이론5_중복숫자종류1 {

	public static void main(String[] args) {
		// 중복숫자금지 ==> 1~4를 배열에 저장하는데 섞어서 중복없이 저장한다.
		// 중복숫자 해결방법 3가지
		//
		// [1] 셔플

//		Random ran = new Random();
//		
//		int arr1[] = new int[4]; // 전부 0 저장
//		
//		for(int i = 0; i < 4; i++) { 
//			arr1[i] = i + 1; // 1~4 저장
//		}
//		
//		System.out.println(Arrays.toString(arr1));
//		
//		for(int i = 0; i < 100; i++) {
//			int r1 = ran.nextInt(4);
//			int r2 = ran.nextInt(4);
//			int temp = arr1[r1];
//			arr1[r1] = arr1[r2];
//			arr1[r2] = temp;
//		}
//		System.out.println(Arrays.toString(arr1));

//		// 중복숫자금지 ==> 1~4를 배열에 저장하는데 섞어서 중복없이 저장한다.
//		// 중복숫자 해결방법 3가지
//		//
//		// [2] check 배열활용
//		Random ran = new Random();
//
//		int arr1[] = new int[4]; // 전부 0 저장
//		boolean check[] = new boolean[4];
//
//		for (int i = 0; i < 4;) {
//			int r = ran.nextInt(4);
//			if (check[r] == false) {
//				check[r] = true;
//				arr1[i] = r;
//				i += 1;
//			}
//		}
//		System.out.println(Arrays.toString(arr1));
//		for (int i = 0; i < 4; i++) {
//			arr1[i] += 1;
//		}
//		System.out.println(Arrays.toString(arr1));

		// 중복숫자금지 ==> 1~4를 배열에 저장하는데 섞어서 중복없이 저장한다.
		// 중복숫자 해결방법 3가지
		//
		// [3] 전체 검사
		Random ran = new Random();
		int arr1[] = new int[4]; // 전부 0 저장

		for (int i = 0; i < 4;) {
			int r = ran.nextInt(4) + 1;
			boolean check = false;
			for (int j = 0; j < i; j++) {
				if (arr1[j] == r) { //중복값있는지 확인
					check = true;
					break;
				}
			}
			if (check == false) {
				arr1[i] = r;
				i += 1;
			}
		}
		System.out.println(Arrays.toString(arr1));

	}

}
