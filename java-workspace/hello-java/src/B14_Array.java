
public class B14_Array {
	/*
		# 배열 (Array)
		  - 같은 타입 변수를 여러 개 선언할 때 사용하는 문법
		  - 배열을 선언할 때 선언과 동시에 배열의 크기를 정해야 한다
		  - 배열은 만들어지고 난 후에는 크기 변경이 불가능하다
		  - 배열은 각 변수를 방? 번호(index)를 통해 구분한다
		  - 배열의 인덱스는 <0번부터 개수-1번>까지 있다
		  - 배령은 변수와는 다르게 각 방?의 모든 값이 초기화 되어있다
		    (정수: 0, 실수: 0.0, boolean: false, 참조형: null)
		  
	  	# 배열 선언 방식
	  	  1. 타입[] 변수명 = new 타입[크기];
	  	  2. 타입[] 변수명 = { 값1, 값2, ... };
	  	  3. 타입[] 변수명 = new 타입[] { 값1, 값2, ... };
	*/
	public static void main(String[] args) {
		// int 형 변수 1,000개 선언 (int 형 배열 선언)
		int[] numbers = new int[1000];
		
		// int 형 변수 1,000개 중 몇 번째 변수를 사용할 것인지 선택
		numbers[0] = 10;
		numbers[399] = 8500;
		numbers[999] = -999;
		
		// 배열 방 번호의 범위를 벗어나는 실수는 컴파일러에서 감지하지 못한다
		// (빨간줄이 안 나온다, 실행 시, ArrayIndexOutOfBoundsException 발생)
		//  => java.lang.ArrayIndexOutOfBoundsException
		//numbers[1333] = 777;
		
		// 배열에 저장되어 있는 값을 꺼내 사용하기
		System.out.println("[999] => " + numbers[999]);
		System.out.println("[0] + [399] => " + numbers[0] + numbers[399]);
		System.out.println("[30] => " + numbers[30]);
		
		System.out.println("========================================");
		
		// 초기화되지 않은 변수는 사용할 수 없다!!
		//double avg;
		//System.out.println(avg);

		// 대문자로 시작하는 타입들은 null로 초기화 되어있다
		String[] schools = new String[13];
		String[] names = { "김철수", "이철수", "박철수" };
		// char[]은 하나의 문자열이라고 간주할 수 있다
		char msg[] = { 'h', 'e', 'l', 'l', 'o' };
		
		double[] weights = new double[30];
		float[] heights = { 123.123f, 99.9f, 80.22f, 33.33f };
		boolean[] passExam = new boolean[] { true, false, true };
		
		System.out.println("[15] => " + weights[15]);

		System.out.println("========================================");
		
		// 반복문으로 배열의 모든 내용을 쉽게 사용할 수 있다
		// 배열.length : 해당 배열의 길이를 알 수 있다. ()를 붙이면 안 된다
		// "".length() : 문자열의 길이를 알 때는 괄호를 붙였였다.
		//   (String 클래스의 length() 메소드)
		String[] fruits = { "apple", "바나나", "oragne", "키위", "수박" };
		
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
	}
}

/*
[999] => -999
[0] + [399] => 108500
[30] => 0
========================================
[15] => 0.0
========================================
apple
바나나
oragne
키위
수박
*/