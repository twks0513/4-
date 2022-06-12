package com.student;

import java.util.ArrayList;
import java.util.Scanner;

public class KYH_Student {
	
	public static ArrayList<Student> arr = new ArrayList<Student>();
	static Scanner input = new Scanner (System.in);
	private String name;
	private static int num;




public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getNum() {
		return num;//학번
	}



	public void setNum(int num) {
		this.num = num;
	}



public static void start() {
	
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
	find();		break;
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
	
	
	
public static void register() {
	Student stu = new Student();
	String name="";
	int num;
	
	System.out.println("학생등록");
	int i=0;
	while(true){
	System.out.println("학번입력:");
	num= input.nextInt();
	int j=0;
	for(;j<arr.size();j++) {
	if(arr.get(j).getNum()==num) {
		System.out.println("등록되어있습니다.");
		break;}
	}
	if(arr.size()==j)
		break;
	}
	
	
	System.out.println("이름입력:");
	name = input.next();
	System.out.println("학번입력:");
	num=input.nextInt();
 
	stu.setName(name);
	stu.setNum(num);
	
	arr.add(stu);
	System.out.println("저장완료");

}
public static void find() {

	while( true ) {
		System.out.println("검색 학번 입력");
		num = input.nextInt();
		int i=0;
		for( ;i<arr.size(); i++) {
			if(arr.get(i).getNum() == num) {
				System.out.println("---학생 정보---");
				System.out.println("학번: "+arr.get(i).getNum());
				System.out.println("이름: "+arr.get(i).getName());
				
				System.out.println("-------------");
				System.out.println("검색을 종료하시겠습니까?");
				System.out.println("1.예 2.아니오");
				int num = input.nextInt();
					if(num==1) {
						start();
					}else if(num==2) {
						
					}else {
						System.out.println("잘못입력하셨습니다.");
						System.out.println("검색으로 돌아갑니다.");
					}

				break;
			}
		}
		if(i == arr.size())
			System.out.println("존재하지 않는 학생입니다");
	}
}
public static void delete() {

	int i=0;
		boolean bool = true;
	while( true ) {
		
		while(bool) {
		System.out.println("삭제 학번 입력");
		num = input.nextInt();
		for(;i<arr.size();i++) {
		if(arr.get(i).getNum() == num) {
				arr.remove(i);
				System.out.println("삭제 되었습니다");
			bool=false;
				break;
				}
		}start();
		}if(i == arr.size())
		System.out.println("존재하지 않는 학생입니다.");
		start();
	} 
	
	
}
public static void modify() {

	boolean bool = true;
	while( bool ) {
		System.out.println("수정 학번 입력");
		num = input.nextInt();
		int i=0;
		for( ;i<arr.size(); i++) {
			if(arr.get(i).getNum() == num) {
				System.out.println("---학생 정보---");
				System.out.println(arr.get(i).getNum());
				System.out.println(arr.get(i).getName());
				System.out.println("-------------");
				System.out.println("수정할 이름 입력");
				String name = input.next();
				System.out.println("수정할 학번 입력");
				int num = input.nextInt();
				
				Student st = arr.get(i);
				st.setName(name);
				st.setNum(num);
				arr.remove(i); 
				arr.add(st);
				System.out.println("수정되었습니다");
				bool = false;
				break;
			}
		}
		if(i == arr.size())
			System.out.println("존재하지 않는 학생입니다");
	}
	
}
public static void print() {
	System.out.println("모든학생 출력");
	for(Student s : arr) {
		System.out.println("학번 : "+s.getNum());
		System.out.println("이름 : "+s.getName());
		System.out.println("------------");
	}
}
public static void exit() {
	System.out.println("종료합니다.");
	System.exit(0);
}
}
