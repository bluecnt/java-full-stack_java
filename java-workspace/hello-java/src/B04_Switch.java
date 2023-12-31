
public class B04_Switch {

	/*
	  # switch-case 문 
	  - ()안의 값에 따라 실행할 코드를 결정하는 문법 - ()안에 boolean 타입 값은 사용할 수 없습니다
	  - ()안에 boolean 타읍 값은 사용할 수 없다
	  - if분으로 완벽하게 대체 가능하기 때문에 자주 사용하는 문법은 아니다
	  - default는 if 문의 else 같은 역할을 한다
	  - ()안의 값에 해당하는 case가 정의되어 있지 않은 경우 default를 실행한다
	  - break를 적지 않으면 break를 만날때까지 case보다 밑에있는 모든 case를 실행한다
	 */
	public static void main(String[] args) {

		int value = 99;
		switch (value) {
		case 1:
			System.out.println("1일 때 출력되는 문장");
			break;

		case 2:
			System.out.println("2일 때 출력되는 문장");
			break;

		case 3:
			System.out.println("3일 때 출력되는 문장");
			break;
			default:
				System.out.println("위의 case에 해당하는 것이 없을 때");
				break;
		}
		String cmd = "help";
		
		switch (cmd) {
		case "run" :
			System.out.println("실행합니다.");
			break;
		case "help" :
			System.out.println("도움말을 출력합니다");
			break;
		case "cd" :
			System.out.println("change directory");
			break;
		default :
			System.out.println("그런 커멘드는 없습니다");
			break;
		}

	}
}
