package com.student;
import java.util.*;
//import day17.BEH_Student;
//import day17.KJH_Student; //Á÷Á¢ ÇÏ½Ç¶© º»ÀÎ°Å ÁÖ¼®ÇØÁ¦ÇØ¼­ »ç¿ëÇØÁÖ¼¼¿ä
//import day17.KYH_Student;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int go;
		System.out.println("1.¹æÀºÇõ 2.±İÁöÇı 3.±èÀ±Çö");
		go = scan.nextInt();
		switch(go) {
		case 1: 
			System.out.println("¹æÀºÇõ");
			break;
		case 2: 
			System.out.println("±İÁöÇı");
			break;
		case 3: 
			System.out.println("±èÀ±Çö");					
			break;
		}

	}

}
