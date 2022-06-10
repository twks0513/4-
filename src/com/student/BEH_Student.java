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
				break;
			}
//			else {
//				System.out.println("조건에 맞는 학생이 없습니다");				
//			}
			if(i==arr.size()) {
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
			}else {			
				System.out.println("조건에 맞는 학생이 없습니다");	
				break;
			}
			if(i==arr.size()) {
				break;
			}
		}
	}
	public void modify() {
		Student st = new Student();
		Scanner scan = new Scanner(System.in);
		System.out.println("정보를 수정할 학생의 학번을 입력하세요");
		num = scan.nextInt();
		int tempNum;
		String tempName;
		int i =0;
		for(;i<arr.size();i++) {
			if(arr.get(i).getNum()==num) {
				tempNum=arr.get(i).getNum();
				tempName = arr.get(i).getName();
				
				System.out.println("학번 수정 : ");
				num = scan.nextInt();
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
						}else {
							System.out.println("조건에 맞는 학생이 없습니다");
							break;
						}
					}
					
					if(k == arr.size()) {						
						break;
					}
				}
				System.out.print("이름 수정 : ");
				name = scan.next();
				st.setName(name);
				st.setNum(num);
				
				arr.add(st);
				System.out.println("수정이 완료되었습니다");
				System.out.println("수정 전\t수정 후");
				for(;i<arr.size();i++) {
					if(arr.get(i).getNum()==num) {
						System.out.println("이름 : "+tempName+"\t이름 : "+arr.get(i).getName());
						System.out.println("학번 : "+tempNum+"\t학번 : "+arr.get(i).getNum());
					}
				}
			}
		}
	}
	public void print() {				
		for(int i =0; i<arr.size();i++) {
			Student stp = arr.get(i);
			System.out.println(stp.getName()+" : "+stp.getNum());
			
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
