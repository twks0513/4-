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
		System.out.println("1.회원관련 2.이벤트관련");
		int choice = scan.nextInt();
		if(choice == 1) {
			System.out.println("회원관련기능입니다");
			System.out.println("1.회원저장기능 2.회원 수 보기");
			int memchoice = scan.nextInt();
			if(memchoice == 1) {
				mem.memSave();
			}else if(memchoice ==2) {
				mem.memNum();
			}
		}else if(choice ==2) {
			System.out.println("이벤트관련기능");
			System.out.println("1.이달의 이벤트 2. 전체 이벤트");
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
