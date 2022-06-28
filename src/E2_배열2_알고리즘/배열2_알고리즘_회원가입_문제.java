package E2_배열2_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 배열2_알고리즘_회원가입_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int[] arr = {0, 0, 0, 0, 0};	
		int count = 0;
		while(true) { // 종료 전까지 무한반복
			System.out.println("===[회원가입]===");
			System.out.println(Arrays.toString(arr)); // 현재 저장된 아이디를 보여줌
			System.out.println("1.추가");
			System.out.println("2.수정");
			System.out.println("3.삭제(인덱스)");
			System.out.println("4.삭제(값)");
			System.out.println("5.삽입");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(count == 5) { // 아이디 배열의 존재 여부 확인
					System.out.println("가득참.");
					//continue;
				}else {
					System.out.println("[추가] 입력 : ");
					int data = scan.nextInt();				
					// 유효성 검사 , 항상 체크해주기
					boolean check = false; 
					for(int i = 0; i < count; i++) {
						if(data == arr[i]) { // 입력한 아이디를 저장된 값과 비교
							check = true; // 중복이면 true
							break; // 결과를 얻었으니 더 반복할필요없다.
						}
					}
					if(check == true) {
						System.out.println("중복. ");
					}else {
						arr[count] = data; // 중복이 아니라면 아이디를 배열에 넣어줌
						count += 1; // 저장될 칸
						System.out.println("추가성공. ");
					}
				}		
			}else if(sel == 2) {
				System.out.println("[수정] 값입력 : ");
				int data = scan.nextInt();
				boolean check = false;
				int index = -1; 
				for(int i = 0; i  < count ;i++) {
					if(data == arr[i]) { // 아이디의 존재여부 확인
						check = true; 
						index = i; // 수정할 데이터 인덱스.
					}
				}
				if(check == true) { // 아이디 존재
					System.out.println("[교체] 값입력 : ");
					data = scan.nextInt();
					check = false;
					for(int i = 0; i < count; i++) {
						if(data == arr[i]) { // 교체하려는 아이디의 존재여부 확인
							check = true;
							break;
						}
					}
					if(check == true) { //기존에 있는 아이디 여부
						System.out.println("중복값. ");
					}else {
						arr[index] = data; // 데이터 수정
						System.out.println("수정완료. ");
					}
					
					
				}else { // 입력안함
					System.out.println("수정값 없음. ");
				}
			}else if(sel == 3) {
				if(count == 0) {
					System.out.println("삭제값없음.");
					continue;
				}
				System.out.println("[삭제] 인덱스 입력 : ");
				int index = scan.nextInt();
				
				if(index < 0 || index >= count) { // 범위벗어날시 오류
					System.out.println("입력 오류.");
					continue;
				}
				
				for(int i = index; i < count-1; i++) { // 현재 카운트된 개수보다 적게돌려서 앞에 인덱스로 아이디 옴겨줌
					arr[i] = arr[i + 1]; // 아이디 삭제후 뒤에있는 값이 전으로 넘어감
				}
				arr[count-1] = 0;
				count -= 1;
				System.out.println("삭제완료.");
				
			}
			else if(sel == 4) {
				if(count == 0) {
					System.out.println("사이즈가 0입니다.");
					continue;
				}
				System.out.println("[삭제] 값입력 : ");
				int data = scan.nextInt();
				boolean check = false;
				int index = -1;
				
				for(int i = 0; i < count ; i++) {
					if(data == arr[i]) {
						check = true;
						index = i;
					}
				}
				
				if(check == true) {
					for(int i = index; i < count-1; i++) {
						arr[i] = arr[i + 1];
					}
					arr[count-1] = 0;
					count -= 1;
					System.out.println("삭제완료.");
				}else {
					System.out.println("삭제값 없음. ");
				}
			}else if(sel == 5) {
				if(count == 5) {
					System.out.println("가득참.");
					continue;
				}
				System.out.println("[삽입] 인덱스 입력 : ");
				int index = scan.nextInt();
				if(index < 0 || index > count) { // 삽입할때 기존에 있는 아이디를 밀어내고 보다 앞에 추가됨
					System.out.println("인덱스 오류.");
					continue;
				}
				System.out.println("[삽입] 값 입력 : ");
				int data = scan.nextInt();
				
				boolean check = false;
				for(int i = 0; i < count ;i++) {
					if(data == arr[i]) {
						check = true;
					}
				}
				if(check == true) {
					System.out.println("값이 중복됨. ");
					continue;
				}
				
				int lastindex = count;
				for(int i = index; i < count; i++) {
					arr[lastindex] = arr[lastindex-1];
					lastindex -= 1;
				}
				arr[index] = data;
				count += 1;
				System.out.println("삽입 완료. ");
				
			}
		}

	}

}
