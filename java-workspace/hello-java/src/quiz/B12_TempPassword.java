package quiz;

public class B12_TempPassword {
	/*
		4자리 랜덤 알파벳 대문자로 구성된 비밀번호를
		생성하여 출력하는 프로그램을 작성하시오
	*/
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			String passwd = generatePasswd();
			System.out.printf("[%d] 임시 패스워드 => \"%s\" \n", i, passwd);
		}
		
		/*
		System.out.print("임시 패스워드: ");
		for (int i = 0; i < 4; i++) {
			char ch = (char)(Math.random() * 26 + 65);
			System.out.print(ch);
		}
		System.out.println();
		*/
	}
	
	static int getRandomNumber(int min, int max) {
		return (int)((Math.random() * (max - min + 1)) + min);
	}
	
	static String generatePasswd() {
		String passwd = "";
		for (int i = 0; i < 4; i++) {
			char ch = (char)getRandomNumber('A', 'Z');
			passwd += ch;
		}
		
		return passwd;
	}
}

/*
[0] 임시 패스워드 => "NCFB" 
[1] 임시 패스워드 => "MJOM" 
[2] 임시 패스워드 => "EXHQ" 
[3] 임시 패스워드 => "DFOQ" 
[4] 임시 패스워드 => "GXDJ" 
[5] 임시 패스워드 => "HYAI" 
[6] 임시 패스워드 => "DRFV" 
[7] 임시 패스워드 => "EOFH" 
[8] 임시 패스워드 => "SWNX" 
[9] 임시 패스워드 => "TGGW" 
*/