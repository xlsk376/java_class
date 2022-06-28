package E4_배열4_알고리즘;

import java.util.Arrays;

public class 배열4_알고리즘_개수찾기_문제 {

	public static void main(String[] args) {
		/*
		 * [개수찾기]
		 
		  	 가장많이 들어있는 숫자개수와
			 가장 적개 들어있는 숫자의 개수의 합을 구하시요.	
			 100 : 1개
			 3   : 5개 	
			 답 : 6		
		 */
		int[] arr = { 1, 2, 3, 3, 100, 1, 3, 3, 2, 3, 2 };
		
		//[1] 새로운 배열을 만들어서 중첩되지않는 값만 저장한다.
		// temp = {1,2,3,100}
		int sample[] = new int[arr.length]; //중첩되지 않는 값만 저장할 배열
		int count[] = new int[arr.length]; // 중첩된 숫자 카운트하여 넣어줄 배열
		int sampleCount = 0; // 중복되는 숫자가 총 몇개인지 체크
		for(int i = 0; i < arr.length; i++) {
			boolean check = false; // 중복체크할 변수
			//System.out.println("i : "+i);
			for(int j = 0; j < sampleCount; j++) { // sampleCount를 해주어 앞에 중복된 숫자가 있다면 패스하고 없으면 다음 인덱스에 들어간다.
				//System.out.println("j :"+j);
				if(sample[j] == arr[i]) { // arr배열을 앞에서 부터 전체 비교 한다.
					check = true;
					break;
				}
			}
			if(check == false) { // 비교할때 중복된 값이 없다면 해당되는 인덱스에 넣어준다.
				sample[sampleCount] = arr[i]; // 중복된 숫자가 들어간 배열과 비교하여 없다면 그다음 인덱스에 들어감
				sampleCount += 1;
				//System.out.println("s : "+sampleCount);
			}
		}
		System.out.println(Arrays.toString(sample));
		System.out.println(sampleCount);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < sampleCount; j++) { // 중복된 숫자들의 배열
				if(arr[i] == sample[j]) { // 같은 값이 있을때마다 +1 하여 count 배열에 넣어준다.
					count[j] += 1;
				}
			}
		}
		System.out.println(Arrays.toString(count));
		
		// 새로 작성 중첩되지 않는 값만 저장함
//		int[] arr = { 1, 2, 3, 3, 100, 1, 3, 3, 2, 3, 2 };	
//		int[] temp = new int[arr.length];
//		int index1 = 0;
//		for(int i = 0; i < arr.length; i++) {
//			int index = i;
//			boolean check = false;
//			for(int j = 0; j < i; j++) {
//				if(arr[j] == arr[index]) {
//					check = true;
//					break;
//				}
//			}
//			if(check == false) {
//				temp[index1] = arr[index];
//				index1 += 1;
//			}
//		}
//		System.out.println(Arrays.toString(temp));

	}

}
