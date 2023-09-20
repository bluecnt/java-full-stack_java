package quiz;

import java.util.Scanner;

public class B03_AppleQuiz {

	/*
		사과를 10개씩 담을 수 있는 바구니가 있다
		사용자로 부터 사과 개수를 입력 받아 몇 개의 바구니까 필요한지 구하라.
	*/
	public static void main(String[] args) {
		final int BASKET_LIMIT = 10;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사과 개수는?");
		int appleCnt = sc.nextInt();
		
		//int basketCnt = (int)(appleCnt / (double)BASKET_LIMIT) +
		//		((appleCnt % BASKET_LIMIT != 0) ? 1 : 0);
		int basketCnt = 0;
		if (appleCnt % BASKET_LIMIT != 0) {
			basketCnt = (appleCnt / BASKET_LIMIT) + 1;
		} else {
			basketCnt = appleCnt / BASKET_LIMIT;
		}
		
		System.out.printf("사과 개수      : %d \n", appleCnt);
		System.out.printf("필요한 바구니 개수: %d \n", basketCnt);
	}
}

/*
사과 개수는?
11
사과 개수      : 11 
필요한 바구니 개수: 2 
*/