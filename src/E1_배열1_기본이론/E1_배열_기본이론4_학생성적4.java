package E1_�迭1_�⺻�̷�;

public class E1_�迭_�⺻�̷�4_�л�����4 {

	public static void main(String[] args) {
		/*
		 * 	numberList = {1001, 1002, 1003, 1004, 1005};
			scoreList  = {  87,   11,   45,   98,   23};
		 *  [����] 1���л��� �й��� ���� ����Ѵ�.
		 *  [����] 1004��(98��)
		 */
		// �� ���� �ۼ�
//		int[] numberList = {1001, 1002, 1003, 1004, 1005};
//		int[] scoreList  = {  87,   11,   45,   98,   23};
//		//1���л��� �����߿� max�� ã��
//		//max �� ã���� �ش�Ǵ� ������ ���� �й� ã��
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
		int room = 0; // �迭���� ��ġ�� üũ
		for(int i = 0; i < 5; i++) {
			if(scoreList[i] > maxScore) { // max���� ���Ͽ� �� ũ�� max���� �ֱ�
				maxScore = scoreList[i]; 
				maxNumber = numberList[i]; 
				room = i; //max���� �������� ���ȣ
			}
		}
		System.out.println(maxScore + " " + maxNumber + " " + room);

	}

}
