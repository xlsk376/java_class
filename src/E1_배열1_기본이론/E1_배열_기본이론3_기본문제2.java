package E1_�迭1_�⺻�̷�;

public class E1_�迭_�⺻�̷�3_�⺻����2 {

	public static void main(String[] args) {
		/*
		 * 	array = {10,20,30,40,50};
		 * 
			[����1] 4�� ����� ����Ѵ�.
			[��] 20 40
			
			[����2] 4�� ����� ���� ����Ѵ�.
			[��] 60
			
			[����3] 4�� ����� ������ ����Ѵ�.
			[��] 2
		 */
		
		int[] array = {10,20,30,40,50};
		
		for(int i = 0; i < 5; i++) {
			if(array[i]%4 == 0) {
				System.out.println(array[i]);
			}
		}
		System.out.println("--------------------------------");
		
		int total = 0;
		for(int i = 0; i < 5; i++) {
			if(array[i]%4 == 0) {
				System.out.println(array[i]);
				total += array[i];
			}
		}
		System.out.println("�� : " + total);
		
		System.out.println("--------------------------------");
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(array[i]%4 == 0) {
				System.out.println(array[i]);
				count += 1;
			}
		}
		System.out.println("���� : " + count);

	}

}
