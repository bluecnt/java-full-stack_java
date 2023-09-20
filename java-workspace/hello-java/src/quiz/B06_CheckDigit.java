package quiz;

import java.util.Scanner;

public class B06_CheckDigit {
	/*
		사용자로부터 숫자를 입력 받은 후 몇 자리 숫자인지 출력하시오.		
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 => ");
		int num = sc.nextInt();
		int digit = 0;
	
		// by ChatGPT
		/*
		if (num == 0 ) {
			cnt = 0;
		} else {
			for (int num2 = num; num2 > 0; num2 /= 10) {
				cnt++;	
				
				System.out.println(num2);
			}
		}
		*/
		
		// 강사
		
		// 숫자를 10배씩 크게 만들면서 10을 몇 번 곱했는지 세어서 알아내기
		/*
		for (int i = 1; i <= num; i *= 10) {
			cnt++;
			
			System.out.printf("i: %5d \n", i);
		}
		*/
		
		// 입력받은 숫자를 10씩 나누면서 몇 번 나눴는지
		for (int i = num; i > 0; i /= 10) {
			digit++;

			System.out.printf("[%d]: %5d \n", digit, i);
		}
		
		
		System.out.printf("숫자: %d, 자릿수: %d \n", num, digit);
	}
}

/*
숫자를 입력하세요 => 
1234
[1]:  1234 
[2]:   123 
[3]:    12 
[4]:     1 
숫자: 1234, 자릿수: 4 
*/