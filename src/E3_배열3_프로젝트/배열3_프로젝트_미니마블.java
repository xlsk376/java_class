package E3_�迭3_������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭3_������Ʈ_�̴ϸ��� {

	public static void main(String[] args) {
		/*
		 [�̴ϸ���]
		 
		 * 1. �÷��̾�� [p1]�� [p2] 2���̴�. �ѹ��� ������ ���鼭 �ൿ�Ѵ�. 
		 * 2. [1.�ֻ���][2.�н�] �� �����Ҽ��ִ�. �ֻ����� (1~4)�� �������� ������. 
		 * 3. �ֻ������ڸ�ŭ ������ġ���� ������ �̵��Ѵ�. 
		 * 4. �̵����ڸ��� �ٸ� �÷��̾�� ���� ��ġ�� ���̰� �Ǹ�,
		 *    ��� �÷��̾�� ������ �Ǿ� �Ǿ�(�ε��� 0) ���� ���� �̵��ȴ�.
		 * 5. ��븦 ���� ��ġ�� �Ǿ�(�ε��� 0)�� ��ġ�� �������� ���������̴�.(�������ʴ´�.)
		 * 6. �̵��Ÿ��� �迭�� ��������ġ�� �ʰ��ϸ�,
		 *    �Ǿ�(�ε��� 0)���� �̵��ϰ� �ʰ��Ѽ��ڸ�ŭ �߰��̵��Ѵ�.
		 * 7. ���� 3������ ���� �̱��.
		 * 
		 *  
		 *  [p1] �ֻ��� : 1
		 *  1 0 0 0 0 0 0 0 0 0
		 *  2 0 0 0 0 0 0 0 0 0
		 *  
		 *  [p2] �ֻ��� : 3
		 *  0 1 0 0 0 0 0 0 0 0
		 *  0 0 0 2 0 0 0 0 0 0
		 *  
		 *  [p1] �ֻ��� : 2
		 *  [p1]�� [p2]�� ��Ҵ�!
		 *  0 0 0 0 1 0 0 0 0 0
		 *  2 0 0 0 0 0 0 0 0 0 
		 */
		Scanner scan = new Scanner(System.in);
		
		int[] map1   = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] map2   = {2, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int p1 = 0;
		int p2 = 0;
		int p1Count = 0;
		int p2Count = 0;
		int turn = 1;
		while(true) {
			System.out.println("p1 : " + p1Count + "����");
			System.out.println("p2 : " + p2Count + "����");
			System.out.println(Arrays.toString(map1));
			System.out.println(Arrays.toString(map2));
			
			if(p1Count == 3 || p2Count == 3) {
				if(p1Count == 3) {
					System.out.println("p1 �¸�");
				}else {
					System.out.println("p2 �¸�");
				}
				break;
			}
			System.out.println("[1]�ֻ��� [2]�н�");
			if(turn % 2 == 1) {
				int n = scan.nextInt();
				if(n == 1) {
					n = scan.nextInt();
					map1[p1] = 0; // �ڱ���ġ�� '0'���� ����
					p1 += n;
					if(p1 >= map1.length) { // map �̵��Ÿ��� �ʰ��� ���
						p1 -= map1.length; // ó������ �̵�
						p1Count += 1; // ���� üũ
					}
					map1[p1] = 1; // �̵��� �ڸ��� '1' �� ����
					System.out.println(n + "��ŭ �̵��մϴ�.");
				}else {
					System.out.println("�н��մϴ�.");
				}
				turn += 1;
			}else {
				int n = scan.nextInt();
				if(n == 1) {
					n = scan.nextInt();
					map2[p2] = 0;
					p2 += n;
					if(p2 >= map2.length) {
						p2 -= map2.length;
						p2Count += 1;
					}
					map2[p2] = 2;
					System.out.println(n + "��ŭ �̵��մϴ�.");
				}else {
					System.out.println("�н��մϴ�.");
				}
				turn += 1;
			}
			if(p1 == p2 && p1 != 0 && p2 != 0) {
				if(turn % 2 == 1) {
					System.out.println("p1 ����");
					map1[p1] = 0;
					p1 = 0;
					map1[p1] = 1;
					
				}else {
					System.out.println("p2 ����");
					map2[p2] = 0;
					p2 = 0;
					map2[p2] = 2;
				}
			}
			
		}

	}

}
