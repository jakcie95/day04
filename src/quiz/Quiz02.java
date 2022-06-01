package quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String home =null, office =null;
		int num;
		while(true) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("집주소 입력");
				home = sc.next();
				break;
			case 2:
				System.out.println("회사 주소 입력");
				office = sc.next();
				break;
			case 3:
				if(home != null && office != null) {
					System.out.println("우리집 : " + home);
					System.out.println("회사 : " + office);
				}else {
					System.out.println("등록먼저 하세요");
				}
				break;
			}
		}
		
}
}





