package E4_�迭4_�˰���;

public class �迭4_�˰���_����� {

	public static void main(String[] args) {
		/*
		 * [�����]
		 * 
		 *  ö���� ����� 3�� 3�Ͽ� ������. 		
			 ö���� ����� 100�� ����Ͽ� ������Ƽ�� �ҷ����Ѵ�.
			 ������ 100�ϵڴ�  ��������ΰ�?
			 �� ������ ��������ʴ´�.
		 */
		
		int monthList[] =
			{31, 28, 31, 30, 
			 31, 30, 31, 31, 
			 30, 31, 30, 31};
	
		int day = 3;
		int month = 3;
		//1)3�� 3���� �ϼ��� �ٲ۴�. -> 31+ 28+3 => 1�� + 2�� + 3�� ���ϱ�
		int total = 0;
		for(int i = 0; i < month-1; i++) { // 3���� �ȼ��� 1,2���� ����
			total += monthList[i];
		}
		System.out.println(total); //59, 1-2�� => 2�� 28��
		total += day;
		System.out.println(total); //62, 59+3 => 3�� 3��
		total += 100; // 100�ϵ�
		System.out.println(total); //162 => 3��3�Ϻ��� 100�� ��
		int day2 = 0;
		for(int i = 0; i < monthList.length; i++) {
			day2 = total; // ���� ���� ���� �ϼ�����, 0�̰ų� 0���� �۱����� �������� �ϼ��� ��
			total -= monthList[i]; // ��ӻ��� 0�̰ų� 0���� ������ �ش�Ǵ� ����
			if(total <= 0) {
				System.out.println((i+1)+"��"); // 0������ ���Ǳ⶧���� +1
				System.out.println(day2 +"��");
				break;
			}
		}

	}

}
