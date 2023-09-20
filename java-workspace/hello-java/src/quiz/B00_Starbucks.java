package quiz;

import java.util.Scanner;

public class B00_Starbucks {
	/*
		커피 3잔의 개수를 입력받아 각 메뉴 당 잔 개수, 총 가격을 출력하시오.
		메뉴 가격: 아메리카노 1,600원, 카페라떼 2,700원, 카페모카 3,300원
	*/
	public static void main(String[] args) {
		final int AMERICANO_PRICE = 1600;
		final int CAFE_LATTE_PRICE = 2700;
		final int CAFE_MOCHA_PRICE = 3300;

		Scanner sc = new Scanner(System.in);

		System.out.print("아메리카노 몇잔?");
		int americanoCount = sc.nextInt();

		System.out.print("카페라떼 몇잔?");
		int cafeLatteCount = sc.nextInt();

		System.out.print("카페모카 몇잔?");
		int cafeMochaCount = sc.nextInt();

		int americanoSum = americanoCount * AMERICANO_PRICE;
		int cafeLatteSum = cafeLatteCount * CAFE_LATTE_PRICE;
		int cafeMochaSum = cafeMochaCount * CAFE_MOCHA_PRICE;
		int totalCount = americanoCount + cafeLatteCount + cafeMochaCount;
		int totalPrice = americanoSum + cafeLatteSum + cafeMochaSum;

		System.out.println("# 주문 내역");
		System.out.printf("  - 아메라카노\t: %d잔 (%d원) \n", americanoCount, americanoSum);
		System.out.printf("  - 카페라떼\t: %d잔 (%d원) \n", cafeLatteCount, cafeLatteSum);
		System.out.printf("  - 카페모카\t: %d잔 (%d원)\n", cafeMochaCount, cafeMochaSum);
		System.out.println("    ----------------");
		System.out.printf("    합계\t\t: %d잔 (%d원) \n", totalCount, totalPrice);
	}
}

/*
아메리카노 몇잔?1
카페라떼 몇잔?2
카페모카 몇잔?3
# 주문 내역
  - 아메라카노	: 1잔 (1600원) 
  - 카페라떼	: 2잔 (5400원) 
  - 카페모카	: 3잔 (9900원)
    ----------------
    합계		: 6잔 (16900원) 
*/