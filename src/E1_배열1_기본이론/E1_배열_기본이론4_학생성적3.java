package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����3 {

	public static void main(String[] args) {
		/*
		 * numberList = { 1001, 1002, 1003, 1004, 1005 }; scoreList = { 87, 11, 45, 98,
		 * 23 }; [����] �й��� �Է¹޾� ���� ��� [����] �й� �Է� : 1003 ���� : 45��
		 */
		Scanner scan = new Scanner(System.in);

//		int[] numberList = { 1001, 1002, 1003, 1004, 1005 };
//		int[] scoreList = { 87, 11, 45, 98, 23 };
//		int[] number = new int[5];
//		int[] score = new int[5];
//		System.out.println("�й��� �Է��ϼ��� : ");
//		int num = scan.nextInt();
//		int temp = 0;
//		for (int i = 0; i < 5; i++) {
//			if (num == numberList[i]) {
//				System.out.println(numberList[i]);
//				temp = num;
//
//			}
//		}
//
//		// System.out.println("�й� : " + numberList[i] + "���� : " + scoreList[i]);
		
		int[] numberList = { 1001, 1002, 1003, 1004, 1005 };
		int[] scoreList = { 87, 11, 45, 98, 23 };
		
		System.out.println("�й��� �Է��ϼ��� : ");
		int number = scan.nextInt();
		int room = -1;
		for(int i = 0; i < 5; i++) {
			if(number == numberList[i]) {
				room = i;
			}
		}
		System.out.println(scoreList[room]);
		
		
		// �� �籸��
//		int[] numberList = { 1001, 1002, 1003, 1004, 1005 };
//		int[] scoreList = { 87, 11, 45, 98, 23 };
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�й� �Է� : ");
//		int a = scan.nextInt();
		
//		// 1001(numberList[0])�Է� -> 87(scoreList[0])���
		
//		for(int i = 0; i < 5; i++) { // ������ ���� �Է��� �ε�����ȣ�� ���ϱ�
//			if(a == numberList[i]) {
//				System.out.println(scoreList[i]);
//			}
//		}

	}

}
