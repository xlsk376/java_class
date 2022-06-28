package E1_배열1_기본이론;

import java.util.Random;

public class E1_배열_기본이론4_학생성적1 {

	public static void main(String[] args) {
		/*
		 [문제1] array 배열에 1~100점 사이의 랜덤 정수를 5개 저장하고 출력
		 예)    87, 11, 92, 14, 47
		
		 [문제2] 전교생의 총점과 평균 출력
		 예)    총점(251) 평균(50.2)
		
		 [문제3] 성적이 60점 이상이면 합격. 합격생 수 출력
		 예)   2명
		 */
		Random ran = new Random();
		
		int[] array = new int[5];
		int total = 0;
		double avg = 0;

		int count = 0;
		for(int i = 0; i < 5; i++) {
			int r = ran.nextInt(100)+1;
			array[i] = r;
			// total += array[i];
			System.out.println(array[i]);
			if(array[i] >= 60) {
				count += 1;
			}
			total += array[i];
		}
		avg = total/5;
		System.out.println("총점" +"("+ total + ")"+ "평균"+ "("+ avg + ")" );
		System.out.println("합격생수 : " + count);
		
		// ↓ 복습하면서 재작성한 코드
//		int[] array = new int[5];
//		int total = 0;
//		double avg = 0;
//		int count = 0;
//		int top = 0;
//		int a = 0;
//		for(int i = 0; i < 5; i++) {
//			array[i] = ran.nextInt(100)+1;
//			System.out.println(array[i]);
//			total += array[i];
//			if(array[i] >= 60) {
//				count += 1;
//			}
//			if(top < array[i]) {
//				top = array[i]; // top 점수
//				a = i + 1; // top 점수를 받은 친구 번호
//			}
//			
//		}
//		System.out.println("총점 : "+total);
//		avg = total/5.0;
//		System.out.println("평균 : "+avg);
//		System.out.println("합격생 수 : "+ count);
//		System.out.println(top);
//		System.out.println(a);

	}

}
