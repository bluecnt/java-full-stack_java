package quiz;

public class B12_TempPassword2 {
	/*
		대문자, 소문자, 특수문자, 숫자로 구성된
		랜덤 비밀번호 6자리를 생성하여 출력하는 프로그램을 작성하시오
	*/
	public static void main(String[] args) {
		final boolean MY_CODE = !true;
		
		if (MY_CODE) {
			for (int i = 0; i < 10; i++) {
				String passwd = generatePasswd();
				System.out.printf("[%d] 임시 패스워드 => \"%s\" \n", i, passwd);
			}
		} else {
			final String PASSWD_CHARSET= "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
					"abcdefghijklmnopqrstuvwxyz" +
					"0123456789" +
					"!@#$%^&*():;=+-[]";
			
			System.out.print("임시 패스워드: \"");
			for (int i = 0; i < 6; i++) {
				int idx = getRandomNumber(0, PASSWD_CHARSET.length() - 1);
				char ch = PASSWD_CHARSET.charAt(idx);
				System.out.print(ch);
			}
			System.out.println("\"");
		}
	}
	
	static int getRandomNumber(int min, int max) {
		return (int)((Math.random() * (max - min + 1)) + min);
	}
	
	static String generatePasswd() {
		final String SPECIAL_CHARS = "!@#$%^&*():;=+-[]";
		
		String passwd = "";
		char[] chars = new char[4];
		for (int i = 0; i < 6; i++) {
			int spcCharIdx = getRandomNumber(0, SPECIAL_CHARS.length() - 1);

			chars[0] = (char)getRandomNumber('A', 'Z');
			chars[1] = (char)getRandomNumber('a', 'z');
			chars[2] = SPECIAL_CHARS.charAt(spcCharIdx);
			chars[3] = (char)getRandomNumber('0', '9');
			
			int charIdx = getRandomNumber(0, chars.length - 1);
			passwd += chars[charIdx];
		}
		
		return passwd;
	}

}

/*
임시 패스워드: "(xJwe*"
*/