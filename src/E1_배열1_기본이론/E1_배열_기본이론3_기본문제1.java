package E1_�迭1_�⺻�̷�;

public class E1_�迭_�⺻�̷�3_�⺻����1 {

	public static void main(String[] args) {
		/*
		 * 
			 [����1] 10���� 50���� array �迭�� ������ �迭���� ��簪�� ����Ѵ�.
			 [��] 10 20 30 40 50
		
			 [����2] array �迭���� ��簪�� ���Ͽ� ����Ѵ�.
			 [��] 150
		 */
		
		int[] array = new int[5];
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println("--------------------------------------------------");
		int total = 0;
		for(int i = 0; i < 5; i++) {
			total += array[i];
		}
		System.out.println("�� : " + total);

	}

}
