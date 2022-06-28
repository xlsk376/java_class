package E1_배열1_기본이론;

public class E1_배열_기본이론3_기본문제3 {

	public static void main(String[] args) {
		/*
		[문제1] 
		
		 array 의 값을 temp1 에  복사후 모든값을 출력한다. 
		 temp1 ==> {10, 20, 30, 40, 50}
		
		
		[문제2] 
		
		 array 의 값의 2배를 temp2에 복사후 모든값을 출력한다.
		 temp2 ==> {20, 40, 60, 80 , 100}		
		 */
		
		int array[] = {10,20,30,40,50};
		int temp1[] = new int[5];
		int temp2[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			temp1[i] = array[i]; // array -> temp1 로 
			System.out.println(temp1[i]);
		}
		System.out.println("----------------------------------");
		
		for(int i = 0; i < 5; i++) {
			temp2[i] = 2*array[i]; // array의 2배를 -> temp2 로 
			System.out.println(temp2[i]);
		}

	}

}
