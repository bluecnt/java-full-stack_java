
public class A01_Escape2 {

	public static void main(String[] args) {
		// 이스케이프 문자 : \와 합쳐져서 특수 기능을 하는 문자
		
		// \n : 줄바꿈
		System.out.println("안녕하세요\n반갑\n습니다");

		// \t : 탭키 역할
		System.out.println("안녕하세요\t반갑\t습니다");

		// \" : 쌍따옴표 출력 역할
		System.out.println("안녕하세요\"반갑습니다\"");

		// \' : 작은따옴표 출력 역할
		System.out.println("안녕하세요\'반갑습니다\'");

		// \\ :  역슬래시를 그냥 출력
		System.out.println("C:\\Program Files\\Nexon\\Crazy Arcade");
	}

}

/*
	안녕하세요
	반갑
	습니다
	안녕하세요	반갑	습니다
	안녕하세요"반갑습니다"
	안녕하세요'반갑습니다'
	C:\Program Files\Nexon\Crazy Arcade
*/