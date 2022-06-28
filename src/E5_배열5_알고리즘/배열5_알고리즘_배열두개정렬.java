package E5_배열5_알고리즘;

import java.util.Arrays;

public class 배열5_알고리즘_배열두개정렬 {

	public static void main(String[] args) {
		/*
		 * [정렬]
		     두 배열을 하나로 합치고 오름차순으로정렬하시오.	
			 예) 1,2,3,5,7,8,9,10,12,15,19,20
		 */
		
		int[] arr1 = {9,10,3,2,20,19};
		int[] arr2 = {15,12,1,5,7,8};
		
		int[] temp = null;
		int size1 = arr1.length;
		int size2 = arr2.length;
		temp = new int[size1 + size2];
		
		for(int i = 0; i < temp.length; i++) { // arr1과 arr2를 동시에 다 넣어주기
			if(i < size1) {
				temp[i] = arr1[i];
			}else if(i > size1) {
				temp[i] = arr2[i - size1];
			}
		}
		System.out.println(Arrays.toString(temp));
		int count = 0; // 몇번 동작하는지 확인
		for(int i = 0; i < temp.length; i++) {
			for(int j = 0; j < i; j++) {
				count += 1;
			}
		}
		System.out.println(count);
		
		
		// 새로 작성 한번에 넣어서 한번에 정렬함
//		int[] arr1 = {9,10,3,2,20,19};
//		int[] arr2 = {15,12,1,5,7,8};
//			
//		int[] temp = null;
//		temp = new int[arr1.length+arr2.length];
//		int index = 0;
//		for(int i = 0; i < arr1.length; i++) {
//			temp[index] = arr1[i];
//			index += 1;
//			temp[index] = arr2[i];
//			index += 1;
//		}
//		System.out.println(Arrays.toString(temp));
//		int min = 0;
//		for(int i = 0; i < temp.length; i++) {
//			for(int j = 0; j < i; j++) {
//				if(temp[i] < temp[j]) {
//					min = temp[i];
//					temp[i] = temp[j];
//					temp[j] = min;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(temp));
		
		
		
		
		
		/*
		 * arr1 과 arr2 를따로 정렬한다. 
		 * 앞에서부터 비교해서 비교하고싶은순서대로 temp에저장
		 * 코스1급 문제 
		 * 
		 * {9,10,3,2,20,19};
		 * {15,12,1,5,7,8};	
		 * 
		 * 2,3,9,10,19,20
		 * 1,5,7,8,12,15
		 * 
		 * temp =>1.2.3.5.7.
		 * 
		 * 
		 */
		
		for(int i = 1; i < arr1.length; i++) { // arr1을 적은순서대로 정렬
			for(int j = 0; j < i; j++) {
				if(arr1[i] < arr1[j]) {
					int t = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = t;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		
		for(int i = 1; i < arr2.length; i++) { // arr2을 적은순서대로 정렬
			for(int j = 0; j < i; j++) {
				if(arr2[i] < arr2[j]) {
					int t = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = t; 
				}
			}
		}
		System.out.println(Arrays.toString(arr2));
		
		temp = new int[size1 + size2];
		
		int id1 = 0;
		int id2 = 0;
		
		for(int i = 0; i < temp.length; i++) {
			
			if(id1 == arr1.length) { // 한쪽이 값이 다 나오면 나머지는 순서대로 출력, 이미 비교한 상태이기때문
				temp[i] = arr2[id2];
				id2 += 1;
			}else if(id2 == arr2.length) {
				temp[i] = arr1[id1];
				id1 += 1;
			}else {
				if(arr1[id1] < arr2[id2]) { // 비교해서 낮은수 넣어줌
					temp[i] = arr1[id1];
					id1 += 1;
				}else if(arr2[id2] < arr1[id1]) {
					temp[i] = arr2[id2];
					id2 += 1;
				}
			}
		}
		System.out.println(Arrays.toString(temp));

	}

}
