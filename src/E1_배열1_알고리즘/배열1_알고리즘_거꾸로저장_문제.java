package E1_�迭1_�˰���;

public class �迭1_�˰���_�Ųٷ�����_���� {

	public static void main(String[] args) {
		/*
		 * a = { 1,2,3,4,5 };
		 * 
		 * [����] a �迭�� ���� b �迭�� �ϳ��� �����ϴµ� ������ �Ųٷ� ���� 
		 * [��]   b = {5,4,3,2,1};
		 */
		//a[0] -> b[4] �̷������� �Ųٷ� ����
		
		int a[] = {1,2,3,4,5};
		int b[] = new int[5];
		
		int index = 5;
		for(int i = 0; i < 5; i++) { // 0~4
			index -= 1;
			b[index] = a[i]; //
			//System.out.println(a[i]);
			//System.out.println(c);
			//System.out.println(b[index]); // b[index]�� 1,2,3,4,5 ���� b[4],b[3],b[2],b[1],b[0] �����
										  // �׷��� ����ϸ� 1,2,3,4,5�� ��µ�	
			//��½� ���� ���� ���� ����ϰ� �Ǹ� ������ �߻��� -> System.out.println(b[6]);
			
		}
		for(int i = 0; i < 5; i++) {
			System.out.println(b[i]);// ����� ������� ����ϸ� b[0] = 5, b[1] = 4 ..., b[4]=1
		}

	}

}
