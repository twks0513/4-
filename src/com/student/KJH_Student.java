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

import java.util.ArrayList;
import java.util.Scanner;

class StInfo{
	private String name = null;
	private int stNum = 0;
	private String major = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStNum() {
		return stNum;
	}

	public void setStNum(int stNum) {
		this.stNum = stNum;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}

public class KJH_Student {
	Scanner input = new Scanner(System.in);
	ArrayList<StInfo> stArr = new ArrayList<StInfo>();
	int user, stNum;
	String name, major;
	
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
			case 1: register(); break;
			case 2: search(); break;
			case 3: delete(); break;
			case 4: modify(); break;
			case 5: printAll(); break;
			case 6: System.out.println("시스템을 종료합니다.");
					System.out.println("감사합니다.");
					break;
			default: System.out.println("다시 입력해주세요.");
			}	
		}


	}
	public void register() {		
		System.out.println("학생을 등록합니다.");
		
		StInfo si = new StInfo();
		
		System.out.print("학번: ");
		stNum = input.nextInt();
		
		if(!stArr.isEmpty()) { //최초 등록이 아닐 때 학번 중복 체크
			for(int i=0 ; i<stArr.size() ; i++) {
				int hasNum = stArr.get(i).getStNum();
				if(stNum == hasNum) {
					System.out.println("이미 존재하는 학번입니다.");
					break;
				}else {
					System.out.print("이름: ");
					name = input.next();
					
					System.out.print("학과: ");
					major = input.next();
					
					si.setName(name); si.setStNum(stNum); si.setMajor(major);
					stArr.add(si);
					
					System.out.println(name + " 학생이 등록되었습니다.");
				}
			}
		}else { //최초 등록일 때
			System.out.print("이름: ");
			name = input.next();
			
			System.out.print("학과: ");
			major = input.next();
			
			si.setName(name); si.setStNum(stNum); si.setMajor(major);
			stArr.add(si);
			
			System.out.println(name + " 학생이 등록되었습니다.");
		}

		
	}

	public void search() {
		System.out.println("학생을 검색합니다.");
		System.out.print("찾을 학번: ");
		stNum = input.nextInt();
		
		for(int i=0 ; i<stArr.size() ; i++) {
			int searchNum = stArr.get(i).getStNum();
			String searchName = stArr.get(i).getName();
			String searchMajor = stArr.get(i).getMajor();
			if(stNum == searchNum) {
				System.out.println("이름: " + searchName);
				System.out.println("학번: " + searchNum);
				System.out.println("학과: " + searchMajor);
				break;
			}else {
				System.out.println("존재하지 않는 학번입니다.");
			}
		}
		
	}

	public void delete() {
		System.out.println("학생 삭제 기능");
	}

	public void modify() {
		System.out.println("학생 수정 기능");
	}

	public void printAll() {
		System.out.println("모든 학생을 출력합니다.");
		
		for(int i=0 ; i<stArr.size() ; i++) {
			StInfo si = stArr.get(i);
			System.out.println("----------------------");
			System.out.println("이름: " + si.getName());
			System.out.println("학번: " + si.getStNum());
			System.out.println("학과: " + si.getMajor());

		}
	}


}