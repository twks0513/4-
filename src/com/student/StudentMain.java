package com.student;
import java.util.*;


import com.student.BEH_Student;
//import com.student.KJH_Student; //직접 하실땐 본인거 주석해제해서 사용해주세요
//import com.student.KYH_Student;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int go;
		System.out.println("1.방은혁 2.금지혜 3.김윤현");
		go = scan.nextInt();
		switch(go) {
		case 1: 
			System.out.println("방은혁");
			BEH_Student beh = new BEH_Student();
			beh.main(args);
			break;
		case 2: 
			System.out.println("금지혜");
			break;
		case 3: 
			System.out.println("김윤현");					
			break;
		}

	}

}
