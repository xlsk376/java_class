package E5_�迭5_�˰���;

import java.util.Arrays;

public class �迭5_�˰���_�����ϱ� {

	public static void main(String[] args) {
		/*
		 �� �����ʹ� ������ �������̴�.
		 �������� �̷��� �����͸� ��� �����ҷ����Ѵ�.
		 ��) 33    ==> {3,2}
		 ��) 55555 ==> {5,5}
		 ��) 3     ==> {3,1};
		 ��) 444   ==> {4,3};
		  0���� �����Ұ� , 1���� ���ӵȰ��� 
		 ����) �� �����������͸� �м��� 2�������� �����Ͻÿ�.
		 */
		int before[] = {3,3,5,5,5,5,5,3,4,4,4};		
		int after[][] = new int[4][2];
		int index = 0;
		after[index][0] = before[0]; // ���� �����ϰ� ��
		after[index][1] = 1;         // ���� ���������Ƿ� +1
		
		//1���� ����, �̹� ó������ �����߱⶧����
		for(int i = 1; i < before.length; i++) {
			if(after[index][0] == before[i]) {
				after[index][1] += 1;
			}else {
				index += 1;
				after[index][0] = before[i];
				after[index][1] = 1;
			}
		}
		for(int i = 0; i < after.length; i++) {
			System.out.println(Arrays.toString(after[i]));
		}
		

	}

}
