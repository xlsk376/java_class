package E6_�迭6_�˰���;

import java.util.Arrays;

public class �迭6_�˰���_��ǲ�����̵� {

	public static void main(String[] args) {
		/*
		 [�����̵�����]	
		 move = {1,0,0,0,8,0,0,0,1};	 
		 [1] move ���� 8�� �÷��̾��̴�
		 [2] move ���� 0�� �̵��Ҽ��ִ� ���̴�.
		 [3] move ���� 1�� �̵��Ҽ����� ���̴�. 

		 input �迭�� ������ ���������� �����ϰ�,�������Ͻÿ�.
		 input�ǰ��� 1�� �����̵� , 2�� �������̵��̴�. 
		 ������ �̵��ϸ�, "�̵��Ҽ������ϴ�" ��� 		
		 ����=> {1,0,0,0,8,0,0,0,1};
		 1 ==> {1,0,0,8,0,0,0,0,1};
		 1 ==> {1,0,8,0,0,0,0,0,1};
		 1 ==> {1,8,0,0,0,0,0,0,1};
		 1 ==> "�̵��Ҽ������ϴ�"
		 2 ==> {1,0,8,0,0,0,0,0,1};
		 2 ==> {1,0,0,8,0,0,0,0,1};
		 2 ==> {1,0,0,0,8,0,0,0,1};
		*/
		int move[] = {1,0,0,0,8,0,0,0,1};		
		int input[] = {1,1,1,1,2,2,2};
		int me = 4;
		// move[i] = 1 : �� , move[i] = 8 : ������ġ
		// input[i] = �̵�
		for(int i = 0; i < input.length; i++) {
			if(input[i] == 1) { // �����̵�
				if(move[me-1] == 0) {
					move[me] = 0;
					me -= 1;
					move[me] = 8;
					System.out.println(Arrays.toString(move));
				}else if(move[me-1] == 1){
					System.out.println("�̵��Ҽ������ϴ�.");
				}
			}else if(input[i] == 2) { // �������̵�
				if(move[me+1] == 0) {
					move[me] = 0;
					me += 1;
					move[me] = 8;
					System.out.println(Arrays.toString(move));
				}else if(move[me+1] == 1){
					System.out.println("�̵��Ҽ������ϴ�.");
				}
			}
		}

	}

}
