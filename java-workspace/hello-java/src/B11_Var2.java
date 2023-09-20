
public class B11_Var2 {
	public static void main(String[] args) {
		
		System.out.println("<1>----------------------------------------");
		
		// 1. {}<중괄호> 변수는 {}<중괄호>를 벗어나면 소멸된다
		if (true) {
			int x = 10;
			System.out.printf("inner x: %d \n", x);
		}
		
		int x = 20;
		System.out.printf("outer x: %d \n", x);
		
		// for 문 내부에서 선언된 변수는 {}<중괄호>내부에서 선언한 것으로 간주
		for (int i = 0; i < 10; i++) {
			System.out.printf("hello! - %d \n", i);
		}

		System.out.println("<2>----------------------------------------");

		// 2. {}<중괄호> 바깥에서 선언한 변수는 중괄호가 끝나도 계속 사용할 수 있다
		int num = 20;
		
		if (true) {
			//int num = 30;
			num = 88;
		}

		System.out.println("<3>----------------------------------------");
		
		// 들여쓰기(indent) 원칙
		/*
		  1. 새로운 {}<>중괄호>가 열리면 한 번 들여쓰기
		  2. } 뒤에 무언가를 쓰지 말자
		  3. 스페이스 바로 줄을 맞추지 말자
		  4. 빤가 줄이있는 상태에서는 자동 들여쓰기의 도움받없다.
		  
		  
		*/
		
		// 잘못된 예
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				//
			} // System.out.println() <- 들여쓰기 잘못된 예
			
		//int num; // <- 들여쓰기 잘못된 예
		}
	}
}

/*
inner x: 10 
outer x: 20 
hello! - 0 
hello! - 1 
hello! - 2 
hello! - 3 
hello! - 4 
hello! - 5 
hello! - 6 
hello! - 7 
hello! - 8 
hello! - 9 
*/