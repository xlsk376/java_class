package E7_�迭7_�⺻�̷�;

import java.util.Arrays;

public class �迭7_�⺻�̷�6_�⺻����2_���� {

	public static void main(String[] args) {
		/* 
		 * �Ʒ� classList�迭�� �ټ����� ���������� �����ѵ������̴�.
		 * 
		 * ������ ������ ����������� ������ �� �̾Ƽ� win �迭�� ������ 
		 * win �迭�� ��� ������ ����Ͻÿ�.
		 * 
		 */
			int classList[][] = {
					 {10,54,65,22,15},
					 {65,14,24,75,25},
					 {50,45,25,87,49},
					 {11,66,5,21,95},
					 {70,84,64,21,11}
			};
		
			int win[][] = new int[3][];
			int total[] = new int[5];
			for(int i = 0; i < classList.length; i++) {
				for(int j = 0; j < classList[i].length; j++) {
					total[i] += classList[i][j];
				}
			}
			//System.out.println(Arrays.toString(total));
			int index = 0;
			int index1[] = new int[5];
			for(int i = 0; i < total.length;) {
				int max = 0;
				for(int j = 0; j < total.length; j++) {
					if(max < total[j]) {
						max = total[j];
						index = j;
					}
				}
				total[index] = 0;
				index1[i] = index;
				i += 1;
			}
			//System.out.println(Arrays.toString(index1));
			for(int i = 0; i < win.length; i++) {
				win[i] = classList[index1[i]];
			}
			for(int i = 0; i < win.length; i++) {
				System.out.println(Arrays.toString(win[i]));
			}
			
			
			

	}

}
