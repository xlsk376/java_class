package E4_�迭4_�˰���;

import java.util.Arrays;

public class �迭4_�˰���_�ߺ�����_���� {

	public static void main(String[] args) {
		/*
		 *  [����] arr1 �迭 ���� �����߿��� b�迭�� ���� ������ 
			      b�� arr1�� ���� ��ġ�°���  0���� ����	
			[����] ��ġ�� ���� ������ ������ ���� 0���� ���� 	
			 ��) arr1[] = {0,0,30,40,0};
			 ��) b[] = {0,3,0,0,0,50};
		 */
		int arr1[] = {10,20,30,40,20};
		int b[] = {10,3,20,10,20,50};
		
		for(int i = 0; i < arr1.length; i++) {
			int value = arr1[i]; // arr1�� �迭���� value�� ����, value�� �����صΰ� ��
			for(int j = 0; j < b.length; j++) {
				if(value == b[j]) { // value�� ����� ���� b�� �迭���� �������� ã��
					b[j] = 0; 
					for(int k = i; k < arr1.length; k++) { 
						if(value == arr1[k]) { // value�� ����� ���� arr1�� �迭���� �������� ã��
							arr1[k] = 0;
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(b));

	}

}
