package E2_�迭2_������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭2_������Ʈ_1to4���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 * 
		 * [1to4 ����]
		 * 
		 * [1] arr�迭�� 1~4 ������ ���ڸ� �ߺ����� �����Ѵ�.
		 * [2] ����ڴ� ����������1���� ������� �ش� ���ȣ(�ε���)�� �Է��Ѵ�.
		 * [3] ������ ���߸� �ش� ���� 9�� ����Ǿ� ��� ���� 9�� �Ǹ� ������ ����ȴ�.
		 * 
		 * [��]
		 * 
		 * ���� : { 4 2 3 1 }
		 * 
		 * �ε��� �Է� : 3  ==> { 4 2 3 9 } ==> 1�� �����������̹Ƿ� 9�� �����Ѵ�.
		 * 
		 * �ε��� �Է� : 0 ==>  { 4 2 3 9 }  ==> 4�� �������������ƴϹǷ� ��ȭ������.
	     *
		 */
		int[] arr = new int[4];
		boolean[] check = new boolean[4];
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 4; ) { // ���ѹݺ�
			int r = ran.nextInt(4);
			if(check[r] == false) { // ������̸�
				check[r] = true; // true�� �������ְ� ���� �־��ش�.
				arr[i] = r;
				i += 1; //�ε�������
			}
		}
		
		for(int i = 0; i < 4; i++) { // 1~4�̱� ������ �߰��� 1�� ������ 
			arr[i] += 1;
		}
		//System.out.println(Arrays.toString(arr));
		
		int count = 1; // 1���� ���� => 1 ~ 4
		while(true) { // ���� ����
			System.out.println(Arrays.toString(arr));
			if(count > 4) { // 
				break;
			}
			System.out.println("���� ���� ������ ��ġ(0~3)�� �����ϼ��� : ");
			int sel = scan.nextInt();
			if(arr[sel] == count) { // ī��Ʈ�� 1~4������ �� üũ �� Ƚ�� üũ
				count += 1;
				arr[sel] = 9;
			}
		}

	}

}
