package E5_�迭5_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭5_�˰���_�Ҽ�������ã�� {

	public static void main(String[] args) {
		/*
		 * [�Ҽ�������ã��]
		 * ���� �� ���� �Է¹޾�, 2���� �ش� ���ڱ����� ��� �Ҽ� ���
		 * ��)
		 * �Է� : 20
		 * 2, 3, 5, 7, 11, 13, 17, 19
		 */
		//�����佺�׳׽��� ü // �ڽ�1�� �ܰ���蹮��
		//�Ҽ��� ����� �Ҽ��� �ƴϴ�.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = scan.nextInt();
		int arr[] = new int[1000];
		int index = 0;
//		for(int i = 2; i <= num; i++) { // ����
//			int count = 0;
//			for(int j = 1; j <= i; j++) { // �Ҽ�ã��
//				if(i % j == 0) {
//					count += 1;
//				}
//			}
//			if(count == 2) { // �������� 2���� �� ã��
//				System.out.println(i);
//			}
//		}
//		System.out.println();
		
		for(int i = 2; i <= num; i++) { // �迭�����Ͽ� �ʱ�ȭ
			arr[i] = i;
		}
		System.out.println(Arrays.toString(arr));
		for(int i = 2; i <= num; i++) { // 2���� �����ؼ� Ư�� ���� ����� �ش��ϴ� ���� ��� �����.
			if(arr[i]==0) {				// ���ﶧ �ڱ��ڽ��� ������ �ʰ�, �̹� ������ ���� �ǳʶڴ�.
				continue; // �̹� ������ ����� �ǳʶٱ�
			}
			//�̹� ������ ���ڰ� �ƴ϶��, �� ������� ����Ͽ�, ������ ��� ���� �����
			for(int j = 2*i; j <= num; j+=i) { // 2�� ����� +2, 3�� ���
				arr[j] = 0;
			}
		}
		// 2���� �����Ͽ� �����ִ� ���� ��� ����Ѵ�.
		for(int i = 2; i <= num; i++) {
			if(arr[i] != 0) {
				arr[i] = i;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
