package E6_배열6_프로젝트;

import java.util.Arrays;
import java.util.Scanner;

public class 배열6_프로젝트_영화예매 {

	public static void main(String[] args) {
		/* 
		 * [영화관좌석예매]
		 * (1)회원가입 (2)로그인  (0) 종료
		 * 
		 * [회원가입] ==> id 만 가입 ==> 중복처리 
		 * [로그인후] ==> (1) 로그아웃 (2) 예매 (3) 예매확인(본인것만 좌석번호출력 ) 
		 *              (4) 예매취소(본인것만) (5) 전체확인 (0) 뒤로가기 
		 *
		 * 1) 회원가입은 10명까지 가능하다.
		 * 2) idList 에는 회원들의 id를 저장 
		 * 3) 로그인이후 좌석을 구매하면 seatList 는 구매한사람의 id 를저장 
		 * 4) 필요한변수는 추가할수있다.
		 */
		final int MAX = 10;
		final int ROW = 3;
		final int COL = 4;
		int idList[] = new int[MAX];
		int seatList[][]= new int[ROW][COL]; // 3 X 4
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int log = -1;
		while(true) {
			System.out.println("(1)회원가입 (2)로그인 (0) 종료");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println(Arrays.toString(idList));
				boolean check = false;
				for(int i = 0; i < idList.length; i++) {
					if(idList[i] == 0) {
						check = true;
						break;
					}
				}
				if(check == true) {
					System.out.println("가입할 아이디 입력");
					int data = scan.nextInt();
					check = false;
					for(int j = 0; j < idList.length; j++) {
						if(data == idList[j]) {
							check = true;
							break;
						}
					}
					if(check == true) {
						System.out.println("중복");
					}else {
						idList[count] = data;
						count += 1;
						System.out.println("추가 성공");
					}
				}else {
					System.out.println("가득참");
				}
			}else if(sel == 2) {
				if(log == -1) {
					System.out.println("로그인할 아이디 입력");
					int id = scan.nextInt();
					boolean check = false;
					for(int i = 0; i < idList.length; i++) {
						if(id == idList[i]) {
							check = true;
							break;
						}
					}
					if(check == true) {
						log = id;
						System.out.println(log +"님 로그인 되었습니다.");
						while(true) {
							if(log != -1) {
								System.out.println("(1) 로그아웃 (2) 예매 (3) 예매확인");
								System.out.println("(4) 예매취소 (5) 전체확인 (0) 뒤로가기");
								int sel1 = scan.nextInt();
								if(sel1 == 0) {
									log = -1;
									break;
								}else if(sel1 == 1) { // 로그아웃
									System.out.println(log+" 님 로그아웃되었습니다.");
									log = -1;
									break;
								}else if(sel1 == 2) { // 예매
									for(int i = 0; i < seatList.length; i++) {
										System.out.println(Arrays.toString(seatList[i]));
									}
									System.out.println("예매할 좌석을 선택하세요.");
									int n1 = scan.nextInt();
									int n2 = scan.nextInt();
									check = false;
									for(int i = 0; i < seatList.length; i++) {
										for(int j = 0; j < seatList[i].length; j++) {
											if(seatList[n1][n2] == 0) {
												check = true;
												break;
											}
										}
									}
									if(check == true) {
										seatList[n1][n2] = log;
										System.out.println("예매되었습니다.");
									}else {
										System.out.println("이미 예매가 끝난 좌석입니다.");
									}
								}else if(sel1 == 3) { // 예매확인(본인것만)
									int seatCount = 0; // 예매한 좌석수
									for(int i = 0; i < seatList.length; i++) {
										for(int j = 0; j < seatList[i].length; j++) {
											if(log == seatList[i][j]) {
												seatCount += 1; 
												System.out.println(i + "행" +" "+j + "열");
											}
										}
									}
									System.out.println(log+" 님이 예매한 좌석수 : "+seatCount);
									
								}else if(sel1 == 4) { // 예매취소(본인것만)
									System.out.println("취소할 좌석을 선택하세요.");
									int cancelSeat1 = scan.nextInt();
									int cancelSeat2 = scan.nextInt();
									check = false;
									for(int i = 0; i < seatList.length; i++) {
										for(int j = 0; j < seatList[i].length; j++) {
											if(log == seatList[cancelSeat1][cancelSeat2]) {
												check = true;
											}
										}
									}
									if(check == true) {
										seatList[cancelSeat1][cancelSeat2] = 0;
										System.out.println("취소되었습니다.");
									}else {
										System.out.println("취소할 좌석이 없습니다.");
									}
								}else if(sel1 == 5) { // 전체확인
									for(int i = 0; i < seatList.length; i++) {
										System.out.println(Arrays.toString(seatList[i]));
									}
								}
							}
						}
					}else {
						System.out.println("일치하는 아이디가 없습니다.");
					}
				}else {
					System.out.println("로그아웃후 이용해 주세요.");
				}
			}else if(sel == 0) {
				System.out.println("종료");
				break;
			}
			
		}

	}

}
