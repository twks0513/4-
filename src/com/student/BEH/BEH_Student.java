package com.student.BEH;

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
	
}

class StF{
	public void register() {
		System.out.println("");
	}
	
	public void find() {
		
	}
	
	public void delete() {
		
	}
	public void modify() {
		
	}
	public void print() {
		
	}
	public void exit() {
		
	}
}
public class BEH_Student {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> arr = new ArrayList<Student>();
		
		while(true) {
			int choice = 0;
			System.out.println("1.등록 2.검색 3.삭제 4.수정 5.전체출력 6.종료");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			
			
			}
		}

	}

}
