package E1_�迭1_�˰���;

public class �迭1_�˰���_ä�ÿ���_���� {

	public static void main(String[] args) {
		/*
		 * [����1] 
		 * 		array1 �迭�� ������ ������ ��ĭ�� ���� �ǵڿ� a��  ���� �����Ѵ�.
		 * 		[��] array1 = {20,30,40,50,90};
		 * 
		 * [����2] array2 �� �迭�� �ڷ� �ϳ��� �о�� �� �տ� b�� ���� �����Ѵ�.
		 * 		[��] array2 = {60,10,20,30,40};
		 */
		
		//�迭��
		
		int array1[] = { 10,20,30,40,50 };
		int a = 90;
		int temp[] = {0,0,0,0,0};
		
		for(int i = 0; i < 4; i++) { //�־��� �迭�� ���缭 �ݺ��� Ƚ���� �������ش�. �׻� üũ�ϱ�!!
			array1[i] = array1[i+1];//�ڽſ��� �ϳ�ū���� �о�ֱ� ���ش�.
		}
		array1[4] = a; //������ �ε����� 50�� ����������� 90�� �־��ش�.
		for(int i = 0; i < 5; i++) {
			//System.out.println(array1[i]);
		}
		
		int array2[] = { 10,20,30,40,50 };
		int b = 60;
		
		int room = 0;
		for(int i = 0; i < 4; i++) {
			array2[room+1] = array2[room]; // �ȵ� �ι�° �ε������� �� 10�� ����
			System.out.println(array2[room+1]); // �ؿ������� ������� �ϸ� �������� �ٽ� �� �ε����� �־���
		}  	//��) �ε��� 1,2,3,4 -> 1,0,2,3 �� �Ǿ������� �̹� 3���ε����� 2���� �ְ� �̰� �ٽ� �� �Ѱܼ� �־��ְ� �Ǿ� �ݺ������� ���� ���� ū�ε����������� �־��ְ� �ȴ�
		System.out.println();
//		room = 4;
//		for(int i = 0; i < 4; i++) {
//			array2[room] = array2[room-1]; // �ε��� 3 -> 4 , 2 -> 3 , 1 -> 2 ...
//			room -= 1;
//			System.out.println(array2[room]);
//		}
		
//		array2[0] = b;
//		int d = array2[2];
//		int e = array2[3];
//		int f = array2[4];
//		System.out.println(d);
//		System.out.println(e);
//		System.out.println(f);
//		for(int i = 0; i < 5; i++) {
//			System.out.println(array2[i]);
//		}

	}

}
