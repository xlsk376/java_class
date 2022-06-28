package E3_배열3_알고리즘;

import java.util.Arrays;
import java.util.Random;


public class 배열3_알고리즘_로또_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 
		 * [로또] 1~45사이의 랜덤값 6 개를 lotto1 에 저장할려고 한다. [조건] 중복되는숫자는 없어야한다.
		 */

		int lotto1[] = new int[6];				
		int lotto[] = new int[45];
		
		for(int i = 0; i < 45; i++) { // 1~45인덱스에 1부터 45까지 넣어주기
			lotto[i] = i + 1;
		}
		Random ran= new Random();
		
		for(int i = 0; i < 100; i++) { // 1~45를 섞기 100번 섞기
			int r1 = ran.nextInt(45);
			int r2 = ran.nextInt(45);		
			int temp = lotto[r1];
			lotto[r1] = lotto[r2];
			lotto[r2] = temp;	
			//System.out.print(r1 + " " + r2 +  " : "); // 섞이는 과정
			//System.out.println(Arrays.toString(lotto));
		}
		System.out.println(Arrays.toString(lotto)); //섞은 값중 0~5번째 인덱스값을 로또1에 넣어주기
		for(int i = 0; i < 6; i++) {
			lotto1[i] = lotto[i];
		}
		System.out.println();
		System.out.println("로또 : "+Arrays.toString(lotto1));
		System.out.println();
		for(int i = 0; i < lotto1.length; i++) {  // 숫자를 작은수부터 차례대로 정렬하기 위한 과정
			int min = lotto1[i]; // 0일때 min은 첫번째 수 
			int index = i; // i를 넣어서 해당되는 인덱스부터 , 0으로 넣으면 제일처음 인덱스부터 시작됨
			
			System.out.println("index : " + index);
			System.out.println("lotto1[i] : " + lotto1[i]);
			//System.out.println("index : " + index);
			for(int j = i + 1; j < lotto1.length; j++) {
				if(min > lotto1[j]) { // j = i+1 부터 시작해서 첫번째를 빼고 그 뒤에 숫자중 제일 작은수 출력
					min= lotto1[j];
					index = j;
				}
			}
			System.out.println("index : " + index);
			System.out.println("min : " + min);
			//System.out.println("index : " + index);
			
			int temp = lotto1[i]; // 가장 작은 값을 i번째 인덱스에 넣기위해서 , 번호정렬
			lotto1[i] = lotto1[index]; 
			lotto1[index] = temp;
			
			System.out.println(Arrays.toString(lotto1));
		}
		System.out.println(Arrays.toString(lotto1));
	}

}
