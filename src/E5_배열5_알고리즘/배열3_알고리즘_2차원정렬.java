package E5_배열5_알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 배열3_알고리즘_2차원정렬 {

	public static void main(String[] args) {
		int darr[][] = new int[3][3];
		
		Random ran = new Random();
		
		int arr[] = new int[9];
		
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				darr[i][j] = ran.nextInt(100); // 0~99중 랜덤으로 9개를 arr 배열에 저장
			}
		}
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("[%2d]" , darr[i][j]); // %2d -> 자리수를 맞춰줌 예)한자리일때 2자리
			}
			System.out.println();
		}
		
		int k = 0;
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				arr[k] = darr[i][j]; // 2차원 -> 1차원 배열로 만듬
				k += 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------------");
		for(int i = 0; i < arr.length; i++) { // 직각삼각형 모양
			for(int j = 0; j < i; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			System.out.println(Arrays.toString(arr));
			System.out.println("------------------------");
		}
		
		k = 0;
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				darr[i][j] = arr[k]; // 1차원 -> 2차원 배열로 만듬
				k += 1;
			}
		}
		System.out.println("-----------------");
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("[%2d]" , darr[i][j]);
			}
			System.out.println();
		}

	}

}
