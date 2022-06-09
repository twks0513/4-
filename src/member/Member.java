package member;

import java.util.Scanner;

public class Member {
	public void memSave() {
		System.out.println("회원 정보 입력");
		System.out.print("이름: ");
		Scanner input = new Scanner(System.in);
		String member = input.next();
		System.out.println(member + "님의 정보가 저장 되었습니다.");
	}
	public void memNum() {
		int memberNum = 100;
		System.out.println("전체 회원 수: " + memberNum + "명");
	}
}
