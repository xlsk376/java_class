package E4_�迭4_�˰���;

import java.util.Arrays;

public class �迭4_�˰���_�Ӹ����1 {

	public static void main(String[] args) {
		int arr1[] = {1,5,4,5,3,2,2,3,5,4,5,1};
		int arr2[] = {1,5,4,5,3,2,3,5,4,5,1};
		//�� �迭���� ���� �Ӹ�������� �ƴ��� ����Ͻÿ�.
		
		//�Ӹ�����̶�? 
		
		// �տ������� ���� ����
		// �ڿ������� ���� �� �Ȱ��� ���ڰ� ������ �Ӹ�����̴�
		// ��) 2112
		// ��) 12321
		int b = arr1.length-1; // �ε�����ȣ�� �����ϱ� ����
		boolean check = false;
		for(int i = 0; i < arr1.length/2; i++) { // ���ݸ� ���ϸ� �Ǳ� ������ '/2'
			if(arr1[i] != arr1[b]) {
				check = true;
				break;
			}
			b -= 1;
		}
		if(check == true) {
			System.out.println("�ƴϴ�");
		}else {
			System.out.println("�´�");
		}
		

	}

}
