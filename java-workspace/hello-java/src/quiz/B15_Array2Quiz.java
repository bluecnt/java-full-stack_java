package quiz;

public class B15_Array2Quiz {
	public static void main(String[] args) {
		runMyCode();
		//runTutorCode();
	}
	
	//------------------------------------------------------------

	static int getRandomNumber(int min, int max) {
		return (int)((Math.random() * (max - min + 1)) + min);
	}

	static void runMyCode() {
		int[][] myArr = {
				{ 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1 },
				{ 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 2 },
		};
		
		// 1. myArr의 모든 값을 1 ~ 500 사이의 랜덤 값으로 바꾸기
		// 2. 랜덤으로 바뀐 모든 값의 총합과 평균을 구하기
		// 3. myArr의 각 행(row)의 합을 구해서 출력하기
		// 4. myArr의 각 열(column)의 합을 구해서 출력하기

		int sum = 0;
		int cnt = 0;
		double avg = 0;
		int maxColWidth = 0;

		for (int r = 0; r < myArr.length; r++) {
			maxColWidth = myArr[r].length > maxColWidth ?
					myArr[r].length : maxColWidth;
			
			for (int c = 0; c < myArr[r].length; c++, cnt++) {
				sum += myArr[r][c];// = getRandomNumber(1, 500);			
			}
		}
		
		avg = sum / (double)cnt;

		// 행의 합 계산
		int[] rowSums = new int[myArr.length];
		for (int r = 0; r < rowSums.length; r++ ) {
			// 해당 행의 모든 열을 더함
			for (int c = 0; c < myArr[r].length; c++) {
				rowSums[r] += myArr[r][c];
			}
		}
		
		// 열의 합 계산
		int[] colSums = new int[maxColWidth];
		for (int r = 0; r < myArr.length; r++) {
			// 해당 행의 특정 컬럼 값을 모두 더함
			for (int c = 0; c < myArr[r].length; c++) {
				colSums[c] += myArr[r][c];
			}
		}
		
		// 배열 값 출력
		System.out.println("myArr:");
		for (int r = 0; r < myArr.length; r++) {
			System.out.print("  ");
			
			for (int c = 0; c < myArr[r].length; c++) {
				System.out.printf("%3d ", myArr[r][c]);
			}
			
			System.out.println();
		}
		System.out.println();
		
		// 총합과 평균 출력
		System.out.printf("sum: %d, avg: %.2f \n", sum, avg);
		
		// 행의 합 출력
		System.out.println("Sum of row:");
		for (int r = 0; r < rowSums.length; r++) {
			System.out.printf("  [%d] %4d \n", r, rowSums[r]);
		}
		System.out.println();
		
		// 열의 합 출력	
		System.out.println("Sum of column:");
		for (int c = 0; c < colSums.length; c++) {
			System.out.printf("%4d ", colSums[c]);
		}
		System.out.println();
	}
	
	//------------------------------------------------------------

	static void runTutorCode() {
		//
	}
}
