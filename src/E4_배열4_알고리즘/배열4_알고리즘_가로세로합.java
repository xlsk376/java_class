package E4_�迭4_�˰���;

import java.util.Arrays;

public class �迭4_�˰���_���μ����� {

	public static void main(String[] args) {
		/*
		 * [���μ�����]
		 * 
		     �� �迭�� 1~9�� ������ ����Ǿ� �ִ� 9�� �������� �迭�̴�.
			 [����1] array �迭�� �� �Ͱ��� �簢�� ������� ��� �ϰ� 
			 ������ ���� ���� garo1[] �� ���ʴ�� ���� 
			 
			 [����2] array �迭�� �� �Ͱ��� �簢�� ������� ��� �ϰ� 
			 ������ ���� ���� sero1[] �� ���ʴ�� ���� 
			 
		 */
		int array[] = {
				2, 4, 6,
				8, 1, 5,
				9, 7, 3
		};
				
		int garo1[] = {0,0,0}; // {2+4+6 , 8+1+5 , 9+7+3}
		int sero1[] = {0,0,0}; // {2+8+9 , 4+1+7 , 6+5+3}
		int gi = 0;
		int si = 0;
		for(int i = 0; i < array.length; i++) {
			System.out.println(gi); // ���η� ��ĭ�� ���� 
			garo1[gi] += array[i]; // 
			sero1[si] += array[i]; // array�� ���η� ���ϱ�
			si += 1; // ���ι迭 �ε����� �־��ְ� ��ĭ�� ����
			if(i % 3 == 2) {
				gi += 1; // 3ĭ gi index�� �ϳ��� ���� 000 /111 /222 , ���ι迭�ε��� ��ĭ�� ����(�� ���ѵ� �ε��� ����)
				si = 0; // 012 012 012 // ���ι迭�ε����� 0���� ����
			}
		}
		System.out.println(Arrays.toString(garo1));
		System.out.println(Arrays.toString(sero1));
		

	}

}
