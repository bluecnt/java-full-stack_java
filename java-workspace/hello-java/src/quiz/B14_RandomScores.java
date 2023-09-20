package quiz;

import java.util.Arrays;

public class B14_RandomScores {
	/*
		1. 100개의 랜덤 점수를 생성한다 (0 ~ 20,000)
		2. 해당 점수들을 한 줄에 5개씩 보기 좋게 출력한다
		3. 모든 점수들의 평균을 출력한다 (소스 셋째 자리에서 반올림)
		4. 가장 높은 점수와 가장 낮은 점수를 찾아
		  그 점수가 몇 번째 사람인지를 출력한다
		  (중복인 경우 모두 출력한다)
	*/
	
	public static void main(String[] args) {
		//runMyCode();
		runTutorCode();
	}
	
	//----------------------------------------------------------------------
	
	static int getRandomNumber(int min, int max) {
		return (int)((Math.random() * (max - min + 1)) + min);
	}
	
	static void runMyCode() {
		final int SCORE_COUNT = 20;
		
		// 1. 100개의 랜덤 점수. 0 ~ 20,000점 
		int[] scores = new int[SCORE_COUNT];
		//int[] scores = { 1, 2, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9, 10 };
		for (int i = 0; i < scores.length; i++) {
			scores[i] = getRandomNumber(0, 20000);
		}
		
		// 2. 한 줄에 5개씩 출력
		System.out.print("Scores: ");
		for (int i = 0; i < scores.length; i++) {
			int score = scores[i];
			System.out.printf("%5d ", score);
			
			//if (++j % 5 == 0) {
			if (i % 5 == 4) {
				System.out.printf("\n        ");
			}
			
		}
		System.out.println();
		
		if (true) {
			int[] sortedScores = Arrays.copyOf(scores, scores.length);
			Arrays.sort(sortedScores);
			
			System.out.print("Sorted: ");
			for (int i = 0; i < sortedScores.length; i++) {
				int score = sortedScores[i];
				System.out.printf("%5d ", score);
				
				//if (++j % 5 == 0) {
				if (i % 5 == 4) {
					System.out.printf("\n        ");
				}
				
			}
			System.out.println();
		}
		
		// 3. 평균 출력
		int sum = 0;
		double avg = 0.0;
		for (int i = 0; i < scores.length; i++) {
			int score = scores[i];
			sum += score;
		}
		avg = sum /(double)scores.length;
		System.out.printf("avg: %.2f \n", avg);
		
		// 4. min, max and its indices
		//   중복인 경우 모두 출력
		int min = scores[0];
		int max = scores[0];
		int minIdx = 0;
		int maxIdx = 0;
		
		for (int i = 0; i < scores.length; i++) {
			int score = scores[i];
			
			if (score < min) {
				min = score;
				minIdx = i;
			}
			
			if (score > max) {
				max = score;
				maxIdx = i;
			}
		}
		
		System.out.printf("min: %d (index: %d), max: %d (index: %d) \n",
				min, minIdx + 1, max, maxIdx + 1);
	}
	
	//----------------------------------------------------------------------
	
	static void runTutorCode() {
		final int SCORE_COUNT = 20;
		
		// 300개의 정수를 담을 수 있는 배열을 생성한다
		int[] scores = new int[SCORE_COUNT];
		//int[] scores = { 1, 1, 2, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9, 10 };
		
		// 0 ~ 299번 방까지 숫자를 랜덤으로 채운다
		for (int i = 0; i < scores.length; i++) {
			scores[i] = (int)(Math.random() * 20001);
		}
		
		// 출력하면서 총합 구하기
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
			
			System.out.print(scores[i] + "\t");
			if (i % 5 == 4) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		System.out.println("----------------------------------------");
		System.out.println("총합: " + sum);
		System.out.printf("평균: %.2f점 \n", sum / (double)scores.length);
		
		// 제일 높은 점수와 제일 낮은 점수를 구한다
		// -> 처음부터 끝까지 하나씩 비교하며 구한다
		// ※ 첫 번째 배열 값으로 초기화하고 두 번째 점수부터 하나씩 비교한다
		int bestScore = scores[0];
		int worstScore = scores[0];
		
		for (int i = 1; i < scores.length; i++) {
			// 현재 최고 점수보다 i번째 점수가 더 크다면 그 점수를 최고 점수로 바꾼다
			if (scores[i] > bestScore) {
				bestScore = scores[i];
			}

			// 현재 최저 점수보다 i번째 점수가 더 작다면 그 점수를 최저 점수로 바꾼다
			if (scores[i] < worstScore) {
				worstScore = scores[i];
			}
		}
		
		System.out.println("최고 점수: " + bestScore);
		// 최고 점수인 사람들을 모두 출력한다
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == bestScore) {
				System.out.printf("  %d 번째 참가자[%d점] \n", i, scores[i]);
			}
		}
		
		System.out.println("최저 점수: " + worstScore);
		// 최저 점수인 사람들을 모두 출력한다
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == worstScore) {
				System.out.printf("  %d 번째 참가자[%d점] \n", i, scores[i]);
			}
		}
	}
}

/*
Scores:  1065  2009  2777  5374  5199 
19324  9192 18214  8692  8764 
10973 10150 11370  2397 15830 
19100 14217  3643 14859  9207 

Sorted:  1065  2009  2397  2777  3643 
 5199  5374  8692  8764  9192 
 9207 10150 10973 11370 14217 
14859 15830 18214 19100 19324 

avg: 9617.80 
min: 1065 (index: 1), max: 19324 (index: 6) 
*/

/*
9734	16637	6068	3449	3569	
6975	8071	8963	2407	8312	
15193	6382	11710	11399	17539	
10631	17259	3205	12222	7661	

----------------------------------------
총합: 187386
평균: 9369.30점 
최고 점수: 17539
  14 번째 참가자[17539점] 
최저 점수: 2407
  8 번째 참가자[2407점] 
*/