package E3_�迭3_������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭3_������Ʈ_max���� {

	public static void main(String[] args) {
		/*
		 * [max����]
		 * 
		 * 1. ���� ū ���� ã�� �Է��Ѵ�.
		 * 2. �����̸� �ش� ���� 0���� �����Ѵ�.
		 * 3. arr�迭�� ��� ���� 0���� ����Ǹ� ���α׷��� ����ȴ�.
		 * ��)
		 * 11, 87, 42, 100, 24
		 * �Է� : 100
		 * 
		 * 11, 87, 42, 0, 24
		 * �Է� : 87
		 * 
		 * 11, 0, 42, 0, 24
		 * �Է� : 24 ==> �ִ밪�� �ƴϹǷ� �ƹ��ϾȻ���
		 */
		int[] arr = {11, 87, 42, 100, 24};
		
		Scanner scan = new Scanner(System.in);
		int count = arr.length;
		while(true) {
			System.out.println(Arrays.toString(arr));
			System.out.println("ū�� �Է�");
			if(count == 0) {// 0���� �� ��ȯ�Ǹ� �ݺ��� ����
				break;
			}
			int n = scan.nextInt();
			int max = 0;
			int index = 0;
			for(int i = 0; i <arr.length; i++) { // ���� ū�� ã��
				if(max < arr[i]) {
					max = arr[i];
				}
				if(n == arr[i]) { // �Է��� ���� �ε����� ����
					index = i;
				}
			}
			if(arr[index] == max) { // �Է��� ���� ū������ Ȯ���Ŀ� 0���� �����
				arr[index] = 0;
				System.out.println();
				count -= 1; // 0���� ���Ҷ����� -1
			}else {
				System.out.println();
			}
			
		}
		
//		int temp[] = new int[5];
//
//		int count = arr.length;
//		while (true) {
//			System.out.println("--------------------------");
//			System.out.println(Arrays.toString(arr));
//			if (count == 0) {
//				break;
//			}
//			int max = 0;
//			for (int i = 0; i < arr.length; i++) { //���� ū�� ã��
//				if (max < arr[i]) {
//					max = arr[i];
//				}
//			} 
//			// ���� ū���� ������ �ε����� �ٽ� ���� ���ϰ� �ؾ���
//			for(int i = 0; i < arr.length;) { // r�� �ߺ��ȵǰ� �̱�
//				int r = ran.nextInt(5);
//				boolean check = false;
//				for(int j = 0; j < i; j++) {
//					if(temp[j] == r) {
//						check = true;
//						break;
//					}
//				}
//				if(check == false) {
//					temp[i] = r;
//					i += 1;
//				}
//			}
//			System.out.println(Arrays.toString(temp));
//			for(int i = 0; i < temp.length; i++) { // ���� r ���� max�� ���Ͽ� �ֱ�
//				if(arr[temp[i]] == max) {
//					arr[temp[i]] = 0;
//					System.out.println(temp[i] + " " + max + " ����");
//					count -= 1;
//				}
//				
//			}
//
//			
//		}
		
		
		//�ѹ� ��� max�� �� �ڸ��� �н���
//		int[] arr = {11, 87, 42, 100, 24};
//		boolean check[] = new boolean[5];
//		int count = arr.length;
//		System.out.println("--------------------------");
//		System.out.println(Arrays.toString(arr));		
//		while(true) {
//			if(count == 0) {				
//				break;
//			}
//			int r = ran.nextInt(arr.length);
//			int max = 0;
//			if(check[r] == true) {
//				r = 0;
//				continue;
//			}
//			for(int i = 0; i < arr.length; i++) {
//				if(max < arr[i]) {
//					max = arr[i];
//				}
//			}			
//			if(arr[r] == max) {
//				check[r] = true;
//				arr[r] = 0;
//				System.out.println(r + " : " + max + " : ����. ");
//				count -= 1;
//			}else {
//				System.out.println(r + " : " + arr[r] + " : ����ū���� �ƴմϴ�. ");
//			}		
//			System.out.println(Arrays.toString(arr));
//		}
		

	}

}
