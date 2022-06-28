package E2_배열2_프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열2_프로젝트_1to4게임 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 
		 * [1to4 게임]
		 * 
		 * [1] arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
		 * [2] 사용자는 가장작은수1부터 순서대로 해당 방번호(인덱스)을 입력한다.
		 * [3] 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
		 * 
		 * [예]
		 * 
		 * 시작 : { 4 2 3 1 }
		 * 
		 * 인덱스 입력 : 3  ==> { 4 2 3 9 } ==> 1은 가장작은수이므로 9로 변경한다.
		 * 
		 * 인덱스 입력 : 0 ==>  { 4 2 3 9 }  ==> 4는 가장작은수가아니므로 변화가없다.
	     *
		 */
		int[] arr = new int[4];
		boolean[] check = new boolean[4];
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 4; ) { // 무한반복
			int r = ran.nextInt(4);
			if(check[r] == false) { // 빈공간이면
				check[r] = true; // true로 변경해주고 값을 넣어준다.
				arr[i] = r;
				i += 1; //인덱스증가
			}
		}
		
		for(int i = 0; i < 4; i++) { // 1~4이기 때문에 추가로 1씩 더해줌 
			arr[i] += 1;
		}
		//System.out.println(Arrays.toString(arr));
		
		int count = 1; // 1부터 시작 => 1 ~ 4
		while(true) { // 게임 시작
			System.out.println(Arrays.toString(arr));
			if(count > 4) { // 
				break;
			}
			System.out.println("가장 작은 숫자의 위치(0~3)를 선택하세요 : ");
			int sel = scan.nextInt();
			if(arr[sel] == count) { // 카운트는 1~4까지의 값 체크 및 횟수 체크
				count += 1;
				arr[sel] = 9;
			}
		}

	}

}
