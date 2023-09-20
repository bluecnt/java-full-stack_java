public class A03_VariableTypes {
	/*
		# 정수 타입
			- byte	(1 byte, 8 bit)
				2^8(256) 가지의 값을 표현할 수 있다
				256개 => -128 ~ -1 / 0 ~ 127
				※ byte num1 = (byte)128; // -128 -> overflow
			
			- short	(2 bytes, 16 bit)
				2^16 => 65,536
				범위 => -32,768 ~ +32,767
			
			- char	(2 bytes, 16 bit)
				2^16 => 65,536
				범위 => 0 ~ 65,535
			
			- int	(4 bytes, 32 bit)
				2^32 => 4,294,967,296
				범위 =>	-2,147,483,648 ~
						+2,147,483,657
			
			- long	(8 bytes, 64 bit)
				2^64 => 18,446,744,073,709,551,616
				범위 =>	-9,223,372,036,854,775,808 ~
						+9,223,372,036,854,775,807
		
		# 실수 타입
			- 부동소소점 방식을 이용한다
				?
			
			- float (4 bytes)
				?
				
			- double (8 bytes)
				?
		
		# 참/거짓 타입
			- boolean
		
		# 문자열
			- String
			
	 */
	public static void main(String[] args) {
		// 자바에서 미리 저장해놓은 각 타임의 최소/최대 값이 있다.
		// 타입이름.MIN_VALUE / MAX_VALUE
		byte byte_min = Byte.MIN_VALUE, byte_max = Byte.MAX_VALUE;
		short short_min = Short.MIN_VALUE, short_max = Short.MAX_VALUE;
		int int_min = Integer.MIN_VALUE, int_max = Integer.MAX_VALUE;
		long long_min = Long.MIN_VALUE, long_max = Long.MAX_VALUE;
		
		char ch_min = Character.MIN_VALUE, ch_max = Character.MAX_VALUE;
		// char 타입에 넣는 정수값은 우리에게 보여질 때, 무자로 바뀌어 보여주다.
		char ch1 = 0xAC00; // 44032
		int num1 = 44032;
		// 문자는 정수값을 가지고 있다
		char ch2 = 'A';
		char ch3 = '가';
		
		System.out.println("byte => " + byte_min + " ~ " + byte_max);
		System.out.println("short => " + short_min + " ~ " + short_max);
		System.out.println("int => " + int_min + " ~ " + int_max);
		System.out.println("long => " + long_min + " ~ " + long_max);

		System.out.println("char => " + (int)ch_min + " ~ " + (int)ch_max);
		System.out.println("ch1 => " + ch1 + "(" + (int)ch1 + ")");
		System.out.println("num1 => " + num1 + "(" + (int)num1 + ")");
		
		System.out.println(ch2);
		System.out.println(ch3);
		
		System.out.println("========================================");
		
		// float(4 bytes)에 저장할 때에는 값에 f suffix를 붙여준다
		float avg_score = 99.5f;
		// f suffix가 없으면 double(8 bytes) 타입
		double avg_weight = 85.9999;
		
		System.out.println("avg_score: " + avg_score);
		System.out.println("avg_weight: " + avg_weight);
		
		System.out.println("========================================");
		
		// boolean 타입은 변수의 이름이 아주 중요하다
		boolean isMale = true;
		System.out.println("isMale: " + isMale);
		
		System.out.println("========================================");
		
		// 문자열
		String welcomeMsg = "어서오세요. 환영합니다.";
		System.out.println("welcomeMsg: " + welcomeMsg);
	}
}

/*
byte => -128 ~ 127
short => -32768 ~ 32767
int => -2147483648 ~ 2147483647
long => -9223372036854775808 ~ 9223372036854775807
char => 0 ~ 65535
ch1 => 가(44032)
num1 => 44032(44032)
A
가
========================================
avg_score: 99.5
avg_weight: 85.9999
========================================
isMale: true
========================================
welcomeMsg: 어서오세요. 환영합니다.
*/