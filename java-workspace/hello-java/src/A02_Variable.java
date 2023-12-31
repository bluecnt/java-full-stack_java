
public class A02_Variable {

	/*
	 	# 변수(variables)
	 		- 프로그래밍 언어에서 데이터를 저장해 둘 수 있는 공간
	 		- 변수에 어떤 데이터를 보관할 것인지 타입을	 		
	*/
	public static void main(String[] args) {
		/*
			# 변수의 선언 (declare)
				- 타입과 변수명을 적어 앞으로 해당 변수를 사용하겠다고선언한다
				- 타입은 저장하고 싶은 타입을 지정하고 변수명은 사용하고싶은 이름을 적는다
				- 한 {} 안에서는 같은 이름의 변수를 여러 번 선언할 수 없다.
				
			# 대입 연산 (=)
				- 원래 알고 있던 =의 의미: 왼쪽과 오른쪽의 값이 같다 (비교)
				- 왼쪽에 있는 변수에 오른쪽에 있는 값을 넣어라
		*/
		
		String food;
		
		food = "피자";
		
		// int : 정수 사용
		int age = 30; // 변수 선언과 동시에 값을 대입
		
		// String : 문자열 사용
		String name = "김철수";		
		
		System.out.println(food);
		System.out.println(name);
		
		System.out.println(age - 10);		
		System.out.println(age);		
		System.out.println(age + 10);
		
		// 초기화하지 않은 변수를 사용할 수 없다.
		// 값을 한 번도 설정한적이 없는 변수는 사용할 수 없다.
		// 선언한 변수에 최초로 값을 넣는 것을 초기화라고 한다.
		int apple;
		apple = 10;
		
		System.out.println("사과는 총 " + (apple = 11) + "개 입니다.");
		
		// 변수를 선언하는 여러 방식들
		
		// (1) 선언과 동시에 초기화
		int x = 10;

		// (2) 선언만 하는 경우 (초기화 X)
		//int y;
		
		// (3) 같은 타입 변수를 한 번에 여러 개 선언하는 경우 (초기화 X)		
		//int a, b, c;
		//String snack1, snack2, snack3;
		
		// (4) 같은 타입 변수를 여러 개 선어하면서 동시에 초기화
		int d = 10, e = 20, f = 30;
		String snack4 = "쿠크다스", snack5 = "초코파이", snack6 = "초코하임";
		
		System.out.println(snack4 + " " + e + "개");
	}
}

/*
	피자
	김철수
	20
	30
	40
	사과는 총 11개 입니다.
	쿠크다스 20개
*/