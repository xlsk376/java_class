package E7_�迭7_�⺻�̷�;

public class �迭7_�⺻�̷�4_�迭���ּҰ���4 {

	public static void main(String[] args) {
		int [][] arr = {
				{10,20,30},
				{10,20,30,40,50},
				{10,20,30,40}
		};
		
		//���Ͱ��� �� ���� ũ�Ⱑ �ٸ� 2�����迭�� �ݺ������� �����
		
		int low = 3;
		int [][] test = new int[low][];
		
		int []list = {3,5,4};
		
		for(int i = 0; i < low; i++) {
			int[] temp = new int[list[i]];
			int value = 10;
			for(int j =0; j < list[i]; j++) {
				temp[j] = value;
				value += 10;
			}
			test[i] = temp;
		}
		
		for(int i = 0; i < test.length; i++) {
			for(int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j] + " ");
			}
			System.out.println();
		}

	}

}
