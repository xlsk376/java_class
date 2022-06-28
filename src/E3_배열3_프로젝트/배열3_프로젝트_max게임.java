package E3_배열3_프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열3_프로젝트_max게임 {

	public static void main(String[] args) {
		/*
		 * [max게임]
		 * 
		 * 1. 가장 큰 값을 찾아 입력한다.
		 * 2. 정답이면 해당 값을 0으로 변경한다.
		 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
		 * 예)
		 * 11, 87, 42, 100, 24
		 * 입력 : 100
		 * 
		 * 11, 87, 42, 0, 24
		 * 입력 : 87
		 * 
		 * 11, 0, 42, 0, 24
		 * 입력 : 24 ==> 최대값이 아니므로 아무일안생김
		 */
		int[] arr = {11, 87, 42, 100, 24};
		
		Scanner scan = new Scanner(System.in);
		int count = arr.length;
		while(true) {
			System.out.println(Arrays.toString(arr));
			System.out.println("큰값 입력");
			if(count == 0) {// 0으로 다 변환되면 반복문 종료
				break;
			}
			int n = scan.nextInt();
			int max = 0;
			int index = 0;
			for(int i = 0; i <arr.length; i++) { // 가장 큰값 찾기
				if(max < arr[i]) {
					max = arr[i];
				}
				if(n == arr[i]) { // 입력한 값을 인덱스로 변경
					index = i;
				}
			}
			if(arr[index] == max) { // 입력한 값이 큰값인지 확인후에 0으로 만들기
				arr[index] = 0;
				System.out.println();
				count -= 1; // 0으로 변할때마다 -1
			}else {
				System.out.println();
			}
			
		}
		
//		int temp[] = new int[5];
//
//		int count = arr.length;
//		while (true) {
//			System.out.println("--------------------------");
//			System.out.println(Arrays.toString(arr));
//			if (count == 0) {
//				break;
//			}
//			int max = 0;
//			for (int i = 0; i < arr.length; i++) { //가장 큰값 찾기
//				if (max < arr[i]) {
//					max = arr[i];
//				}
//			} 
//			// 가장 큰값이 삭제된 인덱스를 다시 선택 안하게 해야함
//			for(int i = 0; i < arr.length;) { // r이 중복안되게 뽑기
//				int r = ran.nextInt(5);
//				boolean check = false;
//				for(int j = 0; j < i; j++) {
//					if(temp[j] == r) {
//						check = true;
//						break;
//					}
//				}
//				if(check == false) {
//					temp[i] = r;
//					i += 1;
//				}
//			}
//			System.out.println(Arrays.toString(temp));
//			for(int i = 0; i < temp.length; i++) { // 뽑은 r 값을 max와 비교하여 넣기
//				if(arr[temp[i]] == max) {
//					arr[temp[i]] = 0;
//					System.out.println(temp[i] + " " + max + " 정답");
//					count -= 1;
//				}
//				
//			}
//
//			
//		}
		
		
		//한번 골라서 max가 된 자리는 패스함
//		int[] arr = {11, 87, 42, 100, 24};
//		boolean check[] = new boolean[5];
//		int count = arr.length;
//		System.out.println("--------------------------");
//		System.out.println(Arrays.toString(arr));		
//		while(true) {
//			if(count == 0) {				
//				break;
//			}
//			int r = ran.nextInt(arr.length);
//			int max = 0;
//			if(check[r] == true) {
//				r = 0;
//				continue;
//			}
//			for(int i = 0; i < arr.length; i++) {
//				if(max < arr[i]) {
//					max = arr[i];
//				}
//			}			
//			if(arr[r] == max) {
//				check[r] = true;
//				arr[r] = 0;
//				System.out.println(r + " : " + max + " : 정답. ");
//				count -= 1;
//			}else {
//				System.out.println(r + " : " + arr[r] + " : 가장큰값이 아닙니다. ");
//			}		
//			System.out.println(Arrays.toString(arr));
//		}
		

	}

}
