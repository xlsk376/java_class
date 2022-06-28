package E1_배열1_알고리즘;

import java.util.Scanner;

public class 배열1_알고리즘_삭제원리_문제 {

	public static void main(String[] args) {
		/*
		 * 	[문제]
		 *  아래배열 a 의 안에 있는 값을 하나 입력받는다.
		 *  b배열안에 위에서 입력한 값을 제외하고 복사한다.
		 *  
		 *  [예] 30 ==> b[] = {10,20,40,50,0};
		 *  
		 *  [문제] 
		 *  아래 배열 c는 번호와 값이 한쌍인 배열이다. 
		 *  번호를 하나를 입력받고 c배열에 있는 번호이면, 
		 *  그번호와  값만 제외하고 d배열에 복사한다.
		 *  
		 *  [예] 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};
		 *  
		 */
//		int a[] = { 10, 20, 30, 40, 50 };
//		int b[] = { 0, 0, 0, 0, 0 };
				
//		Scanner scan = new Scanner(System.in);
		//System.out.println("제외 인덱스");
		//int num = scan.nextInt();
		//int index = num;
////		for(int i = 0; i < 5; i++) {// ※배열칸수를 틀리면 에러가 남, 꼭 명심하기
////			a[index]= 0;
////			b[i] = a[i];
////			System.out.println(b[i]);
////		}
//		for(int i = 0; i < 6; i++) {
//			if(index == c[i]) {
//				c[i] = 0;
//				i += 1;
//				c[i] = 0;
//				d[i] = c[i];
//				System.out.println(d[i]);
//			}
//		}
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 0, 0, 0, 0, 0 };
		int input = 30; // 가정했을때
		int room = 0;
		for(int i = 0; i < 5; i++) {
			if(input != a[i]) { // 같지 않은 값들만 조건문에 들어와서 실행됨
				b[room] = a[i];
				room += 1; // i값과 같이 증가
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.println(b[i]);
		}
		
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = { 0, 0, 0, 0, 0, 0 };
		int find = 1002;
		int index = 0;
		for(int i = 0; i < 6; i+=2) { // i가 번호 조건만 반복해서 확인할 수 있도록 +2를 해준다.
			if(find != c[i]) { // 같지 않은 값들만 조건문에 들어와서 실행됨
				d[index] = c[i];  
				index += 1;
				d[index] = c[i + 1]; 
				index += 1;
			}
		}
		System.out.println();
		for(int i = 0; i < 6; i++) {
			System.out.print(d[i] + "  ");
		}

	}

}
