package E5_�迭5_������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭5_������Ʈ_��ٸ�_���� {

	public static void main(String[] args) {
		/*
		 * # ��ٸ� ����
		 * 1. �ε��� 0~4�� �ϳ������Ѵ�. (���ΰ����� 5��)
		 * 2. ���� 0 �� ������ �׳� �Ʒ��� ��������.
		 * 3. ���� 1 �� ������ ���������� �̵��� ��������.
		 * 4. ���� 2 �� ������ �������� �̵��� ��������.
		 * 5. ������ �޴� ��� 
		 * [��ȭ] ��ٸ��� �������� ��ġ�غ���.
		 * 
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String menu[] = { "�����", "���", "¥���", "�̸�", "�����" };

		int ladder[][] = { 
				{ 0, 0, 0, 0, 0 }, 
				{ 1, 2, 0, 1, 2 }, 
				{ 0, 1, 2, 0, 0 }, 
				{ 0, 0, 1, 2, 0 },
				{ 1, 2, 0, 1, 2 }, 
				{ 0, 1, 2, 0, 0 }, 
				{ 0, 1, 2, 0, 0 }, 
				{ 0, 0, 1, 2, 0 }, 
				{ 0, 0, 0, 0, 0 } };
		
		//�������� ��ġ
//		for(int i = 1; i < ladder.length-1; i++) {
//			for(int j = 0; j < ladder[i].length; j++) {
//				ladder[i][j] = ran.nextInt(3);
//			}
//		}
//		
//		for(int i = 0; i < ladder.length; i++) {
//			System.out.println(Arrays.toString(ladder[i]));
//		}
//		
//		
//		for(int i = 0; i < ladder.length; i++) {
//			for(int j = 0; j < ladder[i].length; j++) {
//				if(ladder[i][j] == 0) {
//					System.out.print(" �� ");
//				}else if(ladder[i][j] == 1) {
//					System.out.print(" �� ");
//				}else if(ladder[i][j] == 2) {
//					System.out.print(" �� ");
//				}
//			}
//			System.out.println();
//		}
		System.out.println("��ȣ ����");
		int x = scan.nextInt();
		//int x = 0;
		for (int i = 0; i < ladder.length; i++) {
			if (ladder[i][x] == 1) {
				x += 1;
			} else if (ladder[i][x] == 2) {
				x -= 1;
			}
		}
		System.out.println(menu[x]);

	}

}
