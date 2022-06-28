package E2_배열2_알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 배열2_알고리즘_중복숫자금지 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 
		 *  [중복숫자 금지]
		 * 1. 0~4 사이의 숫자를 arr1배열에 저장한다.
		 * 2. 단, 중복되는 숫자는 없어야 한다.
		 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
		 * 
		 * [예]
		 * 랜덤숫자 : 1
		 * check = {false, true, false, false, false}
		 * arr1   = {1, 0, 0, 0, 0}
		 * 랜덤숫자 : 3
		 * check = {false, true, false, true, false}
		 * arr1   = {1, 3, 0, 0, 0}
		 * 랜덤숫자 : 2
		 * check = {false, true, true, true, false}
		 * arr1   = {1, 3, 2, 0, 0}
		 */
		boolean[] check = new boolean[5];
		int[] arr1 = new int[5];
		
		Random ran = new Random();
		//배열에 값 여부를 check로 확인
		for(int i = 0; i < arr1.length; i++) {
			int r = ran.nextInt(arr1.length);
			arr1[i] = r;
		}
		//System.out.println(Arrays.toString(arr1));
		
		arr1 = new int[5];
		int i = 0;
		while(true) {
			int r = ran.nextInt(arr1.length); // 인덱스 번호 , 중복되지 않게 하기 위해 check인덱스 번호와 숫자를 매치 시킨다.
			if(check[r] == false) { //체크 인덱스 번호가 값이 없다면 true로 변경하고 값을 arr1에 넣어준다.
				check[r] = true; // false값이면 true로 변경후 값을 넣어준다.
				arr1[i] = r; // 값을 넣을때 값이 없는(false)곳에 값을 넣어준뒤 true로 변경
				i += 1;
				System.out.println(Arrays.toString(arr1));
			}			
			if(i == arr1.length) {
				break;
			}
		}
		//System.out.println(Arrays.toString(check));
		System.out.println(Arrays.toString(arr1));

	}

}
