package com.student;

import java.util.Scanner;

public class KYH_Student {
public void start() {
	Scanner input = new Scanner (System.in);
	int num=0;
	while(true) {
	System.out.println("1.�л����");
	System.out.println("2.�л��˻�");
	System.out.println("3.�л�����");
	System.out.println("4.�л�����");
	System.out.println("5.����л����");
	System.out.println("6.����");
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
	
	System.out.println("�л����");
	System.out.println("�й��Է�:");
	System.out.println("��й�ȣ�Է�:");
	System.out.println("����Ϸ�");
}
public void find() {
	System.out.println("�л� �˻�");
	System.out.println("�������� �ʽ��ϴ�.");
	System.out.println("�л����");
}
public void delete() {
	System.out.println("�л��˻�");
	System.out.println("�������� �ʴ� �л�");
	System.out.println("�����մϴ�.");
	
}
public void modify() {
	System.out.println("�������� �ʽ��ϴ�");
	System.out.println("�����մϴ�.");
	
}
public void print() {
	System.out.println("����л� ���");
	
}
public void exit() {
	System.out.println("�����մϴ�.");
}
}
