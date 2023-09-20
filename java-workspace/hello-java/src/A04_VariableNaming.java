
public class A04_VariableNaming {
	/*
		# 우리가 변수를 사용하는 이유		
		1. 코드의 가독성을 높일 수 있다
		2. 여러 곳에서 사용되는 값을 한 번에 변경할 수 있다 (재사용, reuse)
			=> 하나의 값을 여러 곳에서 사용할 수 있다
		
		# 변수의 작명 규칙 (권장 - 지키지 않아도 에러가 발생하지는 않음)
		1. 두 단어 이상을 이어붙인 변수명을 사용할 때 _를 사용해 붙인다 (snake_case, C 스타일?)
			ex) apple_price, his_age, his_grade, ...
		2. 두 단어 이상을 이어붙일 때, 대문자를 사용한다 (camelCase, Java 스타일?)
			ex) applePrice, hisAge, hisGrade, ...
		3. 변수명의 첫 번째 글자는 소문자를 사용하는 것이 좋다
			ex) apple(O), Apple(X)
		4. 클래스명의 첫 번째 클자는 대문자를 사용한다
			ex) PersonInfo(O), personInfo(X)
		5. 패키지명은 모두 소무자를 사용한다
			ex) quiz(O), Quiz(X)
		6. 프로그램에서 항상 변하지 않고 동일해야하는 값은 모두 대문자를 사용한다 (상수)
			ex) MAX_COUPON_SLOT
		7. 변수안에 들어있는 값을 쉽게 파악할 수 있는 단어를 사용하자
			ex) a1, a2, a3 (X)
		
		# 변수의 작명 규칙 (필수 - 지키지 않으면 에러 발생)
		1. 변수의 첫 번째 글자는 숫자를 사용할 수 없다
			ex) 1st, 2nd, 3rd (X)
		2. 변수명 사이에는 공백을 사용할 수 없다.
		3. 특수 문자는 _와 $만 사용할 수 있다.
			ex) $upsermarket, __apple
		4. 자바에서 이미 사용하고 있는 키워드들은 사용할 수 없다
			=> Eclipse에서는 보라색으로 보이는 단어들 => 예약어
			ex) public, static, void, int, long, double, ...
		5. ? 
	*/
	
	public static void main(String[] args) {
		int applePrice = 837;
		int appleQty = 55;
		double appleWeight = 195.37;
		
		System.out.println("사과의 개당 가경: " + applePrice);
		System.out.println("사과의 개수: " + appleQty);
		System.out.println("사과의 총 가격: " + applePrice * appleQty);
		System.out.println("사과의 총 무게: " + appleWeight * appleQty);
		System.out.println("1g당 가격: " + applePrice / appleWeight);
	}
}

/*
사과의 개당 가경: 837
사과의 개수: 55
사과의 총 가격: 46035
사과의 총 무게: 10745.35
1g당 가격: 4.284178737779597
*/