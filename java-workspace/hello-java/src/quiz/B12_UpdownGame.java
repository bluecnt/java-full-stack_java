package quiz;

import java.util.Scanner;

public class B12_UpdownGame {
	static final boolean PRINT_DEBUG_MSG = !true;
	
	/*
		# Updown 게임 만들기
		  1. 게임이 시작되면 1 ~ 100 사이의 랜덤 숫자를 정답으로 선택한다
		    (사용자에게는 비밀로 하다)
		  2. 사용자가 숫자를 입력하면 UP, DOWN, or 정답 여부를 알려준다.
		  3. 정답이 입력한 숫자보다 크다면 사용자에게 UP이라고 알려준다
		     정답이 입력한 숫자보다 작다면 사용자에게 DOWN이라고 알려준다
		     정답이 입력한 숫자와 일치하면 정답이라고 알려준 후 플레이어가 승리한다
	      4. 5번 안에 못 맞추면 정답이 무엇인지 알려주고 플레이어의 패배로 프로그램을 종료한다
	      5. 정답을 맞추면 몇 번만에 맞췄는지 알려주고 프로그램을 종료한다
	      6. 사용자가 범위를 벗어나는 숫자를 입력하면 다시 입력할 수 있게 한다 
	*/
	public static void main(String[] args) {
		//runMyCode();
		runTutorCode();
	}
	

	static int getRandomNumber(int min, int max) {
		return (int)((Math.random() * (max - min + 1)) + min);
	}
	
	static void printTitle(int min, int max) {
		System.out.println("=".repeat(40));
		System.out.printf("# Updown 게임(%d~%d) v0.1 (2023.09.14.THU) \n", min, max);
		System.out.println("=".repeat(40));
	}
	
	static void printTheEnd(int targetNumber, int winner, int maxInputCount, int inputCount) {
		if (PRINT_DEBUG_MSG)
			System.out.printf("$ winner: %d, maxInputCount: %d, inputCount: %d \n",
					winner, maxInputCount, inputCount);
		
		System.out.println("# 게임 종료");
		System.out.printf("  - 결과 => 정답: %d, 플레이어 %s, 횟수: %d/%d \n",
				targetNumber, winner == 0 ? "승" : "패", inputCount, maxInputCount);
	}
	
	static int generateTargetNumber() {
		return getRandomNumber(1, 100);
	}

	static int getNumberFromUser(Scanner sc, int inputCountMax, int inputIdx,
			int rangeMin, int rangeMax) {		
		System.out.printf("숫자를 입력하세요 (%d/%d)> ", inputIdx, inputCountMax);
		int num = sc.nextInt();

		if (PRINT_DEBUG_MSG)
			System.out.printf("$ inutCountMax: %d, inputIdx: %d, " + 
					" rangeMin: %d, rangeMax: %d, num: %d \n",
					inputCountMax, inputIdx, rangeMin, rangeMax, num);
		
		if (num == 0)
			return 0;
		else if (num < 0)
			return num;
		
		return (num >= rangeMin && num <= rangeMax) ? num : num * -1;
	}

	// My Code
	static void runMyCode() {
		final int INPUT_COUNT_MAX = 5;
		final int RANGE_MIN = 1;
		final int RANGE_MAX = 100;
		
		Scanner sc = new Scanner(System.in);
		int targetNumber = generateTargetNumber();
		int inputCount = INPUT_COUNT_MAX;
		int winner = 1; // 0=player, 1=computer
		
		if (PRINT_DEBUG_MSG)
			System.out.printf("$ targetNumber: %d \n", targetNumber);
		
		printTitle(RANGE_MIN, RANGE_MAX);
		
		//------------------------------------------------------------
		{
			for (int i = 0; i < INPUT_COUNT_MAX; i++) {
				int num = getNumberFromUser(sc, INPUT_COUNT_MAX, i + 1, RANGE_MIN, RANGE_MAX);
				if (num < 0 || num < RANGE_MIN) {
					System.out.printf("  입력값의 범위를 벗어났습니다. 입력: %d, 범위: %d~%d \n",
							num * -1, RANGE_MIN, RANGE_MAX);
					
					i--;
					
					continue;
				}
				
				// UP
				if (num < targetNumber) {
					System.out.println("UP");
				}			
				// DOWN
				else if (num > targetNumber){
					System.out.println("DOWN");
				}			
				// 정답
				else {
					System.out.println("정답^^");
					
					inputCount = i + 1;
					winner = 0;
					
					break;
				}
			}
		}
		//------------------------------------------------------------

		
		// 0=player, 1=computer
		printTheEnd(targetNumber, winner, INPUT_COUNT_MAX, inputCount);
		
		sc.close();
	}

	// Tutor Code
	static void runTutorCode() {
		final int MAX_CHANGE = 5;
		
		Scanner sc = new Scanner(System.in);
		int chance = MAX_CHANGE;
		
		// 100 + 1 => 0~99 + 1 => 1 ~ 100
		int answer = (int)(Math.random() * 100 + 1);
		boolean userWin = false;
		
		System.out.println("정답 (테스트용) : " + answer);
		
		while (chance > 0) {
			System.out.print("숫자를 고르세요 (1~100) : ");
			int select = sc.nextInt();
			
			if (select > 100 || select < 1) {
				System.out.println("숫자의 범위를 올바르게 입력해주세요.");
				
				continue;
			}
			
			if (select > answer) {
				System.out.println("DOWN!!");
			} else if (select < answer) {
				System.out.println("UP!!");
			} else {
				userWin = true;
				
				System.out.println("정답!!");
				
				break;
			}
			
			chance--;
			System.out.println("남은 기회 : " + chance);
		}
		
		if (userWin) {
			System.out.printf("%d번 만에 맞추셨습니다. \n", MAX_CHANGE - chance + 1);
		} else {
			System.out.printf("패배하셨습니다.. 정답은 %d였습니다. \n", answer);
		}
	}
}

/*
========================================
# Updown 게임(1~100) v0.1 (2023.09.14.THU) 
========================================
숫자를 입력하세요 (1/5)> 0
  입력값의 범위를 벗어났습니다. 입력: 0, 범위: 1~100 
숫자를 입력하세요 (1/5)> 200
  입력값의 범위를 벗어났습니다. 입력: 200, 범위: 1~100 
숫자를 입력하세요 (1/5)> 50
UP
숫자를 입력하세요 (2/5)> 60
UP
숫자를 입력하세요 (3/5)> 70
UP
숫자를 입력하세요 (4/5)> 90
UP
숫자를 입력하세요 (5/5)> 94
UP
# 게임 종료
  - 결과 => 정답: 99, 플레이어 패, 횟수: 5/5 
*/

/*
정답 (테스트용) : 81
숫자를 고르세요 (1~100) : 20
UP!!
남은 기회 : 4
숫자를 고르세요 (1~100) : 30
UP!!
남은 기회 : 3
숫자를 고르세요 (1~100) : 81
정답!!
3번 만에 맞추셨습니다. 
*/