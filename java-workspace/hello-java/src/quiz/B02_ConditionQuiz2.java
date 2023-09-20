package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz2 {

	/*
		# 알맞은 조건식을 만들어보세요.
		1. char형 변수 a가 'q' 또는 'Q' 일 때 true
		2. char형 변수 b가 공백이나 탭이 아닐 때 true
		3. char형 변수 c가 '0' ~ '9' 일 때 true
		4. char형 변수 d가 영문자(대문자 또는 소문자) 일 때 true
		5. char형 변수 e가 한글일 때 true (한글의 범위는 유니코드 참조)
		6. 사용자가 입력한 문자열이 quit일 때 true
	*/
	public static void main(String[] args) {
		char a = 'q';
		char b = '\n';
		char c = '0';
		char d = 'A';
		char e = 'ㄱ';
		String s = "";
		
		Scanner sc = new Scanner(System.in);
		
		final boolean a1 = a == 'q' || a == 'Q';
		final boolean a2 = !(b == ' ' || b == '\t');
		final boolean a3 = c >= '0' && c <= '9';
		final boolean a4 = (d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z');
		// 한글 인코딩의 이해(유니코드) 완전 기초!
		// https://jinios.github.io/study/2018/06/23/unicode_background_korean/
		final boolean a5 = 
				// 한글 자모
				(e >= 0x1100 && e <= 0x11FF) ||
				// 호환용 한글 자모
				(e >= 0x3130 && e <= 0x318F) ||
				// 한글 자모 확장 A
				(e >= 0xA960 && e <= 0xA97F) ||
				// 한글 소리 마디
				(e >= 0xAC00 && e <= 0xD7AF) ||
				// 하글 자모 확장 B
				(e >= 0xD7B0 && e <= 0xD7FF);
		System.out.println("quit?");
		final boolean a6 = sc.next().equals("quit");

		System.out.println("a1 => " + a1);
		System.out.println("a2 => " + a2);
		System.out.println("a3 => " + a3);
		System.out.println("a4 => " + a4);
		System.out.println("a5 => " + a5);
		System.out.println("a6 => " + a6);
	}
}

/*
quit?
quit
a1 => true
a2 => true
a3 => true
a4 => true
a5 => true
a6 => true
*/