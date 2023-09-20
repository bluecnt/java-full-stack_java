package quiz;

import java.util.Arrays;
import java.util.DuplicateFormatFlagsException;

public class B14_Lotto {
	/*
		1. 랜덤으로 로또 당첨 번호를 생성하시오
		  => 1 ~ 45의 중복없는 랜덤 숫자 7개, 마지막 번호는 보너스 번호
		  => ? 
	  	2. 당첨이 될 때까지 로도 번호를 자동으로 계속 생성하여
	  	  몇 번만에 당첨되었는지 출력
	  	3. 1등에 당첨 될 때까지 뽑는 동안 2등에 당첨되는 번호들이 있으면 출력하시오
	*/

	public static void main(String[] args) {
		//runMyCode();
		//runTutorCode();
		runTutorCode2();
	}
	
	//----------------------------------------------------------------------
	
	static boolean isInArray(int[] array, int value) {
		for (int i : array) {
			if (i == value)
				return true;
		}
		
		return false;
	}
	
	static int[] generateNumbers(boolean withBonus) {
		int[] nums6 = new int [6]; 
		int[] nums7 = new int [6 + 1];
		int[] nums = withBonus ? nums7 : nums6;
				
		/*
		for (int i = 0; i < nums.length; i++) {
			int num = getRandomNumber(1, 45);
			
			if (isInArray(nums, num)) {
				i--;
				
				continue;
			}

			nums[i] = num;
		}
		*/
		
		int len = 0;
		while (len < nums.length) {
			int num = getRandomNumber(1, 45);			
			if (isInArray(nums, num))
				continue;
			
			nums[len++] = num;
		}
	
		// 보너스 번호는 마지막에 위치하도록
		if (nums.length == 7)
			nums[6] += 100;
		
		Arrays.sort(nums);
		
		if (nums.length == 7)
			nums[6] -= 100;
		
		return nums;
	}
	
	static int calcRank(int[] winningNumbers, int[] numbers) {
		int cnt = 0;
		for (int i = 0; i < winningNumbers.length - 1; i++) {
			for (int j = 0; j < numbers.length; j++) {
				int iv = winningNumbers[i];
				int jv = numbers[j];
				if (jv == iv)
					cnt++;
			}
		}
		
		switch (cnt) {
			case 6:
				return 1;
				
			case 5:
				int wn = winningNumbers[6];
				return isInArray(numbers, wn) ? 2 : 3;
				
			case 4:
				return 4;
				
			case 3:
				return 5;
				
			default:
				return 0;
		}
	}
	
	static String numbersToString(int[] numbers, int idx) {
		String s = idx > 0 ? String.format("[%08d] ", idx) : "";
		for (int i = 0; i < 6; i++) {
			int num = numbers[i];
			s += String.format("%02d ", num);
		}
		
		if (numbers.length == 7)
			s += String.format("+ %02d", numbers[6]);
		
		s = s.stripTrailing();
		
		return s;
	}
		
	static int getRandomNumber(int min, int max) {
		return (int)((Math.random() * (max - min + 1)) + min);
	}

	static void runMyCode() {
		final int NUMBERS_SET_COUNT = 8145060;
		
		/*
		int[] winningNums = { 1, 2, 3, 4, 5, 6, 7 };
		int[] nums1 = { 1, 2, 3, 4, 5, 70 };
		
		int rank = calcRank(winningNums, nums1);
		System.out.println(rank);

		System.out.printf("Winning Numbers: %s \n", numbersToString(winningNums));
		System.out.printf("Nums 1:          %s => rank: %d \n",
				numbersToString(nums1), rank);
		*/	
		
		int[] winningNums = generateNumbers(true);
		//int[] winningNums1085 = { 4, 7, 17, 18, 38, 44, 36 };
		
		System.out.printf("Winning Numbers => %s \n",
				numbersToString(winningNums, 0));
		System.out.printf("Generated Numbers (Count: %d) \n", NUMBERS_SET_COUNT);
		
		boolean nextLifeTime = true;
		for (int i = 0; i < NUMBERS_SET_COUNT; i++) {
			int[] nums = generateNumbers(false);
			String s = numbersToString(nums, i + 1);
			int rank = calcRank(winningNums, nums);
			//if (rank > 0)
			if (rank == 1 || rank == 2) {
				System.out.printf("  %s => rank: %d \n", s, rank);
				
				if (rank == 1) {
					System.out.printf("    %d번만에 1등 당첨^^ \n", i + 1);
					
					nextLifeTime = false;
					
					break;
				}
			}
		}
		
		if (nextLifeTime) {
			System.out.println("=> 다음 생에선 꼭 1등 되자구^^");
		}
	}
		
