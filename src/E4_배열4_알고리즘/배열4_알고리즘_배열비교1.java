package E4_�迭4_�˰���;

import java.util.Arrays;

public class �迭4_�˰���_�迭��1 {

	public static void main(String[] args) {
		/*
		 *  [����] array �迭 ���� �����߿��� b�迭�� ���� ������ 
			     b�� array�� ���� ��ġ�°���  0���� ����	
			 
			 [��] 
			 	array[] = {0,0,30,40};
				   b[] = {0,3,0,50};	
			
		 */
		
//		int array[] = {10,20,30,40};
//		int b[] = {10,3,20,50};
//		
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < b.length; j++) {
//				if(array[i] == b[j]) {
//					array[i] = 0;
//					b[j] = 0;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(array));
//		System.out.println(Arrays.toString(b));
		
		int array[] = {10,20,30,40};
		int b[] = {10,3,20,50};
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(array[i] == 0) { // 0���̸� �н�
					continue;
				}
				if(b[j] == 0) { // 0���̸� �н�
					continue;
				}
				if(array[i] == b[j]) {
					array[i] = 0;
					b[j] = 0;
				}
				count += 1;
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(b));
		System.out.println(count);

	}

}
