package E6_�迭6_������Ʈ;

import java.util.Arrays;

public class �迭6_������Ʈ_�����̱�2 {

	public static void main(String[] args) {
		/*
		 * �� �����ʹ� �����̱� ����� ������ �̴�. (7 x 5) ������
		 * [������ȣ] 
		 * [1 : ȣ����] [2 : ��] [3 : ����] [4 : �⸰]
		 * -------------------------------------------------
		 * [1] ���� 0 �� ����ִ°������Ѵ�.
		 * [2] ���� 0 �� �ƴѰ��� ������ �ִ°��� ���ϰ� ���ڴ� ������ȣ�̴�.
		 * [3] input�� �����ʹ� ���� �մԵ��� ������ ������ �ε�����ȣ�̴�.
		 * [4] ���δ����� �Ѷ����̰�, �ε�����ȣ�� ���η� ������ �ȴ�. (�� 0~4������ ����)
		 * [5] ������ �����κ� �Ʒ��� ���ͻ�����. �žƷ��� �����Ƿ� ���� ��ĭ�� �����´�.
		 * ��) input ==> 1 ==> 2,1,4,1,1 �����̰� �ǾƷ� 1 �� ������ 2,1,4,1 �̵ȴ�.
		 * [6] ���࿡ ���� ���� 0�� ������ �����ϰԵǸ�, "��" ��� 
		 * [7] ���� �Ǹŵ� ���� �̸��� ����Ͻÿ�. 
		 * ��) 
		 *    1 ==> [1:ȣ����]
		 *    0 ==> [2:��]
		 *    0 ==> [4:�⸰]
		 *    3 ==> [3:����]
		 *    3 ==> [0:��]
		 *    4 ==> [3:����]
		 *    4 ==> [4:�⸰]
		 
		 */
			int machine[][] = {
					{0,0,0,0,0},
					{0,0,0,0,3},
					{0,2,0,0,3},
					{3,1,3,0,1},
					{1,4,2,0,2},
					{4,1,4,0,4},
					{2,1,4,3,3},
			};
			int input[] = {1,0,0,3,3,4,4};
			
			for(int i = 0; i < input.length; i++) {
				int x = input[i];
				int y = machine.length-1;
				
				if(machine[y][x] == 0) {
					System.out.println("��");
				}else {
					//[1 : ȣ����] [2 : ��] [3 : ����] [4 : �⸰]
					if(machine[y][x] == 1) {
						System.out.println("ȣ����");  
					}else if(machine[y][x] == 2) {
						System.out.println("��");  
					}else if(machine[y][x] == 3) {
						System.out.println("����");  
					}else if(machine[y][x] == 4) {
						System.out.println("�⸰");  
					}
					// ���� ��ĭ�� �����ش�.
					for(int j = y; j >= 1 ; j--) {
						machine[j][x] = machine[j-1][x];
						System.out.print(machine[j][x] + " ");
					}
					
				}
				System.out.println();
			}
			
			
			// j�� �ڿ������� ���
//			int index = machine.length-1;
//			for(int i = 0; i < input.length; i++) {
//				boolean check = false;
//				for(int j = machine.length-1; j >= 0; j--) {
//					if(machine[j][input[i]] != 0) {
//						check = true;
//						System.out.print(machine[j][input[i]] + " ");
//						machine[j][input[i]] = 0;
//						break;
//					}
//				}
//				if(check == false) {
//					System.out.print("��");
//				}
//				System.out.println();
//			}
			

	}

}
