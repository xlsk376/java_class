package E1_�迭1_������Ʈ;

import java.util.Random;

public class �迭1_������Ʈ_1��7������_���� {

	public static void main(String[] args) {
		/*
		 * [����] a �迭�ȿ� 1 �Ǵ� 7�� �������� ������ ���. 
		 * [��] 1,7,7,1,1,7,7
		 */
		int[] a = new int[7];
		
		Random ran = new Random();
		
//		for(int i = 0; i < 7; i++) {
//			int r = ran.nextInt(2); // �������� 0,1 ���߿� �ϳ� ������ �ϱ�
//			if(r == 0) {
//				a[i] = 1;
//			}else if(r == 1) {
//				a[i] = 7;
//			}
//		}
//		for(int i = 0; i < 7; i++) {
//			System.out.println(a[i]);
//		}
		
		// �߰����� 1 => 4�� , 7 =>3�� ����
		int c1 = 0;
		int c7 = 0;
		int index = 0; // �ε��� ���������� �ش�Ǵ� ĭ�� ���� ����ĭ�� �ֱ����ؼ�
		while(true) {
			int r = ran.nextInt(2);
			if(r == 0 && c1 < 4) { //r�� 0�̸� 1�� �� , 1�� �� 4�� ���
				a[index] = 1; 
				index += 1; // �ε��� ���������� �ش�Ǵ� ĭ�� ���� ����ĭ�� �ֱ����ؼ�
				c1 += 1;
			}else if(r == 1 && c7 < 3) {
				a[index] = 7;
				index += 1;
				c7 += 1;
			}
			if(c1 == 4 && c7 == 3) {
				break;
			}
		}
		for(int i = 0; i < 7; i++) {
			System.out.println(a[i]);
		}
		
		

	}

}
