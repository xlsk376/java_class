package E6_�迭6_�˰���;

import java.util.Arrays;

public class �迭6_�˰���_���������max {

	public static void main(String[] args) {
		/*
		 data �迭�� �� �������� ���� sumList �� ������ 
		 ���� ū���� ��� 
	
		*/
		int data[][] = {
			    {0,0,0,0,0},
				{0,0,0,0,3},
				{0,2,0,0,3},
				{3,1,3,0,1},
				{1,4,2,0,2},
				{4,1,4,0,4},
				{2,1,4,3,3},
		};		
		int[] sumList = {0,0,0,0,0};
		
		for(int i = 0; i < sumList.length; i++) {
			for(int j = 0; j < data.length; j++) {
				sumList[i] += data[j][i];
			}
		}
		System.out.println(Arrays.toString(sumList));
		int max = 0;
		for(int i = 0; i < sumList.length; i++) {
			if(max < sumList[i]) {
				max = sumList[i];
			}
		}
		System.out.println(max);

	}

}
