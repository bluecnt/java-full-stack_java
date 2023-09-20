
public class B09_InnerLoop {
	public static void main(String[] args) {
		// 반복문 내부에 반복문 사용하기
		for (int i = 0; i < 2; i++) {
			System.out.printf("======== 바깥쪽 반복문 {%d} \n", i);
			
			for (int j = 0; j < 2; j++) {
				System.out.printf("  ------ 안쪽 반복문 [%d-%d] \n", i, j);
				
				for (int k = 0; k < 2; k++) {
					System.out.printf("    ~~~~ 가장 안쪽 반복문 <%d-%d-%d> \n", i, j, k);
				}
			}
		}
		
		System.out.println();
		
		/*
			# 다중 반복문으로 구구단 출력해보기
			  - 구구단은 2단부터 9단까지 있다
			  - 각 단마다 x1부터 x9까지 있다
		*/
		for (int dan = 2; dan <= 9; dan++) {
			System.out.printf("======== %d단 ======== \n", dan);
			
			for (int gop = 1; gop <= 9; gop++) {
				System.out.printf("%d x %d = %2d \n", dan, gop, dan * gop);
			}
		}
	}
}

/*
======== 바깥쪽 반복문 {0} 
------ 안쪽 반복문 [0-0] 
  ~~~~ 가장 안쪽 반복문 <0-0-0> 
  ~~~~ 가장 안쪽 반복문 <0-0-1> 
------ 안쪽 반복문 [0-1] 
  ~~~~ 가장 안쪽 반복문 <0-1-0> 
  ~~~~ 가장 안쪽 반복문 <0-1-1> 
======== 바깥쪽 반복문 {1} 
------ 안쪽 반복문 [1-0] 
  ~~~~ 가장 안쪽 반복문 <1-0-0> 
  ~~~~ 가장 안쪽 반복문 <1-0-1> 
------ 안쪽 반복문 [1-1] 
  ~~~~ 가장 안쪽 반복문 <1-1-0> 
  ~~~~ 가장 안쪽 반복문 <1-1-1> 

======== 2단 ======== 
2 x 1 =  2 
2 x 2 =  4 
2 x 3 =  6 
2 x 4 =  8 
2 x 5 = 10 
2 x 6 = 12 
2 x 7 = 14 
2 x 8 = 16 
2 x 9 = 18 
...
*/