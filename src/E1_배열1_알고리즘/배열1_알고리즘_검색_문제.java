package E1_�迭1_�˰���;

import java.util.Scanner;

public class �迭1_�˰���_�˻�_���� {

	public static void main(String[] args) {
		/*
		 *  array = {1001, 20, 1002, 45, 1003, 54};
		 *  
		 *  �й��� ������ �ѽ��̴�. ==>  1001:20 , 1002:45 , 1003:54
		 *  (array[0], array[1]), (array[2], array[3]),(array[4], array[5])
		 *  [����] �й��� �Է��ϸ� ���� ����Ѵ�.
		 *  [��] 1001==>20 , 1003 ==> 54
		 *  
		 *  [����] ������ �Է��ϸ� �й� ����Ѵ�. 
		 *  [��] 20 ==> 1001 , 45 ==> 1002
		 */
		// �鳻�� �ۼ�
//		int array[] = {1001, 20, 1002, 45, 1003, 54};
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�й� �Է� : ");
//		int num = scan.nextInt();
//		int a = 0;
//		int b = 0;
//		for(int i = 0; i < 6; i++) {
//			if(num == array[i]) {
//				i += 1; // �濡 ���Ҽ��� ����
//				System.out.println(array[i]); // ������ 5���� ������ ��� ������ ������ ���������� ��µǴ� �ڸ��� ��ġ�ؾ� �ùٸ�������
//			}
//		}
		
		int array[] = {1001, 20, 1002, 45, 1003, 54};
		
		int num = 1003;
		int score = 0;
		for(int i = 0; i < 6; i++) { 
			if(num == array[i]) { // �й� �Է½� ���� ���
				score = array[i + 1]; // �������̹Ƿ� ���ȣ�� +1�� ���ص� ���
			}
		}
		System.out.println(score );
		score = 45;
		
		for(int i = 0; i < 6; i++) {
			if(score == array[i]) { //���� �Է½� �й� ���
				num = array[i - 1]; //�����̹Ƿ� ���ȣ�� -1�� ���ص� ���
			}
		}
		System.out.println(num);
		
			

	}

}
