package E4_�迭4_�˰���;

import java.util.Arrays;

public class �迭4_�˰���_����ã��_���� {

	public static void main(String[] args) {
		/*
		 * [����ã��]
		 
		  	 ���帹�� ����ִ� ���ڰ�����
			 ���� ���� ����ִ� ������ ������ ���� ���Ͻÿ�.	
			 100 : 1��
			 3   : 5�� 	
			 �� : 6		
		 */
		int[] arr = { 1, 2, 3, 3, 100, 1, 3, 3, 2, 3, 2 };
		
		//[1] ���ο� �迭�� ���� ��ø�����ʴ� ���� �����Ѵ�.
		// temp = {1,2,3,100}
		int sample[] = new int[arr.length]; //��ø���� �ʴ� ���� ������ �迭
		int count[] = new int[arr.length]; // ��ø�� ���� ī��Ʈ�Ͽ� �־��� �迭
		int sampleCount = 0; // �ߺ��Ǵ� ���ڰ� �� ����� üũ
		for(int i = 0; i < arr.length; i++) {
			boolean check = false; // �ߺ�üũ�� ����
			//System.out.println("i : "+i);
			for(int j = 0; j < sampleCount; j++) { // sampleCount�� ���־� �տ� �ߺ��� ���ڰ� �ִٸ� �н��ϰ� ������ ���� �ε����� ����.
				//System.out.println("j :"+j);
				if(sample[j] == arr[i]) { // arr�迭�� �տ��� ���� ��ü �� �Ѵ�.
					check = true;
					break;
				}
			}
			if(check == false) { // ���Ҷ� �ߺ��� ���� ���ٸ� �ش�Ǵ� �ε����� �־��ش�.
				sample[sampleCount] = arr[i]; // �ߺ��� ���ڰ� �� �迭�� ���Ͽ� ���ٸ� �״��� �ε����� ��
				sampleCount += 1;
				//System.out.println("s : "+sampleCount);
			}
		}
		System.out.println(Arrays.toString(sample));
		System.out.println(sampleCount);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < sampleCount; j++) { // �ߺ��� ���ڵ��� �迭
				if(arr[i] == sample[j]) { // ���� ���� ���������� +1 �Ͽ� count �迭�� �־��ش�.
					count[j] += 1;
				}
			}
		}
		System.out.println(Arrays.toString(count));
		
		// ���� �ۼ� ��ø���� �ʴ� ���� ������
//		int[] arr = { 1, 2, 3, 3, 100, 1, 3, 3, 2, 3, 2 };	
//		int[] temp = new int[arr.length];
//		int index1 = 0;
//		for(int i = 0; i < arr.length; i++) {
//			int index = i;
//			boolean check = false;
//			for(int j = 0; j < i; j++) {
//				if(arr[j] == arr[index]) {
//					check = true;
//					break;
//				}
//			}
//			if(check == false) {
//				temp[index1] = arr[index];
//				index1 += 1;
//			}
//		}
//		System.out.println(Arrays.toString(temp));

	}

}
