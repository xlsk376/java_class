package E5_�迭5_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭5_�˰���_�����Ҽ�ã�� {

	public static void main(String[] args) {
		/*
		 *  [���� �Ҽ� ã��]
		 * 1. ���ڸ� �� �� �Է¹޴´�.
		 * 2. �Է¹��� ���ں��� ū ù ��° �Ҽ��� ����Ѵ�.
		 * 
		 * ��) Enter Number ? 1000
		 *    1000���� ū ù���� �Ҽ��� 1009
		 * ��) Enter Number ? 500
		 *    500���� ū ù��° �Ҽ��� 503
		 */
		
		// �Ҽ� �Է½� ���� �Ҽ������� �ϱ�
		
		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("Enter Number ? ");
//		int number = scan.nextInt();
//		int count = 0;
//		int combo = 0;
//		int a = 0;
//		while(true) {
//			count = 0;
//			for(int i = 1; i <= number; i++) {
//				if(number % i == 0) {
//					//System.out.println(i);
//					count += 1;
//				}
//			}
//			a = number; // ����� ����
//			number += 1; // �Է��� ���ڸ� ��� ����
//			if(count == 2) {
//				//System.out.println("�Ҽ�");
//				combo += 1; // �Է��� ���ڰ� �Ҽ����� Ȯ�� �Ϸ�� +1
//			}
//			if(combo == 1 ) { // �Է¹��� ���ں��� ū ù ��° �Ҽ��� Ȯ��
//				break;
//			}
//		}
//		System.out.println(a);
		
		
		// ���� �ۼ�, ���� �ڵ��� �Է��� �Ҽ����� ū �Ҽ� ���
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("Enter Number ? ");
//		int number = scan.nextInt(); 
//		int count = 0;
//		
//		while(true) {
//			count = 0;
//			for(int i = 1; i <= number; i++) {
//				if(number % i == 0) {
//					//System.out.println(i);
//					count += 1;
//				}
//			}
//			if(count == 2) {
//				//System.out.println("�Ҽ�");
//				System.out.println(number);
//				break;
//			}else if(count > 2){
//				//System.out.println("�ƴ�");
//				number += 1;
//			}
//		}
		
		// �Ҽ� �Է½� ���� �Ҽ������� �ϱ�
		System.out.print("Enter Number ? ");
		int n = scan.nextInt();
		int a = n;
		while(true) {
			int count = 0;
			a += 1;
			for(int i = 1; i <= a; i++) {
				if(a % i == 0) {
					count += 1;
				}
			}
			if(count == 2) {
				System.out.println(a);
				break;
			}
		}
		
		
 		
			
			
		
		
		
		

	}

}
