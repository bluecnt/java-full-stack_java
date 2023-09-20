package quiz;

import java.util.Scanner;

public class B14_ShuffleText {

	/*
		사용자로부터 무자열을 입력받으면 해당 단어를 랜덤으로 섞어주는 프로그램을 만드시오
		ex) 1234	=> 1324
			바보멍청이	=> 이멍청보바
	*/
	public static void main(String[] args) {
		runMyCode();
		//runTutorCode();
	}
	
	
	//======================================================================

	static void runMyCode() {
		testMyCode("0123456789");
		testMyCode("대한민국");
		testMyCode("Microsoft Windows NT");
		//testMyCode("");
	}
	
	static int getRandomNumber(int min, int max) {
		return (int)((Math.random() * (max - min + 1)) + min);
	}
	
	/*
	static int isChInString(String str, char ch) {
		int i = 0;
		while (i < str.length()) {
			char ch2 = str.charAt(i);
			if (ch == ch2)
				return i;
			
			i++;
		}
		
		return -1;
	}
	*/
	
	static void testMyCode(String text) {
		if (text.isEmpty()) {
			Scanner sc = new Scanner(System.in);
			System.out.println("문자열을 입력하세요> ");
			text = sc.next();
		}

		/*
		int i = 0;
		int textLen = text.length();
		String newText = "";
		while (i < textLen) {
			int idx = getRandomNumber(0, textLen - 1);
			char ch = text.charAt(idx);
			
			if (isChInString(newText, ch) < 0) {
				newText += ch;
				
				i++;
			}
		}
		*/

		int i = 0;
		int textLen = text.length();
		String newText = "";
		int[] idxTable = new int[textLen];
		while (i < textLen) {
			int idx = getRandomNumber(0, textLen - 1);
			idxTable[i] = idx;
			
			int j = 0;
			boolean duplicated = false;
			while (j < i) {
				if (idxTable[j++] == idxTable[i]) {
					duplicated = true;
					
					break;
				}
			}
			
			if (!duplicated) {
				i++;
			}
		}
		
		for (i = 0; i < textLen; i++) {
			int idx = idxTable[i];
			char ch = text.charAt(idx);
			newText += ch;
		}

		System.out.println("----------------------------------------");
		System.out.printf("text:    '%s' \n", text);
		System.out.printf("newText: '%s' \n", newText);
	}
	
	//======================================================================

	static void runTutorCode() {
		//testTutorCode1();
		testTutorCode2();
	}
	
	static void testTutorCode1() {
		Scanner sc = new Scanner(System.in);
		
		String word = "Apple";
		
		if (word.isEmpty()) {
			System.out.print("입력 >> ");
			word = sc.next();
		} else {
			System.out.printf("입력 >> %s \n", word);
		}
		
		int len = word.length();
		int[] rndIdx = new int[word.length()];
		
		// 문자열의 길이가 10일 때, 0~9까지의 중복없는 랜덤 순서를 생성
		for (int i = 0; i < len; i++) {
			rndIdx[i] = (int)(Math.random() * len);
			
			for (int j = 0; j < i; j++) {
				if (rndIdx[i] == rndIdx[j]) {
					i--;
					
					break;
				}
			} // for (int j = 0;
		} // for (int i = 0;
		
		// 문자열 출력
		System.out.printf("출력 => ");
		for (int i = 0; i < len; i++) {
			int idx = rndIdx[i];
			char ch = word.charAt(idx);
			System.out.print(ch);
		}
		System.out.println();

	}
	
	static void testTutorCode2() {
		String word = "Orange";
		char[] chs = new char[word.length()];
		
		for (int i = 0; i < word.length(); i++) {
			chs[i] = word.charAt(i);
		}
		
		for (int i = 0; i < 100; i++) {
			int rnd = (int)(Math.random() * (chs.length - 1) + 1);
			
			// 맨 앞의 문자와 랜덤 위치의 문자를 교환
			char tmp = chs[0];
			chs[0] = chs[rnd];
			chs[rnd] = tmp;			
		}
		
		System.out.printf("입력: %s \n", word);
		System.out.printf("출력: %s \n", new String(chs));
	}
}

/*
// runMyCode()
----------------------------------------
text:    '0123456789' 
newText: '4189537602' 
----------------------------------------
text:    '대한민국' 
newText: '민국한대' 
----------------------------------------
text:    'Microsoft Windows NT' 
newText: 'rNMoisftsnoWdociw T ' 
*/

