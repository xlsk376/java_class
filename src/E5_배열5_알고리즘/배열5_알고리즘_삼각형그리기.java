package E5_배열5_알고리즘;

public class 배열5_알고리즘_삼각형그리기 {

	public static void main(String[] args) {
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print("#");
//			}
//			System.out.println("#");
//		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		 * 문제 2)
		 * ###
		 * ##
		 * #
		 */
		
		for(int i = 0; i < 3; i++) {
			for(int j = 3; j > i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
//		for(int i = 0; i < 3; i++) {
//			System.out.print("#");
//			for(int j = 0; j < i; j++) {
//				System.out.println("@");
//			}
//		}
		/*
		 * 문제 3)
		 * @##
		 * @@#
		 * @@@
		 */
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(j <= i) {
					System.out.print("@"); // 3x3을 돌리면서 같거나 작은 경우 @
				}else {
					System.out.print("#"); 
				}
			}
			System.out.println();
		}
		System.out.println();

		/*
		 * 문제 4)
		 *   #
		 *  ###
		 * #####
		 */
//		for(int i = 0; i < 4; i++) {
//			for(int j = 3-i; j >0; j--) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j < i*2-1; j++) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}
		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 3; j > i; j--) { // i =0 일때  0,1,2 공백
//				System.out.print(" ");
//			}
//			for(int j = 0; j<2*i+1; j++) { //
//				System.out.print("#");
//			}
//			System.out.println();
//		}
		for(int i = 0; i < 3; i++) {
			for(int j = 2; j > i; j--) { // 2 1 로 공란 생성
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i+1 ; j++) { // 1 - 3 - 5 => 2 * i + 1
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		/*
		 * 문제 5)
		 * #####
		 *  ###
		 *   #
		 */
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 5; j > i*2  ; j--) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
