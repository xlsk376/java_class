package E6_�迭6_������Ʈ;

import java.util.Arrays;
import java.util.Random;

public class �迭6_������Ʈ_�������� {

	public static void main(String[] args) {
		/*
		 * [��������]
		 * 1. lottoSet �迭�� 5 * 7 ������ �迭�̴�. 
		 * 2. ����1���� 7���̰� , �� 5���� ������ ������� �Ѵ�.  
		 * 3. ���� 1���� ������ 1�Ǵ� 7�� ������ �����Ѵ�. 
		 * 4. ���� 1���� 7�� �������� 3���̻��̸� "��÷" �̰� �� �̸��� "��" �̴�.
		 * 5. 5�� �����߿� 1���� ��÷�̰� 4���� ���� ������ �������� �����غ���.
		 * 
		 * ��) �Ʒ��� ���� ���ٸ� "��÷" �̰� ������ 4���� "��"�̴�.
		 * 1177117 (��)
		 * 1117771 (��÷)
		 * 7171117 (��)
		 * 7711771 (��)
		 * 7171717 (��)
		 * 
		 */
		int[][] lottoSet = new int[5][7];
		Random ran = new Random();
		
		// 4 : 1 �� ��� ��쵵 ����
//		while(true) {
//			int count = 0;
//			int count1 = 0;
//			for(int i = 0; i < lottoSet.length; i++) {
//				int c1 = 0;
//				int c7 = 0;
//				boolean check = false;
//				for(int j = 0; j < lottoSet[i].length; j++) {
//					int r = ran.nextInt(2);
//					if(r == 0 ) {
//						lottoSet[i][j] = 1;
//						c7 = 0;
//					}else{
//						lottoSet[i][j] = 7;
//						c7 += 1;
//					}
//					if(c7 >= 3) {
//						check = true;
//					}
//					System.out.print(lottoSet[i][j] + " ");
//				}
//				if(check == true) {
//					System.out.println("��÷");
//					count += 1;
//				}else {
//					System.out.println("��");
//					count1 += 1;
//				}
//			}
//			if(count == 1 && count1 == 4) {
//				break;
//			}
//		}
		
		int winCount = 0;
		for(int i = 0; i < 5; ) {
			
			for(int j = 0; j < lottoSet[i].length; j++) {
				int r = ran.nextInt(2);
				if(r == 0) {
					lottoSet[i][j] = 1;
				}else if(r == 1) {
					lottoSet[i][j] = 7;
				}
			}
			int count = 0;
			boolean check = false;
			for(int j = 0; j < lottoSet[i].length; j++) {
				if(lottoSet[i][j] == 7) {
					count += 1;
					if(count == 3) {
						check = true;
						break;
					}
				}else {
					count = 0;
				}
			}
			if(check == true && winCount == 0) {
				winCount = 1;
				i += 1;
			}else if(check == false && winCount == 1){
				i += 1;
			}			
		}	
		
		for(int i = 0; i < lottoSet.length; i++) {
			System.out.println(Arrays.toString(lottoSet[i]));
		}
		
		//1���� ��÷���� �������� ���κ����̱⶧���� ���ǳ��� ��ȯ���ش�.
		int r = ran.nextInt(lottoSet.length);
		
		int[] temp = lottoSet[0];
		lottoSet[0] = lottoSet[r];
		lottoSet[r] = temp;
		System.out.println("------------------");
		for(int i = 0; i < lottoSet.length; i++) {
			System.out.println(Arrays.toString(lottoSet[i]));
		}
		
		
		
		

	}

}
