package E4_배열4_프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열4_프로젝트_틱택토 {

	public static void main(String[] args) {
		/* 
		 * [틱택토]
		 *  
		 * 	조건1) 구글 크롬에 "틱택토" 검색후 게임을 한번하고 
		 * 	          아래와같이 만들어보기.
		 *  조건2) P1 , P2 를 플레이어가 번갈아가면서 플레이.
		 *  조건3) 먼저 한줄을 완성하면 승리
		 *  [추천조건] P2 는 com으로 대체해보자.(com은 랜덤으로 플레이)
		 *
		 *=============
		 * [처음화면]
		 * 0,0,0
		 * 0,0,0
		 * 0,0,0
		 * [p1]인덱스 입력 : 6
		 * =============
		 * [1턴]
		 * 0,0,0
		 * 0,0,0
		 * 1,0,0
		 * [p2]인덱스 입력 : 1
		 * =============
		 * [2턴]
		 * 0,2,0
		 * 0,0,0
		 * 1,0,0
		 * [p1]인덱스 입력 : 3
		 * =============
		 * [3턴]
		 * 0,2,0
		 * 1,0,0
		 * 1,0,0
		 * [p2]인덱스 입력 : 2
		 * =============
		 * [4턴]
		 * 0,2,2
		 * 1,0,0
		 * 1,0,0
		 * [p1]인덱스 입력 : 0
		 * =============
		 * [5턴]
		 * 1,2,2
		 * 1,0,0
		 * 1,0,0
		 * [p1] 승리
		 * 
		 */
		
		int[] tic = new int[9];
		int index = 0;
		int turn = 1;
		int p1 = 0;
		int p2 = 0;
		boolean check[] = new boolean[9]; // 중복값 체크하기
		System.out.println(Arrays.toString(check));
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println(Arrays.toString(tic));
		System.out.println();
		while(true) {
			for(int i = 0; i < tic.length; i++) {
				System.out.print(" "+ tic[i] + " "); // 먼저 출력한후 
				if(i % 3 == 2) {
					System.out.println(); // 띄어쓰기
				}
			}
			if(p1 == 5 || p2 == 4) {
				System.out.println("무승부");
				break;
			}
			if(tic[0] == 1 && tic[1] == 1 && tic[2] == 1) {
				System.out.println("P1승리");
				System.out.println("1");
				break;
			}else if(tic[3] == 1 && tic[4] == 1 && tic[5] == 1) {
				System.out.println("P1승리");
				System.out.println("2");
				break;
			}else if(tic[6] == 1 && tic[7] == 1 && tic[8] == 1) {
				System.out.println("P1승리");
				System.out.println("3");
				break;
			}else if(tic[0] == 1 && tic[3] == 1 && tic[6] == 1) {
				System.out.println("P1승리");
				System.out.println("4");
				break;
			}else if(tic[1] == 1 && tic[4] == 1 && tic[7] == 1) {
				System.out.println("P1승리");
				System.out.println("5");
				break;
			}else if(tic[2] == 1 && tic[5] == 1 && tic[8] == 1) {
				System.out.println("P1승리");
				System.out.println("6");
				break;
			}else if(tic[0] == 1 && tic[4] == 1 && tic[8] == 1) {
				System.out.println("P1승리");
				System.out.println("7");
				break;
			}else if(tic[2] == 1 && tic[4] == 1 && tic[6] == 1) {
				System.out.println("P1승리");
				System.out.println("8");
				break;
			}else if(tic[0] == 2 && tic[1] == 2 && tic[2] == 2) {
				System.out.println("P2승리");
				System.out.println("1");
				break;
			}else if(tic[3] == 2 && tic[4] == 2 && tic[5] == 2) {
				System.out.println("P2승리");
				System.out.println("2");
				break;
			}else if(tic[6] == 2 && tic[7] == 2 && tic[8] == 2) {
				System.out.println("P2승리");
				System.out.println("3");
				break;
			}else if(tic[0] == 2 && tic[3] == 2 && tic[6] == 2) {
				System.out.println("P2승리");
				System.out.println("4");
				break;
			}else if(tic[1] == 2 && tic[4] == 2 && tic[7] == 2) {
				System.out.println("P2승리");
				System.out.println("5");
				break;
			}else if(tic[2] == 2 && tic[5] == 2 && tic[8] == 2) {
				System.out.println("P2승리");
				System.out.println("6");
				break;
			}else if(tic[0] == 2 && tic[4] == 2 && tic[8] == 2) {
				System.out.println("P2승리");
				System.out.println("7");
				break;
			}else if(tic[2] == 2 && tic[4] == 2 && tic[6] == 2) {
				System.out.println("P2승리");
				System.out.println("8");
				break;
			}
			
			if(turn % 2 == 1) {
				System.out.print("P1 turn : ");
				index = scan.nextInt();
				if(index < 0 || index > 9) {
					System.out.println("다시입력하세요.");
				}else {
					if(check[index] == true) {
						System.out.println("중복입니다.");
					}else {
						check[index] = true;
						tic[index] = 1;
						turn += 1;
						p1 += 1;
					}
				}
				
			}else if(turn % 2 == 0) {
				System.out.print("P2 turn : ");
				index = scan.nextInt();
				if(index < 0 || index > 9) {
					System.out.println("다시입력하세요.");
				}else {
					if(check[index] == true) {
						System.out.println("중복입니다.");
					}else {
						check[index] = true;
						tic[index] = 2;
						turn += 1;
						p2 += 1;
					}
				}
				
			}
			
			
		}

	}

}
