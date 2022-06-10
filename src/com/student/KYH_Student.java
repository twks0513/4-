package com.student;

import java.util.ArrayList;
import java.util.Scanner;

class stu{
	private String name;
	private int pw;
	
	public ArrayList arr = new ArrayList();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	
	
}

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
	//ArrayList<stu> arr = new ArrayList<stu>();
	Scanner input = new Scanner (System.in);
	//System.out.println("등록");
	System.out.println("이름: ");
	String name=input.next();
	System.out.println("비밀번호: ");
	int pw = input.nextInt();
	
	stu s = new stu();
	s.setName(name); s.setPw(pw);
	for(int i=0;i<8;i++) {
	//s.arr.add(s);
	System.out.println(s.arr.get(i));}
	
	}
public void find() {
	System.out.println("검색");
	
}
public void delete() {
	System.out.println("삭제");
	
}
public void modify() {

	System.out.println("수정");
	
}
public void print() {
	System.out.println("모두출력");
	stu s= new stu();
	for(int i=0;i<s.arr.size();i++) {
		System.out.println("이름: "+s.arr.get(i));
	}
	
}
public void exit() {
	System.out.println("종료");
}

}
