package E2_배열2_알고리즘;

import java.util.Arrays;

public class 배열2_알고리즘_1등 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 
		 * [1둥]
		 *   아래 데이터는 학생번호1개, 점수2개가 한세트이다. 		
			 번호는 1001부터시작이고 , 점수는 0~100 이다. 
			 예) 1001 , 20, 30 ==> 1001번 1번점수 20점, 2번점수 30점
			 		 
			 1등의 번호 출력한다. 
			 점수는 두점수의 합으로계산한다. 
		 */
//		//배열 에러나는 이유 배열에 없는값을 넣어주려고 하기때문에 에러가 발생
//		int arr[] = {1001, 20, 30, 1002, 43, 23, 1003, 45, 1};
//		int score[] = {0,0,0,0,0,0,0,0,0};
//		int room = 0;
//		for(int i = 0; i < 8; i++) { //배열길이로 하게되면 없는값을 넣어주기 때문에 에러가 난다
//			score[i] = arr[i+1]; // i+1 이기 때문에 8+1 => arr[9] 인덱스 값을 호출하게 됨, 그래서 조건을 8로 줄여줘야함
//			System.out.println(score[i]);
//			
//		}
//		score[8] = 0;
////		for(int i = 0; i < arr.length; i++) {
////			System.out.println(score[i]);
////		}
		
		//문제 풀이함 , 더줄일수 있는지 고민하기
//		int arr[] = {1001, 20, 30, 1002, 43, 23, 1003, 45, 1};
//		int score[] = new int[3];
//		int room = 0;
//		int max = 0;
//		int temp = 0;
//		int num = 0;
//		for(int i = 0; i < 3; i++) {
//			score[i] = arr[room+1]+arr[room+2]; // 점수를 합산에 값을 넣어준다.
//			temp = score[i];
//			if(max < temp) {
//				max = temp;
//				num = i;
//				//System.out.println(max);
//			}
//			//System.out.println(score[i]);
//			room += 3; // (a[1]+a[2]) +3 -> (a[4]+a[5]) +3 -> (a[7]+a[8]) +3 
//		}
//		if(num == 0) {
//			System.out.println(arr[0]);
//		}else if(num == 1) {
//			System.out.println(arr[3]);
//		}else if(num == 3) {
//			System.out.println(arr[6]);
//		}
//		System.out.println("1등점수 : "+ max);
//		System.out.println("1등 번호 : " + num);
		
		// ↓ 아래는 복습시 작성
//		int temp[] = new int[6];
////		//int student[] = new int[6];
////		//int score[] = new int[6];
////		int index = 0;
////		int room = 0;
////		for(int i = 0; i < 3; i++) {
////			temp[index] = arr[room];
////			index += 1;
////			temp[index] = arr[room+1]+arr[room+2];
////			index += 1;
////			room += 3;
////		}
////		System.out.println(Arrays.toString(temp));
//		int max = 0;
//		int index = 0;
//		int room = 0;
//		int count = 0;
//		int sum[] = new int[8];
//		for(int i = 0; i < 3; i++) {
//			sum[index] = arr[room+1]+ arr[room+2];
//			if(max < sum[index]) {
//				max = sum[index];
//				count = room;
//				
//			}
//			index += 1;
//			room += 3;
//		}
//		System.out.println(Arrays.toString(sum));
//		System.out.println(max);
//		System.out.println(arr[count]);
		
		// 새로 작성 각각의 인덱스에 번호와 점수를 따로 저장 인덱스 번호를 확인하여 값을 출력
		int arr[] = {1001, 20, 30, 1002, 43, 23, 1003, 45, 1};
		int score[] = new int[3];
		int num[] = new int[3];
		int max = 0;
		int maxNum = 0;
		int index = 0;
		for(int i = 0; i < arr.length; i+=3) {
			num[index] = arr[i];
			score[index] = arr[i+1]+arr[i+2];
			index += 1;
		}
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(score));
		for(int i = 0; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
				maxNum = num[i];
			}
		}
		System.out.println(maxNum +" "+ max);
		
	}

}
