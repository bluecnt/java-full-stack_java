package quiz;

import java.util.Scanner;

public class B03_MakeGrade {

	/*
	 * 국어, 영어, 수학 점수를 순서대로 입력받아 평균 점수를 구한 후에 각 과목의 점수와 등급 및 평균점수를 출력해주는 프로그램을 만들어보세요
	 * 
	 * 90점 이상은 A 80점 이상은 B 70점 이상은 C 60점 이상은 D 그 외 F
	 * 
	 * (2) 각 과목의 유효 점수는 0~100점 이다 유효하지 않은 점수가 하나라도 있다면 모든과목이 F이고 평균점수는 0점
	 * 
	 * (3) 평균점수는 소수 둘째자리에서 반올림하여 변수에 저장한 후 출력
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("국어의 점수를 입력하세요>");
		double korScore = sc.nextDouble();
		String notKorScore ="";
		String notEngScore ="";
		String notMathScore ="";
		
		if (korScore > 100 || korScore < 0) {
			System.out.println("유효점수가 아닙니다");
			korScore = 0;
			notKorScore = "무효";
		}
		System.out.print("영어의 점수를 입력하세요>");
		double engScore = sc.nextDouble();

		if (engScore > 100 || engScore < 0) {
			System.out.println("유효점수가 아닙니다.");
			engScore = 0;
			notEngScore = "무효";
		}
		System.out.print("수학의 점수를 입력하세요>");
		double mathScore = sc.nextDouble();

		if (mathScore > 100 || mathScore < 0) {
			System.out.println("유효점수가 아닙니다.");
			mathScore = 0;
			notMathScore = "무효";
		}

		String korGrade;
		String engGrade;
		String mathGrade;
		double totalAvg;

		if (korScore >= 90 && korScore<100) {
			korGrade = "A";
		} else if (korScore >= 80 && korScore < 90) {
			korGrade = "B";
		} else if (korScore >= 70 && korScore < 80) {
			korGrade = "C";
		} else if (korScore >= 60 && korScore < 70) {
			korGrade = "D";
		} else {
			korGrade = "F";
		}

		if (engScore >= 90  && engScore<100) {
			engGrade = "A";
		} else if (engScore >= 80 && engScore < 90) {
			engGrade = "B";
		} else if (engScore >= 70 && engScore < 80) {
			engGrade = "C";
		} else if (engScore >= 60 && engScore < 70) {
			engGrade = "D";
		} else {
			engGrade = "F";
		}

		if (mathScore >= 90  && mathScore<100) {
			mathGrade = "A";
		} else if (mathScore >= 80 && mathScore < 90) {
			mathGrade = "B";
		} else if (mathScore >= 70 && mathScore < 80) {
			mathGrade = "C";
		} else if (mathScore >= 60 && mathScore < 70) {
			mathGrade = "D";
		} else {
			mathGrade = "F";
		}

		if (notKorScore.equals("무효") || notEngScore.equals("무효") || notMathScore.equals("무효")) {
			korGrade = "F";
			engGrade = "F";
			mathGrade = "F";
		}

			System.out.println("국어의 등급 :  " + korGrade);
			System.out.println("영어의 등급 :  " + engGrade);
			System.out.println("수학의 등급 :  " + mathGrade);
			
			
			

		totalAvg = (korScore + engScore + mathScore)/3;
		System.out.println(totalAvg);
		totalAvg = (Math.round(totalAvg)*10)/10;
		System.out.println(totalAvg);
		System.out.printf("세 과목의 평균 점수는 %.1f 점입니다",totalAvg);

	}
}
