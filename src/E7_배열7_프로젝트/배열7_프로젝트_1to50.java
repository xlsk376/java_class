package E7_배열7_프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열7_프로젝트_1to50 {

	public static void main(String[] args) {
		/* 
		 * [1 to 50]
		 * 1. 구글에서 1 to 50 이라고 검색한다.
		 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
		 * 3. 비슷하게 만들기 
		 */
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int arr[][] = new int[5][5];
		// 1 ~ 25 / 26 ~ 50 
		
		int index = 0;
		int k[] = new int[25];
		int h[] = new int[25];
		for(int i = 0; i < 25; i++) {
			k[i] = i+1;
		}
		int g = 26;
		for(int i = 0; i < 25; i++) {
			h[i] = g;
			g += 1;
		}
		//System.out.println(Arrays.toString(k)); // 1~25
		//System.out.println(Arrays.toString(h)); // 26~50
		for(int i = 0; i < k.length; i++) {
			int r1 = ran.nextInt(k.length);
			int r2 = ran.nextInt(k.length);
			int temp = k[r1];
			k[r1] = k[r2];
			k[r2] = temp;
		}
		for(int i = 0; i < k.length; i++) {
			int r1 = ran.nextInt(k.length);
			int r2 = ran.nextInt(k.length);
			int temp = h[r1];
			h[r1] = h[r2];
			h[r2] = temp;
		}
		//System.out.println(Arrays.toString(k)); // 1~25
		//System.out.println(Arrays.toString(h)); // 26~50
		index = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = k[index];
				index += 1;
			}
		}
		int count = 50; // 총 게임 횟수
		int count1 = 25; // 새로 추가되는 숫자 
		while(true) {
			for(int i = 0; i < arr.length; i++) {
				System.out.println(Arrays.toString(arr[i]));
			}
			if(count == 0) {
				break;
			}
			System.out.println("숫자 선택");
			int n = scan.nextInt();
			//int r = ran.nextInt(25)+1;
			int min = 50;
			int a = 0;
			int b = 0;
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr.length; j++) {
					if(arr[i][j] == 0) {
						continue;
					}
					if(min > arr[i][j]) {
						min = arr[i][j];
						a = i;
						b = j;
					}else if(min == arr[i][j]) { // 마지막숫자가 min값과 같다를 확인하기!!
						min = arr[i][j];
						a = i;
						b = j;
					}
				}
			}
			System.out.println("min : " + min);
			if(min == n) {
				if(count <= 25) {
					arr[a][b] = 0;
				}else if(count > 25){
					arr[a][b] = h[0];
					for(int j = 0; j < h.length-1; j++) {
						h[j] = h[j+1];
					}
					h[count1-1] = 0;
					count1 -= 1;
					//System.out.println(Arrays.toString(h));
				}
				count -= 1;
			}
			
		}
		

	}

}
