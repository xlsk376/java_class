package E5_�迭5_�˰���;

import java.util.Arrays;

public class �迭5_�˰���_����Ǯ�� {

	public static void main(String[] args) {
		
		
		/*
	    array[][] = {3,2},{5,6},{2,1},{4,3}
		 �� �����ʹ� ������ �������̴�.
		 ���������� ��Ģ�� 2���� ¦�� �̷��.
		  1) ���� ���� ==> ������ 
		  2) ���� ���� ==> �����̴�.
		 ��) {3,2} ==> 33
		 ��) {5,6} ==> 555555
		 ��) {2,1} ==> 2
		 ��) {4,3} ==> 444
			 ���� �����ʹ� 335555552444 �ΰ��̴�. 
		 ����) �������ͻ����ŭ �迭�� ����� ������ ���� ������ ��� 
		 ��) temp = {3,3,5,5,5,5,5,5,2,4,4,4}
		 */	
		int array[][] = {
				{3,2},{5,6},{2,1},{4,3}
			};
		int [] temp = new int[12];
		int total = 0;
		int index = 0;
		for(int i = 0; i < 4; i++) {
			//total += array[i][1];
			//temp = new int[total];
			
			for(int j = 0; j < array[i][1]; j++) {
				System.out.print(array[i][0]);
				temp[index] = array[i][0];
				index += 1;
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(temp));
		
		// �ٽ� Ǯ� Ǯ�� �Ȱ���
//		int array[][] = {
//				{3,2},{5,6},{2,1},{4,3} // [i] �� ����, [j] �� ����
//			};
//		int [] temp;
//		int count = 0;
//		for(int i = 0; i < array.length; i++) {
//			System.out.print(array[i][0] + " : ");
//			for(int j = 0; j < array[i][1]; j++) {
//				System.out.print(array[i][0] + " ");
//				count += 1;
//			}
//			System.out.println();
//		}
//		temp = new int[count];
//		int index = 0;
//		for(int i = 0; i < array.length; i++) {
//			//System.out.print(array[i][0] + " : ");
//			for(int j = 0; j < array[i][1]; j++) {
//				temp[index] = array[i][0];
//				index += 1;
//			}
//			//System.out.println();
//		}
//		System.out.println(Arrays.toString(temp));
		
		
	}

}
