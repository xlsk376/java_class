package E4_�迭4_�˰���;

import java.util.Arrays;

public class �迭4_�˰���_����_���� {

	public static void main(String[] args) {
		/*
		 * arr1 = {1,1,1,3,3,3,3,2,2,3,3,3,4,5}; 
		 * arr1�� �߿��� �������� �ߺ��Ǵ� ���ڴ� �����ϰ� ���� 1������
		 * �����ؼ� b�� �����Ϸ��� �Ѵ�. 
		 * [��] b[] = {1,3,2,3,4,5}
		 */
		
		/*
		 * 1) b[0]�� arr1�� ù��°���� �����Ѵ�.
		 * 2) arr1[1] ���� ���������� b[0]�� ���ؼ�
		 * 	 �ٸ����� ���ö����� bindex�� �����ϰ�
		 *   b[bindex]�� arr1[i]�� �����Ѵ�.
		 */

		int arr1[] = { 1, 1, 1, 3, 3, 3, 3, 2, 2, 3, 3, 3, 4, 5 };
		int b[] = new int[arr1.length];
		
		b[0] = arr1[0];
		int bindex = 0;
		for(int i = 1; i < arr1.length; i++) {
			if(b[bindex] != arr1[i]) {
				bindex += 1;
				b[bindex] = arr1[i];
			}
		}
		System.out.println(Arrays.toString(b));

	}

}
