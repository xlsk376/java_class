package E6_�迭6_�˰���;

import java.util.Arrays;

public class �迭6_�˰���_��ǲ���� {

	public static void main(String[] args) {
		/*
		 titleList �迭�� ��ǰ�̸�����Ʈ , 
		 dataList 2�����迭�� ���� ���� , ��ǰ���� ����Ʈ����̴� .		
		��) ���� ���� ������� 3�� , ���ڱ� 1�� , ���� 1�� �ִ�.			
		 �Ʒ� �迭�� ���� �ֹ��� ���¼����̴�.
		 �Ѹ����� ����غ�����.	
		
		
		��) ù��° 1 ==> ���ڱ��� ������ 1�̹Ƿ� �Ǹ��Ҽ��ִ�.
		��) �ι�° 2 ==> ������ ������ 1�̹Ƿ� �Ǹ��Ҽ��ִ�.
		��) ����° 2 ==> ������ ������ �̹� �ι�°���� �����ؼ� 0�̵ǹǷ� �ǸźҰ�.
		   ....
		   .... 		
		 �ֹ��� ��  ����� 2�� , ���ڱ� 3�� , ���� 3�� �������� ,
		 ���� �Ǹ��� ǰ����  ����� 2�� , ���ڱ� 1�� , ���� 1�� �̴�.
		*/
		
		String titleList[] = {"�����" , "���ڱ�" , "����"};
		int dataList[][] = {
				{1000, 3},
				{2300, 1},
				{3100, 1}
		};
		int [] input = {1,2,2,0,0,2,1,1};
		int [][] temp = new int[3][2];
		// dataList[i][1] => �� titleList ����
		// input[i] => �� titleList �Ǹ� ǰ��
		for(int i = 0; i < input.length; i++) {
			if(dataList[input[i]][1] > 0) {
				System.out.println(titleList[input[i]] + " �Ǹ�");
				dataList[input[i]][1] -= 1;
				temp[input[i]][1] += 1;
			}else if(dataList[input[i]][1] <= 0) {
				System.out.println("��� ����");
			}
		}
		for(int i = 0; i < temp.length; i++) {
			System.out.println(Arrays.toString(temp[i])); // �ȸ�����
		}
		for(int i = 0; i < temp.length; i++) {
			temp[i][0] = dataList[i][0] * temp[i][1];
		}
		for(int i = 0; i < temp.length; i++) {
			System.out.println(Arrays.toString(temp[i])); // �� ǰ�� ����
		}
		int total = 0;
		for(int i = 0; i < temp.length; i++) {
			total += temp[i][0];
		}
		System.out.println("�Ѹ��� : "+total);
		
//		for(int i = 0; i < dataList.length; i++) {
//			System.out.println(Arrays.toString(dataList[i]));
//		}
		
		
		
		
		
		
		
		

	}

}
