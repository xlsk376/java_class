package E2_�迭2_������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭2_������Ʈ_�Ｎ���� {

	public static void main(String[] args) {
		/*
		 *  �Ｎ���ǹ���) ����� 7�� �迭�� �ִ�. 
		 *   - [1. ���� ���Ȯ��] �Է½� "��÷" �Ǵ� "��" ��� 
		 *   - 1 �Ǵ� 7��  �������� �迭�� �����Ѵ�.   [��] 1,7,7,1,1,1,7
		 *   - 7�̿������� 3���̻��̸� "��÷" �ƴϸ� "��" �̴�.
		 *   - ��÷�̵Ǹ� 3000�� ȹ���Ѵ�.
		 *   - ���̵Ǹ� 1000�� �����Ѵ�.
		 *   
		 *   [����] �ݵ�� 7�� 3���̻� �־���Ѵ�. 
		 */
//		Random ran = new Random();
//		Scanner scan = new Scanner(System.in);
//		int[] lotto = new int[7];
//		int money = 1000;
//		while(true) {
//			int c7 = 0;
//			for(int i = 0; i < 7; i++) {
//				int r = ran.nextInt(2);
//				if(r == 0) {
//					lotto[i] = 1; // 
//				}else if(r == 1) {
//					lotto[i] = 7; // 7�� 3���̻��� ����
//					c7 += 1;
//				}
//			}
//	//		System.out.println(Arrays.toString(lotto));
//			if(c7 >= 3) { //7�� 3���̻󳪿��� Ż��
//				break;
//			}								
//		}
//		
//		int c7 = 0;
//		boolean win = false;
//		for(int i = 0;  i < 7; i++) {
//			if(lotto[i] == 7) { // �������� 7�� �´��� Ȯ��
//				c7 += 1;
//				if(c7 >= 3) {
//					win = true;
//					break;
//				}
//			}else {
//				c7 = 0;
//			}
//		}
//		System.out.println(Arrays.toString(lotto));
//		System.out.println(win);		
		
		/*
		 *  �Ｎ���ǹ���) ����� 7�� �迭�� �ִ�. 
		 *   - [1. ���� ���Ȯ��] �Է½� "��÷" �Ǵ� "��" ��� 
		 *   - 1 �Ǵ� 7��  �������� �迭�� �����Ѵ�.   [��] 1,7,7,1,1,1,7
		 *   - 7�̿������� 3���̻��̸� "��÷" �ƴϸ� "��" �̴�.
		 *   - ��÷�̵Ǹ� 3000�� ȹ���Ѵ�.
		 *   - ���̵Ǹ� 1000�� �����Ѵ�.
		 *   
		 *   [����] �ݵ�� 7�� 3���̻� �־���Ѵ�. 
		 */

			Scanner scan = new Scanner(System.in);
			Random ran = new Random();
			int[] lotto = new int[7];
			int money = 1000;
			
			boolean run = true;
			while(run) {
				System.out.println("[�ܾ� : " + money + "��]");
				System.out.println("[1. ���� ���Ȯ��]");
				System.out.println("[2. ������]");
				System.out.println("[0. ����]");
				int sel = scan.nextInt();

				if (sel == 1) {
					while(true) {
						int c7 = 0;
						for(int i = 0; i < 7; i++) {
							int r = ran.nextInt(2);
							if(r == 0) {
								lotto[i] = 1;
							}else if(r == 1) {
								lotto[i] = 7;
								c7 += 1;
							}
						}
				//		System.out.println(Arrays.toString(lotto));
						if(c7 >= 3) {
							break;
						}								
					}
					
					int c7 = 0;
					boolean win = false;
					for(int i = 0;  i < 7; i++) {
						if(lotto[i] == 7) {
							c7 += 1;
							if(c7 >= 3) {
								win = true;
								break;
							}
						}else {
							c7 = 0;
						}
					}
					System.out.println(Arrays.toString(lotto));
					System.out.println(win);				
				}
				else if(sel == 2) {
					
				}
				else if(sel == 0){
					break;
				}

			}
	

	}

}
