package E7_�迭7_�˰���;

import java.util.Arrays;

public class �迭7_�˰���_���� {

	public static void main(String[] args) {
		/*
		 ö���� ������������. 
		 8�� ö���̰� 7�� ���̰� 0�� �̵������Ѱ��̴�.
		 dir �� ö���� �ٶ󺸴� �����̰� 0~3���� �ϵ����� �� ������ ǥ���Ѵ�. 	
		 input�� �����ʹ� 1�� ��ĭ�����̰� 2�� ��ȸ��(90��) 3�� ��ȸ��(90��)�̴�.
		  ȸ���� ���⸸ �ٲ�� �����̴°� ����.
		 input�� ���� �Է¹ް� �ش系���� ���� ����Ͻÿ�.
		*/
		int map[][] = {
				{0,0,0,0,0,0,0},	
				{0,7,7,7,7,0,0},	
				{0,7,0,0,7,0,0},	
				{0,7,0,8,7,0,0},	
				{0,0,0,0,7,0,0},	
				{0,0,0,0,7,7,0},	
				{0,0,0,0,0,0,0}
		};		
		int dir = 0;		
		int input[] = {1,1,2,1,1,2,1,1,3,1,1};
		int y = 3;
		int x = 3;
		
		for(int i = 0; i < map.length; i++) {
			System.out.println(Arrays.toString(map[i]));
		}
		System.out.println();
		for (int k = 0; k < input.length; k++) {
			// System.out.println(y + " " + x);
			if (input[k] == 1) {
				if (dir == 0 && map[y-1][x] == 0 && y > 0 && y < map.length) {
					map[y][x] = 0;
					y -= 1;
					map[y][x] = 8;
				} else if (dir == 1 && map[y][x+1] == 0 && x > 0 && x < map.length) {
					map[y][x] = 0;
					x += 1;
					map[y][x] = 8;
				} else if (dir == 2 && map[y+1][x] == 0 && y > 0 && y < map.length) {
					map[y][x] = 0;
					y += 1;
					map[y][x] = 8;
				} else if (dir == 3 && map[y][x-1] == 0 && x > 0 && x < map.length) {
					map[y][x] = 0;
					x -= 1;
					map[y][x] = 8;
				}
				System.out.println(y + " " + x);
			} else if (input[k] == 2) { // ��ȸ�� / 0:�� , 1:�� , 2:�� , 3:��
				if (dir == 0) {
					dir = 3;
				} else if (dir == 1) {
					dir = 0;
				} else if (dir == 2) {
					dir = 1;
				} else if (dir == 3) {
					dir = 2;
				}
			} else if (input[k] == 3) {// ��ȸ��
				if (dir == 0) {
					dir = 1;
				} else if (dir == 1) {
					dir = 2;
				} else if (dir == 2) {
					dir = 3;
				} else if (dir == 3) {
					dir = 0;
				}
			}
			for(int i = 0; i < map.length; i++) {
				System.out.println(Arrays.toString(map[i]));
			}
			System.out.println();
		}
		

	}
}
