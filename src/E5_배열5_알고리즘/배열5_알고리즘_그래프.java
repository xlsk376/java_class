package E5_�迭5_�˰���;

import java.util.Arrays;

public class �迭5_�˰���_�׷��� {

	public static void main(String[] args) {
		/*
	  	scoreList[] = {31, 76, 54, 2, 100, 23};
	  
		�� �����ʹ� �л� 6���� �����̴�.	
		�� �����͸� �׷����� ǥ���غ������Ѵ�.		
		 ǥ�ô� 10�� �ڸ����ڷ� ǥ���ؼ� ������ŭ  * �� ����ҷ����Ѵ�.		
		��)
		 31  ==> ***
		 76  ==> *******
		 54  ==> *****
		 2   ==> 
		 100 ==> **********
		 23  ==> **
		 */
		/*
		 * 10���� ���� ���� *�� ���
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
		
		
		//���� �ۼ�, ������ �ۼ���
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
