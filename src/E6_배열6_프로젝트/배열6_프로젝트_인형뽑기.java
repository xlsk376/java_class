package E6_�迭6_������Ʈ;

import java.util.Arrays;

public class �迭6_������Ʈ_�����̱� {

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
		 * [5] ������ �����κ� ������������ �����Եȴ�. 
		 * ��) input ==> 1 ==> 2,1,4,1,1 �����̰� ������ 2�� 0�̵ȴ�.
		 * [6] ���࿡ ���� ���� 0�� ������ �����ϰԵǸ�, "��" ��� 
		 * [7] ���� �Ǹŵ� ���� �̸��� ����Ͻÿ�. 
		 * ��) 
		 *    1 ==> [2:��]
		 *    0 ==> [3:����]
		 *    0 ==> [1:ȣ����]
		 *    3 ==> [3:����]
		 *    3 ==> [0:��]
		 *    4 ==> [3:����]
		 *    4 ==> [3:����]
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
			
//			for(int i = 0; i < input.length; i++) {
//				for(int j = 0; j < machine.length; j++) {
//					System.out.print(machine[j][input[i]] + " "); // input�� �ش�Ǵ� ���� ���
//				}
//				System.out.println();
//			}
//			int temp[] = new int[input.length];
//			for(int i = 0; i < input.length; i++) {
//				for(int j = 0; j < machine.length; j++) {
//					if(machine[j][input[i]] != 0) {
//						System.out.print(j + " ");
//						temp[i] = machine[j][input[i]];
//						machine[j][input[i]] = 0;
//						break;
//					}
//				}
//			}
//			System.out.println(Arrays.toString(temp));
//			// [1 : ȣ����] [2 : ��] [3 : ����] [4 : �⸰]
//			for(int i = 0; i < temp.length; i++) {
//				if(temp[i] == 1) {
//					System.out.println("[1:ȣ����]");
//				}else if(temp[i] == 2) {
//					System.out.println("[2:��]");
//				}else if(temp[i] == 3) {
//					System.out.println("[3:����]");
//				}else if(temp[i] == 4) {
//					System.out.println("[4:�⸰]");
//				}else if(temp[i] == 0) {
//					System.out.println("[0:��]");
//				}
//			}
			
			for(int i = 0; i < input.length; i++) {
				boolean check = false;
				for(int j = 0; j < machine.length; j++) {
					if(machine[j][input[i]] != 0) {
						check = true;
						System.out.print(machine[j][input[i]]);
						machine[j][input[i]] = 0;
						break;
					}
				}
				if(check == false) {
					System.out.print("��");
				}
				System.out.println();
			}
			
			
	}

}
