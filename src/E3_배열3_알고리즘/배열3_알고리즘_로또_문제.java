package E3_�迭3_�˰���;

import java.util.Arrays;
import java.util.Random;


public class �迭3_�˰���_�ζ�_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 * 
		 * [�ζ�] 1~45������ ������ 6 ���� lotto1 �� �����ҷ��� �Ѵ�. [����] �ߺ��Ǵ¼��ڴ� ������Ѵ�.
		 */

		int lotto1[] = new int[6];				
		int lotto[] = new int[45];
		
		for(int i = 0; i < 45; i++) { // 1~45�ε����� 1���� 45���� �־��ֱ�
			lotto[i] = i + 1;
		}
		Random ran= new Random();
		
		for(int i = 0; i < 100; i++) { // 1~45�� ���� 100�� ����
			int r1 = ran.nextInt(45);
			int r2 = ran.nextInt(45);		
			int temp = lotto[r1];
			lotto[r1] = lotto[r2];
			lotto[r2] = temp;	
			//System.out.print(r1 + " " + r2 +  " : "); // ���̴� ����
			//System.out.println(Arrays.toString(lotto));
		}
		System.out.println(Arrays.toString(lotto)); //���� ���� 0~5��° �ε������� �ζ�1�� �־��ֱ�
		for(int i = 0; i < 6; i++) {
			lotto1[i] = lotto[i];
		}
		System.out.println();
		System.out.println("�ζ� : "+Arrays.toString(lotto1));
		System.out.println();
		for(int i = 0; i < lotto1.length; i++) {  // ���ڸ� ���������� ���ʴ�� �����ϱ� ���� ����
			int min = lotto1[i]; // 0�϶� min�� ù��° �� 
			int index = i; // i�� �־ �ش�Ǵ� �ε������� , 0���� ������ ����ó�� �ε������� ���۵�
			
			System.out.println("index : " + index);
			System.out.println("lotto1[i] : " + lotto1[i]);
			//System.out.println("index : " + index);
			for(int j = i + 1; j < lotto1.length; j++) {
				if(min > lotto1[j]) { // j = i+1 ���� �����ؼ� ù��°�� ���� �� �ڿ� ������ ���� ������ ���
					min= lotto1[j];
					index = j;
				}
			}
			System.out.println("index : " + index);
			System.out.println("min : " + min);
			//System.out.println("index : " + index);
			
			int temp = lotto1[i]; // ���� ���� ���� i��° �ε����� �ֱ����ؼ� , ��ȣ����
			lotto1[i] = lotto1[index]; 
			lotto1[index] = temp;
			
			System.out.println(Arrays.toString(lotto1));
		}
		System.out.println(Arrays.toString(lotto1));
	}

}
