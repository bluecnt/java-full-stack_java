package quiz;

import java.util.Scanner;

public class B00_DollarSwap {
	/*
		원화를 현재 환율로 달러로 변환하는 프로그램
	*/
	
	public static void main(String[] args) {
		final double USD_KRW_RATE = 1330.88;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요>");
		int krw = sc.nextInt();
		double usd = krw / USD_KRW_RATE;
		
		System.out.printf("￦%d -> $%.2f \n", krw, usd);
		
//		sc.close();	
	}
}

/*
원화를 입력하세요>10000
￦10000 -> $7.51 
*/