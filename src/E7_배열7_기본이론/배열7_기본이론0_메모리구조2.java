package E7_�迭7_�⺻�̷�;

import java.util.Arrays;

public class �迭7_�⺻�̷�0_�޸𸮱���2 {

	public static void main(String[] args) {
		/*
		 * ram ==> stack , heap , data(static)
		 * 
		 * stack ==> �Ϲݺ��� (���ʿ��ִº���)
		 * 
		 * heap ==> new �θ��� ���� (�����ʿ� �ִº���)
		 * --------------------------
		 * STACK ==> �������� 
		 * HEAP  ==> ��ü (NEW)
		 * DATA  ==> �������� 
		 * --------------------------
		 * []������������ => new �θ��� ������ �ּҸ�����.
		 */
		int [] arr = new int[3];		
		int a = 10;	
		int b = 20;
		System.out.println(arr);		
		int [] temp = arr;	
		temp[1] = 100;	
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		arr[0] = 200;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));

	}

}
