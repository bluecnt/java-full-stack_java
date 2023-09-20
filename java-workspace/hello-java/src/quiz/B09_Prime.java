package quiz;

import java.util.Scanner;

public class B09_Prime {
	/*
		사용자로부터 정수를 입력받고 1부터 입력받은 정수 사이에 있는 모든 소수를 출력하시오
		※ 소수(prime) : 나누어 떨어지는 수가 1과 자기 자신밖에 없는 수
		>> 10 => 2,3,5,7 >> 30 => 2,3,5,7,11,13,17,19,23,29
	 */

	public static void main(String[] args) {
		//for (int i = 2; i <= 10; i++) {
		//	testPrime(i);
		//}
		// testPrime(Integer.MAX_VALUE);
		
		int num = 300;		
		if (num == Integer.MAX_VALUE) {
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 입력> ");
			num = sc.nextInt();
		}
		
		System.out.printf("Input  : %d \n", num);
		System.out.printf("Primes : ");
		
		for (int i = 2, j = 0; i <= num; i++) {
			boolean isPrime = true;
			
			// 이번 숫자 i에 대한 약수 개수 검사
			// (1) 약수가 2개인지 검사하기
			// (2) 2부터 i-1에 약수가 존재하면 소수가 아님
			// (3) 2부터 루트i까지 약수가 존재하면 소수가 아님
			for (int chk = 2; chk <= Math.sqrt(i); chk++) {
				if (i % chk == 0) {
					isPrime = false;
					
					break;
				}
			}
			
			//System.out.printf("%2d은(는) 소수? %s \n", i, isPrime ? "Yes!" : "");
			if(isPrime) {
				System.out.printf("%4d ", i);
				
				if (++j % 10 == 0) {
					System.out.printf("\n       : ");
				}
			}
		}
	}

	/*
	static void testPrime(int num) {
		if (num == Integer.MAX_VALUE) {
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 입력> ");
			num = sc.nextInt();
		}

		int divisorCount = 0;
		for (int i = 1; i <= num; i++) {
			boolean isDivisor = num % i == 0;
			if (isDivisor)
				divisorCount++;
		}

		System.out.printf("%2d은(는) %s \n",
				num, divisorCount == 2 ? "소수 입니다." : "...");
	}
	*/
}

/*
Input  : 300 
Primes :    2    3    5    7   11   13   17   19   23   29 
       :   31   37   41   43   47   53   59   61   67   71 
       :   73   79   83   89   97  101  103  107  109  113 
       :  127  131  137  139  149  151  157  163  167  173 
       :  179  181  191  193  197  199  211  223  227  229 
       :  233  239  241  251  257  263  269  271  277  281 
       :  283  293 
*/