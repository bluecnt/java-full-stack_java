
public class B02_Operator02 {
	/*
		# 비교 여산자
			- 두 값을 비교하는 연산
			- 비교 연산의 결과는 항상 true or false
			
		# 논리 연산
			- 두 boolean 값으로 연산하는 연산자
			- && : 두 값이 모두 true 일 때			=> AND
			- || : 두 값 중 하나라도 true 일 때			=> OR
				 : vertical bar
			- !	 : true -> false, false -> true	=> NOT
				
	*/
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		System.out.printf("a(%d) > b(%d) => %s \n", a, b, a > b);
		System.out.printf("a(%d) < b(%d) => %s \n", a, b, a < b);
		System.out.printf("a(%d) >= b(%d) => %s \n", a, b, a >= b);
		System.out.printf("a(%d) <= b(%d) => %s \n", a, b, a <= b);
		System.out.printf("a(%d) == b(%d) => %s \n", a, b, a == b);
		System.out.printf("a(%d) != b(%d) => %s \n", a, b, a != b);
		
		System.out.println("========================================");
		
		// 비교 연산자는 우선 순위가 낮다
		// "a + 5"와 "b * 10"이 먼저 연산되고 비교 연산자 ">"를 수행함
		System.out.printf("a(%d) + 5 > b(%d) * 10 => %s \n",
				a, b, a + 5 > b * 10);
		
		// a를 2로 누나었을 때 나머지가 0이면 true
		System.out.printf("a(%d) %% 2 == 0 => %s \n", a, a % 2 == 0);
		
		// a가 5의 배수가 아닐 대, true
		System.out.printf("a(%d) %% 5 != 0 => %s \n", a, a % 5 != 0);

	
		System.out.println("========================================");
		
		// 논리 연산자는 비교 연산자보다 우선 순위가 낮기 때문에
		// () 없이도 비교 연산을 비교 연산을 먼저 수행한다
		
		System.out.println("#### AND ####");
		System.out.printf("true  && true  => %s \n", true && true);
		System.out.printf("true  && false => %s \n", true && false);
		System.out.printf("false && true  => %s \n", false && true);
		System.out.printf("false && false => %s \n", false && false);
		
		System.out.printf("a(%d) %% 3 == 0 && a(%d) < 100 && a > - 100 \n",
				a, a, a, a % 3 == 0 && a < 100 && a > -100);	
		
		System.out.println("#### OR ####");
		System.out.printf("true  || true  => %s \n", true || true);
		System.out.printf("true  || false => %s \n", true || false);
		System.out.printf("false || true  => %s \n", false || true);
		System.out.printf("false || false => %s \n", false || false);

		System.out.printf("a(%d) %% 3 == 0 || a(%d) < 100 => %s \n",
				a, a, a % 3 == 0 || a < 100);	

		System.out.println("#### NOT ####");
		System.out.printf("!true  => %s \n", !true);
		System.out.printf("!false => %s \n", !false);
		
		// a가 3보다 크지 않을 때 true
		System.out.printf("!(a<%d> > 3) => %s ", a, !(a > 3));
		
	}
}

/*
a(10) > b(3) => true 
a(10) < b(3) => false 
a(10) >= b(3) => true 
a(10) <= b(3) => false 
a(10) == b(3) => false 
a(10) != b(3) => true 
========================================
a(10) + 5 > b(3) * 10 => false 
a(10) % 2 == 0 => true 
a(10) % 5 != 0 => false 
========================================
#### AND ####
true  && true  => true 
true  && false => false 
false && true  => false 
false && false => false 
a(10) % 3 == 0 && a(10) < 100 && a > - 100 
#### OR ####
true  || true  => true 
true  || false => true 
false || true  => true 
false || false => false 
a(10) % 3 == 0 || a(10) < 100 => true 
#### NOT ####
!true  => false 
!false => true 
!(a<10> > 3) => false 
*/