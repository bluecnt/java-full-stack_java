package quiz;

public class B14_Count369 {
	final static boolean PRINT_DBG_MSG = true;
	
	/*
		100~500 사이의 랜덤 양의 정수를 하나 생성하고
		해당 숫자까지 369를 진행한다면 박수를 총 몇 번 쳐야하는가?
	*/
	public static void main(String[] args) {
		runMyCode();
		//runTutorCode();
	}
	
	static int getRandomNumber(int min, int max) {
		return (int)((Math.random() * (max - min + 1)) + min);
	}
	
	static void runMyCode() {
		int num = 100;//getRandomNumber(100, 500);
		int cnt = 0;
		int cntDetail = 0;
		
		if (PRINT_DBG_MSG) {
			System.out.print("369 => ");
		}
		
		for (int i = 1, j = 0; i <= num; i++ ) {
			int d1 = i % 10;
			int d2 = (i % 100) / 10;
			int d3 = (i % 1000) / 100;
			
			boolean isD1_369 = d1 == 3 || d1 == 6 || d1 == 9;
			boolean isD2_369 = d2 == 3 || d2 == 6 || d2 == 9;
			boolean isD3_369 = d3 == 3 || d3 == 6 || d3 == 9;

			if (isD1_369 || isD2_369 || isD3_369) {			
				cnt++;
				
				if (PRINT_DBG_MSG) {
					System.out.printf("%3d ", i);
				
					if (++j % 10 == 0)
						System.out.printf("\n.......");
				}				
			}
			
			cntDetail += (isD1_369 ? 1 : 0) + (isD2_369 ? 1 : 0) + (isD3_369 ? 1 : 0);
		}
		
		System.out.println();
		
		System.out.printf("숫자: %d, 횟수: %d, 횟수(디테일): %d \n", num, cnt, cntDetail);
	}

	static void runTutorCode() {
		int num = 100;//(int)(Math.random() * 401 + 100);
		int clapCnt = 0;
		
		for (int i = 1; i <= num; i++) {
			System.out.print(i + ": ");
			
			// (1) 숫자를 문자로 바꿔서 센다
			if (!true) {
				String numStr = i + "";
				
				for (int j = 0; j < numStr.length(); j++) {
					char ch = numStr.charAt(j);
					if (ch == '3' || ch == '6' || ch == '9') {
						System.out.print("짝 ");
						
						//clapCnt++;
					}
				}
			}
			
			// (2) 숫자를 한 자리씩 검사하며 3,6,9인지 센다
			if (true) {
				int chkNum = i;
				// 이번에 검사할 숫자를 10씩 나무면서 일의 자리만 검사하기
				while (chkNum > 0) {
					// 한 자리 분리
					int digit = chkNum % 10;
					if (digit != 0 && digit % 3 == 0)
						clapCnt++;						
					
					chkNum /= 10;
				}
			}
			
			System.out.printf("\t\t누적 %d회", clapCnt);
			System.out.println();
		}		
	}
}

/*
369 =>   3   6   9  13  16  19  23  26  29  30 
....... 31  32  33  34  35  36  37  38  39  43 
....... 46  49  53  56  59  60  61  62  63  64 
....... 65  66  67  68  69  73  76  79  83  86 
....... 89  90  91  92  93  94  95  96  97  98 
....... 99 
숫자: 100, 횟수: 51, 횟수(디테일): 60 
*/

/*
?
*/