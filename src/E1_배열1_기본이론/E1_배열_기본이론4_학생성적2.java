package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����2 {

	public static void main(String[] args) {
		/*
		 * 	 array = { 87, 11, 45, 98, 23 };
		  
			 [����1] �ε����� �Է¹޾� ���� ���
			 [����1] �ε��� �Է� : 1 ���� : 11��
		
			 [����2] ������ �Է¹޾� �ε��� ���
			 [����2] ���� �Է� : 11 �ε��� : 1
		 */
		Scanner scan = new Scanner(System.in);
		
		int[] array = {87,11,45,98,23};
//		System.out.println("�ε����� �Է��ϼ��� : ");
//		int num = scan.nextInt();
//		if(num == 1) { // num�� �迭�ε����� ������ �ս��� ���Ҽ� ���� array[num]
//			System.out.println(array[0]);
//		}else if(num == 2) {
//			System.out.println(array[1]);
//		}else if(num == 3) {
//			System.out.println(array[2]);
//		}else if(num == 4) {
//			System.out.println(array[3]);
//		}else if(num == 5) {
//			System.out.println(array[4]);
//		}
//		System.out.println("-------------------------------");
//		System.out.println("������ �Է��ϼ��� : ");
//		int num = scan.nextInt();
//		if(num == 87) {
//			System.out.println(1);
//		}else if(num == 11) {
//			System.out.println(2);
//		}else if(num == 45) {
//			System.out.println(3);
//		}else if(num == 98) {
//			System.out.println(4);
//		}else if(num == 23) {
//			System.out.println(5);
//		}
		System.out.println("�ε��� �Է� : ");
		int index = scan.nextInt();
		
		System.out.println(array[index]); //���ȣ�� �𸣰� ���� �˶�
		
		System.out.println("������ �Է� : ");
		int score = scan.nextInt();  //��) 11 -> array[1]
		int room = 0; // �߸��Է��Ͽ����� ��µǴ� ��
		for(int i = 0; i < 5; i++) {
			if(array[i] == score) { //�Է¹��� ������ ���ȣ�� ���Ͽ� ã��
				room = i;
			}
		}
		System.out.println(room);
		
		
		
		
		

	}

}
