package com.student;
/*�л����� ���α׷� ����� �ּ���
- 1.�л����
   - �����ϴ� �л��̸� �����ϴ� �л��Դϴ�.
   - ������ ���̵�(�Ǵ� �й�)�����ϸ� �����ϴ� ���̵�(�й�)�Դϴ�
   - ������ �Ϸ�Ǹ� '��ϵǾ����ϴ�'
- 2.�л��˻�
   - �����ϸ� �ش� �л� ���
   - �������� ������ '�������� �ʽ��ϴ�'
- 3.�л�����
   - �������� ������ '�������� �ʽ��ϴ�'
   - �����ϴ� �л��̸� �ش簪 ����
- 4.����
   - �������� ������ '�������� �ʽ��ϴ�'
   - �����Ѵٸ� �ش� �л��� ���̵�(�й�)�� ������ �������� ����
- 5.����л� ���
- 6.����
*/
import java.util.Scanner;

public class KJH_Student {
	Scanner input = new Scanner(System.in);
	int user=0;
	public void info() {
		while(true) {
			System.out.println("=========================");
			System.out.println("�л� ���� ���α׷�(ver.KJH)");
			System.out.println("=========================");
			System.out.println("1. �л� ���");
			System.out.println("2. �л� �˻�");
			System.out.println("3. �л� ����");
			System.out.println("4. �л� ����");
			System.out.println("5. ��� �л� ���");
			System.out.println("6. ����");
			System.out.print(">>>");
			user = input.nextInt();
			System.out.println("=========================");
			
			switch(user) {
			case 1: 
				register();
				break;
			case 2: 
				search();
				break;
			case 3: 
				delete();
				break;
			case 4: 
				modify();
				break;
			case 5: 
				printAll();
				break;
			case 6: 
				quit();
				break;
			}	
		}


	}
	public void register() {
		System.out.println("�л� ��� ���");
	}
	
	public void search() {
		System.out.println("�л� �˻� ���");
	}
	
	public void delete() {
		System.out.println("�л� ���� ���");
	}
	
	public void modify() {
		System.out.println("�л� ���� ���");
	}
	
	public void printAll() {
		System.out.println("��� �л� ��� ���");
	}
	
	public void quit() {
		System.out.println("���� ���");
	}
	
}
