package E1_배열1_기본이론;

public class E1_배열_기본이론4_학생성적4 {

	public static void main(String[] args) {
		/*
		 * 	numberList = {1001, 1002, 1003, 1004, 1005};
			scoreList  = {  87,   11,   45,   98,   23};
		 *  [문제] 1등학생의 학번과 성적 출력한다.
		 *  [정답] 1004번(98점)
		 */
		// ↓ 내가 작성
//		int[] numberList = {1001, 1002, 1003, 1004, 1005};
//		int[] scoreList  = {  87,   11,   45,   98,   23};
//		//1등학생은 점수중에 max값 찾기
//		//max 값 찾은후 해당되는 점수와 같은 학번 찾기
//		int max = scoreList[0];
//		int count = 0;
//		for(int i = 0; i < 5; i++) {
//			if(max < scoreList[i]) {
//				max = scoreList[i];
//				count = i;
//			}
//		}
//		System.out.println(max);
//		System.out.println(numberList[count]);
		
		int[] numberList = {1001, 1002, 1003, 1004, 1005};
		int[] scoreList  = {  87,   11,   45,   98,   23};
		
		int maxNumber = 0;
		int maxScore = 0;
		int room = 0; // 배열방의 위치를 체크
		for(int i = 0; i < 5; i++) {
			if(scoreList[i] > maxScore) { // max값과 비교하여 더 크면 max값에 넣기
				maxScore = scoreList[i]; 
				maxNumber = numberList[i]; 
				room = i; //max값이 들어갔을때의 방번호
			}
		}
		System.out.println(maxScore + " " + maxNumber + " " + room);

	}

}
