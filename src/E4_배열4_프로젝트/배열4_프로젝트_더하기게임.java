package E4_�迭4_������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭4_������Ʈ_���ϱ���� {

	public static void main(String[] args) {
		/*
		  [���ϱ����]	
			1) 1~10 ������ ���ڸ� �������� 7�������ش�. (�ߺ�����)
			2) �׾ȿ��� 3���� �ε����� �����ְ����ش�. (�ߺ�����)
			3) ���ڸ� ���� ���� �ϳ� �����ϴµ�  �ε���3���� ���� ����
			   ���õ� ���ڶ� ������ ����. 
			   ��, ������ ������ �ϼ��ִ�. 
			4) �ݵ�� ������ ����� ���� �־���Ѵ�.	 
			   ��! �ߺ����� ���� ��������. 
			 [��]
			    ����  = {1,5,8,6,4,2,9};
			    ���þ� = 13	
			    ����) �ε��� ==> 0,2,4  ==>  1 + 8 + 4	
			 
			    �߸��ȿ�) �ε��� ==> 5,5,6 ==> 2 + 2 + 9
		*/
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int num[] = new int[10];
		int quiz[] = new int[7];
		for(int i = 0; i < num.length; i++) {
			num[i] += i + 1; // 1~10 ���� ����
		}
		for(int i = 0; i < 1000; i++) { // 1000�� ����
			int r1 = ran.nextInt(num.length);
			int r2 = ran.nextInt(num.length);
			int temp = num[r1];
			num[r1] = num[r2];
			num[r2] = temp;
		}
		System.out.println(Arrays.toString(num));
		
		for(int i = 0; i < 7; i++) { // �������� 7�� ������
			quiz[i] = num[i];
		}
		System.out.println(Arrays.toString(quiz));
		int sample[] = new int[3]; // �ߺ����� �ʰ� �ؼ� ���õǴ� ���� ������
		for(int i = 0; i < sample.length;) { // ���ѹݺ�
			int r = ran.nextInt(7)+1;
			boolean check = false;
			for(int j = 0; j < i; j++) {
				if(sample[j] == r) {
					check = true;
				}
			}
			if(check == false) {
				sample[i] = r;
				i += 1;
			}
		}
		System.out.println(Arrays.toString(sample));
		int total = 0;
		for(int i = 0; i < sample.length; i++) {
			total += quiz[sample[i]]; // ���õ� ������ ��
		}
		System.out.println(total);
		
		while(true) {
			int me[] = new int[3]; // �ε���3�� ����
			System.out.println(Arrays.toString(quiz));
			System.out.println(total);
			System.out.println("[����] �ε��� 3���� ������ : ");
			for(int i = 0; i < me.length; i++) { // �ݺ������� ������ ���ڸ� ����
				me[i] = scan.nextInt();
			}
			
			int meTotal = 0;
			for(int i = 0; i < me.length; i++) {
				meTotal += quiz[me[i]]; // ������ ������ ��
			}
			if(meTotal == total) {
				System.out.println("����");
				break;
			}else {
				System.out.println("��");
			}
		}

	}

}
