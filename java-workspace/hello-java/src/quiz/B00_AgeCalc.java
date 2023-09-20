package quiz;

import java.util.Scanner;

public class B00_AgeCalc {
	/*
		사용자가 태어난 해를 입력하면 그 사람의 한국 나이를 출력하시오.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("태어난 해? ");
		final int THIS_YEAR = 2023;
		int birthYear = sc.nextInt();

		int age = THIS_YEAR - birthYear + 1;
		System.out.printf("태어난 해는 %d년이며, 나이는 %d세 입니다.", birthYear, age);

		sc.close();
	}
}

/*
태어난 해? 2003
태어난 해는 2003년이며, 나이는 21세 입니다.
*/