package baekjoon;

import java.util.Scanner;

public class Q2588 {
	public static void main(String[] args) {
		int a = 1234;
		int b = 0;
		
		if (a == 0 && b == 0) {
			Scanner sc = new Scanner(System.in);
		
			a = sc.nextInt();
			b = sc.nextInt();
		}
		
		System.out.printf("a: %d \n", a);
		
		// 1000의 자리 구하기
		System.out.printf("1000의 자리: %d \n", (a % 10000) / 1000);
		// 100의 자리 구하기
		System.out.printf("100의 자리:  %d \n", (a % 1000) / 100);
		// 10의 자리 구하기
		System.out.printf("10의 자리:   %d \n", (a % 100) / 10);
		// 1의 자리 구하기
		System.out.printf("1의 자리:    %d \n", a % 10);		
	}
}
