package com.jo4;

import java.util.Scanner;
import com.jo4.*;
import com.jo4.event.*;


import member.*;

public class Quiz01 {
	public static void main(String[] args) {
		Member mem = new Member();
		Event01 ev = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("1.ȸ������ 2.�̺�Ʈ����");
		int choice = scan.nextInt();
		if(choice == 1) {
			System.out.println("ȸ�����ñ���Դϴ�");
			System.out.println("1.ȸ�������� 2.ȸ�� �� ����");
			int memchoice = scan.nextInt();
			if(memchoice == 1) {
				mem.memSave();
			}else if(memchoice ==2) {
				mem.memNum();
			}
		}else if(choice ==2) {
			System.out.println("�̺�Ʈ���ñ��");
			System.out.println("1.�̴��� �̺�Ʈ 2. ��ü �̺�Ʈ");
			int eventchoice = scan.nextInt();
			if(eventchoice ==1) {
				ev = new Event1();
			}else if (eventchoice ==2) {
				ev = new Event();
			}
			ev.event();
		}
			

	}

}
