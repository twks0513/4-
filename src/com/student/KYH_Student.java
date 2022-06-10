package com.student;

import java.util.Scanner;

public class KYH_Student {
public void start() {
	Scanner input = new Scanner (System.in);
	int num=0;
	while(true) {
	System.out.println("1.학생등록");
	System.out.println("2.학생검색");
	System.out.println("3.학생삭제");
	System.out.println("4.학생수정");
	System.out.println("5.모든학생출력");
	System.out.println("6.종료");
	System.out.println(">>>");
	num = input.nextInt();
	
	switch (num) {
	case 1: 
	register();	break;
	case 2: 
	find();	break;
	case 3: 
	delete();	break;
	case 4: 
	modify();	 break;
	case 5: 
	print();	break;
	case 6: 
	exit(); 	break;
	}
	}
	
}
	
	
	
public void register() {
	
	System.out.println("학생등록");
	System.out.println("학번입력:");
	System.out.println("비밀번호입력:");
	System.out.println("저장완료");
}
public void find() {
	System.out.println("학생 검색");
	System.out.println("존재하지 않습니다.");
	System.out.println("학생출력");
}
public void delete() {
	System.out.println("학생검색");
	System.out.println("존재하지 않는 학생");
	System.out.println("삭제합니다.");
	
}
public void modify() {
	System.out.println("존재하지 않습니다");
	System.out.println("수정합니다.");
	
}
public void print() {
	System.out.println("모든학생 출력");
	
}
public void exit() {
	System.out.println("종료합니다.");
}
}
