package E7_�迭7_�⺻�̷�;

public class �迭7_�⺻�̷�7_�ּҰ���1 {

	public static void main(String[] args) {
		int arr1[] = {10,20,30,40};
		int arr2[] = {10,20,30,40};
			
		//����1) �Ʒ� �ּ��� Ǯ�� ���������� ����� ������ �����ϰ� 
		//      �����غ��ÿ�.
		/*
		if(arr1 == arr2) {
			System.out.println("����.1");
		}else {
			System.out.println("�ٸ���.1");
		}
		*/
			
		//����2) �Ʒ� �ּ��� Ǯ�� ���������� ����� ������ �����ϰ� 
		//      �����غ��ÿ�.
		int arr3[] = {10,20,30,40};
		int temp[] = arr3;
		int arr4[] = temp;
		/*
		if(arr3 == arr4) {
			System.out.println("����.2");
		}else {
			System.out.println("�ٸ���.2");
		}
		*/

	}

}
