import java.util.Scanner;

//import quiz.A00_Rabbit;

public class B00_Scanner {
	/*
		# import => Ctrl+Shift+O
			- 다른 패키지에 있는 클래스를 가져옴
			- 같은 패키지에 있는 다른 클래스는 import 없이 사용 가능
			- 다른 캐키지에 있는 다른 클래스는 반드스시 import가 필요
			
		# java.util.Scanner class
			- 입력을 받을 수 있는 기능들을 제공하는 클래스
			- 새 스캐너를 생성할 때, 어느곳에서 입력 받을지 결정 가능
			  (System은 현재 컴퓨터의 콘솔을 의미한다)
			  ex) System.out : 콘솔로 데이터 출력
			      System.in  : 콘솔로부터 데이터 입력
			- ?
	*/
	
	public static void main(String[] args) {
		/*
			// 같은 패키지에 있는 다른 클래스 사용하기
			A00_Hello.main(null);
			// 다른 패키지에 있는 다른 클래스 사용하기
			A00_Rabbit.main(null);
		*/
		
		// 새 스캐너 생성 (입력 통로 설정)
		Scanner sc = new Scanner(System.in);
		
		/*
		// 입력 안내 문구 출력
		System.out.println("아무 숫자나 입력하세요:");
		// 다음으로 입력받는 숫자 하나를 꺼냄
		// "1 2 3" 이런식으로 입력을 하든가 아님 하나씩 입력하고 엔터를 치든가
		// space, \t, \n을 통해 각 값을 구분한다.
		int num0 = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("입력한 숫자 num0 : " + num0);
		System.out.println("입력한 숫자 * 3  : " + num0 * 3);
		
		System.out.println("입력한 숫자 num1 : " + num1);
		System.out.println("입력한 숫자 num2 : " + num2);
		*/
		
		/*
			# 스태너의 대표적인 기능들
				(1) next타입() 메서드 : nextInt(), nextFloat(), ...
					- 사용자가 입력한 값을 해당하는 타입으로 가져온다
					- 사용자는 공백을 사용하여 한번에 여러 값을 입력할 수 있다.
					- 만약 입력 통로에 남아있는 값이 없다면 프로그램을 멈추고
					  다음 입력을 기다린다
				(2) next() 메서드
					- 값을 String 타입으로 가져온다
					- 공백, \t, \n을 통해 각 값을 구분
					- 통로에 남아있는 값이 없다면 다음 입력을 기다림
				(3) nextLine() 메서드
					- 통로에 있는 값을 모두 문자열로 타입으로 가져온다.
					- \n만으로 값을 구분하기에 space로 값을 구분하지 않음
		*/
		
		System.out.println("내용을 입력하세요:");
		String line = sc.nextLine();
		System.out.printf("입력된 내용 => <%s>", line);
	}
}

/*
내용을 입력하세요:
Microsoft Windows NT
입력된 내용 => <Microsoft Windows NT>
*/