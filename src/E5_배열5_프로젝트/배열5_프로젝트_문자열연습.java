package E5_�迭5_������Ʈ;

public class �迭5_������Ʈ_���ڿ����� {

	public static void main(String[] args) {
//		String str = "60";
//		���ڿ��� ������ ��ȯ�ϴ¹�
//		int score= Integer.parseInt(str);
//
//		������ ���ڿ��� ��ȯ�ϴ¹�
//		String str = 10 + "";
		
		String[][] data = {
				{"1001" ,"��ö��" , "10"},
				{"1002" ,"�̸���" , "60"},
				{"1003" ,"�輺��" , "90"},
				{"1004" ,"����ȣ" , "55"},
		};
		for(int i = 0; i < data.length; i++) {			
			System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2]);			
		}	
		System.out.println("---------------------------------------------------");
		System.out.println("������ 60���̻��� [�л���ȣ �̸� ����] ��� : ");
		
		for(int i = 0; i < data.length; i++) {
			int score =  Integer.parseInt(data[i][2]);
			if(score >= 60) {
				System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2]);
			}
		}
		System.out.println("---------------------------------------------------");
		System.out.println("���蹮���� 1������ ���� ����ó���Ǿ���. �л��� ������ 5���� �λ��Ͻÿ�");
		
		for(int i = 0; i < data.length; i++) {
			int score = Integer.parseInt(data[i][2]);
			score += 5;
			data[i][2] = score + "";
		}		
		for(int i = 0; i < data.length; i++) {			
			System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2]);			
		}

	}

}
