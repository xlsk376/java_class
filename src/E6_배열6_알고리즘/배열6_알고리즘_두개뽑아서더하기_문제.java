package E6_�迭6_�˰���;

import java.util.Arrays;

public class �迭6_�˰���_�ΰ��̾Ƽ����ϱ�_���� {

	public static void main(String[] args) {
		/*	
		 [1] arr �迭���� ���� 2���� �̾Ƽ� ���Ѱ��� ���ʴ�� result �� ���������
		 [2] �ڱ����� �ε����� ����  �������ʴ´�.		
		  (1) [�ε��� 0] �ǰ� 2 + (1,3,4,1) ==> 2 + 1 , 2 + 3 , 2 + 4 , 2 + 1
		  (2) [�ε��� 1] �ǰ� 1 + (2,3,4,1) ==> 1 + 2 , 1 + 3 , 1 + 4 , 1 + 1
		  (3) [�ε��� 2] �ǰ� 3 + (2,1,4,1) ==> 3 + 2 , 3 + 1 , 3 + 4 , 3 + 1
		   ....		
		 [�߰� ����] result �� ����Ȱ����� �ߺ��Ǵ� ���� ���� ������ ��� 
		*/
		int arr[]  = {2,1,3,4,1};
		int result [] = new int[100];
		int temp [] = new int[100];
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i != j) { // �ڱ����� �ε����� ����
					result[index] = arr[i] + arr[j];
					index += 1;
					//System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
		System.out.println(Arrays.toString(result));
		index = 0;
		for(int i = 0; i < result.length; i++) {
			if(result[i] == 0) {
				continue;
			}
			boolean check = false;
			for(int j = 0; j < result.length; j++) {
				if(result[i] == temp[j]) {
					check = true;
					break;
				}
			}
			if(check == false) {
				temp[index] = result[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(temp));
		
		//������ �ڵ�, �������� continue�� ����
//		int arr[]  = {2,1,3,4,1};
//		
//		int result [] = new int[100];
//		int index = 0;
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr.length; j++) {
//				if(i == j) {
//					continue;
//				}else {
//					result[index] = arr[i] + arr[j];
//					index += 1;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(result));
		

	}

}
