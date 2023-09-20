public class A06_Print {
	/*
		# 함수
			- 뒤에 ()가 붙은 것
			- 뒤에 ()가 붙고 class 내부에 있으면 메서드
		
		# 콘솔에 출력하기 위한 함수들
			1. println()
				- ()안에 전달한 데이터를 출력
				- 데이터 뒤에 자동으로 \n을 추가하여 출력한다
			2. print()
				- () 안에 전달한 데이터를 콘솔에 출력한다
			3. printf()
				- print format(서식)
				- 원하는 서식을 먼저 설정하고 해당 서식대로 데이터를 출력
				- 서식 문자 종류
					%d : <decimal> 10진수로 출력
					%o : <octal> 8진수로 출력
					%x : <hex> 16진수 (소문자)
					%X : <HEX> 16진수 (대문자)
					%f : 실수
					%s : 무자열
					%c : 문자
					%% : % 문자
				- 서식 문자 옵션 : 서식 문자의 %와 문자 사이에 넣어서 사용
					1. %Nd  : N만큼 자릿수 확보
					2. %-Nd : ~ 왼쪽 정렬
					3. %+Nd : ~ 부호 출력
					4. %0Nd : ~ 0 패딩
					5. %.Nf : 소수점 자릿수 확보
	*/
	public static void main(String[] args) {		
		System.out.print("A \n");
		System.out.print("B \n");
		System.out.print("C \n");
		System.out.print("D \n");
		
		System.out.println("========================================");
		
		int year = 2023;
		int month = 9;
		int day = 6;
		String ampm = "AM";
		int hour = 11;
		int minute = 12;
		int second = 32;
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " +
				hour + "시 " + minute + "분 " + second + "초");		
		System.out.printf("%04d.%02d.%02d %s %02d:%02d:%02d \n",
				year, month, day, ampm, hour, minute, second);
		
		System.out.println("========================================");
		
		double successRate = 60.8;
		System.out.printf("%.1f%%의 확률로 강화에 성공합니다 \n", successRate);
		
		int money = 1234;
		System.out.printf("보유금액: %10d원 \n", money);		
		System.out.printf("보유금액: %-10d원 \n", money);		
		System.out.printf("보유금액: %+10d원 \n", money);		
		System.out.printf("보유금액: %010d원 \n", money);		
		
		double dollar = 10.15;
		
		System.out.printf("dollar: $%.2f \n", dollar);		

	}
}

/*
A 
B 
C 
D 
========================================
2023년 9월 6일 11시 12분 32초
2023.09.06 AM 11:12:32 
========================================
60.8%의 확률로 강화에 성공합니다 
보유금액:       1234원 
보유금액: 1234      원 
보유금액:      +1234원 
보유금액: 0000001234원 
dollar: $10.15 
*/