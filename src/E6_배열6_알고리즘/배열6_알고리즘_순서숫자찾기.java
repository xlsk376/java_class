package E6_�迭6_�˰���;

public class �迭6_�˰���_��������ã�� {

	public static void main(String[] args) {
		/*
		 input �� �迭���� ������   array�迭�� ����� ��ġ�ϰ�,
		  �׼����� ��ġ�ϸ�  true , �ƴϸ� false ��� 	
		  
		��) input1�� ������  6,1,8  �̰� array ��  
			index 5~7(6,1,8) �� ���� ������ ��ġ�Ѵ�.
		���)  true	
			  	
		��) input2�� ������ array �迭�� �ִ°���� ��ġ������, 
		   input2 ������ 6,3 �̰�, array �� ���� 3,6 ���� ������ �ٸ���.
		���) false
		*/
//		int array[] = {1,3,3,6,5,6,1,8,9};	// 9
//		int input1[] = {6,1,8};
//		int input2[] = {6,3};
//		for(int i = 0; i < array.length - input1.length+1; i++) {
//			int count = 0;
//			for(int j = 0; j < input1.length; j++) {
//				if(array[i+j] == input1[j]) {
//					count += 1;
//				}
//				System.out.print(array[i+j] + " ");
//			}
//			if(count == input1.length) {
//				System.out.print("����");
//			}
//			System.out.println();
//		}
		
		int array[] = {1,3,3,6,5,6,1,8,9};	
		int input1[] = {6,1,8};
		int input2[] = {6,3};
		int win = 0;
		for(int i = 0; i < array.length - (input1.length-1); i++) {
			int count = 0;
			for(int j = 0; j < input1.length; j++) {
				System.out.print("[" + input1[j] + " " + array[j + i]  + "]"); // �� �ε��� ���ڳ��� ��ġ
							
				if(input1[j] == array[j + i]) {
					count += 1;
				}
			}
			System.out.println();
			if(count == 3) {
				win = 1;
			}
		}
		if(win == 1) {
			System.out.println("�ִ�.");
		}else {
			System.out.println("����.");
		}
		

	}

}
