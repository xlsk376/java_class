package E1_배열1_알고리즘;

public class 배열1_알고리즘_채팅원리_문제 {

	public static void main(String[] args) {
		/*
		 * [문제1] 
		 * 		array1 배열의 값들을 앞으로 한칸씩 당기고 맨뒤에 a의  값을 저장한다.
		 * 		[예] array1 = {20,30,40,50,90};
		 * 
		 * [문제2] array2 의 배열을 뒤로 하나씩 밀어낸후 맨 앞에 b의 값을 저장한다.
		 * 		[예] array2 = {60,10,20,30,40};
		 */
		
		//배열은
		
		int array1[] = { 10,20,30,40,50 };
		int a = 90;
		int temp[] = {0,0,0,0,0};
		
		for(int i = 0; i < 4; i++) { //넣어줄 배열에 맞춰서 반복을 횟수를 지정해준다. 항상 체크하기!!
			array1[i] = array1[i+1];//자신에게 하나큰수를 밀어넣기 해준다.
		}
		array1[4] = a; //마지막 인덱스엔 50이 들어있음으로 90을 넣어준다.
		for(int i = 0; i < 5; i++) {
			//System.out.println(array1[i]);
		}
		
		int array2[] = { 10,20,30,40,50 };
		int b = 60;
		
		int room = 0;
		for(int i = 0; i < 4; i++) {
			array2[room+1] = array2[room]; // 안됨 두번째 인덱스부터 다 10을 저장
			System.out.println(array2[room+1]); // 밑에서부터 순서대로 하면 넣은값을 다시 또 인덱스에 넣어줌
		}  	//예) 인덱스 1,2,3,4 -> 1,0,2,3 이 되야하지만 이미 3번인덱스에 2값이 있고 이걸 다시 또 넘겨서 넣어주게 되어 반복적으로 같은 값이 큰인덱스방향으로 넣어주게 된다
		System.out.println();
//		room = 4;
//		for(int i = 0; i < 4; i++) {
//			array2[room] = array2[room-1]; // 인덱스 3 -> 4 , 2 -> 3 , 1 -> 2 ...
//			room -= 1;
//			System.out.println(array2[room]);
//		}
		
//		array2[0] = b;
//		int d = array2[2];
//		int e = array2[3];
//		int f = array2[4];
//		System.out.println(d);
//		System.out.println(e);
//		System.out.println(f);
//		for(int i = 0; i < 5; i++) {
//			System.out.println(array2[i]);
//		}

	}

}
