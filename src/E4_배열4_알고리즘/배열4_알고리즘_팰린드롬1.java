package E4_배열4_알고리즘;

import java.util.Arrays;

public class 배열4_알고리즘_팰린드롬1 {

	public static void main(String[] args) {
		int arr1[] = {1,5,4,5,3,2,2,3,5,4,5,1};
		int arr2[] = {1,5,4,5,3,2,3,5,4,5,1};
		//위 배열들이 각각 팰린드롬인지 아닌지 출력하시요.
		
		//팰린드롬이란? 
		
		// 앞에서부터 읽을 때와
		// 뒤에서부터 읽을 때 똑같은 숫자가 나오면 팰린드롬이다
		// 예) 2112
		// 예) 12321
		int b = arr1.length-1; // 인덱스번호로 변경하기 위해
		boolean check = false;
		for(int i = 0; i < arr1.length/2; i++) { // 절반만 비교하면 되기 때문에 '/2'
			if(arr1[i] != arr1[b]) {
				check = true;
				break;
			}
			b -= 1;
		}
		if(check == true) {
			System.out.println("아니다");
		}else {
			System.out.println("맞다");
		}
		

	}

}
