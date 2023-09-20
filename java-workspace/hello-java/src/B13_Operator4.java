public class B13_Operator4 {
	/*
		# 삼항 연산자
		  - 간단한 if 문을 한 줄로 쉽게 사용할 수 있는 연산자
		  - condition ? true : false
	*/
	
	public static void main(String[] args) {
		int age = 25;		
		int money = age > 30 ? -50000 : 5000;
		System.out.println("이번 추석에 받을 돈:" + money);
		
		int apple = 33;
		int basket = apple % 10 == 0 ? apple / 10 : apple / 10 + 1;
		System.out.printf("apple: %d, basket: %d \n", apple, basket);
				
		String greetings = age < 10 ? "안녕!" : "안녕하세요";
		System.out.println(greetings);
	}
}

/*
이번 추석에 받을 돈:5000
apple: 33, basket: 4 
안녕하세요
*/