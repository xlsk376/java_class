package E7_�迭7_�⺻�̷�;

import java.util.Arrays;

public class �迭7_�⺻�̷�5_�⺻����1_���� {

	public static void main(String[] args) {
		/* 
		 * �Ʒ� class1~5 �迭�� ������ ���������� �����ѵ������̴�.
		 * 
		 * ������ ������ ����������� ������ �� �̾Ƽ� win �迭�� ������ 
		 * win �迭�� ��� ������ ����Ͻÿ�.
		 * 
		 */
			int class1[] = {10,54,65,22,15};
			int class2[] = {65,14,24,75,25};
			int class3[] = {50,45,25,87,49};
			int class4[] = {11,66,5,21,95};
			int class5[] = {70,84,64,21,11};
		
			int win[][] = new int[3][];
			
			int temp[] = new int[5];
			int index = 0;
			for(int i = 0; i < class1.length; i++) {
				temp[index] += class1[i];
			}
			index += 1;
			for(int i = 0; i < class2.length; i++) {
				temp[index] += class2[i];
			}
			index += 1;
			for(int i = 0; i < class3.length; i++) {
				temp[index] += class3[i];
			}
			index += 1;
			for(int i = 0; i < class4.length; i++) {
				temp[index] += class4[i];
			}
			index += 1;
			for(int i = 0; i < class5.length; i++) {
				temp[index] += class5[i];
			}
			System.out.println(Arrays.toString(temp));
//			int rank[] = new int[5];
//			for(int i = 0; i < temp.length; i++) {
//				for(int j = 0; j < temp.length; j++) {
//					if(i != j && temp[i] > temp[j]) {
//						rank[j] += 1;
//					}
//				}
//				rank[i] += 1;
//			}
//			System.out.println(Arrays.toString(rank));
			int index1 = 0;
			int index2[] = new int[5];
			for(int i = 0; i < temp.length; ) {
				int max = 0;
				for(int j = 0; j < temp.length; j++) {
					if(max < temp[j]) {
						max = temp[j];
						index1 = j;
					}
				}
				temp[index1] = 0;
				index2[i] = index1+1;
				i += 1;
			}
			System.out.println(Arrays.toString(index2));
			int index3 = 0;
			win[index3] = class3;
			index3 += 1;
			win[index3] = class5;
			index3 += 1;
			win[index3] = class2;
			for(int i = 0; i < win.length; i++) {
				System.out.println(Arrays.toString(win[i]));
			}

	}

}
