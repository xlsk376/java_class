package E6_�迭6_�˰���;

public class �迭6_�˰���_������� {

	public static void main(String[] args) {
		/*
		yList �� ������ data �� ���� �ε����� ���Ѵ�. 
		yList�� ������ ����Ű�� �������� ��� 
		
		��) yList[0] = 1 ==> 0,0,2,1,4,1,1
		��) yList[1] = 3 ==> 0,0,0,0,0,0,3
		��) yList[2] = 2 ==> 0,0,0,3,2,4,4
		....
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
		int[] yList = {1,3,2,2,0,1};
		
		for(int i = 0; i < yList.length; i++) {
			for(int j = 0; j < data.length; j++) {
				System.out.print(data[j][yList[i]] + " ");
			}
			System.out.println();
		
		}
		
		

	}

}
