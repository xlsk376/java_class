package E3_�迭3_�˰���;

import java.util.Arrays;

public class �迭3_�˰���_���ʿ����� {

	public static void main(String[] args) {
		/*
		 * [���ʿ�����]
		 * 
		 *   �Ʒ� ��ȣ�� �Է¹ް� ������ ���� 0 �̾ƴѼ��ڸ� �����ÿ�.
			 1)left 2)right 	
			 ��) 1) left ==> arr = {2,3,4,5,0,0,0,0,0};
			 ��) 1) right ==> arr = {0,0,0,0,0,2,3,4,5};
		 */
		
		int arr[] = {0,2,0,3,4,0,0,5,0};
		
		int select = 2;
		int index = arr.length - 1; // �ڿ��� ����
		System.out.println(index);
		int index2 = index; // �ٲ� ��ġ ���
//		if(select == 2) {
//			for(int i = 0; i < arr.length; i++) {
//				if(arr[index] != 0 ) {
//					int temp = arr[index];
//					arr[index] = arr[index2];
//					arr[index2] = temp;
//					index2 -= 1;
//					//System.out.println(Arrays.toString(arr));
//				}
//				index -= 1;
//			}
//		}
		//System.out.println(Arrays.toString(arr));
		select = 1;
		index = 0; // �տ��� ���� ����
		index2 = index; // �ٲ���ġ ���
		System.out.println(Arrays.toString(arr));
		if(select == 1) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[index] != 0) {
					int temp = arr[index];
					arr[index] = arr[index2];
					arr[index2] = temp;
					index2 += 1;
					System.out.println(Arrays.toString(arr));
				}
				index += 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		//�������� ����
//		int arr[] = {0,2,0,3,4,0,0,5,0};	
//		int index = 0;
//		for(int i = 0; i< arr.length; i++) {
//			if(arr[i] != 0) {
//				arr[index] = arr[i];
//				index += 1;
//				arr[i] = 0;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		//������ ����
//		int arr[] = {0,2,0,3,4,0,0,5,0};	
//		int index = arr.length-1;
//		for(int i = arr.length-1; i >= 0; i--) {
//			if(arr[i] != 0) {
//				arr[index] = arr[i];
//				index -= 1;
//				arr[i] = 0;
//			}
//		}
//		System.out.println(Arrays.toString(arr));

	}

}
