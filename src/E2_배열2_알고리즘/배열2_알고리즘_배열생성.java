package E2_�迭2_�˰���;

import java.util.Arrays;

public class �迭2_�˰���_�迭���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 *    [4�� ����� ����]
		 * - 	[����1] arr �迭���� 4�� ����� ��� temp �迭�� ����
		 * - ��! temp �� ���̸� 4�� ����� ���� ��ŭ�� �����Ѵ�.
		 * - ��) 4�ǹ�� ������ 3���̹Ƿ� temp = new int[3];  
		 */
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null; // 0��, �ƹ��͵� ���� nothing
		int room = 0;
		int count = 0;
		//int a[] = new int[3];
		for(int i = 0; i <arr.length; i++) {
			if(arr[i]%4 == 0) {
				count += 1;
				temp = new int[count];
				temp[room]= arr[i];
				//a[room] = temp[room];
				System.out.println(temp[room]);
				room += 1;
			}
		}
		System.out.println(Arrays.toString(temp)); // �迭�� ��������� ���� ���������� ����Ǿ� ��µȴ�.
		//System.out.println(Arrays.toString(a));
		
		// ---------------------------------------------------------------------------
		
		//���� �ۼ� 4�� ����� ������ �迭�� �����ѵ� 4�� ����� ������ �迭�� ��´�
//		int[] arr = {44, 11, 29, 24, 76};
//		int[] temp = null;
//		int count = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] % 4 == 0) {
//				System.out.println(arr[i]);
//				count += 1;
//			}
//		}
//		temp = new int[count];
//		int index = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] % 4 == 0) {
//				temp[index] = arr[i];
//				index += 1;
//			}
//		}
//		System.out.println(Arrays.toString(temp));

	}

}
