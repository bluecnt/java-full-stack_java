public class B03_If {
	/*
 		# if문
			- () 안의 값이 true이면, {} 안의 코드를 실행하는 문법
			- () 안에 값이 false이며느 {} 안의 코드를 무시
		
		# else if문
			- 위의 if문에서 조건이 맞지 않아 실행되지 않았다면 if문처럼 작동
			- 여러 번 사용 가능하며 단독 사용 불가
			
		# else
			- 위에 있는 모든 if, if else에 해당되지 않을 때 실행
			- 단독 사용 불가
			- else가 붙어 있으면 해당 if문 블록은 무조건 실행됨
	*/
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
	
		int a = 8;
		if (a > 10) {
			System.out.println("if문의 {}가 실행되었습니다");
		} else if (a%2 == 0) {
			System.out.println("a가 10보다 작으면서 짝수일 때 실행되는 곳");
		} else {
			System.out.println("");
		}

		char appleGrade = 'C';
		int price;
		
		if (appleGrade == 'A') {
			price = 1200;
		} else if (appleGrade == 'B') {
			price = 800;
		} else if (appleGrade == 'C') {
			price = 600;
		} else {
			price = 0;
		}		
		
		System.out.println("사과 가격: " + price);
		
		System.out.println("프로그램 끝");
	}
}

/*
프로그램 시작
a가 10보다 작으면서 짝수일 때 실행되는 곳
사과 가격: 600
프로그램 끝
*/