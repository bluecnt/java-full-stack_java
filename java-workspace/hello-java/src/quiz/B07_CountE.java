package quiz;

import java.util.Scanner;

public class B07_CountE {

	/*
		사용자로부터 문장을 입력받고 알파벳 E(대소문자 모두) 개수를 출력하시오
	*/
	public static void main(String[] args) {
		B07_CountE.testCountE("Microsoft Surface");
		B07_CountE.testCountE("Google Pixel Phone");
		B07_CountE.testCountE("Apple IPhone");
		B07_CountE.testCountE("I want to know why you go.");
	}
	
	static void testCountE(String text) {
		System.out.println("----------------------------------------");
		
		if (text.isEmpty()) {
			Scanner sc = new Scanner(System.in);
			System.out.println("문장을 입력하세요> ");
			text = sc.nextLine();
		}
		
		int countE = 0;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (ch == 'E' || ch == 'e') {
				countE++;
			}
		}
		
		System.out.printf("문장\t\t: \"%s\" \n", text);
		System.out.printf("알파벳 E(e) 개수\t: %d \n", countE);
	}
}

/*
----------------------------------------
문장				: "Microsoft Surface" 
알파벳 E(e) 개수	: 1 
----------------------------------------
문장				: "Google Pixel Phone" 
알파벳 E(e) 개수	: 3 
----------------------------------------
문장				: "Apple IPhone" 
알파벳 E(e) 개수	: 2 
----------------------------------------
문장				: "I want to know why you go." 
알파벳 E(e) 개수	: 0 
*/