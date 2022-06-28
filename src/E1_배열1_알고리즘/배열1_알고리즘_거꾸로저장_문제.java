package E1_배열1_알고리즘;

public class 배열1_알고리즘_거꾸로저장_문제 {

	public static void main(String[] args) {
		/*
		 * a = { 1,2,3,4,5 };
		 * 
		 * [문제] a 배열의 값을 b 배열에 하나씩 저장하는데 순서를 거꾸로 저장 
		 * [예]   b = {5,4,3,2,1};
		 */
		//a[0] -> b[4] 이런식으로 거꾸로 저장
		
		int a[] = {1,2,3,4,5};
		int b[] = new int[5];
		
		int index = 5;
		for(int i = 0; i < 5; i++) { // 0~4
			index -= 1;
			b[index] = a[i]; //
			//System.out.println(a[i]);
			//System.out.println(c);
			//System.out.println(b[index]); // b[index]에 1,2,3,4,5 값이 b[4],b[3],b[2],b[1],b[0] 저장됨
										  // 그래서 출력하면 1,2,3,4,5로 출력됨	
			//출력시 방이 없는 곳을 출력하게 되면 에러가 발생함 -> System.out.println(b[6]);
			
		}
		for(int i = 0; i < 5; i++) {
			System.out.println(b[i]);// 저장된 순서대로 출력하면 b[0] = 5, b[1] = 4 ..., b[4]=1
		}

	}

}
