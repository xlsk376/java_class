package E1_�迭1_�⺻�̷�;

import java.util.Random;

public class E1_�迭_�⺻�̷�3_�⺻����5 {

	public static void main(String[] args) {
		/*
		 * [����]
		 *  array �迭�� 0~100������ ������ 5�� ������ ��簪�� ����Ѵ�.
		 */
		Random ran = new Random();
		int array[] = new int[5];
//		
//		for(int i = 0; i < 5; i++) {
//			array[i] = ran.nextInt(101);
//			System.out.println(array[i]);
//			
//		}
		
		for(int i = 0; i < 5; i++) {
			int r = ran.nextInt(101);
			array[i] = r;
			System.out.println(array[i]);
		}
		

	}

}
