package member;

import java.util.Scanner;

public class Member {
	public void memSave() {
		System.out.println("ȸ�� ���� �Է�");
		System.out.print("�̸�: ");
		Scanner input = new Scanner(System.in);
		String member = input.next();
		System.out.println(member + "���� ������ ���� �Ǿ����ϴ�.");
	}
	public void memNum() {
		int memberNum = 100;
		System.out.println("��ü ȸ�� ��: " + memberNum + "��");
	}
}
