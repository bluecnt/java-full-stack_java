

public class B07_CharAt {
	/*
		# "문자열".charAt(index)
		  - 해당 문자열에서 원하는 위치의 문자를 char 타입으로 가져옴
		  - 시작하는 위치는 0이다
		  - 마지막 인덱스는 해당 문자열의 "문자 개수 - 1"이다
		  
	   	# "문자열".length()
	   	  - 해당 문자열의 길이를 얻는다
	*/
	public static void main(String[] args) {
		String s = "안녕하세요";
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
		
		String s2 = "마지막 인덱스는 해당 문자열의 '문자 개수 - 1'이다";
		System.out.println("마지막 글자: " + s2.charAt(s2.length() - 1));
		
		// for문을 사용하면 문자열을 쉽게 탐색할 수 있다
		String t = "다람쥐 헌 쳇바퀴에 타고파";
		
		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			System.out.printf("%d번째 문자: %c \n", i, c);
		}
		
		System.out.println("----------------------------------------");
		
		// 연습: 문자열 str을 거꾸로 출력하시오
		
		System.out.printf("원문: %s \n", t);
		System.out.printf("반전: ");
		for (int i = t.length() - 1; i >= 0; i--) {
			char ch = t.charAt(i);
			System.out.printf("%c", ch);
		}
		System.out.println();
	}
}

/*
녕
하
세
요
마지막 글자: 다
0번째 문자: 다 
1번째 문자: 람 
2번째 문자: 쥐 
3번째 문자:   
4번째 문자: 헌 
5번째 문자:   
6번째 문자: 쳇 
7번째 문자: 바 
8번째 문자: 퀴 
9번째 문자: 에 
10번째 문자:   
11번째 문자: 타 
12번째 문자: 고 
13번째 문자: 파 
----------------------------------------
원문: 다람쥐 헌 쳇바퀴에 타고파 
반전: 파고타 에퀴바쳇 헌 쥐람다
*/

