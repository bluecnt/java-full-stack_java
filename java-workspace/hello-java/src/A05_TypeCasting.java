
public class A05_TypeCasting {
	/*
		# 타입 캐스팅
			- 타입 캐스팅에는 명시하지 않아도 자동으로 캐스팅되는 /자동 타입 캐스팅/과
			  데이터의 타입을 강제로 변환하는 /강제 타입 캐스팅/이 있다
			- 데이터 또는 변수 앞에 (타입)을 적으면 타입이 강제로 변한다
			
		# 자동 타입 캐스팅
			- 작은 타입에서 큰 타입으로 변하는 등 타입이 변했을 경우
			  특별히 문제가 발생하지 않는 경우 별다른 문제없이 타입이 자동으로 변하는 것
			  
	  	# 강제 타입 캐스팅
	  		- 큰 타입의 값을 작은 타입에 억지로 넣어야 하는 경우
	  		- 그 외 타입이 변했을 때 특정 기능이 손실될 수 있는 경우
	  		- 값이 손상될 우려가 있어서 프로그래머에게 에러로 알려줘야 하는 경우
		  
	  	# 타입의 크기 순서
		  	- byte(1) < short(2), char(2) < int(4) < long(8) <
		  	  float(4) < double(8)
		  	  ※ long(8) to float(4) => OK
		  	  ※ float(4) to long(8) => Warning!
		  	- 작은 타입의 값을 큰 타입 변수에 넣을 때는 아무런 문제도 발생하지 않는다
		  	- 큰 타입의 값을 작은 타입 변수에 넣을 때는 위험하다면서 에러가 발생한다
	*/

	public static void main(String[] args) {
		// 작은 타입 값을 큰 타입에 넣기 (정상 작동)
		// 자동으로 byte 타입 값을 int 타입으로 변환하여 넣어줌 (자동 타입 캐스팅)
		byte b = 127;
		int i = b;
		
		// 큰 타입 값을 작은 타입에 넣기
		// int 타입 정수 값을 강제로 byte 타입으로 변환하여 넣음 (강제 타입 캐스팅)
		/*
		    i2 => 130
			       0 1 2 3 4 5 6 7  8 9 A B C D E F
			byte +--------------------------------
			0x00 | 0 0 0 0 0 0 0 0  0 0 0 0 0 0 0 0
			0x02 | 0 0 0 0 0 0 0 0  1 0 0 0 0 0 1 0
			...

			b2 => -126
			       0 1 2 3 4 5 6 7  8 9 A B C D E F
			byte +--------------------------------
			0x00 | 1 0 0 0 0 0 1 0
			...    | 
			       +-> sign 0 : 나머지 값을 양수
			                1 : 나머지 값을 2의 보수 (비트 반전 후 +1)
		*/
		int i2 = 130;
		byte b2 = (byte)i2;		
		System.out.println("강제로 캐스팅된 i2의 결과: " + b2);
		
		System.out.println("========================================");
		
		// long은 8바이트이고 float은 4바이트이지만 소수를 더 큰 것으로 간주한다
		long l1 = 10000000000L; // 100억
		int i3 = (int)l1;
		float f3 = (float)l1;
		
		System.out.println("l1: " + l1 + ", i3: " + i3 + "f3: " + f3);
		
		System.out.println("========================================");
		
		// short, char 모두 2 bytes이지만
		// short에는 음수값이 존재할 위험이 있으므로 확인(강제 타입 캐스팅)이 필요하다
		short s1 = 70;
		char ch1 = (char)s1;
		System.out.println(ch1);
		
		// char에서 short로 갈 때도 32,767를 초과하는 값이 포함될 수 있으므로
		// 강제 타입 캐스팅이 필요하다
		char ch2 = 'F';
		short s2 = (short)ch2;

		System.out.println("========================================");

		// 해당 코드 값의 문자 형태를 보고 싶은 경우 타입 캐스팅을 사용해 간편하게 확인 가능
		int value = 44032;
		
		System.out.println(value);
		System.out.println((char)value);		
	}
}


/*
강제로 캐스팅된 i2의 결과: -126
========================================
l1: 10000000000, i3: 1410065408f3: 1.0E10
========================================
F
========================================
44032
가
*/