public class A01_Escape {
	/*
	 * # Escape 문자 - \와 합쳐져서 특수한 기능을 하는 문자 - 그냥 사용하기에는 문제가 생기는 문자들을 표현하기 위한 방식 =>
	 * 하나의 문자로 인식
	 */
	public static void main(String[] args) {
		// \n : 줄넘김 문자
		System.out.println("안녕하세요, 반갑습니다.");
		System.out.println("안녕하세요,\n반갑습니다.");

		// \t : Tab 문자
		System.out.println("나이\t: " + 24);
		System.out.println("평균점수\t: " + 98.5);

		// \\ : \를 자체
		System.out.println("c:\\Program Files\\java\\jdk");

		// \" : " 출력
		System.out.println("오늘 저녁은 \"피자\"를 먹을거임");

		// \' : ' 출력. 일반적으로 "에서는 ' 사용 가는
		System.out.println("오늘 저녁은 '라면'을 먹을거임");

		// 문자 타입으로 작은 따옴표 하나 사용
		System.out.println('\'');
	}
}

/*
	안녕하세요, 반갑습니다.
	안녕하세요,
	반갑습니다.
	나이	: 24
	평균점수	: 98.5
	c:\Program Files\java\jdk
	오늘 저녁은 "피자"를 먹을거임
	오늘 저녁은 '라면'을 먹을거임
	'
*/