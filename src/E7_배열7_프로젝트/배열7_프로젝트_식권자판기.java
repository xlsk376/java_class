package E7_배열7_프로젝트;

import java.util.Arrays;
import java.util.Scanner;

public class 배열7_프로젝트_식권자판기 {

	public static void main(String[] args) {
		/*
		 [식권 자판기 프로그램]		
			 1) 관리자   2) 사용자 
			관리자 ==> 1) 식권충전   2) 잔돈 충전 	 3)뒤로가기
			사용자 ==> 1) 구입 ==> ==> 입금 금액 입력 ==> 구매 매수 입력  ==> 잔돈출력 	
		    	       2)뒤로가기
			 조건 ) 예) 잔돈이 7600원이다. 5000원권이 없으면 1000원짜리 7장거슬러준다. 
			화면 
			 식권 가격 : 3200원 
			 식권 	  : ??매  (매진시 매진) 
			 50000원 : ?? 매  	// 10000원 : ?? 매	// 5000원 : ?? 매
			 1000원 : ?? 매		//  500원 : ?? 개	  	//  100원 : ?? 개 
		*/
		Scanner scan = new Scanner(System.in);
		
		int[] money   = {50000, 10000, 5000, 1000, 500, 100};
		int[] charges = {    1,     1,    1,    1,   5,  10};
		
		int tickets = 5;		// 식권 개수
		int price = 3200;		// 식권 가격
		
		while(true) {
			int temp[][] = new int[money.length][2];
			int index = 0;
			for(int i = 0; i < money.length; i++) {
				temp[index][0] = money[i]; 
				temp[index][1] = charges[i];
				index += 1;
			}
//			for(int i = 0; i < temp.length; i++) {
//				System.out.println(Arrays.toString(temp[i])); // 각각의 돈과 남은 장수 배열
//			}
			System.out.println("[1]관리자");
			System.out.println("[2]사용자");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				while(true) {
					System.out.println("1)식권충전");
					System.out.println("2)잔돈충전");
					System.out.println("0)뒤로가기");
					
					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					if(choice == 1) {
						System.out.println("몇장을 충전하시겠습니까?");
						int n = scan.nextInt();
						tickets += n;
						System.out.println(n + " 장 충전되었습니다.");
						System.out.println("총 식권 : " +tickets +" 장");
					}
					else if(choice == 2) {
						System.out.println("[1]50000, [2]10000, [3]5000, [4]1000, [5]500, [6]100");
						int a = scan.nextInt();
						System.out.println("충전할 장수를 입력하세요");
						int b = scan.nextInt();
						if(a == 1) {
							temp[0][1] += b;
						}else if(a == 2) {
							temp[1][1] += b;
						}else if(a == 3) {
							temp[2][1] += b;
						}else if(a == 4) {
							temp[3][1] += b;
						}else if(a == 5) {
							temp[4][1] += b;
						}else if(a == 6) {
							temp[5][1] += b;
						}
						System.out.println("충전이 완료되었습니다.");
						for(int i = 0; i < temp.length; i++) {
							System.out.println(Arrays.toString(temp[i])); // 각각의 돈과 남은 장수 배열
						}
					}
					else if(choice == 0) {
						break;
					}
				}
				
			}
			else if(sel == 2) {
				while(true) {
					System.out.println("1)구입");					
					System.out.println("0)뒤로가기");				
					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					if(choice == 1) { // 1) 구입 ==> 입금 금액 입력 ==> 구매 매수 입력  ==> 잔돈출력
						System.out.println("입금 금액 입력");
						int cash = scan.nextInt();
						System.out.println("구매 매수 입력");
						int t = scan.nextInt();
//						화면 
//						 식권 가격 : 3200원 
//						 식권 	  : ??매  (매진시 매진) 
//						 50000원 : ?? 매  	// 10000원 : ?? 매	// 5000원 : ?? 매
//						 1000원 : ?? 매		//  500원 : ?? 개	  	//  100원 : ?? 개 
						int c = price*t;
						System.out.println("식권 가격 : " + (c) + "원 ");
						System.out.println("식권     : " + (tickets-t) +" 매" +" (매진시 매진)");
						System.out.println("거스름돈 : " + (cash - c));
						int p = cash-c;
						int q = 0; // 50000원
						int w = 0; // 10000원
						int e = 0; // 5000원
						int r = 0; // 1000원
						int z = 0; // 500원
						int x = 0; // 100원
						q = p / temp[0][0];
						w = p % temp[0][0] / temp[1][0];
						e = p % temp[0][0] % temp[1][0] / temp[2][0];
						r = p % temp[0][0] % temp[1][0] % temp[2][0] / temp[3][0];
						z = p % temp[0][0] % temp[1][0] % temp[2][0] % temp[3][0] / temp[4][0];
						x = p % temp[0][0] % temp[1][0] % temp[2][0] % temp[3][0] % temp[4][0] / temp[5][0];
						System.out.printf("%d원 : %d 매 ", temp[0][0], q);
						System.out.print(" // ");
						System.out.printf("%d원 : %d 매 ", temp[1][0], w);
						System.out.print(" // ");
						System.out.printf("%d원 : %d 매 ", temp[2][0], e);
						System.out.println();
						System.out.printf("%d원 : %d 매 ", temp[3][0], r);
						System.out.print(" // ");
						System.out.printf("%d원 : %d 매 ", temp[4][0], z);
						System.out.print(" // ");
						System.out.printf("%d원 : %d 매 ", temp[5][0], x);
						System.out.println();
						
					}
					else if(choice == 0) {
						break;
					}
				}
			}else if(sel == 0) {
				break;
			}
		}

	}

}
