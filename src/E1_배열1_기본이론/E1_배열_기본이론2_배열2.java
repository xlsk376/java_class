package E1_�迭1_�⺻�̷�;

public class E1_�迭_�⺻�̷�2_�迭2 {

	public static void main(String[] args) {
		/*
		 * 1.�迭 ����(1)
		 */
		int[] array = new int[3];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		
		for(int i = 0; i < 3; i++) {
			System.out.println(array[i]);
		}
		System.out.println("-----------------------------");
		
		/*
		 * 2.�迭 ����(2) : �Ʒ��� ������̴�. (���� ������ ����̴�.)
		 */
		
		int[] temp = {10,20,30};
		
		for(int i = 0; i < 3; i++) {
			System.out.println(temp[i]);
		}
		System.out.println("-----------------------------");
		/*
		 * ��, ������� ó���� �ѹ��� ����ǰ�, ������ ���� �����ϰ� ������ ���� �־���Ѵ�.
		 */
		
		//temp = {40,50,60}; // �̷��� �ѹ��� ������� ���� �����߻�
		temp[0] = 40;
		temp[1] = 50;
		temp[2] = 60;
		for(int i = 0; i < 3; i++) {
			System.out.println(temp[i]);
		}

	}

}
