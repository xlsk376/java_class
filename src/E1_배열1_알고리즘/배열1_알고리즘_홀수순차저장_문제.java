package E1_�迭1_�˰���;

public class �迭1_�˰���_Ȧ����������_���� {

	public static void main(String[] args) {
		/*
		 * [����1] ���� ����Ʈ�� �̿��ؼ� arr1 �� ���� Ȧ���� b �� ����(��ġ�� ��������ġ�� ����)
		 * [��]   b = { 0, 49, 51, 0, 17 }
		 * 
		 * [����2] ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����
		 * [����] ��ġ�� �տ��� ���� �����Ѵ�. 
		 * [��]   c = { 49, 51, 17, 0, 0 }
		 */
		int arr1[] = { 10, 49, 51, 36, 17 };	
		int b[] = { 0,0,0,0,0 };	
		int c[] = { 0,0,0,0,0 };
		
		for(int i = 0; i < 5; i++) {
			if(arr1[i]%2 != 0) {
				b[i] = arr1[i]; // �ش�Ǵ� �ε����� ��ġ�� ���� ���, b = { 0, 49, 51, 0, 17 }
				//System.out.println(b[i]);
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		int room = 0;
		for(int i = 0; i < 5; i++) {
			if(arr1[i]%2 != 0) {
				c[room] = arr1[i]; // c�� �ε����� ���������� �������� ����, c = { 49, 51, 17, 0, 0 }
				room += 1;
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(c[i] + " ");
		}
		

	}

}
