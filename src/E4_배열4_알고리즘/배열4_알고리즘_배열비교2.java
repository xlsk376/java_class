package E4_�迭4_�˰���;

import java.util.Arrays;

public class �迭4_�˰���_�迭��2 {

	public static void main(String[] args) {
		/*
		 * [�迭��]
		  
		     arr1 �迭�� input �迭�� ���Ѵ�.
		     ���ΰ��� ���� �ִ��� üũ�Ѵ�.
		     �������� ã���� arr1�� ���� �ִ� �ε����� b�� �����Ѵ�.    
			 input ���ڰ� arr1 �� ������ �ε��� ��� -1 �����Ѵ�.
				  [��]  input[] ==> { 30, 40, 1, 10, 2 }
				  [��]  arr1[] = {10, 20, 30, 40};
				  
					   1) 30 �� arr1[2] �̹Ƿ� 2���� 
					   2) 40 �� arr1[3] �̹Ƿ� 3����
					   3) 1 �� arr1�� �����Ƿ� -1 ����
					   4) 10 �� arr1[0] �̹Ƿ� 0 ����
					   5) 2�� arr1�� �����Ƿ� -1  ���� 	
					   
			 	  [��] b = { 2, 3, -1, 0, -1}
		 */
//		int input[] = {30, 40, 1, 10, 2};
//		int arr[] = {10, 20, 30, 40};
//		
//		int b[] = {-1, -1, -1, -1, -1};
//		int index = 0;
//		int count = 0;
////		for(int i = 0; i < 5; i++) {
////			System.out.println(b[i]);
////		}
//		for(int i = 0; i < input.length; i++) {
//			for(int j = 0; j < arr.length; j++) {
//				if(input[i] == arr[j]) {
//					index = j;
//					b[i] = j;
//					count += 1;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(b));
//		System.out.println(count);
		
		int arr[] = {10, 20, 30, 40};		
		int input[] = {30, 40, 1, 10, 2};		
		int b[] = {-1, -1, -1, -1, -1};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < input.length; j ++) {
				if(arr[i] == input[j]) { // �ִ°��鸸 ��Ƽ� �����Ϸ��� ���ο� �ε����� �������� ����
					b[j] = i;			// �ִ°����� �ش�Ǵ� �ε����� �����ϱ� ���ؼ��� ���� ����
				}
			}
		}		
		for(int i = 0; i < 5; i++) {
			System.out.println(b[i]);
		}

	}

}
