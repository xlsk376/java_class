package E7_�迭7_�˰���;

import java.util.Arrays;

public class �迭7_�˰���_����9�ǰ���_���� {

	public static void main(String[] args) {
		/* 
		   mine = {0,9,0},
				  {9,0,9},
				  {0,0,9}
				  
		  	�� mine�迭�� ���� 0�� �ڸ��� ���ڸ� �����ҷ����Ѵ�.
		 	�����Ҽ��ڴ� �ֺ� 8������ �˻��� 9�� ������ ���������.
				
			 ��) �Ʒ��� ���� ���  
			   {2,9,2},
			   {9,4,9},
			   {1,3,9}
		
		 */
			int mine[][] = {
					{0,9,0},
					{9,0,9},
					{0,0,9}
			};
			int sy = mine.length;
			int sx = mine[0].length;
			for(int i = 0; i < mine.length; i++) {
				for(int j = 0; j < mine[i].length; j++) {
					if(mine[i][j] == 0) {
						System.out.println(i + " " + j);
						int y = i;
						int x = j;
						System.out.println("------------------");
						int count = 0;
						for(int k = y-1; k <= y + 1; k++) { // ���簪 �������� �ֺ��˻� y-1 ~ y+1 , x-1 ~ x+1
							for(int h = x -1; h <= x + 1; h++) {
								if(k < 0 || h < 0 || k >= sy || h >= sx ) {
									System.out.print("[   ]");
									continue;
								}
								System.out.print("["+k + " " + h+"]");
								if(mine[k][h]==9) {
									count += 1;
								}
							}
							System.out.println();				
						}
						mine[i][j] = count;
						
					}
				}
			}
			for(int i = 0; i < mine.length; i++) {
				System.out.println(Arrays.toString(mine[i]));
			}

	}

}
