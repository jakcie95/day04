package day04;

import java.io.IOException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int select;
		System.out.println("�� �Է� ");
		select = sc.nextInt();
		switch(select) {
		case 1:System.out.println("1�Է�");break;
		case 2:System.out.println("2�Է�");break;
		case 3:System.out.println("3�Է�");break;
		default:System.out.println("�� ���� �� �Է�");
		}
		char ch;
		System.out.println("���� �Է�");
		ch = (char)System.in.read();// �����ϳ��� �Է¹޴� �޼ҵ� (throws IOException���� ����ó�� �ʿ�)
		switch(ch) {
		case 'a' : System.out.println("a�Է�");break;
		case 'A' : System.out.println("A�Է�");//������ ����� ������ ������ break ���� ����
		}
		
		String s;
		System.out.println("���ڿ� �Է�");
		s = sc.next();
		switch(s) {
		case "�ȳ�" : System.out.println("�ȳ� �Է�");break;
		case "�׷�" : System.out.println("�׷� �Է�");break;
		}
		
	
		System.out.println("���� ����� ����");
}
}
