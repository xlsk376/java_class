package E1_�迭1_�˰���;

public class �迭1_�˰���_��������_���� {

	public static void main(String[] args) {
		/*
		 * [����1] a�� ���� b�� ���� �����ư��鼭 c�� �����Ѵ�.
		 * [��] 
		 * 	c = {10,40,20,50,30,60}
		 * 
		 * 
		 * [����2] d�� ���� �����ư��鼭 e, f �� ���� ���� 
		 * [��]
		 * 	e = {10,30,50}
		 * 	f = {20,40,60};
		 * 
		 */
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int c[] = {0,0,0,0,0,0};
			
		int d[] = {10,20,30,40,50,60};
		int e[] = {0,0,0};
		int f[] = {0,0,0};
		int index = 0;
		for(int i = 0; i < 3; i++) { //i = 0; a[0]�ְ� �ε��� ����, b[0] ������ �ε����� ���� ���� �ε��� ���� 
			c[index] = a[i];
			index += 1;
			c[index] = b[i];
			index += 1;
		}
		for(int i = 0; i < 6; i++) {
			System.out.println(c[i]);
		}
		index = 0; //index�� 6�� �� �ֱ⶧���� 0���� �ʱ�ȭ �����ش�.
		for(int i = 0; i < 3; i++) {
			e[i] = d[index];
			index += 1;
			f[i] = d[index];
			index += 1;
		}
		for(int i = 0; i < 3; i++) {
			System.out.println(e[i]);
		}
		System.out.println();
		for(int i = 0; i < 3; i++) {
			System.out.println(f[i]);
		}

	}

}
