package E2_�迭2_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭2_�˰���_��ȭ���� {

	public static void main(String[] args) {
		/*
		 * # ��ȭ�� �¼�����
		 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
		 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
		 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
		 * 4. �� �¼��� ���� ������ 12000���̴�.
		 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� �ݾ��� ����Ѵ�.
		 * ��)
		 * seat = 0 0 0 0 0 0 0
		 * 
		 * �¼����� : 1
		 * seat = 0 1 0 0 0 0 0
		 * 
		 * �¼����� : 3
		 * seat = 0 1 0 1 0 0 0
		 *  
		 * �¼����� : 3
		 * seat = 0 1 0 1 0 0 0
		 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
		 * ----------------------
		 * �ѱݾ� : 24000��
		 */
		
		
		Scanner scan = new Scanner(System.in);		
		int[] seat = new int[7];
		int count = 0;
		boolean run = true;
		while(run) {
			System.out.println();
			System.out.println("=�ް� ��ȭ��=");				
			System.out.println("1.�¼�����");
			System.out.println("2.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				for(int i = 0; i < 7; i++) {
					System.out.print(seat[i] + " ");
				}
				System.out.println();	
				System.out.println("������ �¼��� �Է��ϼ���.");
				int c = scan.nextInt();
				for(int i = 0; i < 7; i++) { 
					if(seat[c] == 0) { //�̹� ���ŵ� �ڼ��� ������ ����
						seat[c] = 1;
						break;
					}else if(seat[c] == 1) { // �̹� ���ŵ� �ڼ��� ������ �ִٰ� ǥ��
						System.out.println("���ŵ� �ڸ�");
						break;
					}
				}
				System.out.println(Arrays.toString(seat)); // ������ �¼� ȭ��
			}
			else if(sel == 2) {
				for(int i = 0; i < 7; i++) {
					if(seat[i] == 1) { // ������ �¼��� üũ
						count += 1;
					}
				}
				System.out.println("�����¼� : "+ Arrays.toString(seat));
				System.out.println("�ѱݾ� : "+ (count*12000));
				run = false;
			}
		}
		
		
		// --------------------------------------------------------
		
		
		//���� �ۼ� 
//		Scanner scan = new Scanner(System.in);
//		int seat[] = new int[7];
//		int count = 0;
//		while(true) {
//			System.out.println("=�ް� ��ȭ��=");				
//			System.out.println("1.�¼�����");
//			System.out.println("2.����");
//			
//			System.out.print("�޴� ���� : ");
//			int sel = scan.nextInt();
//			if(sel == 1) {
//				for(int i = 0; i < 7; i++) {
//					System.out.print(seat[i] + " ");
//				}
//				System.out.println();	
//				System.out.println("������ �¼��� �Է��ϼ���.");
//				int num = scan.nextInt();
//				if(seat[num] == 0) {
//					seat[num] = 1;
//					count += 1;
//				}else if(seat[num] == 1){
//					System.out.println("�̹� ������ �¼��Դϴ�.");
//				}
//			}
//			else if(sel == 2) { // ���������� 1�� ������ �¼����� ������ �������� 1�� üũ�ؼ� ����ϴ°� ����
//				System.out.println(Arrays.toString(seat));
//				System.out.println("�ݾ� : " + (count*12000) + " " +count);
//				System.out.println("����������.");
//				break;
//			}
//		}

		

	}

}
