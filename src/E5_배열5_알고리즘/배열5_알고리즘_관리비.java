package E5_배열5_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 배열5_알고리즘_관리비 {

	public static void main(String[] args) {
		/*	
		 문제 1) 각층별 관리비 합 출력
		 정답 1) 4400, 7100, 5400		
		 문제 2) 호를 입력하면 관리비 출력
		 정답 2) 입력 : 202	관리비 출력 : 2000	
		 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)		
		 문제 4) 호 2개를 입력하면 관리비 교체 (101 , 102) ==>  (2100, 1000)		
		 문제 5) 관리비 많이 나온순서대로 관리비와 호수 출력 (정렬)
		 */
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
		int garo[] = new int[3];
		System.out.println("--호수--");
		for(int i = 0; i < apt.length; i++) {
			System.out.println(Arrays.toString(apt[i]));
		}
		System.out.println();
		System.out.println("--관리비--");
		for(int i = 0; i < pay.length; i++) {
			System.out.println(Arrays.toString(pay[i]));
		}
		System.out.println();
//		//1) 각층별 관리비 합
//		System.out.println("각 층별 관리비 합 : ");
//		int index = 0;
//		for(int i = 0; i < pay.length; i++) {
//			if(i % 3 == 0) { // x가 0일때
//				for(int j = 0; j < pay[i].length; j++) {
//					garo[index] += pay[i][j];
//				}
//			}
//			if(i % 3 == 1) { // x가 1일때
//				for(int j = 0; j < pay[i].length; j++) {
//					garo[index] += pay[i][j];
//				}
//			}
//			if(i % 3 == 2) { // x가 2일때
//				for(int j = 0; j < pay[i].length; j++) {
//					garo[index] += pay[i][j];
//				}
//			}
//			index += 1;
//		}
//		System.out.println(Arrays.toString(garo));
//		System.out.println();
//		
//		//2) 호 입력하면 관리비 출력
//		Scanner scan = new Scanner(System.in);
//		System.out.print("호수를 입력하세요 : ");
//		int num = scan.nextInt();
//		int a = 0;
//		int b = 0;
//		for(int i = 0; i < apt.length; i++) {
//			for(int j = 0; j < apt[i].length; j++) {
//				if(num == apt[i][j]) {
//					a = i;
//					b = j;
//				}
//			}
//		}
//		System.out.println("관리비는 : "+ pay[a][b]);
//		
//		//3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
//		int max = 0;
//		a = 0;
//		b = 0;
//		for(int i = 0; i < pay.length; i++) {
//			for(int j = 0; j < pay[i].length; j++) {
//				if(max < pay[i][j]) {
//					max = pay[i][j];
//					a = i;
//					b = j;
//				}
//			}
//		}
//		System.out.println("--------------------");
//		System.out.println("관리비가 가장 많이 나온 집 : " + apt[a][b]);
//		System.out.println("관리비는 : " + max);
//		System.out.println("--------------------");
//		int min = 4000;
//		a = 0;
//		b = 0;
//		for(int i = 0; i < pay.length; i++) {
//			for(int j = 0; j < pay[i].length; j++) {
//				if(min > pay[i][j]) {
//					min = pay[i][j];
//					a = i;
//					b = j;
//				}
//			}
//		}
//		System.out.println("--------------------");
//		System.out.println("관리비가 가장 적게 나온 집 : " + apt[a][b]);
//		System.out.println("관리비는 : " + min);
//		System.out.println("--------------------");
		
		//4) 호 2개를 입력하면 관리비 교체 (101 , 102) ==>  (2100, 1000)
//		Scanner scan = new Scanner(System.in);
//		System.out.println("변경할 호수를 입력하세요.");
//		int ho1 = scan.nextInt();
//		int ho2 = scan.nextInt();
//		int id1 = 0;
//		int id2 = 0;
//		int id3 = 0;
//		int id4 = 0;
//		int temp1 = 0;
//		int temp2 = 0;
//		for(int i = 0; i < apt.length; i++) {
//			for(int j = 0; j < apt[i].length; j++) {
//				if(ho1 == apt[i][j]) {
//					id1 = i;
//					id2 = j;
//				}
//				if(ho2 == apt[i][j]) {
//					id3 = i;
//					id4 = j;
//				}
//			}
//		}
//		temp1 = pay[id1][id2];
//		temp2 = pay[id3][id4];
//		pay[id1][id2] = temp2;
//		pay[id3][id4] = temp1;
//		System.out.println(ho1 + " , " + ho2);
//		for(int i = 0; i < pay.length; i++) {
//			System.out.println(Arrays.toString(pay[i]));
//		}
		
		//5) 관리비 많이 나온순서대로 관리비와 호수 출력 (정렬)
		/*
		 * 2차원 정렬을 1차원으로 변경하기
		 */
		int arr[] = new int[9];
		int index = 0;
		for(int i = 0; i < pay.length; i++) {
			for(int j = 0; j < pay[i].length; j++) {
				arr[index] = pay[i][j]; // 2차원배열 -> 1차원배열
				index += 1; // 증가 시킴  
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("----------------------------------------------------");
		
		int arr1[] = new int[9];
		int index1 = 0;
		for(int i = 0; i < apt.length; i++) {
			for(int j = 0; j < apt[i].length; j++) {
				arr1[index1] = apt[i][j];
				index1 += 1;
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println("----------------------------------------------------");
		
		int temp = 0;
		int temp1 = 0;
		for(int i = 0; i < arr.length; i++) { // i가 증가하면서 j가 비교하는 영역이 증가 
			for(int j = 0; j < i; j++) {
				if(arr[i] > arr[j]) { // i 기준
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					temp1 = arr1[j];
					arr1[j] = arr1[i];
					arr1[i] = temp1;
							
				}
			}
//			System.out.println(Arrays.toString(arr));
//			System.out.println();
//			System.out.println(Arrays.toString(arr1));
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println(Arrays.toString(arr1));
		
		
		
		// 새로 작성
		
//		int[] garo = new int[3];
//		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				garo[i] += pay[i][j];
//			}
//		}
//		System.out.println(Arrays.toString(garo));
//		문제 2) 호를 입력하면 관리비 출력
//		 정답 2) 입력 : 202	관리비 출력 : 2000	
//		System.out.println("호를 입력하세요.");
//		int n = scan.nextInt();
//		int a = 0;
//		int b = 0;
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				if(n == apt[i][j]) {
//					a = i;
//					b = j;
//				}
//			}
//		}
//		System.out.println(n + " " + pay[a][b]);
		 
//		 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
//		 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)	
//		int max = 0;
//		int min = pay[0][0];
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		int d = 0;
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				if(max < pay[i][j]) {
//					max = pay[i][j];
//					a = i;
//					b = j;
//				}
//				if(min > pay[i][j]) {
//					min = pay[i][j];
//					c = i;
//					d = j;
//				}
//			}
//		}
//		System.out.println(apt[a][b] + " " + apt[c][d]);
		
//		 문제 4) 호 2개를 입력하면 관리비 교체 (101 , 102) ==>  (2100, 1000)	
//		System.out.println("변경할 호수를 두개 입력하세요.");
//		int n1 = scan.nextInt();
//		int n2 = scan.nextInt();
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		int d = 0;
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				if(n1 == apt[i][j]) {
//					a = i;
//					b = j;
//				}
//				if(n2 == apt[i][j]) {
//					c = i;
//					d = j;
//				}
//			}
//		}
//		int temp = pay[a][b];
//		pay[a][b] = pay[c][d];
//		pay[c][d] = temp;
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.println(Arrays.toString(pay[i]));
//		}
		
//		 문제 5) 관리비 많이 나온순서대로 관리비와 호수 출력 (정렬)
//		int index = 0;
//		int temp[] = new int[9];
//		int ho[] = new int[temp.length];
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				temp[index] = pay[i][j];
//				ho[index] = apt[i][j];
//				index += 1;
//			}
//		}
//		System.out.println(Arrays.toString(temp));
//		System.out.println(Arrays.toString(ho));
//		index = 0;
//		int a = 0;
//		int b = 0;
//		for(int i = 0; i< temp.length; i++) {
//			for(int j = 0; j < i; j++) {
//				if(temp[i] > temp[j]) {
//					a = temp[i];
//					temp[i] = temp[j];
//					temp[j] = a;
//					b = ho[i];
//					ho[i] = ho[j];
//					ho[j] = b;
//				}
//				
//			}
//		}
//		System.out.println(Arrays.toString(temp));
//		System.out.println(Arrays.toString(ho));
//		index = 0;
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				pay[i][j] = temp[index];
//				apt[i][j] = ho[index];
//				index += 1;
//			}
//		}
//		for(int i = 0; i < 3; i++) {
//			System.out.println(Arrays.toString(pay[i]));
//		}
//		for(int i = 0; i < 3; i++) {
//			System.out.println(Arrays.toString(apt[i]));
//		}
		

	}

}
