package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����5 {

	public static void main(String[] args) {
		/* numberList = {1001, 1002, 1003, 1004, 1005};
		 *	scoreList  = {  87,   11,   45,   98,   23};
		 * 
		 *  [����] �й��� �Է¹޾� ���� ����Ѵ�. 
			 		��, �����й� �Է� �� ����ó�� �Ͻÿ�.
			 ��)
			 �й� �Է� : 1002		���� : 11��
			 �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�. 
		 */
//		int[] numberList = {1001, 1002, 1003, 1004, 1005};
//		int[] scoreList  = {  87,   11,   45,   98,   23};
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�й� �Է� : ");
//		int num = scan.nextInt();
//		int room = -1;
//		for(int i = 0; i < 5; i++) {
//			if(num == numberList[i]) {
//				room = i;
//			}
//		}
//		if(room == -1) { // room �� ã�� ���ϸ� -1 �״�� ���
//			System.out.println("�ش��й��� �������� �ʽ��ϴ�.");
//		}else {
//			System.out.println(numberList[room]);
//			System.out.println(scoreList[room]);
//		}
		
		int[] numberList = {1001, 1002, 1003, 1004, 1005};
		int[] scoreList  = {  87,   11,   45,   98,   23};
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("�й� �Է� : ([����] : -1000)");
			int number = scan.nextInt();
			if(number == -1000) {
				System.out.println("����");
				break;
			}else {
				int room = -1; // �������ϸ� �ؿ� ������ �ٽ� �ۼ��ؾ���, 0�� ������ room���� �״�� ���
				for(int i = 0; i < 5; i++) {
					if(number == numberList[i]) {
						room = i;
					}
				}
				if(room == -1) { // room �� ã�� ���ϸ� -1 �״�� ��µȴ�.
					System.out.println("�ش��й��� �������� �ʽ��ϴ�.");
				}else {
					System.out.println(numberList[room]);
					System.out.println(scoreList[room]);
				}
			}			
		}	
		// ctrl + f11 ==> �׽�Ʈ���
		// f11 ==> ������ (�������� �� �˷������ʰ� debug �ιٲ��.)
		
		
		
		

	}

}
