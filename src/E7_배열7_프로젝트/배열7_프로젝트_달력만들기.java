package E7_�迭7_������Ʈ;

import java.util.Scanner;

public class �迭7_������Ʈ_�޷¸���� {

	public static void main(String[] args) {
		/*
	 	[�޷¸����]
	  	�⵵�� ���� �Է¹ް� �޷��� ����ÿ�.
	  	
	  	[�������] �Ʒ��� ���� ���� �̴�. 
	  	
	  	1. ��(year)�� 4�� �������� ����.
	  	2. 1�� ������ �´��� 100���� �������� ������ �ƴϴ�.  
		3. 2�� ������ �´��� 400���� �������� �����̴�.
	  	
	  	[���ϰ���]
	  	1��1��1�� �� �������̴�. 
		*/
		
		int year = 1987;
		int month = 1;		
		int total1 = (year - 1) * 365;
		System.out.println("year : " + total1); // 2020��12��31�ϱ��� (���⻩��)
		int add = 0;		
		for(int i = 1; i < year; i++) {
			if(i % 400 == 0 || (i % 100 != 0 && i % 4 == 0)) {
				add += 1; // ������
			}
		}
		System.out.println("total 1 : " + (add + total1));// 2020��12��31�ϱ��� (��������)	
		
		// ������ �Ʒ��� ���� ���������� ���Ҽ��ִ�. 
		int total2=(year-1)*365
                +(year-1)/4
                -(year-1)/100
                +(year-1)/400;			
		System.out.println("total 2 : " + total2);// 2020��12��31�ϱ��� (��������)	 		
		int monthList[] = {31,28,31,30,31,30,31,31,30,31,30,31};	
		
		for(int i = 0; i <month-1; i++) {
			if(i == 1) {
				if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0) ) {
					total2 += 1;
				}
			}
			total2 += monthList[i];
		}
		// 2021�� 1�� 1�Ϻ��� 8��31�ϱ��� ��� 		
		System.out.println("=======���=======");
		String week = "�Ͽ�ȭ�������";	
		int weekIndex = total2 % 7;
		System.out.println(week.charAt(weekIndex + 1)); // 2021�� 9��1�� ������ 		
		System.out.println("----------------------------");
		for(int i = 0; i < week.length(); i++) {
			System.out.print(week.charAt(i) + "\t" );
		}
		System.out.println();
		for(int i = 0; i <= monthList[month-1] + weekIndex; i++) {
			if(i > weekIndex) {
				System.out.print((i - weekIndex) + "\t");
			}else {
				System.out.print("\t");
			}
			if(i % 7 == 6) {
				System.out.println();
			}
		}
		
		

	}

}
