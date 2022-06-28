package E3_배열3_기본이론;

public class 배열3_기본이론2_사각형그리기 {

	public static void main(String[] args) {
		/*
		 * [사각형그리기]
		 *  
		 *  아래와같은 사각형을 출력하시오.
		 * 
		 * ###
		 * ###
		 * ###
		 */
		for(int i = 0; i < 9; i++) {
			System.out.print("#");
			if(i % 3 == 2) { // 0,1,2  3,4,5  6,7,8
				System.out.println();
			}
		}
		System.out.println();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
