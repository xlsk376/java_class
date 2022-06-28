package E7_배열7_알고리즘;

import java.util.Arrays;

public class 배열7_알고리즘_인풋추가삭제2 {

	public static void main(String[] args) {
		/*
		1) arr 배열은 사이즈3이다.		
		2) input 배열 안의 값들은  추가와 삭제를 반복할 값들이다.		
		3) 0번 인덱스의 값은 "추가" 이고, 
		4) 1번 인덱스의 값은 "삭제" 이다. 
		   [조건] 삭제한자리는 뒤에서부터 앞으로 밀어내고 0으로 표시 한다. 	
		5) 중복된값은 "추가" 할수없고 , 없는값은 "삭제"할수없다.
		6) input의 값들을 전부 처리하고 처리과정출력 		
		예)
		 10 ==> 짝수인덱스이므로 추가 ==> arr[] = {10,0,0};
		 20 ==> 홀수인덱스이므로 삭제 ==> 20은 없으므로 ==> "삭제할값이 없습니다"
		 30 ==> 짝수인덱스이므로 추가 ==> arr[] = {10,30,0};
		 10 ==> 홀수인덱스이므로 삭제 ==> arr[] = {30,0,0};
		 30 ==> 짝수인덱스이므로 추가 ==> 30 은이미 저장되어서 ==> "중복됩니다"
		 30 ==> 홀수인덱스이므로 삭제 ==> arr[] = {0,0,0};
		*/
		
		int arr[] = {0,0,0};
		int count = 0;
		int input[][] = {{10,20},{30,10},{30,30}}; // input[i][0] == 추가 / input[i][1] == 삭제
		// input[0][0] input[0][1] input[1][0] input[1][1] input[2][0] input[2][1]
		for(int i = 0; i < input.length; i++) {
			for(int j = 0; j < input[i].length; j++) {
				if(j % 2 == 0) {
					boolean check = false;
					for(int k = 0; k < arr.length; k++) {
						if(input[i][j] == arr[k]) {
							check = true;
						}
					}
					if(check == false) {
						arr[count] = input[i][j];
						count += 1;
						System.out.println(Arrays.toString(arr));
					}else{
						System.out.println("중복됩니다.");
					}
				}else {
					//System.out.println(i + " " + j);
					boolean check = false;
					for(int k = 0; k < arr.length; k++) {
						if(input[i][j] == arr[k]) {
							check = true;
						}
					}
					if(check == false) {
						System.out.println("삭제할 값이 없습니다.");
					}else{
						for(int k = 0; k < count-1; k++) {
							arr[k] = arr[k+1];
						}
						arr[count-1] = 0;
						count -= 1;
						System.out.println(Arrays.toString(arr));
					}
				}
				//System.out.println(i + " " + j);
			}
			
		}
		
		

	}

}
