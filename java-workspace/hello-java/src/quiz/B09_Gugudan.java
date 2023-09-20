package quiz;

public class B09_Gugudan {
	/*
		1. 구구단을 다음과 같이 가로로 출력하시오
		  2단: 2x1=2, ...
		  3단: 3x1=3, ...
		  ...
		  
		 2. 구구단을 다음과 같이 세로로 출력하시오
		   2단     3단    ...
		   2x1=2  3x1=3
		   2x2=4  3x2=6
		   ...    ...
	*/
	
	public static void main(String[] args) {
		System.out.println("<1>========================================");
		
		for (int step = 2; step <= 9; step++) {
			System.out.printf("%d단: ", step);
			
			for (int multiple = 1; multiple <= 9; multiple++) {
				int result = step * multiple;				
				System.out.printf("%dx%d=%2d ", step, multiple, result);
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("<2>========================================");
		
		for (int step = 2; step <= 9; step++) {
			System.out.printf("%d단\t", step);
		}
		System.out.println();

		for (int multiple = 1; multiple <= 9; multiple++) {
			for (int step = 2; step <= 9; step++) {
				int result = step * multiple;				
				System.out.printf("%dx%d=%2d\t", step, multiple, result);
			}
			System.out.println();
		}	
		
		System.out.println();
	}
}

/*
<1>========================================
2단: 2x1= 2 2x2= 4 2x3= 6 2x4= 8 2x5=10 2x6=12 2x7=14 2x8=16 2x9=18 
3단: 3x1= 3 3x2= 6 3x3= 9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 
4단: 4x1= 4 4x2= 8 4x3=12 4x4=16 4x5=20 4x6=24 4x7=28 4x8=32 4x9=36 
5단: 5x1= 5 5x2=10 5x3=15 5x4=20 5x5=25 5x6=30 5x7=35 5x8=40 5x9=45 
6단: 6x1= 6 6x2=12 6x3=18 6x4=24 6x5=30 6x6=36 6x7=42 6x8=48 6x9=54 
7단: 7x1= 7 7x2=14 7x3=21 7x4=28 7x5=35 7x6=42 7x7=49 7x8=56 7x9=63 
8단: 8x1= 8 8x2=16 8x3=24 8x4=32 8x5=40 8x6=48 8x7=56 8x8=64 8x9=72 
9단: 9x1= 9 9x2=18 9x3=27 9x4=36 9x5=45 9x6=54 9x7=63 9x8=72 9x9=81 

<2>========================================
2단	3단	4단	5단	6단	7단	8단	9단	
2x1= 2	3x1= 3	4x1= 4	5x1= 5	6x1= 6	7x1= 7	8x1= 8	9x1= 9	
2x2= 4	3x2= 6	4x2= 8	5x2=10	6x2=12	7x2=14	8x2=16	9x2=18	
2x3= 6	3x3= 9	4x3=12	5x3=15	6x3=18	7x3=21	8x3=24	9x3=27	
2x4= 8	3x4=12	4x4=16	5x4=20	6x4=24	7x4=28	8x4=32	9x4=36	
2x5=10	3x5=15	4x5=20	5x5=25	6x5=30	7x5=35	8x5=40	9x5=45	
2x6=12	3x6=18	4x6=24	5x6=30	6x6=36	7x6=42	8x6=48	9x6=54	
2x7=14	3x7=21	4x7=28	5x7=35	6x7=42	7x7=49	8x7=56	9x7=63	
2x8=16	3x8=24	4x8=32	5x8=40	6x8=48	7x8=56	8x8=64	9x8=72	
2x9=18	3x9=27	4x9=36	5x9=45	6x9=54	7x9=63	8x9=72	9x9=81	
*/