package E2_�迭2_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭2_�˰���_ȸ������_���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int[] arr = {0, 0, 0, 0, 0};	
		int count = 0;
		while(true) { // ���� ������ ���ѹݺ�
			System.out.println("===[ȸ������]===");
			System.out.println(Arrays.toString(arr)); // ���� ����� ���̵� ������
			System.out.println("1.�߰�");
			System.out.println("2.����");
			System.out.println("3.����(�ε���)");
			System.out.println("4.����(��)");
			System.out.println("5.����");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(count == 5) { // ���̵� �迭�� ���� ���� Ȯ��
					System.out.println("������.");
					//continue;
				}else {
					System.out.println("[�߰�] �Է� : ");
					int data = scan.nextInt();				
					// ��ȿ�� �˻� , �׻� üũ���ֱ�
					boolean check = false; 
					for(int i = 0; i < count; i++) {
						if(data == arr[i]) { // �Է��� ���̵� ����� ���� ��
							check = true; // �ߺ��̸� true
							break; // ����� ������� �� �ݺ����ʿ����.
						}
					}
					if(check == true) {
						System.out.println("�ߺ�. ");
					}else {
						arr[count] = data; // �ߺ��� �ƴ϶�� ���̵� �迭�� �־���
						count += 1; // ����� ĭ
						System.out.println("�߰�����. ");
					}
				}		
			}else if(sel == 2) {
				System.out.println("[����] ���Է� : ");
				int data = scan.nextInt();
				boolean check = false;
				int index = -1; 
				for(int i = 0; i  < count ;i++) {
					if(data == arr[i]) { // ���̵��� ���翩�� Ȯ��
						check = true; 
						index = i; // ������ ������ �ε���.
					}
				}
				if(check == true) { // ���̵� ����
					System.out.println("[��ü] ���Է� : ");
					data = scan.nextInt();
					check = false;
					for(int i = 0; i < count; i++) {
						if(data == arr[i]) { // ��ü�Ϸ��� ���̵��� ���翩�� Ȯ��
							check = true;
							break;
						}
					}
					if(check == true) { //������ �ִ� ���̵� ����
						System.out.println("�ߺ���. ");
					}else {
						arr[index] = data; // ������ ����
						System.out.println("�����Ϸ�. ");
					}
					
					
				}else { // �Է¾���
					System.out.println("������ ����. ");
				}
			}else if(sel == 3) {
				if(count == 0) {
					System.out.println("����������.");
					continue;
				}
				System.out.println("[����] �ε��� �Է� : ");
				int index = scan.nextInt();
				
				if(index < 0 || index >= count) { // ��������� ����
					System.out.println("�Է� ����.");
					continue;
				}
				
				for(int i = index; i < count-1; i++) { // ���� ī��Ʈ�� �������� ���Ե����� �տ� �ε����� ���̵� �Ȱ���
					arr[i] = arr[i + 1]; // ���̵� ������ �ڿ��ִ� ���� ������ �Ѿ
				}
				arr[count-1] = 0;
				count -= 1;
				System.out.println("�����Ϸ�.");
				
			}
			else if(sel == 4) {
				if(count == 0) {
					System.out.println("����� 0�Դϴ�.");
					continue;
				}
				System.out.println("[����] ���Է� : ");
				int data = scan.nextInt();
				boolean check = false;
				int index = -1;
				
				for(int i = 0; i < count ; i++) {
					if(data == arr[i]) {
						check = true;
						index = i;
					}
				}
				
				if(check == true) {
					for(int i = index; i < count-1; i++) {
						arr[i] = arr[i + 1];
					}
					arr[count-1] = 0;
					count -= 1;
					System.out.println("�����Ϸ�.");
				}else {
					System.out.println("������ ����. ");
				}
			}else if(sel == 5) {
				if(count == 5) {
					System.out.println("������.");
					continue;
				}
				System.out.println("[����] �ε��� �Է� : ");
				int index = scan.nextInt();
				if(index < 0 || index > count) { // �����Ҷ� ������ �ִ� ���̵� �о�� ���� �տ� �߰���
					System.out.println("�ε��� ����.");
					continue;
				}
				System.out.println("[����] �� �Է� : ");
				int data = scan.nextInt();
				
				boolean check = false;
				for(int i = 0; i < count ;i++) {
					if(data == arr[i]) {
						check = true;
					}
				}
				if(check == true) {
					System.out.println("���� �ߺ���. ");
					continue;
				}
				
				int lastindex = count;
				for(int i = index; i < count; i++) {
					arr[lastindex] = arr[lastindex-1];
					lastindex -= 1;
				}
				arr[index] = data;
				count += 1;
				System.out.println("���� �Ϸ�. ");
				
			}
		}

	}

}
