package E1_�迭1_�˰���;

import java.util.Scanner;

public class �迭1_�˰���_��������_���� {

	public static void main(String[] args) {
		/*
		 * 	[����]
		 *  �Ʒ��迭 a �� �ȿ� �ִ� ���� �ϳ� �Է¹޴´�.
		 *  b�迭�ȿ� ������ �Է��� ���� �����ϰ� �����Ѵ�.
		 *  
		 *  [��] 30 ==> b[] = {10,20,40,50,0};
		 *  
		 *  [����] 
		 *  �Ʒ� �迭 c�� ��ȣ�� ���� �ѽ��� �迭�̴�. 
		 *  ��ȣ�� �ϳ��� �Է¹ް� c�迭�� �ִ� ��ȣ�̸�, 
		 *  �׹�ȣ��  ���� �����ϰ� d�迭�� �����Ѵ�.
		 *  
		 *  [��] 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};
		 *  
		 */
//		int a[] = { 10, 20, 30, 40, 50 };
//		int b[] = { 0, 0, 0, 0, 0 };
				
//		Scanner scan = new Scanner(System.in);
		//System.out.println("���� �ε���");
		//int num = scan.nextInt();
		//int index = num;
////		for(int i = 0; i < 5; i++) {// �ع迭ĭ���� Ʋ���� ������ ��, �� ����ϱ�
////			a[index]= 0;
////			b[i] = a[i];
////			System.out.println(b[i]);
////		}
//		for(int i = 0; i < 6; i++) {
//			if(index == c[i]) {
//				c[i] = 0;
//				i += 1;
//				c[i] = 0;
//				d[i] = c[i];
//				System.out.println(d[i]);
//			}
//		}
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 0, 0, 0, 0, 0 };
		int input = 30; // ����������
		int room = 0;
		for(int i = 0; i < 5; i++) {
			if(input != a[i]) { // ���� ���� ���鸸 ���ǹ��� ���ͼ� �����
				b[room] = a[i];
				room += 1; // i���� ���� ����
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.println(b[i]);
		}
		
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = { 0, 0, 0, 0, 0, 0 };
		int find = 1002;
		int index = 0;
		for(int i = 0; i < 6; i+=2) { // i�� ��ȣ ���Ǹ� �ݺ��ؼ� Ȯ���� �� �ֵ��� +2�� ���ش�.
			if(find != c[i]) { // ���� ���� ���鸸 ���ǹ��� ���ͼ� �����
				d[index] = c[i];  
				index += 1;
				d[index] = c[i + 1]; 
				index += 1;
			}
		}
		System.out.println();
		for(int i = 0; i < 6; i++) {
			System.out.print(d[i] + "  ");
		}

	}

}
