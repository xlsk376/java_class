package E1_�迭1_�⺻�̷�;

import java.util.Random;

public class E1_�迭_�⺻�̷�4_�л�����1 {

	public static void main(String[] args) {
		/*
		 [����1] array �迭�� 1~100�� ������ ���� ������ 5�� �����ϰ� ���
		 ��)    87, 11, 92, 14, 47
		
		 [����2] �������� ������ ��� ���
		 ��)    ����(251) ���(50.2)
		
		 [����3] ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		 ��)   2��
		 */
		Random ran = new Random();
		
		int[] array = new int[5];
		int total = 0;
		double avg = 0;

		int count = 0;
		for(int i = 0; i < 5; i++) {
			int r = ran.nextInt(100)+1;
			array[i] = r;
			// total += array[i];
			System.out.println(array[i]);
			if(array[i] >= 60) {
				count += 1;
			}
			total += array[i];
		}
		avg = total/5;
		System.out.println("����" +"("+ total + ")"+ "���"+ "("+ avg + ")" );
		System.out.println("�հݻ��� : " + count);
		
		// �� �����ϸ鼭 ���ۼ��� �ڵ�
//		int[] array = new int[5];
//		int total = 0;
//		double avg = 0;
//		int count = 0;
//		int top = 0;
//		int a = 0;
//		for(int i = 0; i < 5; i++) {
//			array[i] = ran.nextInt(100)+1;
//			System.out.println(array[i]);
//			total += array[i];
//			if(array[i] >= 60) {
//				count += 1;
//			}
//			if(top < array[i]) {
//				top = array[i]; // top ����
//				a = i + 1; // top ������ ���� ģ�� ��ȣ
//			}
//			
//		}
//		System.out.println("���� : "+total);
//		avg = total/5.0;
//		System.out.println("��� : "+avg);
//		System.out.println("�հݻ� �� : "+ count);
//		System.out.println(top);
//		System.out.println(a);

	}

}
