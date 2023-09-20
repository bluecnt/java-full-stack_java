package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz {
	/*
		# 알맞은 비교 연산을 만들어 보세요
			1. int형 변수 a가 10보다 크고 20보다 작을 때 true
			2. int형 변수 b가 짝수일 때 true
			3. int형 변수 c가 7의 배수 일 때 true
			4. int형 변수 d와 e의 차이가 30일 때 true
			5. int형 변수 year가 400으로 나누어 떨어지거나
			   또는 4로 나누어 떨어지고 100으로 나누어 떨어지지 않을 때 true
			6. boolean형 변수 powerOn이 false일 때 true
			7. 문자열 참조 변수 str이 "yes"일때 true
	*/
	public static void main(String[] args) {
		int a = 15;
		int b = 2;
		int c = 21;
		int d = 10;
		int e = d + 30;
		int year = 2023;
		boolean powerOn = false;
		String str = "yes";

		//
		Scanner sc = new Scanner(System.in);
		System.out.print("yes or no?");
		str = sc.next();
		//
		
		final boolean a1 = a > 10 && a < 20;
		final boolean a2 = b % 2 == 0;
		final boolean a3 = c % 7 == 0;
		final boolean a4 = Math.abs(d - e) == 30;
		final boolean a5 = (year % 400 == 0) ||
				((year % 4 == 0) && !(year % 100 == 0));
		final boolean a6 = !powerOn;
		// == => 연산자는 주소값 비교
		// final boolean a7 = str == "yes";
		// String.equals() => 값 비교
		// ※ 모든 참조형 변수는 Object.equals() 메소드를 사용해야함
		final boolean a7 = str.equals("yes");
		
		System.out.printf("a1 => %s \n", a1);
		System.out.printf("a2 => %s \n", a2);
		System.out.printf("a3 => %s \n", a3);
		System.out.printf("a4 => %s \n", a4);
		System.out.printf("a5 => %s \n", a5);
		System.out.printf("a6 => %s \n", a6);
		System.out.printf("a7 => %s \n", a7);
	}
}

/*
yes or no?yes
a1 => true 
a2 => true 
a3 => true 
a4 => true 
a5 => false 
a6 => true 
a7 => true 
*/