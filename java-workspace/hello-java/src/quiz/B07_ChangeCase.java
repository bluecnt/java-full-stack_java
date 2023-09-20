package quiz;

import java.util.Scanner;

public class B07_ChangeCase {
	/*
		사용자가 문장을 입력하면 대문자는 소문자로, 소문자는 대문자로 변경하여 출력하시오
		(영어가 아닌 문자는 그대로 출력)
	*/
	public static void main(String[] args) {
		B07_ChangeCase.testChangeCase("Microsoft Windows 11");
		B07_ChangeCase.testChangeCase("마이크로소프트 Windows 11");
		//B07_ChangeCase.testChangeCase("");
	}	
	
	static void testChangeCase(String text) {
		// 'a'(97, 0x61) - 'A'(65, 0x41) = ' '(32, 0x20)
		// 소문자: lower case, 대문자: upper case
		final int CHAR_DIST = 'a' - 'A';
		
		System.out.println("----------------------------------------");

		if (text.isEmpty()) {
			Scanner sc = new Scanner(System.in);
			System.out.println("문장을 입력하시오> ");
			text = sc.nextLine();
		}
		
		String resultText = "";
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			
			// 대문자(A, 65) -> 소문자(a, 97)
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char)(ch + CHAR_DIST);
			}
			// 소문자(a, 97) -> 대문자(A, 65)
			else if (ch >= 'a' && ch <= 'z') {
				ch = (char)(ch - CHAR_DIST);
			}
			
			resultText += ch;
		}
		
		System.out.println("원문: " + text);
		System.out.println("결과: " + resultText);
	}
}

/*
----------------------------------------
원문: Microsoft Windows 11
결과: mICROSOFT wINDOWS 11
----------------------------------------
원문: 마이크로소프트 Windows 11
결과: 마이크로소프트 wINDOWS 11
*/
