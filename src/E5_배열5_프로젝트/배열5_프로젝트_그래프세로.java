package E5_�迭5_������Ʈ;

import java.util.Arrays;

public class �迭5_������Ʈ_�׷������� {

	public static void main(String[] args) {
		/*  
	    scoreList[] = {31, 76, 54, 2, 100, 23};
	    �� �����ʹ� �л� 6���� �����̴�.		
		�� �����͸� �׷����� ǥ���غ������Ѵ�.
	 	ǥ�ô� 10�� �ڸ����ڷ� ǥ���ؼ� ������ŭ  * �� ����ҷ����Ѵ�.
	 	������ ���ʿ��� ���������� ǥ�������� �̹��� �Ʒ��� ���� ǥ���ҷ����Ѵ�.		
		  
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
		int y = temp.length; // 10���� ������ ���
		int x = temp[0].length;
		//System.out.println(x);
		//System.out.println(y);
		for(int i = 0; i < x; i++) { // 6
			int score = scoreList[i]/10; // 3;			
			for(int j = 0; j < y - score; j++) { // ��ĭ�� üũ�ؼ� 1�� ä���
				temp[j][i] = 1; // j�� �տ��� ���η� �ٲٱ� ���ؼ�
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
