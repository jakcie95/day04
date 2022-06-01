package day04;

import java.io.IOException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int select;
		System.out.println("수 입력 ");
		select = sc.nextInt();
		switch(select) {
		case 1:System.out.println("1입력");break;
		case 2:System.out.println("2입력");break;
		case 3:System.out.println("3입력");break;
		default:System.out.println("그 외의 값 입력");
		}
		char ch;
		System.out.println("문자 입력");
		ch = (char)System.in.read();// 문자하나를 입력받는 메소드 (throws IOException으로 예외처리 필요)
		switch(ch) {
		case 'a' : System.out.println("a입력");break;
		case 'A' : System.out.println("A입력");//다음에 실행된 문장이 없을땐 break 생략 가능
		}
		
		String s;
		System.out.println("문자열 입력");
		s = sc.next();
		switch(s) {
		case "안녕" : System.out.println("안녕 입력");break;
		case "그래" : System.out.println("그래 입력");break;
		}
		
	
		System.out.println("다음 문장들 실행");
}
}
