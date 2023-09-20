package quiz;

import java.util.Scanner;

public class B07_Palindrome {
	/*
		Palindrome: 회문
		사용자가 단어를 입력하면 해당 단어가 좌우대칭인 판별해주는
		프로그램을 작성하시오
		ex) LEVEL -> 좌우대칭입니다
			FATHER -> 좌우대칭이 아닙니다
			
		※ 어려움 (안 해도 됨)
		ex) Eye -> 대소문자가 다르지만 좌우대칭 입니다
		
		=> 방법
			1. 맨 앞부터 글자를 하나씩 비교하다 (절반)
			2. 단어를 뒤집고 비교해서 똑같으면 좌우대칭			
				...
				String reversed = "";
				for (int i = 0; i < word.length(); i++)
					revered += word.charAt(word.length() - 1 - i);
				isPalindrom = word.equals(reserved);
				...
	*/
	public static void main(String[] args) {
		B07_Palindrome.testPalindrome("LEVEL");
		B07_Palindrome.testPalindrome("FATHER");
		B07_Palindrome.testPalindrome("Eye");
		B07_Palindrome.testPalindrome("noon");
	}
	
	static void testPalindrome(String word) {
		if (word.isEmpty()) {
			Scanner sc = new Scanner(System.in);
			System.out.println("단어를 입력하세요> ");
			word = sc.next();
			
			// [SGLEE:20230912TUE_095700]
			// 여기에서 close()를 호출하면 입력 스트림이 닫혀지고 다시 사용할 수 없게 된다.
			// 프로그램이 완전히 종료되기 직전에 close()를 호출해야한다.
			//sc.close();
		}
		
		int wordLen = word.length();
		int centerPos = wordLen / 2;
		String wordUpCase = word.toUpperCase();
		//System.out.printf("wordLen: %d, centerPos: %d, wordUpCase: '%s' \n",
		//	wordLen, centerPos, wordUpCase);
		
		boolean isPalindrome = true;
		boolean isDiffCase = false;
		for (int i = 0; i < centerPos; i++) {
			char leftCh = word.charAt(i);
			char rightCh = word.charAt(wordLen - 1 - i);
			char leftChUpCase = wordUpCase.charAt(i);
			char rightChUpCase = wordUpCase.charAt(wordLen - 1 - i);
					
			//System.out.printf("leftCh: %c, rightCh: %c, leftChUpCase: %c, rightChUpCase: %c \n",
			//		leftCh, rightCh, leftChUpCase, rightChUpCase);
			
			//
			// &= 을 이용해 false가 한 번만 발생해도 false가 되도록 만들 수 있다
			// isPalindrome &= leftCh == rightCh;
			//
			
			if (leftCh != rightCh) {
				isPalindrome = false;
				
				if (leftChUpCase == rightChUpCase) {
					isPalindrome = true;
					isDiffCase = true;
					
					continue;
				}
				
				break;
			}				
		}
		
		//System.out.printf("isPalindrome: %s, isDiffCase: %s \n",
		//		isPalindrome, isDiffCase);
		
		System.out.printf("'%s'은(는)%s %s. \n", word,
				isDiffCase ? " 대/소문자가 다르지만" : "",
				isPalindrome ? "좌우대칭 입니다" : "좌우대칭이 아닙니다");
	}
}

/*
'LEVEL'은(는) 좌우대칭 입니다. 
'FATHER'은(는) 좌우대칭이 아닙니다. 
'Eye'은(는) 대/소문자가 다르지만 좌우대칭 입니다. 
'noon'은(는) 좌우대칭 입니다. 
*/