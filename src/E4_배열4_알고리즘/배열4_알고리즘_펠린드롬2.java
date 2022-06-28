package E4_배열4_알고리즘;

import java.util.Arrays;

public class 배열4_알고리즘_펠린드롬2 {

	public static void main(String[] args) {
		/*
	    [펠림드롬]
	    
	     -펠림드롬이란 앞에서 시작해도 뒤에서시작해도 똑같은 값이다.
	    
	  	위 배열에서 0이나 1을 제외한 나머지 값들이 페린드롬인지 출력한다.
		[예] 1과 0을 전부 제외하면 3,2,2,3 이므로 펠린드롬이다.
		 */
		
		int arr[] = {1,3,0,0,2,1,2,3,0};
		int temp[] = new int[4];
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 1 && arr[i] != 0 ) {
				temp[index] = arr[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(temp));
		int b = temp.length-1;
		System.out.println(b);
		boolean check = false;
		for(int i = 0; i < temp.length/2; i++) {
			if(temp[i] != temp[b]) { // 같은 배열의 작은 인덱스와 제일큰 인덱스부터 서로서로 비교
				check = true; // 하나라도 같지 않으면 성립이 안되기 때문에 빠져나온다.
				break;
			}
			b -= 1;
			
		}
		if(check == true) {
			System.out.println("아니다");
		}else {
			System.out.println("맞다");
		}
		
		
		// 새로 작성
//		int arr[] = {1,3,0,0,2,1,2,3,0};
//		int temp[] = new int[arr.length];
//		int index = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] != 0 && arr[i] != 1) {
//				temp[index] = arr[i];
//				index += 1;
//			}
//		}
//		System.out.println(Arrays.toString(temp));
//		int a = index-1;
//		boolean check = false;
//		for(int i = 0; i < index/2; i++) {
//			if(temp[i] != temp[a]) {
//				check = true;
//				break;
//			}
//			a -= 1;
//		}
//		if(check == true) {
//			System.out.println("아님");
//		}else {
//			System.out.println("맞음!!!");
//		}
		

	}

}
