package com.student;

import java.util.*;
class Student{
	
	private String name;
	private int num;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	

	ArrayList<Student> arr = new ArrayList<Student>();
	
	public void register() {
		Student st = new Student();
		Scanner scan = new Scanner(System.in);
		String name;
		int num = 0;
		boolean bool = true;
		while( bool ) {
			System.out.println("학번 입력");
			num = scan.nextInt();
			int k=0;
			for(;k<arr.size();k++) {
				if(arr.get(k).getNum() == num) {
					System.out.println("동일한 학번이 존재합니다");
					break;
				}
			}
			if(k == arr.size())
				break;
		}
		System.out.println("이름 입력");
		name = scan.next();
		st.setName(name);
		st.setNum(num);
		
		arr.add(st);
		
	}
	
	public void find() {	
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 학생의 학번을 입력하세요");
		num = scan.nextInt();
		int i =0;
		for(;i<arr.size();i++) {
			if(arr.get(i).getNum()==num) {
				System.out.println("---------------------");
				System.out.println("이름 : "+arr.get(i).getName());
				System.out.println("학번 : "+arr.get(i).getNum());
				System.out.println("---------------------");				
			}
			if(i==arr.size()) {
				System.out.println("조건에 맞는 학생이 없습니다");	
				break;
			}
		}
	}
	
	public void delete() {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 학생의 학번을 입력하세요");
		num = scan.nextInt();
		int i =0;
		for(;i<arr.size();i++) {
			if(arr.get(i).getNum()==num) {
				System.out.println(arr.get(i).getName()+"의 정보를 삭제했습니다");
				arr.remove(i);
				break;
			}
			if(i==arr.size()) {
				System.out.println("조건에 맞는 학생이 없습니다");	
				break;
			}
		}
	}
	public void modify() {
		
		Scanner scan = new Scanner(System.in);
		boolean bool = true;
		while( bool ) {
			System.out.println("수정 학번 입력");
			num = scan.nextInt();
			int k=0;
			for( ;k<arr.size(); k++) {
				if(arr.get(k).getNum() == num) {
					System.out.println("---학생 정보---");
					System.out.println(arr.get(k).getNum());
					System.out.println(arr.get(k).getName());					
					System.out.println("-------------");
					System.out.println("수정할 이름 입력");
					String name = scan.next();
					
					Student st = arr.get(k);
					st.setName(name);
					arr.remove(k); arr.add(st);
					System.out.println("수정되었습니다");
					bool = false;
					break;
				}
			}
			if(k == arr.size())
				System.out.println("해당 학생은 존재하지 않습니다");
		}
	}
	public void print() {
		
		for(int i =0; i<arr.size();i++) {
			Student stp = arr.get(i);
			System.out.println("이름\t학번");
			System.out.println(stp.getName()+"\t"+stp.getNum());			
		}
		if(arr.isEmpty()) {
			System.out.println("아무도 등록 되어있지 않습니다");
		}
	}
	public void exit() {
		System.out.println("종료합니다");
		System.exit(0);
	}
}
public class BEH_Student {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		Student s = new Student();
		while(true) {
			int choice = 0;
			System.out.println("1.등록 2.검색 3.삭제 4.수정 5.전체출력 6.종료");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				s.register();
				break;
			case 2:
				s.find();
				break;
			case 3:
				s.delete();
				break;
			case 4:
				s.modify();
				break;
			case 5:
				s.print();
				break;
			case 6:
				s.exit();
				break;
			
			
			}
		}

	}

}
