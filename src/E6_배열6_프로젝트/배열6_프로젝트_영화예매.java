package E6_�迭6_������Ʈ;

import java.util.Arrays;
import java.util.Scanner;

public class �迭6_������Ʈ_��ȭ���� {

	public static void main(String[] args) {
		/* 
		 * [��ȭ���¼�����]
		 * (1)ȸ������ (2)�α���  (0) ����
		 * 
		 * [ȸ������] ==> id �� ���� ==> �ߺ�ó�� 
		 * [�α�����] ==> (1) �α׾ƿ� (2) ���� (3) ����Ȯ��(���ΰ͸� �¼���ȣ��� ) 
		 *              (4) �������(���ΰ͸�) (5) ��üȮ�� (0) �ڷΰ��� 
		 *
		 * 1) ȸ�������� 10����� �����ϴ�.
		 * 2) idList ���� ȸ������ id�� ���� 
		 * 3) �α������� �¼��� �����ϸ� seatList �� �����ѻ���� id ������ 
		 * 4) �ʿ��Ѻ����� �߰��Ҽ��ִ�.
		 */
		final int MAX = 10;
		final int ROW = 3;
		final int COL = 4;
		int idList[] = new int[MAX];
		int seatList[][]= new int[ROW][COL]; // 3 X 4
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int log = -1;
		while(true) {
			System.out.println("(1)ȸ������ (2)�α��� (0) ����");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println(Arrays.toString(idList));
				boolean check = false;
				for(int i = 0; i < idList.length; i++) {
					if(idList[i] == 0) {
						check = true;
						break;
					}
				}
				if(check == true) {
					System.out.println("������ ���̵� �Է�");
					int data = scan.nextInt();
					check = false;
					for(int j = 0; j < idList.length; j++) {
						if(data == idList[j]) {
							check = true;
							break;
						}
					}
					if(check == true) {
						System.out.println("�ߺ�");
					}else {
						idList[count] = data;
						count += 1;
						System.out.println("�߰� ����");
					}
				}else {
					System.out.println("������");
				}
			}else if(sel == 2) {
				if(log == -1) {
					System.out.println("�α����� ���̵� �Է�");
					int id = scan.nextInt();
					boolean check = false;
					for(int i = 0; i < idList.length; i++) {
						if(id == idList[i]) {
							check = true;
							break;
						}
					}
					if(check == true) {
						log = id;
						System.out.println(log +"�� �α��� �Ǿ����ϴ�.");
						while(true) {
							if(log != -1) {
								System.out.println("(1) �α׾ƿ� (2) ���� (3) ����Ȯ��");
								System.out.println("(4) ������� (5) ��üȮ�� (0) �ڷΰ���");
								int sel1 = scan.nextInt();
								if(sel1 == 0) {
									log = -1;
									break;
								}else if(sel1 == 1) { // �α׾ƿ�
									System.out.println(log+" �� �α׾ƿ��Ǿ����ϴ�.");
									log = -1;
									break;
								}else if(sel1 == 2) { // ����
									for(int i = 0; i < seatList.length; i++) {
										System.out.println(Arrays.toString(seatList[i]));
									}
									System.out.println("������ �¼��� �����ϼ���.");
									int n1 = scan.nextInt();
									int n2 = scan.nextInt();
									check = false;
									for(int i = 0; i < seatList.length; i++) {
										for(int j = 0; j < seatList[i].length; j++) {
											if(seatList[n1][n2] == 0) {
												check = true;
												break;
											}
										}
									}
									if(check == true) {
										seatList[n1][n2] = log;
										System.out.println("���ŵǾ����ϴ�.");
									}else {
										System.out.println("�̹� ���Ű� ���� �¼��Դϴ�.");
									}
								}else if(sel1 == 3) { // ����Ȯ��(���ΰ͸�)
									int seatCount = 0; // ������ �¼���
									for(int i = 0; i < seatList.length; i++) {
										for(int j = 0; j < seatList[i].length; j++) {
											if(log == seatList[i][j]) {
												seatCount += 1; 
												System.out.println(i + "��" +" "+j + "��");
											}
										}
									}
									System.out.println(log+" ���� ������ �¼��� : "+seatCount);
									
								}else if(sel1 == 4) { // �������(���ΰ͸�)
									System.out.println("����� �¼��� �����ϼ���.");
									int cancelSeat1 = scan.nextInt();
									int cancelSeat2 = scan.nextInt();
									check = false;
									for(int i = 0; i < seatList.length; i++) {
										for(int j = 0; j < seatList[i].length; j++) {
											if(log == seatList[cancelSeat1][cancelSeat2]) {
												check = true;
											}
										}
									}
									if(check == true) {
										seatList[cancelSeat1][cancelSeat2] = 0;
										System.out.println("��ҵǾ����ϴ�.");
									}else {
										System.out.println("����� �¼��� �����ϴ�.");
									}
								}else if(sel1 == 5) { // ��üȮ��
									for(int i = 0; i < seatList.length; i++) {
										System.out.println(Arrays.toString(seatList[i]));
									}
								}
							}
						}
					}else {
						System.out.println("��ġ�ϴ� ���̵� �����ϴ�.");
					}
				}else {
					System.out.println("�α׾ƿ��� �̿��� �ּ���.");
				}
			}else if(sel == 0) {
				System.out.println("����");
				break;
			}
			
		}

	}

}
