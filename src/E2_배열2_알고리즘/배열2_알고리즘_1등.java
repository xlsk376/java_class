package E2_�迭2_�˰���;

import java.util.Arrays;

public class �迭2_�˰���_1�� {

	public static void main(String[] args) {
		/*
		 * [����]
		 * 
		 * [1��]
		 *   �Ʒ� �����ʹ� �л���ȣ1��, ����2���� �Ѽ�Ʈ�̴�. 		
			 ��ȣ�� 1001���ͽ����̰� , ������ 0~100 �̴�. 
			 ��) 1001 , 20, 30 ==> 1001�� 1������ 20��, 2������ 30��
			 		 
			 1���� ��ȣ ����Ѵ�. 
			 ������ �������� �����ΰ���Ѵ�. 
		 */
//		//�迭 �������� ���� �迭�� ���°��� �־��ַ��� �ϱ⶧���� ������ �߻�
//		int arr[] = {1001, 20, 30, 1002, 43, 23, 1003, 45, 1};
//		int score[] = {0,0,0,0,0,0,0,0,0};
//		int room = 0;
//		for(int i = 0; i < 8; i++) { //�迭���̷� �ϰԵǸ� ���°��� �־��ֱ� ������ ������ ����
//			score[i] = arr[i+1]; // i+1 �̱� ������ 8+1 => arr[9] �ε��� ���� ȣ���ϰ� ��, �׷��� ������ 8�� �ٿ������
//			System.out.println(score[i]);
//			
//		}
//		score[8] = 0;
////		for(int i = 0; i < arr.length; i++) {
////			System.out.println(score[i]);
////		}
		
		//���� Ǯ���� , �����ϼ� �ִ��� ����ϱ�
//		int arr[] = {1001, 20, 30, 1002, 43, 23, 1003, 45, 1};
//		int score[] = new int[3];
//		int room = 0;
//		int max = 0;
//		int temp = 0;
//		int num = 0;
//		for(int i = 0; i < 3; i++) {
//			score[i] = arr[room+1]+arr[room+2]; // ������ �ջ꿡 ���� �־��ش�.
//			temp = score[i];
//			if(max < temp) {
//				max = temp;
//				num = i;
//				//System.out.println(max);
//			}
//			//System.out.println(score[i]);
//			room += 3; // (a[1]+a[2]) +3 -> (a[4]+a[5]) +3 -> (a[7]+a[8]) +3 
//		}
//		if(num == 0) {
//			System.out.println(arr[0]);
//		}else if(num == 1) {
//			System.out.println(arr[3]);
//		}else if(num == 3) {
//			System.out.println(arr[6]);
//		}
//		System.out.println("1������ : "+ max);
//		System.out.println("1�� ��ȣ : " + num);
		
		// �� �Ʒ��� ������ �ۼ�
//		int temp[] = new int[6];
////		//int student[] = new int[6];
////		//int score[] = new int[6];
////		int index = 0;
////		int room = 0;
////		for(int i = 0; i < 3; i++) {
////			temp[index] = arr[room];
////			index += 1;
////			temp[index] = arr[room+1]+arr[room+2];
////			index += 1;
////			room += 3;
////		}
////		System.out.println(Arrays.toString(temp));
//		int max = 0;
//		int index = 0;
//		int room = 0;
//		int count = 0;
//		int sum[] = new int[8];
//		for(int i = 0; i < 3; i++) {
//			sum[index] = arr[room+1]+ arr[room+2];
//			if(max < sum[index]) {
//				max = sum[index];
//				count = room;
//				
//			}
//			index += 1;
//			room += 3;
//		}
//		System.out.println(Arrays.toString(sum));
//		System.out.println(max);
//		System.out.println(arr[count]);
		
		// ���� �ۼ� ������ �ε����� ��ȣ�� ������ ���� ���� �ε��� ��ȣ�� Ȯ���Ͽ� ���� ���
		int arr[] = {1001, 20, 30, 1002, 43, 23, 1003, 45, 1};
		int score[] = new int[3];
		int num[] = new int[3];
		int max = 0;
		int maxNum = 0;
		int index = 0;
		for(int i = 0; i < arr.length; i+=3) {
			num[index] = arr[i];
			score[index] = arr[i+1]+arr[i+2];
			index += 1;
		}
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(score));
		for(int i = 0; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
				maxNum = num[i];
			}
		}
		System.out.println(maxNum +" "+ max);
		
	}

}
