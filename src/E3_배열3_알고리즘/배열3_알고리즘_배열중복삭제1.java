package E3_�迭3_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭3_�˰���_�迭�ߺ�����1 {

	public static void main(String[] args) {
		/*
			 [����] ���� �Է¹ް� ���� 
			 [����] ���࿡ �������� ������ ������ ����ù��°�� ��  �Ѱ��� ���� �� b �� ���������� ���� 
			 
			 		  data[] = {5,2,6,8,5,6};
			 		  
			 [��] 2 ==>  b [] = {5,6,8,5,6,0};
			 [��] 6 ==>  b [] = {5,2,8,5,6,0};
		 */
		int data[] = {5,2,6,8,5,6};
		int b [] = {0,0,0,0,0,0};
		int value = 5;
		int index = -1;
		
		for(int i = 0; i < data.length; i++) {
			if(value == data[i]) { // �Է¹��� �� ã��
				index = i; // �Է¹��� ���� �迭�� ���� ������ �ε��� ���
				break;
			}
		}
		System.out.println(index);
		if(index == -1) {
			System.out.println("����");
		}else {
			int bindex = 0;
			for(int i = 0; i < data.length; i++) {
				if(i != index) { // �Է¹��� �ε����� �����ϰ� ��� , �Է��� �� �ϳ��� ������
					b[bindex] = data[i];
					bindex += 1;
				}
			}
		}
		System.out.println(Arrays.toString(b));

	}

}
