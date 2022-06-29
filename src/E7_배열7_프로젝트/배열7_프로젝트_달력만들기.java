package E7_배열7_프로젝트;

import java.util.Scanner;

public class 배열7_프로젝트_달력만들기 {

	public static void main(String[] args) {
		/*
	 	[달력만들기]
	  	년도와 월을 입력받고 달력을 만드시오.
	  	
	  	[윤년계산법] 아래의 경우는 윤년 이다. 
	  	
	  	1. 해(year)가 4로 나눠지면 윤년.
	  	2. 1번 조건이 맞더라도 100으로 나눠지면 윤년이 아니다.  
		3. 2번 조건이 맞더라도 400으로 나눠지면 윤년이다.
	  	
	  	[요일계산법]
	  	1년1월1일 이 월요일이다. 
		*/
		
		int year = 1987;
		int month = 1;		
		int total1 = (year - 1) * 365;
		System.out.println("year : " + total1); // 2020년12월31일까지 (윤년빼고)
		int add = 0;		
		for(int i = 1; i < year; i++) {
			if(i % 400 == 0 || (i % 100 != 0 && i % 4 == 0)) {
				add += 1; // 윤년계산
			}
		}
		System.out.println("total 1 : " + (add + total1));// 2020년12월31일까지 (윤년포함)	
		
		// 위식을 아래와 같이 수학적으로 구할수있다. 
		int total2=(year-1)*365
                +(year-1)/4
                -(year-1)/100
                +(year-1)/400;			
		System.out.println("total 2 : " + total2);// 2020년12월31일까지 (윤년포함)	 		
		int monthList[] = {31,28,31,30,31,30,31,31,30,31,30,31};	
		
		for(int i = 0; i <month-1; i++) {
			if(i == 1) {
				if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0) ) {
					total2 += 1;
				}
			}
			total2 += monthList[i];
		}
		// 2021년 1월 1일부터 8월31일까지 계산 		
		System.out.println("=======출력=======");
		String week = "일월화수목금토";	
		int weekIndex = total2 % 7;
		System.out.println(week.charAt(weekIndex + 1)); // 2021년 9월1일 수요일 		
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
