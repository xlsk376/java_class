package E5_�迭5_�˰���;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭5_�˰���_�����������ֱ�_���� {

	public static void main(String[] args) {
		/*
		 * [�����������ֱ�]
		  
		  	�Ʒ� 2�����迭�� 3�г�1���� �л����� ǥ���Ѵ�.
		   	���� 4 ���� 5�� �� �л����� 20���̰�,
		   	������ ������ ���л��� �������������� �ʿ��� ������ ���̴�. 
		   	�л����� �ʿ��� ���������� �ٸ���. 	
		   	�������� �����ٷ��� �Ѵ�. �ε�����ġ (0,0) ���� �����ٷ����ϴµ�	
			
		   	�����ֱ� ���ϰ��ϱ����ؼ� ������׷� �����ٷ��� �Ѵ�. 		
			ù��°���� �տ��� ���� �ڷ� �̵��Ѵ�. 3,1,5,4,1 
			�ι�°���� �ڿ��� ���� ������ �̵��Ѵ�. 8,2,4,6,1
			�ٽ� ����°���� �տ������� �ڷ��̵��Ѵ�. 2,3,5,5,2 
			�ٽ� �׹�°���� �ڿ������� ������ �̵��Ѵ�. 2,1,7,1,6 
			  
			�������� �л��� 1~20�� �����ϰ� , ���л��� �ʿ��� ���������� ���� ����Ѵ�.
			 ��) 7 ==> {3 + 1 + 5 + 4 + 1} + {8 + 2}
			 ��) 12 ==> {3 + 1 + 5 + 4 + 1} + {8 + 2 + 4 + 6 + 1} + {2 + 3}
		*/
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int darr[][] = {
				{3,1,5,4,1},
				{1,6,4,2,8},
				{2,3,5,5,2},
				{6,1,7,1,2},
		};
		
//		for(int i = 0; i < 4; i++) {
//			System.out.println(Arrays.toString(darr[i]));
//		}
//		int index = 0;
//		int arr[] = new int[20];
//		
//		for(int i = 0; i < 4; i++ ) {
//			if(i % 2 == 0) {
//				for(int j = 0; j < 5; j++) {
//					arr[index] = darr[i][j];
//					index += 1;
//				}
//			}else {
//				for(int j = 4; j >= 0; j--) {
//					arr[index] = darr[i][j];
//					index += 1;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		System.out.print("�л���ȣ�� �Է��ϼ��� : ");
//		int num = scan.nextInt(); // �ε��� ��ȣ �Է�
//		int total = 0;
//		for(int i = 0; i < 20; i++) { // 20���� �ȵ�, �ε��� ��ȣ�� �صξ��� ������
//			if(arr[num] == i) { // �ε���
//				for(int j = 0; j < num; j++) {
//					total += arr[j];
//					System.out.println(total);
//				}
//			}
//		}
//		System.out.println("�� : "+total);
		
		
		//���� �ۼ� ���� ���
		int d[] = new int[20];
		int index = 0;
		for(int i = 0; i < 4; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < 5; j++) {
					//System.out.print(darr[i][j]+ " ");
					d[index] = darr[i][j];
					index += 1;
//					if(j % 5 == 4) {
//						System.out.println();
//					}
				}
			}else {
				for(int j = 4; j >= 0; j--) {
					//System.out.print(darr[i][j]+ " ");
					d[index] = darr[i][j];
					index += 1;
//					if(j % 5 == 0) {
//						System.out.println();
//					}
				}
			}
		}
		System.out.println(Arrays.toString(d));
		int r = ran.nextInt(20)+1;
		System.out.println(r);
		int a = 0;
		for(int i = 0; i < r; i++) {
			a += d[i];
			System.out.printf("%d ", d[i]);
		}
		System.out.println();
		System.out.println("�� : "+a);
		
		
		// ������� �����ֱ�
//		int r = ran.nextInt(20)+1;
//		System.out.println("r : " + r);
//		int total = 0;
//		int count = r;
//		int a = count / 10;
//		boolean check = false;
//		for(int i = 0; i < 4; i++) {
//			if(i % 2 == 0) {
//				for(int j = 0; j < 5; j++) {
//					System.out.print(darr[i][j] + " ");
//					total += darr[i][j];
//					count -= 1;
//					if(count == 0) {
//						check = true;
//						break;
//					}
//				}
//			}else {
//				int index = 4;
//				for(int j = 0; j < 5; j++) {
//					System.out.print(darr[i][index] + " ");
//					total += darr[i][index];
//					index -= 1;
//					count -= 1;
//					if(count == 0) {
//						check = true;
//						break;
//					}
//					//System.out.println("count : "+count);
//				}
//			}
//			//System.out.println("count : "+count);
//			if(check == true) {
//				break;
//			}
//		}
//		System.out.println();
//		System.out.println(total);
		
		
		

	}

}
