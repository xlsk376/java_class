package E2_�迭2_������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭2_������Ʈ_���Ǳܱ� {

	public static void main(String[] args) {
		/*
		 *  [���Ǳܱ�]
		  
		    �������� ���ǹ迭�� 1 �Ǵ� 7 �� �����Ѵ�. 
		    ȭ���� { * * * * * * * } �̷��� ����Ѵ�.
			�ε��� 3���� �����ְ�, 
			�ε��� 3���� ���� ���� 7�̸�  ��÷�̴�.
			
		    [����1] 
		    	�ݵ�� 7�� 3���̻� �־�� �Ѵ�.	
				[��] 1,1,7,7,1,7,1
			
			[����2] 
				�ѹ� �� �ε����� �ǰ�������. 		
				[��] 2,2,2
		 */
		Scanner scan = new Scanner(System.in);
		int ����[] = new int[7];		
		Random ran = new Random();	
		int c7 = 0;
		int c1 = 0;
		int index = 0;
		for(int i = 1; i ==1;) {
			int r = ran.nextInt(2);		
			if(r == 0 && c7 < 3) {
				����[index] = 7; 
				index += 1;
				c7 += 1;
			}else if(r == 1 && c1 < 4) {
				����[index] = 1; 
				index += 1;
				c1 += 1;
			}
			if(c7 == 3 && c1 == 4) {
				break;
			}
		}
		System.out.println(Arrays.toString(����));
		boolean check[] = new boolean[7];
		int cCount = 0;
		while(true) {
			for(int i = 0; i < 7; i++) {
				if(check[i] == false) {
					System.out.print("*"+" ");
				}else {
					System.out.print(����[i]);
				}
			}
			System.out.println();
			
			if(cCount == 3) {
				break;
			}
			
			System.out.println("�ε��� �Է� : ");
			int sel = scan.nextInt();
			if(sel < 0 || sel > 7) {
				System.out.println("����"); // while ������������ �ٽý���
				continue;
			}
			if(check[sel]== false) {
				cCount += 1;
				check[sel] = true;
				
			}else if(check[sel]== true) {
				System.out.println("�̹̼������ڸ��Դϴ�.");
			}			
		}
		int win = 0;
		for(int i = 0; i < 7; i++) {
			if(check[i] == true && ����[i] == 7) {
				win += 1;
			}
		}
		if(win == 3) {
			System.out.println("��÷");
		}else {
			System.out.println("��");
		}

	}

}