	//----------------------------------------------------------------------

	static void runTutorCode() {
		
		//----------------------------------------
		// 중복 제거 코드 (2023.09.19.TUE)
		//----------------------------------------
		
		int[] winNums = new int[7];
		
		int i = 0;
		int len = winNums.length;
	
		// 랜덤 값 넣기
		while (i < len) {
			winNums[i] = (int)(Math.random() * 45 + 1);
		
			// i : 방금 뽑은 새 숫자의 인덱스
			// j : 지금까지 뽑았던 숫자들의 인덱스
			int j = 0;
			boolean duplicated = false;
			while (j < i) {
				if (winNums[j] == winNums[i]) {
					duplicated = true;
					
					// 중복을 찾았다면 더 찾을 필요가 없다
					break;
				}
				
				j++;
			}
			
			if (!duplicated) 
				i++;
		}		
		
		// 정렬하기
		winNums[6] += 100;
		Arrays.sort(winNums);
		winNums[6] -= 100;
		
		// 출력하기
		String winNumsStr = numbersToString(winNums, 0);
		//System.out.printf("winNums: %s \n", winNumsStr);
		
		int idx = 0;
		while (true) {
			//System.out.printf("[%08d] \n", idx);
			
			// 자동 로또 돌리기
			int[] userNums = new int[6];
			
			len = userNums.length;

			//System.out.println("A");
			
			i = 0;
			while (i < len) {
				//System.out.printf("i: %d, len: %d, %s \n",
				//		i, len, Arrays.toString(userNums));

				userNums[i] = (int)(Math.random() * 45 + 1);
				
				int j = 0;
				boolean duplicated = false;
				while (j < i) {
					//System.out.printf(">> j: %d, i: %d \n", j, i);
					
					if (userNums[j] == userNums[i]) {
						duplicated = true;
						
						break;
					}
					
					j++;
				}
				
				if (!duplicated)
					i++;			
			}
			
			//System.out.println("B");
			
			Arrays.sort(userNums);
			
			String userNumsStr = numbersToString(userNums, idx++);
			//winNumsStr = Arrays.toString(userNums);
			
			//System.out.printf("%s, %s \n", winNumsStr, userNumsStr);
			
			// 당첨 여부 확인
			//   당첨번호 7개 vs 자동번호 6개
			boolean hasBonusNum = false;
			int winCount = 0;
			for (int userNumIdx = 0; userNumIdx < userNums.length; userNumIdx++) {
				for (int winNumIdx = 0; winNumIdx < winNums.length; winNumIdx++) {
					int userNum = userNums[userNumIdx];
					int winNum = winNums[winNumIdx];
					
					// 일치하는 당첨번호가 있을 때
					if (userNum == winNum) {
						// 해당 번호가 마지막 번호(보너스 번호)인 경우
						if (winNumIdx == 6) {
							hasBonusNum = true;
						}
						
						winCount++;
					}
				}
			}

			if (winCount == 6) {
				System.out.printf("%s, %s => ", winNumsStr, userNumsStr);
				System.out.printf("winCount: %d, hasBonusNum: %s \n",
						winCount, hasBonusNum);
				
				if (hasBonusNum) {
					System.out.println("2등입니다..");
				} else {
					System.out.println("1등입니다^^");
					
					break;
				}			
			}
		} // while (true) {
		
		System.out.println("프로그램을 종료합니다...");
	}

