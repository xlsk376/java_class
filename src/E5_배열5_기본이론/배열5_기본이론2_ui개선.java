package E5_�迭5_�⺻�̷�;

import java.util.Scanner;

public class �迭5_�⺻�̷�2_ui���� {

	public static void main(String[] args) {
		
		int arr[] = { 10, 32, 11, 56, 7 };
		int player = 2; // �ε����� ��
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int select = 0;
		while (run) {

			System.out.println("[���� ���� �����]");
			for (int i = 0; i < arr.length; i++) {
				
				System.out.printf("[%2d]", arr[i]);
			}
			System.out.println();
			for (int i = 0; i < arr.length; i++) {
				if (i == player) {
					System.out.print("[ ��]");
				} else {
					System.out.print("[  ]");
				}
			}
			System.out.println();
			System.out.println("1) left 2) right 3)choice");
			select = scan.nextInt();
			if (select == 1 && player > 0) { // 0���� Ŀ�� ���������� �������� �� ������
				player -= 1;
			} else if (select == 2 && player < arr.length - 1) { // �迭���̺��� �۰�
				player += 1;
			} else if (select == 3) {
				arr[player] = 0;
				run = false; // 0���� ����Ǹ� ���ѹݺ� ����
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != 0) { // 0�� �ƴѼ��� �������� ��� ����
						run = true;
						break;
					}
				}
			}
		}
		System.out.println("[���� ���� �����]");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%2d]", arr[i]);
		}

	}

}
