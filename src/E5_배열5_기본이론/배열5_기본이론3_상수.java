package E5_�迭5_�⺻�̷�;

import java.util.Arrays;

public class �迭5_�⺻�̷�3_��� {

	public static void main(String[] args) {
		int a = 10;
		a = 20;
		
		//��� ==> ������ �ʴ¼� 
		// Ű���� final ==> ���״�� ���������̶�¶� (�����Ұ�)
		
		final int b = 20;
		// b = 30; Ű���� final�� ���̸� �ѹ����Ѱ��� �����Ҽ�����.
		
		// �ڹٴ� �Ϲ������� ����� �빮�ڷ� ǥ���Ѵ�. (�Ϲ����η�)
		final int SIZE = 20;
		int arr[] = new int[SIZE];
		
		System.out.println(Arrays.toString(arr));

	}

}
