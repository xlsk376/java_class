package E2_�迭2_�˰���;

import java.util.Arrays;
import java.util.Random;

public class �迭2_�˰���_���� {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60};
		
		//���� 	
		// 1) �ε��� 2���� ����(0~5)���� �����ϰ� �� �ε����� ���� ��ȯ
		// 2) �� 1���� 10 �� �ݺ��ϸ� ����  ��� 
		
		//��) 1 , 2 ==> {10,30,20,40,50,60};  // 20 �� 30�� ��ȯ��.
		
		//��) 4 , 1 ==> {10,50,20,40,30,60};  // 50 �� 30�� ��ȯ��.
		
		//��) 3 , 3 ==> {10,50,20,40,30,60}; // ������ �ƹ��ϵ��Ȼ����.
		
		Random ran = new Random();
//		int temp = 0;
//		for(int i = 0; i < 10; i++) {
//			int n1 = ran.nextInt(6);
//			int n2 = ran.nextInt(6);
//			if(n1 == n2) {
//				System.out.println("����"+Arrays.toString(arr));
//			}else {
//				temp = arr[n1];
//				arr[n1] = arr[n2];
//				arr[n2] = temp;
//				System.out.println("����"+Arrays.toString(arr));
//			}
//			
//		}
		for(int i = 0; i < 1000; i++) {
			int r1 = ran.nextInt(arr.length);
			int r2 = ran.nextInt(arr.length);
			
			int temp = arr[r1]; // ������ ���־ �ε����� ���ԵǸ� �ƹ��ϵ� ���Ͼ
			arr[r1] = arr[r2];
			arr[r2] = temp;
			System.out.print(r1 + " " + r2 + " : ");
			System.out.println(Arrays.toString(arr));
		}
		
		
		
		//���� �ۼ�
//		Random ran = new Random();
//		int a = 0;
//		int b = 0;
//		int temp = 0;
//		for(int i = 0; i < 10; i++) { // ���� �ݺ� 10��
//			int n1 = ran.nextInt(6); // �ε���
//			int n2 = ran.nextInt(6);
//			if(n1 != n2) { // ���� ���  // ������ ���־ �ε����� ���ԵǸ� �ƹ��ϵ� ���Ͼ
//				temp = arr[n1];
//				arr[n1] = arr[n2];
//				arr[n2] = temp;
//			}
//			System.out.print(n1 + " " + n2 + " : ");
//			System.out.println(Arrays.toString(arr));
//			
//		}


	}

}
