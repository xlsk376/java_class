package E7_�迭7_������Ʈ;

import java.util.Arrays;
import java.util.Scanner;

public class �迭7_������Ʈ_�ı����Ǳ� {

	public static void main(String[] args) {
		/*
		 [�ı� ���Ǳ� ���α׷�]		
			 1) ������   2) ����� 
			������ ==> 1) �ı�����   2) �ܵ� ���� 	 3)�ڷΰ���
			����� ==> 1) ���� ==> ==> �Ա� �ݾ� �Է� ==> ���� �ż� �Է�  ==> �ܵ���� 	
		    	       2)�ڷΰ���
			 ���� ) ��) �ܵ��� 7600���̴�. 5000������ ������ 1000��¥�� 7��Ž����ش�. 
			ȭ�� 
			 �ı� ���� : 3200�� 
			 �ı� 	  : ??��  (������ ����) 
			 50000�� : ?? ��  	// 10000�� : ?? ��	// 5000�� : ?? ��
			 1000�� : ?? ��		//  500�� : ?? ��	  	//  100�� : ?? �� 
		*/
		Scanner scan = new Scanner(System.in);
		
		int[] money   = {50000, 10000, 5000, 1000, 500, 100};
		int[] charges = {    1,     1,    1,    1,   5,  10};
		
		int tickets = 5;		// �ı� ����
		int price = 3200;		// �ı� ����
		
		while(true) {
			int temp[][] = new int[money.length][2];
			int index = 0;
			for(int i = 0; i < money.length; i++) {
				temp[index][0] = money[i]; 
				temp[index][1] = charges[i];
				index += 1;
			}
//			for(int i = 0; i < temp.length; i++) {
//				System.out.println(Arrays.toString(temp[i])); // ������ ���� ���� ��� �迭
//			}
			System.out.println("[1]������");
			System.out.println("[2]�����");
			System.out.println("[0]����");
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				while(true) {
					System.out.println("1)�ı�����");
					System.out.println("2)�ܵ�����");
					System.out.println("0)�ڷΰ���");
					
					System.out.print("�޴� ���� : ");
					int choice = scan.nextInt();
					if(choice == 1) {
						System.out.println("������ �����Ͻðڽ��ϱ�?");
						int n = scan.nextInt();
						tickets += n;
						System.out.println(n + " �� �����Ǿ����ϴ�.");
						System.out.println("�� �ı� : " +tickets +" ��");
					}
					else if(choice == 2) {
						System.out.println("[1]50000, [2]10000, [3]5000, [4]1000, [5]500, [6]100");
						int a = scan.nextInt();
						System.out.println("������ ����� �Է��ϼ���");
						int b = scan.nextInt();
						if(a == 1) {
							temp[0][1] += b;
						}else if(a == 2) {
							temp[1][1] += b;
						}else if(a == 3) {
							temp[2][1] += b;
						}else if(a == 4) {
							temp[3][1] += b;
						}else if(a == 5) {
							temp[4][1] += b;
						}else if(a == 6) {
							temp[5][1] += b;
						}
						System.out.println("������ �Ϸ�Ǿ����ϴ�.");
						for(int i = 0; i < temp.length; i++) {
							System.out.println(Arrays.toString(temp[i])); // ������ ���� ���� ��� �迭
						}
					}
					else if(choice == 0) {
						break;
					}
				}
				
			}
			else if(sel == 2) {
				while(true) {
					System.out.println("1)����");					
					System.out.println("0)�ڷΰ���");				
					System.out.print("�޴� ���� : ");
					int choice = scan.nextInt();
					if(choice == 1) { // 1) ���� ==> �Ա� �ݾ� �Է� ==> ���� �ż� �Է�  ==> �ܵ����
						System.out.println("�Ա� �ݾ� �Է�");
						int cash = scan.nextInt();
						System.out.println("���� �ż� �Է�");
						int t = scan.nextInt();
//						ȭ�� 
//						 �ı� ���� : 3200�� 
//						 �ı� 	  : ??��  (������ ����) 
//						 50000�� : ?? ��  	// 10000�� : ?? ��	// 5000�� : ?? ��
//						 1000�� : ?? ��		//  500�� : ?? ��	  	//  100�� : ?? �� 
						int c = price*t;
						System.out.println("�ı� ���� : " + (c) + "�� ");
						System.out.println("�ı�     : " + (tickets-t) +" ��" +" (������ ����)");
						System.out.println("�Ž����� : " + (cash - c));
						int p = cash-c;
						int q = 0; // 50000��
						int w = 0; // 10000��
						int e = 0; // 5000��
						int r = 0; // 1000��
						int z = 0; // 500��
						int x = 0; // 100��
						q = p / temp[0][0];
						w = p % temp[0][0] / temp[1][0];
						e = p % temp[0][0] % temp[1][0] / temp[2][0];
						r = p % temp[0][0] % temp[1][0] % temp[2][0] / temp[3][0];
						z = p % temp[0][0] % temp[1][0] % temp[2][0] % temp[3][0] / temp[4][0];
						x = p % temp[0][0] % temp[1][0] % temp[2][0] % temp[3][0] % temp[4][0] / temp[5][0];
						System.out.printf("%d�� : %d �� ", temp[0][0], q);
						System.out.print(" // ");
						System.out.printf("%d�� : %d �� ", temp[1][0], w);
						System.out.print(" // ");
						System.out.printf("%d�� : %d �� ", temp[2][0], e);
						System.out.println();
						System.out.printf("%d�� : %d �� ", temp[3][0], r);
						System.out.print(" // ");
						System.out.printf("%d�� : %d �� ", temp[4][0], z);
						System.out.print(" // ");
						System.out.printf("%d�� : %d �� ", temp[5][0], x);
						System.out.println();
						
					}
					else if(choice == 0) {
						break;
					}
				}
			}else if(sel == 0) {
				break;
			}
		}

	}

}
