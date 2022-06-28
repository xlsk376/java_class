package E3_배열3_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 배열3_알고리즘_배열중복삭제1 {

	public static void main(String[] args) {
		/*
			 [문제] 값을 입력받고 삭제 
			 [조건] 만약에 같은값이 여러개 있으면 가장첫번째의 값  한개만 삭제 후 b 에 순차적으로 저장 
			 
			 		  data[] = {5,2,6,8,5,6};
			 		  
			 [예] 2 ==>  b [] = {5,6,8,5,6,0};
			 [예] 6 ==>  b [] = {5,2,8,5,6,0};
		 */
		int data[] = {5,2,6,8,5,6};
		int b [] = {0,0,0,0,0,0};
		int value = 5;
		int index = -1;
		
		for(int i = 0; i < data.length; i++) {
			if(value == data[i]) { // 입력받은 값 찾기
				index = i; // 입력받은 값과 배열의 값이 같을때 인덱스 출력
				break;
			}
		}
		System.out.println(index);
		if(index == -1) {
			System.out.println("없음");
		}else {
			int bindex = 0;
			for(int i = 0; i < data.length; i++) {
				if(i != index) { // 입력받은 인덱스만 제외하고 출력 , 입력한 값 하나만 삭제됨
					b[bindex] = data[i];
					bindex += 1;
				}
			}
		}
		System.out.println(Arrays.toString(b));

	}

}
