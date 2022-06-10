package com.student;
/*학생관리 프로그램 만들어 주세요
- 1.학생등록
   - 존재하는 학생이면 존재하는 학생입니다.
   - 동일한 아이디(또는 학번)가입하면 존재하는 아이디(학번)입니다
   - 저장이 완료되면 '등록되었습니다'
- 2.학생검색
   - 존재하면 해당 학생 출력
   - 존재하지 않으면 '존재하지 않습니다'
- 3.학생삭제
   - 존재하지 않으면 '존재하지 않습니다'
   - 존재하는 학생이면 해당값 삭제
- 4.수정
   - 존재하지 않으면 '존재하지 않습니다'
   - 존재한다면 해당 학생의 아이디(학번)을 제외한 나머지값 수정
- 5.모든학생 출력
- 6.종료
*/
import java.util.Scanner;

public class KJH_Student {
	Scanner input = new Scanner(System.in);
	int user=0;
	public void info() {
		while(true) {
			System.out.println("=========================");
			System.out.println("학생 관리 프로그램(ver.KJH)");
			System.out.println("=========================");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 검색");
			System.out.println("3. 학생 삭제");
			System.out.println("4. 학생 수정");
			System.out.println("5. 모든 학생 출력");
			System.out.println("6. 종료");
			System.out.print(">>>");
			user = input.nextInt();
			System.out.println("=========================");
			
			switch(user) {
			case 1: 
				register();
				break;
			case 2: 
				search();
				break;
			case 3: 
				delete();
				break;
			case 4: 
				modify();
				break;
			case 5: 
				printAll();
				break;
			case 6: 
				quit();
				break;
			}	
		}


	}
	public void register() {
		System.out.println("학생 등록 기능");
	}
	
	public void search() {
		System.out.println("학생 검색 기능");
	}
	
	public void delete() {
		System.out.println("학생 삭제 기능");
	}
	
	public void modify() {
		System.out.println("학생 수정 기능");
	}
	
	public void printAll() {
		System.out.println("모든 학생 출력 기능");
	}
	
	public void quit() {
		System.out.println("종료 기능");
	}
	
}
