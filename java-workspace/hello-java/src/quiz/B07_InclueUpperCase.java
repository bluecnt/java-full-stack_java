package quiz;

import java.util.Scanner;

public class B07_InclueUpperCase {
	/*
		사용자가 입력한 단어에 대문자 포함여부를 체크하는 프로그램을 작성하시오
	*/
	public static void main(String[] args) {
		B07_InclueUpperCase.testIncludeUpperCase("Microsoft Surface");
		B07_InclueUpperCase.testIncludeUpperCase("구글 pixel phone");
		B07_InclueUpperCase.testIncludeUpperCase("애플 i-phone");
	}
	
	static void testIncludeUpperCase(String word) {
		System.out.println("----------------------------------------");
		
		if (word.isEmpty()) {
			Scanner sc = new Scanner(System.in);
			System.out.println("단어를 입력하세요> ");
			word = sc.next();
		}
		
		boolean hasUpperCase = false;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				hasUpperCase = true;
				
				break;
			}
		}
		
		System.out.printf("단어\t\t: '%s' \n", word);
		System.out.printf("대문자 포함 여부\t: %s \n", hasUpperCase);
	}
}

/*
----------------------------------------
단어		: 'Microsoft Surface' 
대문자 포함 여부	: true 
----------------------------------------
단어		: '구글 pixel phone' 
대문자 포함 여부	: false 
----------------------------------------
단어		: '애플 i-phone' 
대문자 포함 여부	: false 
*/