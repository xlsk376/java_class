package E1_�迭1_������Ʈ;

import java.util.Random;

public class �迭1_������Ʈ_OMRī��_���� {

	public static void main(String[] args) {
		/*
		 * [OMRī��]
		 * 
		 * 1. �迭 test�� ���蹮���� �������̴�.
		 * 2. �迭 student�� 1~5 ������ ���� ���� 5���� �����Ѵ�.	
		 * 3. ���ڸ����� ���ؼ� ������ ����Ѵ�.
		 *     ==> ������ true , Ʋ���� false
		   4. ������ �� ������ 20���̴�.
		   5. ������ ����Ѵ�.  
		   
		 * [��]
		 * test  = {1, 3, 4, 2, 5}
		 * student = {1, 1, 4, 4, 3}
		 * result  = {t, f, t, f, f} 
		*/
		
		int[] test = {1, 3, 4, 2, 5};
		int[] student = new int[5];
		boolean[] result = new boolean[5];
		int score = 0;
		Random ran = new Random();
		for(int i = 0; i < 5; i++) {
			int num = ran.nextInt(5)+1;
			System.out.println(num);
			student[i] = num;
			if(test[i] == student[i]) {
				result[i] = true;
			}else {
				result[i] = false;
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.println(result[i]);
			if(result[i] == true) {
				score += 20;
			}
		}
		
		System.out.println(score);
		

	}

}
