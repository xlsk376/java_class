package E2_배열2_알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 배열2_알고리즘_셔플 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60};
		
		//셔플 	
		// 1) 인덱스 2개를 랜덤(0~5)으로 저장하고 각 인덱스의 값을 교환
		// 2) 위 1번을 10 번 반복하며 과정  출력 
		
		//예) 1 , 2 ==> {10,30,20,40,50,60};  // 20 과 30이 교환됨.
		
		//예) 4 , 1 ==> {10,50,20,40,30,60};  // 50 과 30이 교환됨.
		
		//예) 3 , 3 ==> {10,50,20,40,30,60}; // 같을땐 아무일도안생긴다.
		
		Random ran = new Random();
//		int temp = 0;
//		for(int i = 0; i < 10; i++) {
//			int n1 = ran.nextInt(6);
//			int n2 = ran.nextInt(6);
//			if(n1 == n2) {
//				System.out.println("같음"+Arrays.toString(arr));
//			}else {
//				temp = arr[n1];
//				arr[n1] = arr[n2];
//				arr[n2] = temp;
//				System.out.println("변경"+Arrays.toString(arr));
//			}
//			
//		}
		for(int i = 0; i < 1000; i++) {
			int r1 = ran.nextInt(arr.length);
			int r2 = ran.nextInt(arr.length);
			
			int temp = arr[r1]; // 조건을 안주어도 인덱스가 같게되면 아무일도 안일어남
			arr[r1] = arr[r2];
			arr[r2] = temp;
			System.out.print(r1 + " " + r2 + " : ");
			System.out.println(Arrays.toString(arr));
		}
		
		
		
		//새로 작성
//		Random ran = new Random();
//		int a = 0;
//		int b = 0;
//		int temp = 0;
//		for(int i = 0; i < 10; i++) { // 과정 반복 10번
//			int n1 = ran.nextInt(6); // 인덱스
//			int n2 = ran.nextInt(6);
//			if(n1 != n2) { // 같을 경우  // 조건을 안주어도 인덱스가 같게되면 아무일도 안일어남
//				temp = arr[n1];
//				arr[n1] = arr[n2];
//				arr[n2] = temp;
//			}
//			System.out.print(n1 + " " + n2 + " : ");
//			System.out.println(Arrays.toString(arr));
//			
//		}


	}

}
