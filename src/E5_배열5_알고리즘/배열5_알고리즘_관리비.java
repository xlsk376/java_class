package E5_�迭5_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭5_�˰���_������ {

	public static void main(String[] args) {
		/*	
		 ���� 1) ������ ������ �� ���
		 ���� 1) 4400, 7100, 5400		
		 ���� 2) ȣ�� �Է��ϸ� ������ ���
		 ���� 2) �Է� : 202	������ ��� : 2000	
		 ���� 3) ������ ���� ���� ���� ��, ���� ���� �� ���
		 ���� 3) ���� ���� ���� ��(201), ���� ���� ���� ��(303)		
		 ���� 4) ȣ 2���� �Է��ϸ� ������ ��ü (101 , 102) ==>  (2100, 1000)		
		 ���� 5) ������ ���� ���¼������ ������� ȣ�� ��� (����)
		 */
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
		int garo[] = new int[3];
		System.out.println("--ȣ��--");
		for(int i = 0; i < apt.length; i++) {
			System.out.println(Arrays.toString(apt[i]));
		}
		System.out.println();
		System.out.println("--������--");
		for(int i = 0; i < pay.length; i++) {
			System.out.println(Arrays.toString(pay[i]));
		}
		System.out.println();
//		//1) ������ ������ ��
//		System.out.println("�� ���� ������ �� : ");
//		int index = 0;
//		for(int i = 0; i < pay.length; i++) {
//			if(i % 3 == 0) { // x�� 0�϶�
//				for(int j = 0; j < pay[i].length; j++) {
//					garo[index] += pay[i][j];
//				}
//			}
//			if(i % 3 == 1) { // x�� 1�϶�
//				for(int j = 0; j < pay[i].length; j++) {
//					garo[index] += pay[i][j];
//				}
//			}
//			if(i % 3 == 2) { // x�� 2�϶�
//				for(int j = 0; j < pay[i].length; j++) {
//					garo[index] += pay[i][j];
//				}
//			}
//			index += 1;
//		}
//		System.out.println(Arrays.toString(garo));
//		System.out.println();
//		
//		//2) ȣ �Է��ϸ� ������ ���
//		Scanner scan = new Scanner(System.in);
//		System.out.print("ȣ���� �Է��ϼ��� : ");
//		int num = scan.nextInt();
//		int a = 0;
//		int b = 0;
//		for(int i = 0; i < apt.length; i++) {
//			for(int j = 0; j < apt[i].length; j++) {
//				if(num == apt[i][j]) {
//					a = i;
//					b = j;
//				}
//			}
//		}
//		System.out.println("������� : "+ pay[a][b]);
//		
//		//3) ������ ���� ���� ���� ��, ���� ���� �� ���
//		int max = 0;
//		a = 0;
//		b = 0;
//		for(int i = 0; i < pay.length; i++) {
//			for(int j = 0; j < pay[i].length; j++) {
//				if(max < pay[i][j]) {
//					max = pay[i][j];
//					a = i;
//					b = j;
//				}
//			}
//		}
//		System.out.println("--------------------");
//		System.out.println("������ ���� ���� ���� �� : " + apt[a][b]);
//		System.out.println("������� : " + max);
//		System.out.println("--------------------");
//		int min = 4000;
//		a = 0;
//		b = 0;
//		for(int i = 0; i < pay.length; i++) {
//			for(int j = 0; j < pay[i].length; j++) {
//				if(min > pay[i][j]) {
//					min = pay[i][j];
//					a = i;
//					b = j;
//				}
//			}
//		}
//		System.out.println("--------------------");
//		System.out.println("������ ���� ���� ���� �� : " + apt[a][b]);
//		System.out.println("������� : " + min);
//		System.out.println("--------------------");
		
		//4) ȣ 2���� �Է��ϸ� ������ ��ü (101 , 102) ==>  (2100, 1000)
//		Scanner scan = new Scanner(System.in);
//		System.out.println("������ ȣ���� �Է��ϼ���.");
//		int ho1 = scan.nextInt();
//		int ho2 = scan.nextInt();
//		int id1 = 0;
//		int id2 = 0;
//		int id3 = 0;
//		int id4 = 0;
//		int temp1 = 0;
//		int temp2 = 0;
//		for(int i = 0; i < apt.length; i++) {
//			for(int j = 0; j < apt[i].length; j++) {
//				if(ho1 == apt[i][j]) {
//					id1 = i;
//					id2 = j;
//				}
//				if(ho2 == apt[i][j]) {
//					id3 = i;
//					id4 = j;
//				}
//			}
//		}
//		temp1 = pay[id1][id2];
//		temp2 = pay[id3][id4];
//		pay[id1][id2] = temp2;
//		pay[id3][id4] = temp1;
//		System.out.println(ho1 + " , " + ho2);
//		for(int i = 0; i < pay.length; i++) {
//			System.out.println(Arrays.toString(pay[i]));
//		}
		
		//5) ������ ���� ���¼������ ������� ȣ�� ��� (����)
		/*
		 * 2���� ������ 1�������� �����ϱ�
		 */
		int arr[] = new int[9];
		int index = 0;
		for(int i = 0; i < pay.length; i++) {
			for(int j = 0; j < pay[i].length; j++) {
				arr[index] = pay[i][j]; // 2�����迭 -> 1�����迭
				index += 1; // ���� ��Ŵ  
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("----------------------------------------------------");
		
		int arr1[] = new int[9];
		int index1 = 0;
		for(int i = 0; i < apt.length; i++) {
			for(int j = 0; j < apt[i].length; j++) {
				arr1[index1] = apt[i][j];
				index1 += 1;
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println("----------------------------------------------------");
		
		int temp = 0;
		int temp1 = 0;
		for(int i = 0; i < arr.length; i++) { // i�� �����ϸ鼭 j�� ���ϴ� ������ ���� 
			for(int j = 0; j < i; j++) {
				if(arr[i] > arr[j]) { // i ����
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					temp1 = arr1[j];
					arr1[j] = arr1[i];
					arr1[i] = temp1;
							
				}
			}
//			System.out.println(Arrays.toString(arr));
//			System.out.println();
//			System.out.println(Arrays.toString(arr1));
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println(Arrays.toString(arr1));
		
		
		
		// ���� �ۼ�
		
//		int[] garo = new int[3];
//		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				garo[i] += pay[i][j];
//			}
//		}
//		System.out.println(Arrays.toString(garo));
//		���� 2) ȣ�� �Է��ϸ� ������ ���
//		 ���� 2) �Է� : 202	������ ��� : 2000	
//		System.out.println("ȣ�� �Է��ϼ���.");
//		int n = scan.nextInt();
//		int a = 0;
//		int b = 0;
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				if(n == apt[i][j]) {
//					a = i;
//					b = j;
//				}
//			}
//		}
//		System.out.println(n + " " + pay[a][b]);
		 
//		 ���� 3) ������ ���� ���� ���� ��, ���� ���� �� ���
//		 ���� 3) ���� ���� ���� ��(201), ���� ���� ���� ��(303)	
//		int max = 0;
//		int min = pay[0][0];
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		int d = 0;
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				if(max < pay[i][j]) {
//					max = pay[i][j];
//					a = i;
//					b = j;
//				}
//				if(min > pay[i][j]) {
//					min = pay[i][j];
//					c = i;
//					d = j;
//				}
//			}
//		}
//		System.out.println(apt[a][b] + " " + apt[c][d]);
		
//		 ���� 4) ȣ 2���� �Է��ϸ� ������ ��ü (101 , 102) ==>  (2100, 1000)	
//		System.out.println("������ ȣ���� �ΰ� �Է��ϼ���.");
//		int n1 = scan.nextInt();
//		int n2 = scan.nextInt();
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		int d = 0;
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				if(n1 == apt[i][j]) {
//					a = i;
//					b = j;
//				}
//				if(n2 == apt[i][j]) {
//					c = i;
//					d = j;
//				}
//			}
//		}
//		int temp = pay[a][b];
//		pay[a][b] = pay[c][d];
//		pay[c][d] = temp;
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.println(Arrays.toString(pay[i]));
//		}
		
//		 ���� 5) ������ ���� ���¼������ ������� ȣ�� ��� (����)
//		int index = 0;
//		int temp[] = new int[9];
//		int ho[] = new int[temp.length];
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				temp[index] = pay[i][j];
//				ho[index] = apt[i][j];
//				index += 1;
//			}
//		}
//		System.out.println(Arrays.toString(temp));
//		System.out.println(Arrays.toString(ho));
//		index = 0;
//		int a = 0;
//		int b = 0;
//		for(int i = 0; i< temp.length; i++) {
//			for(int j = 0; j < i; j++) {
//				if(temp[i] > temp[j]) {
//					a = temp[i];
//					temp[i] = temp[j];
//					temp[j] = a;
//					b = ho[i];
//					ho[i] = ho[j];
//					ho[j] = b;
//				}
//				
//			}
//		}
//		System.out.println(Arrays.toString(temp));
//		System.out.println(Arrays.toString(ho));
//		index = 0;
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				pay[i][j] = temp[index];
//				apt[i][j] = ho[index];
//				index += 1;
//			}
//		}
//		for(int i = 0; i < 3; i++) {
//			System.out.println(Arrays.toString(pay[i]));
//		}
//		for(int i = 0; i < 3; i++) {
//			System.out.println(Arrays.toString(apt[i]));
//		}
		

	}

}
