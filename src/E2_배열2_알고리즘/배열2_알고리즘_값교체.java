package E2_배열2_알고리즘;

import java.util.Scanner;
import java.util.Arrays;
public class 배열2_알고리즘_값교체 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예 1) 인덱스1 입력 : 1  , 인덱스2 입력 : 3
		// {10, 40, 30, 20, 50}

		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예 2) 값1 입력 : 40 , 값2 입력 : 20
		// {10, 20, 30, 40, 50}
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("인덱스1 :");
//		int index1 = scan.nextInt();
//		System.out.println("인덱스2 :");
//		int index2 = scan.nextInt();
//		int temp = 0;
//		for(int i = 0; i < arr.length; i++) {
//			temp = arr[index1]; // 인덱스1번값을 임시저장소에 옴겨넣는다.
//			arr[index1] = arr[index2]; // 변경하려는 인덱스2번값을 인덱스1번에 넣어준다.
//			arr[index2] = temp; // 임시저장소(인덱스1)을 인덱스2번에 넣어준다.
//		}
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		System.out.println("값1 :");
		int value1 = scan.nextInt();
		System.out.println("값2 :");
		int value2 = scan.nextInt();
		int temp = 0;
		int i1 = 0; // 변경하려는 인덱스번호를 따로 저장
		int i2 = 0;
		for(int i = 0; i < arr.length; i++) {
			if(value1 == arr[i]) { // 인덱스번호를 체크해서 저장, 값을 저장하면 for문 나가면 초기화됨
				i1 = i;
			}
			if(value2 == arr[i]) { 
				i2 = i;
			}
		}
		temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
		System.out.println(Arrays.toString(arr));
		
		
		//새로 작성 각각의 인덱스를 확인한후에 교체
//		Scanner scan = new Scanner(System.in);
//		System.out.println("값1");
//		int n1 = scan.nextInt();
//		System.out.println("값2");
//		int n2 = scan.nextInt();
//		int a = 0;
//		int b = 0;
//		int index = 0;
//		int temp = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == n1) {
//				a = i;
//			}
//			if(arr[i] == n2) {
//				b = i;
//			}
//		}
//		temp = arr[a];
//		arr[a] = arr[b];
//		arr[b] = temp;
//		System.out.println(Arrays.toString(arr));

	}

}
