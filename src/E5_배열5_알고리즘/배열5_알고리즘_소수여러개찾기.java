package E5_배열5_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 배열5_알고리즘_소수여러개찾기 {

	public static void main(String[] args) {
		/*
		 * [소수여러개찾기]
		 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
		 * 예)
		 * 입력 : 20
		 * 2, 3, 5, 7, 11, 13, 17, 19
		 */
		//에라토스테네스의 체 // 코스1급 단골시험문제
		//소수의 배수는 소수가 아니다.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		int arr[] = new int[1000];
		int index = 0;
//		for(int i = 2; i <= num; i++) { // 범위
//			int count = 0;
//			for(int j = 1; j <= i; j++) { // 소수찾기
//				if(i % j == 0) {
//					count += 1;
//				}
//			}
//			if(count == 2) { // 나머지가 2개인 수 찾기
//				System.out.println(i);
//			}
//		}
//		System.out.println();
		
		for(int i = 2; i <= num; i++) { // 배열생성하여 초기화
			arr[i] = i;
		}
		System.out.println(Arrays.toString(arr));
		for(int i = 2; i <= num; i++) { // 2부터 시작해서 특정 수의 배수에 해당하는 수를 모두 지운다.
			if(arr[i]==0) {				// 지울때 자기자신은 지우지 않고, 이미 지워진 수는 건너뛴다.
				continue; // 이미 지워진 수라면 건너뛰기
			}
			//이미 지워진 숫자가 아니라면, 그 배수부터 출발하여, 가능한 모든 숫자 지우기
			for(int j = 2*i; j <= num; j+=i) { // 2의 배수면 +2, 3의 배수
				arr[j] = 0;
			}
		}
		// 2부터 시작하여 남아있는 수를 모두 출력한다.
		for(int i = 2; i <= num; i++) {
			if(arr[i] != 0) {
				arr[i] = i;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
