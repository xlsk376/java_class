package E7_�迭7_�˰���;

import java.util.Arrays;

public class �迭7_�˰���_�ϳ����ִ¼������� {

	public static void main(String[] args) {
		/*
		 �Ʒ� �迭���� ȥ���ִ� ���ڸ� �������� ���������鸸  temp1~3 �� ������ ���
		 1) {1,2,2,1,0}    // 3�� ȥ������
		 2) {4,4,0,0,0}        // 1,2,3 ȥ������
		 3) {1,1,1,1,1}  // ����
		*/
		int test1[] = {1,2,3,2,1};		
		int test2[] = {1,3,4,4,2};
		int test3[] = {1,1,1,1,1};
		
		int temp1[] = new int[5];
		int temp2[] = new int[5];
		int temp3[] = new int[5];
		
		int index1 = 0;
		for(int i = 0; i < test1.length; i++) {
			boolean check = false;
			for(int j = 0; j < test1.length; j++) {
				if(i != j && test1[i] == test1[j]) {
					check = true;
				}
			}
			if(check == true) {
				temp1[index1] = test1[i];
				index1 += 1;
			}
		}
		System.out.println(Arrays.toString(temp1));
		System.out.println();
		int index2 = 0;
		for(int i = 0; i < test2.length; i++) {
			boolean check = false;
			for(int j = 0; j < test2.length; j++) {
				if(i != j && test2[i] == test2[j]) {
					check = true;
				}
			}
			if(check == true) {
				temp2[index2] = test2[i];
				index2 += 1;
			}
		}
		System.out.println(Arrays.toString(temp2));
		System.out.println();
		int index3 = 0;
		for(int i = 0; i < test3.length; i++) {
			boolean check = false;
			for(int j = 0; j < test3.length; j++) {
				if(i != j && test3[i] == test3[j]) {
					check = true;
				}
			}
			if(check == true) {
				temp3[index3] = test3[i];
				index3 += 1;
			}
		}
		System.out.println(Arrays.toString(temp3));
	}

}
