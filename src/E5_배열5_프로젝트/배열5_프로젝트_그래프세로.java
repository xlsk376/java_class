package E5_배열5_프로젝트;

import java.util.Arrays;

public class 배열5_프로젝트_그래프세로 {

	public static void main(String[] args) {
		/*  
	    scoreList[] = {31, 76, 54, 2, 100, 23};
	    위 데이터는 학생 6명의 점수이다.		
		위 데이터를 그래프로 표현해볼려고한다.
	 	표시는 10의 자리숫자로 표현해서 개수만큼  * 로 출력할려고한다.
	 	전에는 왼쪽에서 오른쪽으로 표현했지만 이번엔 아래서 위로 표현할려고한다.		
		  
		---------------------------------		                
		                 *
		                 *
		                 *
		        *        *
		 	    *        *
		  	    *  *     *
		        *  *     *
		     *  *  *     *
		     *  *  *     *  *
		  	 *  *  *     *  *
		    31 76 54 2 100 23
		---------------------------------	
		    
		*/

		int scoreList[] = {31, 76, 54, 2, 100, 23};
		int [][] temp = new int[10][scoreList.length];
		int y = temp.length; // 10으로 설정후 계산
		int x = temp[0].length;
		//System.out.println(x);
		//System.out.println(y);
		for(int i = 0; i < x; i++) { // 6
			int score = scoreList[i]/10; // 3;			
			for(int j = 0; j < y - score; j++) { // 빈칸을 체크해서 1로 채우기
				temp[j][i] = 1; // j가 앞에옴 세로로 바꾸기 위해서
				System.out.print(temp[j][i] + " ");
			}
			System.out.println();
		}
//		for(int i = 0; i < 6; i++) {
//			System.out.println(Arrays.toString(temp[i]));
//		}
		
		System.out.println("-------------------------------------");
		for(int i = 0; i < temp.length; i++) {
			for(int j = 0; j < temp[i].length; j++) {
				if(temp[i][j] == 1) {
					System.out.print("    ");
				}else {
					System.out.print("*   ");
				}
	//			System.out.print(temp[i][j]);
			}
			System.out.println();
		}
		for(int i = 0; i < scoreList.length; i++) {
			System.out.print(scoreList[i] + "  ");
		}
		System.out.println();
		System.out.println("-------------------------------------");
		
		
		
		
	
		
		
		
		

	}

}