	static void runTutorCode2() {
		//----------------------------------------
		// 당첨 번호 생성
		//----------------------------------------
		
		int[] winNums = new int[7];
		int i = 0;
		while (i < winNums.length) {
			int num = (int)(Math.random() * 45 + 1);
			winNums[i] = num;
			
			// 중복 번호 제거
			int j = 0;
			boolean duplicated = false;
			while (j < i) {
				if (winNums[j++] == winNums[i]) {
					duplicated = true;
					
					break;
				}
			}
			
			if (!duplicated)
				i++;
		}
		
		// 보너스 번호를 가장 뒤에 두고 오름차순(ascending) 정렬
		winNums[6] += 100;
		Arrays.sort(winNums);
		winNums[6] -= 100;
		
		//System.out.printf("winNums: %s \n", Arrays.toString(winNums));
		
		int userNumsIdx = 0;
		
		while (true) {		
			//----------------------------------------
			// 사용자 번호 생성
			//----------------------------------------
	
			int[] userNums = new int[6];
			i = 0;
			while (i < userNums.length) {
				int num = (int)(Math.random() * 45 + 1);
				userNums[i] = num;
				
				// 중복 번호 제거
				int j = 0;
				boolean duplicated = false;
				while (j < i) {
					if (userNums[j++] == userNums[i]) {
						duplicated = true;
						
						break;
					}
				}
				
				if (!duplicated)
					i++;
			}
			
			// 오름차순(ascending) 정렬
			Arrays.sort(userNums);
			
			//System.out.printf("%s, [%08d] %s",
			//		Arrays.toString(winNums), userNumsIdx++, Arrays.toString(userNums));
			
			//----------------------------------------
			// 당첨 번호 확인
			//----------------------------------------
			
			int winCount = 0;
			boolean hasBonusNum = false;

			for (int winNumIdx = 0; winNumIdx < winNums.length; winNumIdx++) {
				for (int userNumIdx = 0; userNumIdx < userNums.length; userNumIdx++) {
					int winNum = winNums[winNumIdx];
					int userNum = userNums[userNumIdx];
					
					if (winNum == userNum) {
						winCount++;
						
						if (winNumIdx == 6)
							hasBonusNum = true;
							
						continue;
					}
				}
			}
			
			//----------------------------------------
			// 결과 확인
			//----------------------------------------
			
			if (winCount == 6) {
				System.out.printf("%s, [%08d] %s",
						Arrays.toString(winNums), userNumsIdx++, Arrays.toString(userNums));
				
				if (hasBonusNum) {
					System.out.printf(" => 2등입니다! \n");
				} else {
					System.out.printf(" => 1등입니다^^ \n");
					
					break; // while (true)
				}
			} else {
				//System.out.println();
				//System.out.printf(" %d, %s \n", winCount, hasBonusNum);
			}
			
			
		} // while (true) {
	}
}

/*
// runMyCode()
Winning Numbers => 04 12 20 25 29 45 + 42 
Generated Numbers (Count: 8145060) 
  [00017440] 04 12 20 29 42 45 => rank: 2 
  [00921017] 04 12 20 25 29 45 => rank: 1 
    921017번만에 1등 당첨^^ 
*/


/*
// runTutorCode2()
[10, 35, 36, 38, 39, 45, 27], [00000000] [27, 35, 36, 38, 39, 45] => 2등입니다! 
[10, 35, 36, 38, 39, 45, 27], [00000001] [10, 27, 35, 38, 39, 45] => 2등입니다! 
[10, 35, 36, 38, 39, 45, 27], [00000002] [10, 27, 35, 36, 39, 45] => 2등입니다! 
[10, 35, 36, 38, 39, 45, 27], [00000003] [10, 27, 35, 38, 39, 45] => 2등입니다! 
[10, 35, 36, 38, 39, 45, 27], [00000004] [10, 35, 36, 38, 39, 45] => 1등입니다^^ 
*/