package E1_�迭1_�⺻�̷�;

public class E1_�迭_�⺻�̷�1_�迭1 {

	public static void main(String[] args) {
		/*
		 * [�迭] (array)
		 * 1. "���� ����"�� �����͸� "������" �����ϱ� ���� ���
		 * 
		 * 2. ����� 
		 * 		
		 * 		int[] array = new int[���� ����];  // [] ���ȣ ��ġ�� �� �� ����������.
		 * 		int array[] = new int[���� ����];
		 * 
		 * 3. �ε���(index)
		 * 		0���� �����ϴ� ���ȣ(index)�� �ο��ȴ�.
		 *      ���ȣ�� ���������� 1�� �����Ѵ�. 
		 *      ��) int array[] = new int[5];//���� ��5�� ����
		 *      ���ȣ�� 0,1,2,3,4
		 *      
		 * 4. �迭�� �ʱ�ȭ 
		 *    �迭�� null �� ����Ѵ�.
		 *    
		 * 5. �迭�� ������ ������ �ʱ�ȭ
		 * 	  �迭�� �ڵ����� ������ 0 �� �����Ѵ�.
		 * 
		 * 6. ���� 
		 * 		������ ���ȣ�� �̿��ؼ� ���������Ѵ�. 
		 * 			array[0] = 1;
		 * 			array[1] = 2;
		 * 
		 * 7. ���� ���� ����ϸ� ������ �߻��Ѵ�.
		 * 			array[10] = 10; 
		 * 
		 */
		
		// 1.�Ϲݺ����� ��������. 
				int num = 0;
				num = 10;
				System.out.println("num = " + num);
				System.out.println("------------------------------");
				
				// 2.�迭
				int[] array = null;	// �迭�� null �� 0 ��� ����Ѵ�.
				array = new int[5]; // ���� 5���� ���ܳ��� �⺻�� 0 �� ����ȴ�.(�ڵ����� ����ȴ�.)
				
				System.out.println(array[0]);				// 0
				System.out.println(array[1]);				// 0
				System.out.println(array[2]);				// 0
				System.out.println(array[3]);				// 0
				System.out.println(array[4]);				// 0
				System.out.println("------------------------------");	
				
				array[0] = 10; // ������ ������ ���� �����Ѵ�. 
				array[1] = 20;
				array[2] = 30;
				array[3] = 40;
				array[4] = 50;
				
				for(int i=0; i<5; i++) {
					System.out.println(array[i]);
				}
				System.out.println();
				
				//array[5] = 100;				���� ���ȣ�� ���� �����ϸ� �����߻��Ѵ�.
				//System.out.println(array[5]); ���� ���ȣ�� ���� ����ϸ� �����߻��Ѵ�.
				
				
				

	}

}
