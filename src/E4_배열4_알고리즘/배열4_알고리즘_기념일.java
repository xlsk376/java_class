package E4_배열4_알고리즘;

public class 배열4_알고리즘_기념일 {

	public static void main(String[] args) {
		/*
		 * [기념일]
		 * 
		 *  철수와 영희는 3월 3일에 만났다. 		
			 철수는 영희와 100일 기념일에 축하파티를 할려고한다.
			 만난지 100일뒤는  몇월몇일인가?
			 단 윤년은 계산하지않는다.
		 */
		
		int monthList[] =
			{31, 28, 31, 30, 
			 31, 30, 31, 31, 
			 30, 31, 30, 31};
	
		int day = 3;
		int month = 3;
		//1)3월 3일을 일수로 바꾼다. -> 31+ 28+3 => 1월 + 2월 + 3일 더하기
		int total = 0;
		for(int i = 0; i < month-1; i++) { // 3월은 안세고 1,2월만 더함
			total += monthList[i];
		}
		System.out.println(total); //59, 1-2월 => 2월 28일
		total += day;
		System.out.println(total); //62, 59+3 => 3월 3일
		total += 100; // 100일뒤
		System.out.println(total); //162 => 3월3일부터 100일 후
		int day2 = 0;
		for(int i = 0; i < monthList.length; i++) {
			day2 = total; // 빼고 나서 남은 일수저장, 0이거나 0보다 작기전에 남은값이 일수가 됨
			total -= monthList[i]; // 계속빼서 0이거나 0보다 작으면 해당되는 월임
			if(total <= 0) {
				System.out.println((i+1)+"월"); // 0월부터 계산되기때문에 +1
				System.out.println(day2 +"일");
				break;
			}
		}

	}

}
