package E2_배열2_프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열2_프로젝트_복권긁기 {

	public static void main(String[] args) {
		/*
		 *  [복권긁기]
		  
		    랜덤으로 복권배열에 1 또는 7 을 저장한다. 
		    화면은 { * * * * * * * } 이렇게 출력한다.
			인덱스 3개를 고를수있고, 
			인덱스 3개의 값이 전부 7이면  당첨이다.
			
		    [조건1] 
		    	반드시 7은 3개이상 있어야 한다.	
				[예] 1,1,7,7,1,7,1
			
			[조건2] 
				한번 고른 인덱스는 또고를수없다. 		
				[예] 2,2,2
		 */
		Scanner scan = new Scanner(System.in);
		int 복권[] = new int[7];		
		Random ran = new Random();	
		int c7 = 0;
		int c1 = 0;
		int index = 0;
		for(int i = 1; i ==1;) {
			int r = ran.nextInt(2);		
			if(r == 0 && c7 < 3) {
				복권[index] = 7; 
				index += 1;
				c7 += 1;
			}else if(r == 1 && c1 < 4) {
				복권[index] = 1; 
				index += 1;
				c1 += 1;
			}
			if(c7 == 3 && c1 == 4) {
				break;
			}
		}
		System.out.println(Arrays.toString(복권));
		boolean check[] = new boolean[7];
		int cCount = 0;
		while(true) {
			for(int i = 0; i < 7; i++) {
				if(check[i] == false) {
					System.out.print("*"+" ");
				}else {
					System.out.print(복권[i]);
				}
			}
			System.out.println();
			
			if(cCount == 3) {
				break;
			}
			
			System.out.println("인덱스 입력 : ");
			int sel = scan.nextInt();
			if(sel < 0 || sel > 7) {
				System.out.println("오류"); // while 제일위에부터 다시실행
				continue;
			}
			if(check[sel]== false) {
				cCount += 1;
				check[sel] = true;
				
			}else if(check[sel]== true) {
				System.out.println("이미선택한자리입니다.");
			}			
		}
		int win = 0;
		for(int i = 0; i < 7; i++) {
			if(check[i] == true && 복권[i] == 7) {
				win += 1;
			}
		}
		if(win == 3) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}

	}

}
