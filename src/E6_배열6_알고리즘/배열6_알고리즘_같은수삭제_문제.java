package E6_배열6_알고리즘;

import java.util.Arrays;

public class 배열6_알고리즘_같은수삭제_문제 {

	public static void main(String[] args) {
		/*
	 	 input[] = {1,3,3,2,1,1,4};
	 
		 [1] input 의 데이터를 a 에 순차적으로 저장한다.
		 [2] 단, 저장할려는 숫자의 앞의 숫자가 지금 저장할려는 수와 값이 같다면,
		  	 둘다 삭제한다.		
		 예) input = {1,3,3,2,1,1,4}		
		 1  ==> a[] = {1}
		 3  ==> a[] = {1,3}
		 3  ==> a[] = {1,3,3} ==> {1}
		 2  ==> a[] = {1,2}
		 1  ==> a[] = {1,2,1}
		 1  ==> a[] = {1,2,1,1} ==> {1,2}
		 4  ==> a[] = {1,2,4}
		*/
		int input[] = {1,3,3,2,1,1,4};
		int a [] = new int[input.length];
		
		//단순히 앞에 수와 비교해서 같은값이면 삭제해주면 되기때문에 무한반복을 할필요가 없다.
//		int count = 0;
//		for(int i = 0; i < input.length; i++) {
//			a[count] = input[i];
//			System.out.println(Arrays.toString(a));
//			while(true) {
//				if(count == 0) {
//					break;
//				}
//				if(a[count] == a[count-1]) {
//					a[count] = 0;
//					a[count-1] = 0;
//					count -= 2;
//				}else {
//					break;
//				}
//			}
//			count += 1;
//		}
		int count = 0;
		for(int i = 0 ; i < input.length; i++) {
			if(count == 0) {
				a[count] = input[i];
				count += 1;
			}
			else if(input[i] == a[count-1]) {
				a[count - 1] = 0;
				count -= 1;
			}else {
				a[count] = input[i];
				count += 1;
			}
			System.out.println(Arrays.toString(a));
		}

	}

}
