package E4_�迭4_������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭4_������Ʈ_ƽ���� {

	public static void main(String[] args) {
		/* 
		 * [ƽ����]
		 *  
		 * 	����1) ���� ũ�ҿ� "ƽ����" �˻��� ������ �ѹ��ϰ� 
		 * 	          �Ʒ��Ͱ��� ������.
		 *  ����2) P1 , P2 �� �÷��̾ �����ư��鼭 �÷���.
		 *  ����3) ���� ������ �ϼ��ϸ� �¸�
		 *  [��õ����] P2 �� com���� ��ü�غ���.(com�� �������� �÷���)
		 *
		 *=============
		 * [ó��ȭ��]
		 * 0,0,0
		 * 0,0,0
		 * 0,0,0
		 * [p1]�ε��� �Է� : 6
		 * =============
		 * [1��]
		 * 0,0,0
		 * 0,0,0
		 * 1,0,0
		 * [p2]�ε��� �Է� : 1
		 * =============
		 * [2��]
		 * 0,2,0
		 * 0,0,0
		 * 1,0,0
		 * [p1]�ε��� �Է� : 3
		 * =============
		 * [3��]
		 * 0,2,0
		 * 1,0,0
		 * 1,0,0
		 * [p2]�ε��� �Է� : 2
		 * =============
		 * [4��]
		 * 0,2,2
		 * 1,0,0
		 * 1,0,0
		 * [p1]�ε��� �Է� : 0
		 * =============
		 * [5��]
		 * 1,2,2
		 * 1,0,0
		 * 1,0,0
		 * [p1] �¸�
		 * 
		 */
		
		int[] tic = new int[9];
		int index = 0;
		int turn = 1;
		int p1 = 0;
		int p2 = 0;
		boolean check[] = new boolean[9]; // �ߺ��� üũ�ϱ�
		System.out.println(Arrays.toString(check));
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println(Arrays.toString(tic));
		System.out.println();
		while(true) {
			for(int i = 0; i < tic.length; i++) {
				System.out.print(" "+ tic[i] + " "); // ���� ������� 
				if(i % 3 == 2) {
					System.out.println(); // ����
				}
			}
			if(p1 == 5 || p2 == 4) {
				System.out.println("���º�");
				break;
			}
			if(tic[0] == 1 && tic[1] == 1 && tic[2] == 1) {
				System.out.println("P1�¸�");
				System.out.println("1");
				break;
			}else if(tic[3] == 1 && tic[4] == 1 && tic[5] == 1) {
				System.out.println("P1�¸�");
				System.out.println("2");
				break;
			}else if(tic[6] == 1 && tic[7] == 1 && tic[8] == 1) {
				System.out.println("P1�¸�");
				System.out.println("3");
				break;
			}else if(tic[0] == 1 && tic[3] == 1 && tic[6] == 1) {
				System.out.println("P1�¸�");
				System.out.println("4");
				break;
			}else if(tic[1] == 1 && tic[4] == 1 && tic[7] == 1) {
				System.out.println("P1�¸�");
				System.out.println("5");
				break;
			}else if(tic[2] == 1 && tic[5] == 1 && tic[8] == 1) {
				System.out.println("P1�¸�");
				System.out.println("6");
				break;
			}else if(tic[0] == 1 && tic[4] == 1 && tic[8] == 1) {
				System.out.println("P1�¸�");
				System.out.println("7");
				break;
			}else if(tic[2] == 1 && tic[4] == 1 && tic[6] == 1) {
				System.out.println("P1�¸�");
				System.out.println("8");
				break;
			}else if(tic[0] == 2 && tic[1] == 2 && tic[2] == 2) {
				System.out.println("P2�¸�");
				System.out.println("1");
				break;
			}else if(tic[3] == 2 && tic[4] == 2 && tic[5] == 2) {
				System.out.println("P2�¸�");
				System.out.println("2");
				break;
			}else if(tic[6] == 2 && tic[7] == 2 && tic[8] == 2) {
				System.out.println("P2�¸�");
				System.out.println("3");
				break;
			}else if(tic[0] == 2 && tic[3] == 2 && tic[6] == 2) {
				System.out.println("P2�¸�");
				System.out.println("4");
				break;
			}else if(tic[1] == 2 && tic[4] == 2 && tic[7] == 2) {
				System.out.println("P2�¸�");
				System.out.println("5");
				break;
			}else if(tic[2] == 2 && tic[5] == 2 && tic[8] == 2) {
				System.out.println("P2�¸�");
				System.out.println("6");
				break;
			}else if(tic[0] == 2 && tic[4] == 2 && tic[8] == 2) {
				System.out.println("P2�¸�");
				System.out.println("7");
				break;
			}else if(tic[2] == 2 && tic[4] == 2 && tic[6] == 2) {
				System.out.println("P2�¸�");
				System.out.println("8");
				break;
			}
			
			if(turn % 2 == 1) {
				System.out.print("P1 turn : ");
				index = scan.nextInt();
				if(index < 0 || index > 9) {
					System.out.println("�ٽ��Է��ϼ���.");
				}else {
					if(check[index] == true) {
						System.out.println("�ߺ��Դϴ�.");
					}else {
						check[index] = true;
						tic[index] = 1;
						turn += 1;
						p1 += 1;
					}
				}
				
			}else if(turn % 2 == 0) {
				System.out.print("P2 turn : ");
				index = scan.nextInt();
				if(index < 0 || index > 9) {
					System.out.println("�ٽ��Է��ϼ���.");
				}else {
					if(check[index] == true) {
						System.out.println("�ߺ��Դϴ�.");
					}else {
						check[index] = true;
						tic[index] = 2;
						turn += 1;
						p2 += 1;
					}
				}
				
			}
			
			
		}

	}

}
