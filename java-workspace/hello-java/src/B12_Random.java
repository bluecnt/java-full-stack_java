import java.util.Random;

public class B12_Random {
	/*
		# 무작위 숫자 생성하기
		  1. java.util.Random 클래스 사용하기
		  2. Math.ranom() 메서드 사용하기
	*/
	public static void main(String[] args) {
		System.out.println("<Random>----------------------------------------");

		// 랜덤 인스턴스 생성
		Random rnd = new Random();
		
		// 번호 하나 얻기
		int num1 = rnd.nextInt();			// int 전 범위
		int num2 = rnd.nextInt(10);			// 0 ~ 9
		int num3 = rnd.nextInt(100);		// 0 ~ 99
		int num4 = rnd.nextInt(201) + 100;	// 0~200 + 100 => 100 ~ 300
		int num5 = rnd.nextInt(81) - 50;	// -50 ~ +30
				
		System.out.printf("num1: %d \n", num1);
		System.out.printf("num2: %d \n", num2);
		System.out.printf("num3: %d \n", num3);
		System.out.printf("num4: %d \n", num4);
		System.out.printf("num5: %d \n", num4);
		
		System.out.println("<Math.random()>----------------------------------------");
		
		// math.random() : 0 <= x < 1 범위의 랜덤 실수 생성
		/*
			# Math.random()으로 원하는 범위의 랜덤 숫자 생성
			    <step 1> 0 <= x < 1
			  (1) 워하는 숫자의 개수를 곱한다 (bound 역할)
			    <step 2> 0 <= x < 21
			  (2) 곱한 결과를 int로 변환한다 (소수점 아래 삭제)
			  (3) 가감을 하여 원하는 범위로 만든다 
			    <step 3> 50 <= x < 71
		*/
		
		System.out.println("<3>----------------------------------------");
		
		for (int i = 0; i < 10; i++) {
			int v = getRandomNumber(50, 70);
			System.out.printf("[%02d] %3d \n", i, v);
		}
	}
	
	static int getRandomNumber(int min, int max) {
		return (int)((Math.random() * (max - min + 1)) + min);
	}
}

/*
<Random>----------------------------------------
num1: -1062590558 
num2: 7 
num3: 13 
num4: 193 
num5: 193 
<Math.random()>----------------------------------------
<3>----------------------------------------
[00]  68 
[01]  60 
[02]  52 
[03]  64 
[04]  53 
[05]  61 
[06]  59 
[07]  54 
[08]  53 
[09]  65

*/
