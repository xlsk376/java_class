package E5_�迭5_������Ʈ;

public class �迭5_������Ʈ_������ü {

	public static void main(String[] args) {
		/*
		 *  �Ʒ� �� �����������϶� ���� ��ü���� ���(��, ������ ��������ʴ´�)
		 */
		int rentalPeriod = 70;
		int [] rentalDay = {2020 , 12, 29};
		int [] today = {2021, 3, 10};
			
		int monthList[] = {31, 28, 31, 30, 31, 31, 30,
					31 , 30 , 31 , 30 , 31};
		
		int rsum = 0;
		int tsum = 0;
		
		rsum += rentalDay[0] * 365;
		tsum += today[0] * 365;
		System.out.println("�⵵ : "+rsum + " " + tsum);
		
		for(int i = 0; i < rentalDay[1] - 1; i++) {
			rsum += monthList[i]; // 1 ~ 11
		}
		for(int i = 0; i < today[1]-1; i++) {
			tsum += monthList[i]; // 1 ~ 2
		}
		System.out.println("�� : "+rsum + " " + tsum);
		rsum += rentalDay[2];
		tsum += today[2];
		System.out.println("�� : "+rsum + " " + tsum);
		rsum += rentalPeriod;
		System.out.println(rsum + " " + tsum);
		int result = rsum - tsum;
		System.out.println(result);
		

	}

}
