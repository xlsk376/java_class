package E4_배열4_프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열4_프로젝트_더하기게임 {

	public static void main(String[] args) {
		/*
		  [더하기게임]	
			1) 1~10 사이의 숫자를 랜덤으로 7개보여준다. (중복금지)
			2) 그안에서 3개의 인덱스를 고를수있게해준다. (중복금지)
			3) 숫자를 랜덤 으로 하나 제시하는데  인덱스3개의 값의 합이
			   제시된 숫자랑 같으면 정답. 
			   단, 정답은 여러개 일수있다. 
			4) 반드시 정답의 경우의 수는 있어야한다.	 
			   단! 중복으로 값을 고를순없다. 
			 [예]
			    보기  = {1,5,8,6,4,2,9};
			    제시어 = 13	
			    정답) 인덱스 ==> 0,2,4  ==>  1 + 8 + 4	
			 
			    잘못된예) 인덱스 ==> 5,5,6 ==> 2 + 2 + 9
		*/
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int num[] = new int[10];
		int quiz[] = new int[7];
		for(int i = 0; i < num.length; i++) {
			num[i] += i + 1; // 1~10 숫자 저장
		}
		for(int i = 0; i < 1000; i++) { // 1000번 셔플
			int r1 = ran.nextInt(num.length);
			int r2 = ran.nextInt(num.length);
			int temp = num[r1];
			num[r1] = num[r2];
			num[r2] = temp;
		}
		System.out.println(Arrays.toString(num));
		
		for(int i = 0; i < 7; i++) { // 랜덤으로 7개 보여줌
			quiz[i] = num[i];
		}
		System.out.println(Arrays.toString(quiz));
		int sample[] = new int[3]; // 중복되지 않게 해서 제시되는 숫자 보여줌
		for(int i = 0; i < sample.length;) { // 무한반복
			int r = ran.nextInt(7)+1;
			boolean check = false;
			for(int j = 0; j < i; j++) {
				if(sample[j] == r) {
					check = true;
				}
			}
			if(check == false) {
				sample[i] = r;
				i += 1;
			}
		}
		System.out.println(Arrays.toString(sample));
		int total = 0;
		for(int i = 0; i < sample.length; i++) {
			total += quiz[sample[i]]; // 제시될 문제의 합
		}
		System.out.println(total);
		
		while(true) {
			int me[] = new int[3]; // 인덱스3개 선택
			System.out.println(Arrays.toString(quiz));
			System.out.println(total);
			System.out.println("[문제] 인덱스 3개를 고르세요 : ");
			for(int i = 0; i < me.length; i++) { // 반복문으로 선택한 숫자를 저장
				me[i] = scan.nextInt();
			}
			
			int meTotal = 0;
			for(int i = 0; i < me.length; i++) {
				meTotal += quiz[me[i]]; // 선택한 숫자의 합
			}
			if(meTotal == total) {
				System.out.println("정답");
				break;
			}else {
				System.out.println("꽝");
			}
		}

	}

}
