package E3_�迭3_�˰���;

import java.util.Arrays;

public class �迭3_�˰���_�����ϱ�1 {

	public static void main(String[] args) {
		/*
		 * 1) seatList �� ���� ��ȭ�� ���Ż�Ȳ �̴�.
		 * 2) seatIndex �� ���� �ҷ��� �¼� ��ȣ�̰�
		 * 3) user �� ȸ����ȣ�̴� 
		 * 
		 * 4) seatIndex �� user �� ������ ������ ��ü ���Ż�Ȳ ��� 
		 * 5) �¼��� ��������� �����Ҽ��ִ�.
		 * 6) �¼��� �̹� ���� �Ǿ������� ���� �Ұ� 
		 * 
		 * -��) 2 , 1003 ==> seatList[] = {1003,1003,1003,0,1002,0,1001};
		 * -��) 1 , 1002 ==> "x";
		 * -��) 3 , 1005 ==> seatList[] = {1003,1003,1003,1005,1002,0,1001};
		 * 
		 */
		
		int seatList[] = {1003,1003,0,0,1002,0,1001};
		
		int seatIndex[] = {2,1,3};
		int user [] = {1003,1002,1005};
		
		for(int i = 0; i < 3; i++) {
			int index = seatIndex[i]; // �ڸ��ε����� �ڸ�����Ʈ�ε����� �����Ͽ� �� ���� �Ǻ�,. index�� �������� ���� seatList[seatIndex[]]�� ǥ���ص� ��
			int value = seatList[index]; 
			if(value == 0) {
				seatList[index] = user[i];
				System.out.println(Arrays.toString(seatList));
			}else {
				System.out.println("x");
			}
			
//			if(seatList[seatIndex[i]] == 0) {
//				seatList[seatIndex[i]] = user[i];
//				System.out.println(Arrays.toString(seatList));
//			}else {
//				System.out.println("x");
//			}
		}

	}

}
