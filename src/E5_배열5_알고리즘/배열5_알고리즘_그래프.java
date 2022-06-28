package E5_배열5_알고리즘;

import java.util.Arrays;

public class 배열5_알고리즘_그래프 {

	public static void main(String[] args) {
		/*
	  	scoreList[] = {31, 76, 54, 2, 100, 23};
	  
		위 데이터는 학생 6명의 점수이다.	
		위 데이터를 그래프로 표현해볼려고한다.		
		 표시는 10의 자리숫자로 표현해서 개수만큼  * 로 출력할려고한다.		
		예)
		 31  ==> ***
		 76  ==> *******
		 54  ==> *****
		 2   ==> 
		 100 ==> **********
		 23  ==> **
		 */
		/*
		 * 10으로 나눈 몫을 *로 출력
		 */
		int scoreList[] = {31, 76, 54, 2, 100, 23};
		int a = 0;
		for(int i = 0; i < scoreList.length; i++) {
			System.out.printf("[%3d]",scoreList[i]);
			a = scoreList[i]/10;
			for(int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//새로 작성, 나눠서 작성하
//		int scoreList[] = {31, 76, 54, 2, 100, 23};
//		int a = 0;
//		int temp[] = new int[scoreList.length];
//		for(int i = 0; i < scoreList.length; i++) {
//			for(int j = 0; j < scoreList.length; j++) {
//				a = scoreList[j] / 10;
//				temp[j] = a;
//			}
//		}
//		for(int i = 0; i < scoreList.length; i++) {
//			System.out.printf("%3d ==> ",scoreList[i]);
//			for(int j = 0; j < temp[i]; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	}

}
