package E5_�迭5_�˰���;

import java.util.Arrays;
import java.util.Random;

public class �迭3_�˰���_2�������� {

	public static void main(String[] args) {
		int darr[][] = new int[3][3];
		
		Random ran = new Random();
		
		int arr[] = new int[9];
		
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				darr[i][j] = ran.nextInt(100); // 0~99�� �������� 9���� arr �迭�� ����
			}
		}
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("[%2d]" , darr[i][j]); // %2d -> �ڸ����� ������ ��)���ڸ��϶� 2�ڸ�
			}
			System.out.println();
		}
		
		int k = 0;
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				arr[k] = darr[i][j]; // 2���� -> 1���� �迭�� ����
				k += 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------------");
		for(int i = 0; i < arr.length; i++) { // �����ﰢ�� ���
			for(int j = 0; j < i; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			System.out.println(Arrays.toString(arr));
			System.out.println("------------------------");
		}
		
		k = 0;
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				darr[i][j] = arr[k]; // 1���� -> 2���� �迭�� ����
				k += 1;
			}
		}
		System.out.println("-----------------");
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("[%2d]" , darr[i][j]);
			}
			System.out.println();
		}

	}

}
