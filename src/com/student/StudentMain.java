package com.student;
import java.util.*;
//import com.student.BEH_Student;
//import com.student.KJH_Student; //���� �ϽǶ� ���ΰ� �ּ������ؼ� ������ּ���
import com.student.KYH_Student;

public class StudentMain {

	public static void main(String[] args) {
		KYH_Student yh = new KYH_Student();
		Scanner scan = new Scanner(System.in);
		int go;
		System.out.println("1.������ 2.������ 3.������");
		go = scan.nextInt();
		switch(go) {
		case 1: 
			System.out.println("������");
			break;
		case 2: 
			System.out.println("������");
			break;
		case 3: 
			yh.start();					
			break;
		}

	}

}
