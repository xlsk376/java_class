package E2_�迭2_�˰���;

import java.util.Scanner;
import java.util.Arrays;
public class �迭2_�˰���_����ü {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 1) �ε���1 �Է� : 1  , �ε���2 �Է� : 3
		// {10, 40, 30, 20, 50}

		// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 2) ��1 �Է� : 40 , ��2 �Է� : 20
		// {10, 20, 30, 40, 50}
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("�ε���1 :");
//		int index1 = scan.nextInt();
//		System.out.println("�ε���2 :");
//		int index2 = scan.nextInt();
//		int temp = 0;
//		for(int i = 0; i < arr.length; i++) {
//			temp = arr[index1]; // �ε���1������ �ӽ�����ҿ� �Ȱִܳ´�.
//			arr[index1] = arr[index2]; // �����Ϸ��� �ε���2������ �ε���1���� �־��ش�.
//			arr[index2] = temp; // �ӽ������(�ε���1)�� �ε���2���� �־��ش�.
//		}
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		System.out.println("��1 :");
		int value1 = scan.nextInt();
		System.out.println("��2 :");
		int value2 = scan.nextInt();
		int temp = 0;
		int i1 = 0; // �����Ϸ��� �ε�����ȣ�� ���� ����
		int i2 = 0;
		for(int i = 0; i < arr.length; i++) {
			if(value1 == arr[i]) { // �ε�����ȣ�� üũ�ؼ� ����, ���� �����ϸ� for�� ������ �ʱ�ȭ��
				i1 = i;
			}
			if(value2 == arr[i]) { 
				i2 = i;
			}
		}
		temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
		System.out.println(Arrays.toString(arr));
		
		
		//���� �ۼ� ������ �ε����� Ȯ�����Ŀ� ��ü
//		Scanner scan = new Scanner(System.in);
//		System.out.println("��1");
//		int n1 = scan.nextInt();
//		System.out.println("��2");
//		int n2 = scan.nextInt();
//		int a = 0;
//		int b = 0;
//		int index = 0;
//		int temp = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == n1) {
//				a = i;
//			}
//			if(arr[i] == n2) {
//				b = i;
//			}
//		}
//		temp = arr[a];
//		arr[a] = arr[b];
//		arr[b] = temp;
//		System.out.println(Arrays.toString(arr));

	}

}
