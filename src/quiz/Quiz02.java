package quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String home =null, office =null;
		int num;
		while(true) {
			System.out.println("1.�츮�� ���");
			System.out.println("2.ȸ�� ���");
			System.out.println("3.��� ����");
			num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("���ּ� �Է�");
				home = sc.next();
				break;
			case 2:
				System.out.println("ȸ�� �ּ� �Է�");
				office = sc.next();
				break;
			case 3:
				if(home != null && office != null) {
					System.out.println("�츮�� : " + home);
					System.out.println("ȸ�� : " + office);
				}else {
					System.out.println("��ϸ��� �ϼ���");
				}
				break;
			}
		}
		
}
}





