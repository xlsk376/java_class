package E5_�迭5_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭5_�˰���_2�����迭2 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		for(int i = 0; i < 3; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		// ����1) �ε��� 2���� �Է¹޾� �� ���
		// ��1) �ε���1 �Է� : 1	�ε���2 �Է� : 2
		//		   �� ��� : 60 
		int id1 = 1;
		int id2 = 2;
		System.out.println(arr[id1][id2]);
		
		// ����2) ���� �Է¹޾� �ε��� 2�� ���
		// ��2) �� �Է� : 60
		//		   �ε���1 ��� : 1	�ε���2 ��� : 2
		int value = 60;
		int id3 = -1; // -1�� ������ ���� ������ ���� ���ٸ� ���
		int id4 = -1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(value == arr[i][j]) {
					id3 = i;
					id4 = j;
				}
			}
		}
		if(id3 == -1 || id4 == -1) {
			System.out.println("����.");
		}else {
			System.out.println(id3 + " " + id4);
		}
		
		// ����3) ���� ū ���� �ε��� 2�� ���
		// ����3) 2 2
		
		int max = arr[0][0];
		int id5 = 0; // ����ū���� �����ϹǷ� -1�� ������
		int id6 = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(max < arr[i][j]) {
					max = arr[i][j];
					id5 = i;
					id6 = j;
				}
			}
		}	
		System.out.println(id5 + " " + id6);
		
		// ����4) �� 2���� �Է¹޾� �� ��ü
		int value1 = 60;
		int value2 = 80;
		int id7 = 0;
		int id8 = 0;
		int id9 = 0;
		int id10 = 0;
		int temp1 = 0;
		//int temp2 = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(value1 == arr[i][j]) {
					id7 = i;
					id8 = j;
				}
				if(value2 == arr[i][j]) {
					id9 = i;
					id10 = j;
				}
			}
		}
		temp1 = arr[id7][id8];
		arr[id7][id8] = arr[id9][id10];
		arr[id9][id10] = temp1;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		

	}

}
