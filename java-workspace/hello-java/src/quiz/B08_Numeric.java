package quiz;

import java.util.Scanner;

public class B08_Numeric {
	/*
		사용자가 입력한 문자열이 모두 숫자로만 구성된 문자열인지 판단하시오
		ex) a1234 => 모두 숫자인 문자열이 아닙니다
			12345 => 모두 숫자인 문자열입니다
			
		방법1: 숫자의 개수를 센 후 무자열의 길이와 같으면 모두 숫자
		방법2: 하나씩 보면서 숫자가 아닌 것이 등장하면 모두 숫자가 아님
	*/
	public static void main(String[] args) {
		B08_Numeric.testNumeric("a1234");
		B08_Numeric.testNumeric("1234");
	}
	
	static void testNumeric(String text) {
		System.out.println("----------------------------------------");
		
		if (text.isEmpty()) {
			Scanner sc = new Scanner(System.in);
			System.out.println("입력> ");
			text = sc.next();
		}
		
		//int numCount = 0;
		boolean isAllNums = true;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
						
			// 숫자가 아닌 경우 continue
			//if (!(ch >= '0' && ch <= '9'))
			//	continue;
			
			//numCount++;
			
			if (!(ch >= '0' && ch <= '9')) {
				isAllNums = false;
				
				break;
			}
		}
		
		System.out.printf("입력: %s \n", text);
		//System.out.printf("결과: %s \n", text.length() == numCount ?
		//				"모두 숫자인 문자열입니다" : "모두 숫자인 문자열이 아닙니다");
		
		if (isAllNums) {
			System.out.println("모두 숫자인 문자열입니다");
		} else {
			System.out.println("모두 숫자인 문자열이 아닙니다");
		}
	}
}

/*
----------------------------------------
입력: a1234 
결과: 모두 숫자인 문자열이 아닙니다 
----------------------------------------
입력: 1234 
결과: 모두 숫자인 문자열입니다 
*/