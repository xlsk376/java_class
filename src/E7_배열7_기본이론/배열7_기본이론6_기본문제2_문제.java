package E7_배열7_기본이론;

import java.util.Arrays;

public class 배열7_기본이론6_기본문제2_문제 {

	public static void main(String[] args) {
		/* 
		 * 아래 classList배열은 다섯반의 시험점수를 저장한데이터이다.
		 * 
		 * 각반의 총점이 높은순서대로 세반을 을 뽑아서 win 배열에 저장후 
		 * win 배열의 모든 내용을 출력하시오.
		 * 
		 */
			int classList[][] = {
					 {10,54,65,22,15},
					 {65,14,24,75,25},
					 {50,45,25,87,49},
					 {11,66,5,21,95},
					 {70,84,64,21,11}
			};
		
			int win[][] = new int[3][];
			int total[] = new int[5];
			for(int i = 0; i < classList.length; i++) {
				for(int j = 0; j < classList[i].length; j++) {
					total[i] += classList[i][j];
				}
			}
			//System.out.println(Arrays.toString(total));
			int index = 0;
			int index1[] = new int[5];
			for(int i = 0; i < total.length;) {
				int max = 0;
				for(int j = 0; j < total.length; j++) {
					if(max < total[j]) {
						max = total[j];
						index = j;
					}
				}
				total[index] = 0;
				index1[i] = index;
				i += 1;
			}
			//System.out.println(Arrays.toString(index1));
			for(int i = 0; i < win.length; i++) {
				win[i] = classList[index1[i]];
			}
			for(int i = 0; i < win.length; i++) {
				System.out.println(Arrays.toString(win[i]));
			}
			
			
			

	}

}
