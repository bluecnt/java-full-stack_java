package baekjoon;

import java.util.Scanner;

public class Q2480 {
	public static void main(String[] args) {
		int d1 = 1;
		int d2 = 3;
		int d3 = 51;
		
		// 눈 3개가 같은지 체크
		if (d1 == d2 && d2 == d3) {
			System.out.println(10000 + d1 * 1000);
		} else {
			if (d1 == d2) {
				System.out.println(100 + d1 * 100);
			} else if (d2 == d3) {
				System.out.println(100 + d2 * 100);
			} else if (d1 == d3) {
				System.out.println(100 + d1 * 100);
			} else {
				int max = d1;
				if (max < d2) max = d2;
				if (max < d3) max = d3;
				
				System.out.println(100 * max);
			}
		}
		
		System.out.println();
		
		d1 = 3;
		d2 = 1;
		d3 = 9;
		int[] arr = {d1,d2,d3};
		System.out.println();
	}
}
