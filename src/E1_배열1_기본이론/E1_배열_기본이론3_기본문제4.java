package E1_�迭1_�⺻�̷�;

public class E1_�迭_�⺻�̷�3_�⺻����4 {

	public static void main(String[] args) {
		/*
		[����1] 
		
		 array1�迭 �� array2�迭�� ���ڸ��� ���� temp1������
		 temp1 = {10 + 5 , 20 + 8, 30 + 54, 40 + 32, 50 + 1};
				
		[����2] 
		
		 array1�迭 �� array2�迭�� ���ڸ��� ���� temp2������
		 temp2 = {10 - 5 , 20 - 8, 30 - 54, 40 - 32, 50 - 1};
		 */
		
		int array1[] = {10,20,30,40,50};
		int array2[] = {5,8,54,32,1};
		int temp1[] = new int[5];
		int temp2[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			temp1[i] = array1[i] + array2[i];
			System.out.println(temp1[i]);
		}
		System.out.println("-----------------------------");
		
		for(int i = 0; i <5; i++) {
			temp2[i] = array1[i] - array2[i];
			System.out.println(temp2[i]);
		}

	}

}
