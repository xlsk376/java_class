package E7_�迭7_�˰���;

import java.util.Arrays;

public class �迭7_�˰���_��ǲ�߰�����2 {

	public static void main(String[] args) {
		/*
		1) arr �迭�� ������3�̴�.		
		2) input �迭 ���� ������  �߰��� ������ �ݺ��� �����̴�.		
		3) 0�� �ε����� ���� "�߰�" �̰�, 
		4) 1�� �ε����� ���� "����" �̴�. 
		   [����] �������ڸ��� �ڿ������� ������ �о�� 0���� ǥ�� �Ѵ�. 	
		5) �ߺ��Ȱ��� "�߰�" �Ҽ����� , ���°��� "����"�Ҽ�����.
		6) input�� ������ ���� ó���ϰ� ó��������� 		
		��)
		 10 ==> ¦���ε����̹Ƿ� �߰� ==> arr[] = {10,0,0};
		 20 ==> Ȧ���ε����̹Ƿ� ���� ==> 20�� �����Ƿ� ==> "�����Ұ��� �����ϴ�"
		 30 ==> ¦���ε����̹Ƿ� �߰� ==> arr[] = {10,30,0};
		 10 ==> Ȧ���ε����̹Ƿ� ���� ==> arr[] = {30,0,0};
		 30 ==> ¦���ε����̹Ƿ� �߰� ==> 30 ���̹� ����Ǿ ==> "�ߺ��˴ϴ�"
		 30 ==> Ȧ���ε����̹Ƿ� ���� ==> arr[] = {0,0,0};
		*/
		
		int arr[] = {0,0,0};
		int count = 0;
		int input[][] = {{10,20},{30,10},{30,30}}; // input[i][0] == �߰� / input[i][1] == ����
		// input[0][0] input[0][1] input[1][0] input[1][1] input[2][0] input[2][1]
		for(int i = 0; i < input.length; i++) {
			for(int j = 0; j < input[i].length; j++) {
				if(j % 2 == 0) {
					boolean check = false;
					for(int k = 0; k < arr.length; k++) {
						if(input[i][j] == arr[k]) {
							check = true;
						}
					}
					if(check == false) {
						arr[count] = input[i][j];
						count += 1;
						System.out.println(Arrays.toString(arr));
					}else{
						System.out.println("�ߺ��˴ϴ�.");
					}
				}else {
					//System.out.println(i + " " + j);
					boolean check = false;
					for(int k = 0; k < arr.length; k++) {
						if(input[i][j] == arr[k]) {
							check = true;
						}
					}
					if(check == false) {
						System.out.println("������ ���� �����ϴ�.");
					}else{
						for(int k = 0; k < count-1; k++) {
							arr[k] = arr[k+1];
						}
						arr[count-1] = 0;
						count -= 1;
						System.out.println(Arrays.toString(arr));
					}
				}
				//System.out.println(i + " " + j);
			}
			
		}
		
		

	}

}
