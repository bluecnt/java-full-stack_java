package quiz;

import java.util.Scanner;

public class B06_ForQuiz2 {

	/*
		사용자로부터 숫자를 입력 받아
		0부터 해당 숫자 사이의 5의 배수를 한 줄에 10개씩 출력하시오.
		단, 음수를 입력해도 올바르게 작동해야함 
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오(음수 가능) => ");
		int lastNum = sc.nextInt();
		
		// 시관
		int lastNumAbs = Math.abs(lastNum);		
		for (int i = 0, cnt = 0; i <= lastNumAbs; i++) {
			if (i % 5 == 0) {
				String s = String.format("%c%d",
						lastNum < 0 && i != 0 ? '-' : ' ', i);
				System.out.printf("%4s, ", s);
				
				if (++cnt % 10 == 0) {
					System.out.println();
				}
			}
		}
		
		// 강사
		/*
		boolean isMinus = lastNum < 0;
		lastNum = Math.abs(lastNum);
		for (int i = 0, cnt = 0; i <= lastNum; ++i) {
			if (i % 5 == 0) {
				if (isMinus) {
					System.out.printf("-%d ", i);
				} else {
					System.out.printf("%d ", i);
				}
				
				if (++cnt % 10 == 0)
					System.out.println();
			}
		}
		*/

		/*
		// 양수일 때
		if (lastNum >= 0) {
			for (int i = 0, cnt = 0; i <= lastNum; ++i) {
				if (i % 5 == 0) {
					System.out.print(i + " ");
					if (++cnt % 10 == 0) {
						System.out.println();
					}
				}
			}
		}
		// 음수일 때
		else {
			for (int i = 0, cnt = 0; i >= lastNum; --i) {
				if (i % 5 == 0) {
					System.out.print(i + " ");
					if (++cnt % 10 == 0) {
						System.out.println();
					}
				}
			}
		}
		*/		
	}
}

/*
숫자를 입력하시오(음수 가능) => 
-100
   0,   -5,  -10,  -15,  -20,  -25,  -30,  -35,  -40,  -45, 
 -50,  -55,  -60,  -65,  -70,  -75,  -80,  -85,  -90,  -95, 
-100, 
*/