package E4_�迭4_�˰���;

import java.util.Arrays;

public class �迭4_�˰���_�縰���2 {

	public static void main(String[] args) {
		/*
	    [�縲���]
	    
	     -�縲����̶� �տ��� �����ص� �ڿ��������ص� �Ȱ��� ���̴�.
	    
	  	�� �迭���� 0�̳� 1�� ������ ������ ������ �丰������� ����Ѵ�.
		[��] 1�� 0�� ���� �����ϸ� 3,2,2,3 �̹Ƿ� �縰����̴�.
		 */
		
		int arr[] = {1,3,0,0,2,1,2,3,0};
		int temp[] = new int[4];
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 1 && arr[i] != 0 ) {
				temp[index] = arr[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(temp));
		int b = temp.length-1;
		System.out.println(b);
		boolean check = false;
		for(int i = 0; i < temp.length/2; i++) {
			if(temp[i] != temp[b]) { // ���� �迭�� ���� �ε����� ����ū �ε������� ���μ��� ��
				check = true; // �ϳ��� ���� ������ ������ �ȵǱ� ������ �������´�.
				break;
			}
			b -= 1;
			
		}
		if(check == true) {
			System.out.println("�ƴϴ�");
		}else {
			System.out.println("�´�");
		}
		
		
		// ���� �ۼ�
//		int arr[] = {1,3,0,0,2,1,2,3,0};
//		int temp[] = new int[arr.length];
//		int index = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] != 0 && arr[i] != 1) {
//				temp[index] = arr[i];
//				index += 1;
//			}
//		}
//		System.out.println(Arrays.toString(temp));
//		int a = index-1;
//		boolean check = false;
//		for(int i = 0; i < index/2; i++) {
//			if(temp[i] != temp[a]) {
//				check = true;
//				break;
//			}
//			a -= 1;
//		}
//		if(check == true) {
//			System.out.println("�ƴ�");
//		}else {
//			System.out.println("����!!!");
//		}
		

	}

}
