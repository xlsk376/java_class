package E2_�迭2_�⺻�̷�;

public class �迭2_�⺻�̷�1_���� {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		double farr[] = {1.1, 2.2, 3.3, 4.4};
		boolean barr[] = {false, false , true , true};
		/*
			char[] �迭�� �ѱ��ھ� ���尡���ϰ� '' Ȭ����ǥ�� ����Ѵ�.	
			char[] �迭�� �ʹ� �����ϴ�. 
			 [��] �ѻ���� �̸� ��ü�� �迭�̱⶧���� �Ѹ��̻� �����Ҽ�����.  
		 */
		char carr[] = {'m' ,'i' , 'k' , 'e'}; 		
			
		/*
		 * char��ſ� ���ڿ��� �����Ҽ��ִ� String �� ���������.���� �ڼ��� �ٷ��.
		 */
		String name = "�̿���";
		System.out.println(name);	
		String sarr[] = {"��ö��" , "mike" , "�̸���" , "jake"};
					
		System.out.println("--------------------------------");
		for(int i = 0; i < 4; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			System.out.print(farr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			System.out.print(barr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			System.out.print(carr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			System.out.print(sarr[i] + " ");
		}
		System.out.println();

	}

}
