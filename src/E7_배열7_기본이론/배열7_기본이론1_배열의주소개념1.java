package E7_�迭7_�⺻�̷�;

public class �迭7_�⺻�̷�1_�迭���ּҰ���1 {

	public static void main(String[] args) {
		//[]�� �������� == > ��������
		//��� ==> new �� ������� ������ ù��° �ּҸ� �����ϴ� ����
		int[] arr = { 87, 100, 24, 11, 79 };

		int[] temp = arr;
		temp[1] = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.print(temp[i] + " ");
		}

		System.out.println();
		System.out.println(arr);
		System.out.println(temp);

		// arr1�� arr2 �� ���� ���ٸ� ǥ���غ�����.
		// �Ʒ��� ���� ������ �˻� �ؾ��Ѵ�.
		int arr1[] = {10,20,30,40};
		int arr2[] = {10,20,30,40};
		
		if(arr1 == arr2) {
			System.out.println("����.1");
		}else{
			System.out.println("�ٸ���.1");
		}
		
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				count += 1;
			} else {
				break;
			}
		}
		if (count == arr1.length) {
			System.out.println("����.2");
		} else {
			System.out.println("�ٸ���.2");
		}

	}

}
