package com.student;
import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		KJH_Student ks = new KJH_Student();
		Scanner scan = new Scanner(System.in);
		int go;
		System.out.println("1.������ 2.������ 3.������");
		go = scan.nextInt();
		switch(go) {
		case 1: 
			System.out.println("������");
			break;
		case 2: 
			ks.info();
			break;
		case 3: 
			System.out.println("������");					
			break;
		}

	}

}
