package E5_�迭5_�˰���;

import java.util.Arrays;

public class �迭5_�˰���_�迭�ΰ����� {

	public static void main(String[] args) {
		/*
		 * [����]
		     �� �迭�� �ϳ��� ��ġ�� �����������������Ͻÿ�.	
			 ��) 1,2,3,5,7,8,9,10,12,15,19,20
		 */
		
		int[] arr1 = {9,10,3,2,20,19};
		int[] arr2 = {15,12,1,5,7,8};
		
		int[] temp = null;
		int size1 = arr1.length;
		int size2 = arr2.length;
		temp = new int[size1 + size2];
		
		for(int i = 0; i < temp.length; i++) { // arr1�� arr2�� ���ÿ� �� �־��ֱ�
			if(i < size1) {
				temp[i] = arr1[i];
			}else if(i > size1) {
				temp[i] = arr2[i - size1];
			}
		}
		System.out.println(Arrays.toString(temp));
		int count = 0; // ��� �����ϴ��� Ȯ��
		for(int i = 0; i < temp.length; i++) {
			for(int j = 0; j < i; j++) {
				count += 1;
			}
		}
		System.out.println(count);
		
		
		// ���� �ۼ� �ѹ��� �־ �ѹ��� ������
//		int[] arr1 = {9,10,3,2,20,19};
//		int[] arr2 = {15,12,1,5,7,8};
//			
//		int[] temp = null;
//		temp = new int[arr1.length+arr2.length];
//		int index = 0;
//		for(int i = 0; i < arr1.length; i++) {
//			temp[index] = arr1[i];
//			index += 1;
//			temp[index] = arr2[i];
//			index += 1;
//		}
//		System.out.println(Arrays.toString(temp));
//		int min = 0;
//		for(int i = 0; i < temp.length; i++) {
//			for(int j = 0; j < i; j++) {
//				if(temp[i] < temp[j]) {
//					min = temp[i];
//					temp[i] = temp[j];
//					temp[j] = min;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(temp));
		
		
		
		
		
		/*
		 * arr1 �� arr2 ������ �����Ѵ�. 
		 * �տ������� ���ؼ� ���ϰ����������� temp������
		 * �ڽ�1�� ���� 
		 * 
		 * {9,10,3,2,20,19};
		 * {15,12,1,5,7,8};	
		 * 
		 * 2,3,9,10,19,20
		 * 1,5,7,8,12,15
		 * 
		 * temp =>1.2.3.5.7.
		 * 
		 * 
		 */
		
		for(int i = 1; i < arr1.length; i++) { // arr1�� ����������� ����
			for(int j = 0; j < i; j++) {
				if(arr1[i] < arr1[j]) {
					int t = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = t;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		
		for(int i = 1; i < arr2.length; i++) { // arr2�� ����������� ����
			for(int j = 0; j < i; j++) {
				if(arr2[i] < arr2[j]) {
					int t = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = t; 
				}
			}
		}
		System.out.println(Arrays.toString(arr2));
		
		temp = new int[size1 + size2];
		
		int id1 = 0;
		int id2 = 0;
		
		for(int i = 0; i < temp.length; i++) {
			
			if(id1 == arr1.length) { // ������ ���� �� ������ �������� ������� ���, �̹� ���� �����̱⶧��
				temp[i] = arr2[id2];
				id2 += 1;
			}else if(id2 == arr2.length) {
				temp[i] = arr1[id1];
				id1 += 1;
			}else {
				if(arr1[id1] < arr2[id2]) { // ���ؼ� ������ �־���
					temp[i] = arr1[id1];
					id1 += 1;
				}else if(arr2[id2] < arr1[id1]) {
					temp[i] = arr2[id2];
					id2 += 1;
				}
			}
		}
		System.out.println(Arrays.toString(temp));

	}

}
