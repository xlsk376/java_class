package E3_�迭3_�⺻�̷�;

public class �迭3_�⺻�̷�4_�ε�������2 {

	public static void main(String[] args) {
		/*
		 * [����] 
		     b�� ������ arr1�� �ε����̴�.
			 arr1�迭���� b�� ������ ����Ű�� �ε����� ���� ��� 
		 */
		
		int arr1[] = {10,20,30,40,50};
		int b[] = {1,4,0};
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < arr1.length; j++) {
				if(b[i] == j) {
					System.out.println(arr1[j]);
				}
			}
		}
		
		System.out.println("-------------------------");
		for(int i = 0; i < b.length; i++) {
			System.out.println(arr1[b[i]]);
		}
		System.out.println("-------------------------");
		for(int i = 0; i < b.length; i++) {
			int index = b[i];
			System.out.println(arr1[index]);
		}

	}

}
