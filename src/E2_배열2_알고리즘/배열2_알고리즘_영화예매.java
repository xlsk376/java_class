package E2_배열2_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 배열2_알고리즘_영화예매 {

	public static void main(String[] args) {
		/*
		 * # 영화관 좌석예매
		 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
		 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
		 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
		 * 4. 한 좌석당 예매 가격은 12000원이다.
		 * 5. 프로그램 종료 후, 해당 영화관의 총 금액을 출력한다.
		 * 예)
		 * seat = 0 0 0 0 0 0 0
		 * 
		 * 좌석선택 : 1
		 * seat = 0 1 0 0 0 0 0
		 * 
		 * 좌석선택 : 3
		 * seat = 0 1 0 1 0 0 0
		 *  
		 * 좌석선택 : 3
		 * seat = 0 1 0 1 0 0 0
		 * 이미 예매가 완료된 자리입니다.
		 * ----------------------
		 * 총금액 : 24000원
		 */
		
		
		Scanner scan = new Scanner(System.in);		
		int[] seat = new int[7];
		int count = 0;
		boolean run = true;
		while(run) {
			System.out.println();
			System.out.println("=메가 영화관=");				
			System.out.println("1.좌석예매");
			System.out.println("2.구매");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				for(int i = 0; i < 7; i++) {
					System.out.print(seat[i] + " ");
				}
				System.out.println();	
				System.out.println("예매할 좌석을 입력하세요.");
				int c = scan.nextInt();
				for(int i = 0; i < 7; i++) { 
					if(seat[c] == 0) { //이미 예매된 자석이 없으면 예매
						seat[c] = 1;
						break;
					}else if(seat[c] == 1) { // 이미 예매된 자석이 있으면 있다고 표기
						System.out.println("예매된 자리");
						break;
					}
				}
				System.out.println(Arrays.toString(seat)); // 선택한 좌석 화면
			}
			else if(sel == 2) {
				for(int i = 0; i < 7; i++) {
					if(seat[i] == 1) { // 예매한 좌석수 체크
						count += 1;
					}
				}
				System.out.println("선택좌석 : "+ Arrays.toString(seat));
				System.out.println("총금액 : "+ (count*12000));
				run = false;
			}
		}
		
		
		// --------------------------------------------------------
		
		
		//새로 작성 
//		Scanner scan = new Scanner(System.in);
//		int seat[] = new int[7];
//		int count = 0;
//		while(true) {
//			System.out.println("=메가 영화관=");				
//			System.out.println("1.좌석예매");
//			System.out.println("2.구매");
//			
//			System.out.print("메뉴 선택 : ");
//			int sel = scan.nextInt();
//			if(sel == 1) {
//				for(int i = 0; i < 7; i++) {
//					System.out.print(seat[i] + " ");
//				}
//				System.out.println();	
//				System.out.println("예매할 좌석을 입력하세요.");
//				int num = scan.nextInt();
//				if(seat[num] == 0) {
//					seat[num] = 1;
//					count += 1;
//				}else if(seat[num] == 1){
//					System.out.println("이미 예매한 좌석입니다.");
//				}
//			}
//			else if(sel == 2) { // 최종적으로 1이 예매한 좌석수기 때문에 구매전에 1을 체크해서 계산하는게 좋다
//				System.out.println(Arrays.toString(seat));
//				System.out.println("금액 : " + (count*12000) + " " +count);
//				System.out.println("정산후종료.");
//				break;
//			}
//		}

		

	}

}
