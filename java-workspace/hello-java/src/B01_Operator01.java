
public class B01_Operator01 {
	/*
		# 연산자 (Operator)
			- 계산할 때 값 사이에 넣어서 쓰는 것
			- +, -, *, /, <, &, ...
			
		# 산술 연산자
			+ : 더하기
			- : 빼기
			* : 곱하기
			/ : 나누기
				※ 정수끼리 나무면 몫만 구하고
				  실수가 포함되어 있으면 정확한 결과를 구한다
				※ 정수끼리의 산술 연산 결과는 정수이고
				  정수와 실수의 산술 연산 결과는 실수다
			% : 나머지
	*/

	public static void main(String[] args) {
		int a = 10;
		int b = 7;
		double c = 7.0;
		
		// 문자열과 숫자를 더하면 결과는 문자열
		// (a + b) 형태로 해야 원하는 결과(정수값 더하기)가 나옴
		System.out.println("a + b: " + (a + b));
		System.out.println("a - b: " + (a - b));
		System.out.println("a * b: " + (a * b));
		System.out.println("a / b: " + (a / b));
		System.out.println("a % b: " + (a % b));
		
		// n으로 나눈 나머지 연산의 결과는 0 ~ (n-1) 이다.
		System.out.println(10 % 5);
		System.out.println(11 % 5);
		System.out.println(12 % 5);
		System.out.println(13 % 5);
		System.out.println(14 % 5);
		System.out.println(15 % 5);
		
		System.out.println("========================================");
		
		// char 타입은 중수를 문자로 보여주는 것처럼
		// double/float 타입은 정수를 .0을 붙여 보여준다
		
		// 정수와 실수의 연산 결과 확인
		System.out.println("a + c: " + (a + c));
		System.out.println("a - c: " + (a - c));
		System.out.println("a * c: " + (a * c));
		System.out.println("a / c: " + (a / c));
		System.out.println("a % c: " + (a % c));

		System.out.println("========================================");
		
		// Math.pow(a, b): a 제곱 b의 결과를 반환
		// 결과는 double 타입으로 나옴
		double result = Math.pow(2, 10);
		System.out.println("pow의 결과: " + result);
		
		// Math.sqrt(a) : a의 제곱근을 반환 => √(root)
		double result2 = Math.sqrt(25);
		System.out.println("sqrt의 결과: " + result2);
		
		// Math.abs(a) : a의 절댓값 반환
		// 파라미터 타입에 따라 리턴 타입이 결정됨
		// => Java에는 template 개념이 없나?
		int abs1 = Math.abs(-7);
		float abs2 = Math.abs(-1.23f);
		double abs3 = Math.abs(-2.34);
		System.out.println(abs1);
		System.out.println(abs2);
		System.out.println(abs3);
		
		// Math.round(a) : a를 소수 첫 째 자리에서 반올림
		// => 실수를 정수로 만듦
		double roundValue = 123.456;
		double roundResult = Math.round(roundValue);
		System.out.printf("[Math.round()] roundValue: %f, roundResult: %f \n",
				roundValue, roundResult);
		
		// Math.ceil(a) : a를 소수 첫 째 자리에서 강제 올림
		double ceilValue = 123.111;
		double ceilResult = Math.ceil(ceilValue);
		System.out.printf("[math.ceil()] ceilValue: %f, ceilResult: %f \n",
				ceilValue, ceilResult);
		
		// Math.floor(a) : a를 소수 첫 째 자리에서 강제 내림
		double floorValue = 123.111;
		double floorResult = Math.ceil(floorValue);
		System.out.printf("[Math.ceil()] floorValue: %f, floorResult: %f \n",
				floorValue, floorResult);
		
		/*
			# 원하는 자리에서 반올림 하는 방법
				1. 반올림하고 싶은 자리를 소수 첫 번째 자리로 만듦
				2. 반올림하고 다시 원래대로 돌림
		*/
		double value = 123.123456;
		double unit = Math.pow(10, 4);
		
		System.out.printf("[원하는 자리 반올림] value: %f, unit: %f \n", value, unit);
		System.out.println(value * unit);
		System.out.println(Math.round(value * unit));
		System.out.println(Math.round(value * unit) / unit);
		
		System.out.println("========================================");
		
		System.out.println("연습1 : 12500을 반올림하여 13000으로 만드시오");
		double dbl1Value= 12500;
		double dbl1Result = Math.round(dbl1Value / 1000) * 1000;
		int int1Result = (int)dbl1Result;
		System.out.printf(">> dbl1Value: %f, dbl1Result: %f, int1Result: %d \n",
				dbl1Value, dbl1Result, int1Result);

		System.out.println("연습2 : 1.138을 내림하여 1.13으로 만드시오");
		double dbl2Value = 1.138;
		double dbl2Result = Math.floor(dbl2Value * 100) / 100;
		System.out.printf(">> dbl2Value: %f, dbl2Result: %f \n",
				dbl2Value, dbl2Result);

	}
}

/*
a + b: 17
a - b: 3
a * b: 70
a / b: 1
a % b: 3
0
1
2
3
4
0
========================================
a + c: 17.0
a - c: 3.0
a * c: 70.0
a / c: 1.4285714285714286
a % c: 3.0
========================================
pow의 결과: 1024.0
sqrt의 결과: 5.0
7
1.23
2.34
[Math.round()] roundValue: 123.456000, roundResult: 123.000000 
[math.ceil()] ceilValue: 123.111000, ceilResult: 124.000000 
[Math.ceil()] floorValue: 123.111000, floorResult: 124.000000 
[원하는 자리 반올림] value: 123.123456, unit: 10000.000000 
1231234.56
1231235
123.1235
========================================
연습1 : 12500을 반올림하여 13000으로 만드시오
>> dbl1Value: 12500.000000, dbl1Result: 13000.000000, int1Result: 13000 
연습2 : 1.138을 내림하여 1.13으로 만드시오
>> dbl2Value: 1.138000, dbl2Result: 1.130000 
*/