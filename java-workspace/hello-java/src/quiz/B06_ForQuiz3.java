package quiz;

public class B06_ForQuiz3 {
	/*
		# for 문을 사용해 숫자를 다음과 같이 출력하시오
		
		1. 0 3 6 9 12 ... 93 96 99
		2. -35 -28 -21 ... 0 7 14 ... 35
		3. 100 200 300 ... 800 900 1000
		4. 100 99 98 ... 5 4 3 2 1
		5. 0 1 2 3 ... 6 7 8 9 0 1 2 3 ... 7 8 9 ... (30번)
		6. 10 9 8 7 .. 3 2 1 9 8 ... 3 2 1 10 9 ... (30번)
		7. 7 77 777 7777 7777 ... 7777777777
	*/
	
	public static void main(String[] args) {
		//-----------------------------------------------------------
		
		System.out.printf("1. ");
		for (int i = 0, j = 0; i < 100; i += 3) { 
			System.out.printf("%2d ", i);
			
			if (++j % 10 == 0)
				System.out.printf("\n   "); 
		}
		System.out.println();
		System.out.println();
		
		//-----------------------------------------------------------
		
		System.out.printf("2. ");
		
		for (int i = -35, j = 0; i <= 35; i += 7) {
			System.out.printf("%3d ", i);
			
			if (++j % 10 == 0)
				System.out.printf("\n   "); 
		}
		System.out.println();
		System.out.println();
		
		//-----------------------------------------------------------
		
		System.out.printf("3. ");
		for (int i = 100; i <= 1000; i += 100) {
			System.out.printf("%4d ", i);
		}
		System.out.println();
		System.out.println();
		
		//-----------------------------------------------------------
		
		System.out.printf("4. ");
		for (int i = 100, j = 0; i >= 0; i--) { 
			System.out.printf("%3d ", i);
			
			if (++j % 10 == 0)
				System.out.printf("\n   "); 
		}
		System.out.println();
		System.out.println();

		//-----------------------------------------------------------
		
		System.out.printf("5. ");
		/*
		for (int i = 0; i < 30; i++) {
			System.out.printf("[%02d] ", i);
			
			for (int j = 0; j < 10; j++) { 
				System.out.printf("%2d ", j);
			}
			System.out.printf("\n   ");
		}
		*/
		for (int i = 0; i < 30; i++) {
			System.out.printf("%d ", i % 10);
			if ((i+1) % 10 == 0)
				System.out.printf("\n   ");
		}
		System.out.println();
		System.out.println();

		//-----------------------------------------------------------
		
		System.out.printf("6. ");
		/*
		for (int i = 0; i < 30; i++) {
			System.out.printf("[%02d] ", i);
			
			for (int j = 10; j > 0; j--) { 
				System.out.printf("%2d ", j);
			}
			System.out.printf("\n   ");
		}
		*/
		for (int i = 0; i < 30; i++) {
			System.out.printf("%d ", 10 - (i % 10));
			if ((i+1) % 10 == 0)
				System.out.printf("\n   ");
		}
		System.out.println();

		//-----------------------------------------------------------
		
		System.out.printf("7. ");
		/*
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.printf("7");
			}
			System.out.print(" ");
		}
		*/
		long num = 7;
		for (int i = 0; i < 10; i++) {
			System.out.printf("%10d \n   ", num);
			num = num * 10 + 7;
		}
		System.out.println();
	}
}

/*
1.  0  3  6  9 12 15 18 21 24 27 
30 33 36 39 42 45 48 51 54 57 
60 63 66 69 72 75 78 81 84 87 
90 93 96 99 

2. -35 -28 -21 -14  -7   0   7  14  21  28 
 35 

3.  100  200  300  400  500  600  700  800  900 1000 

4. 100  99  98  97  96  95  94  93  92  91 
 90  89  88  87  86  85  84  83  82  81 
 80  79  78  77  76  75  74  73  72  71 
 70  69  68  67  66  65  64  63  62  61 
 60  59  58  57  56  55  54  53  52  51 
 50  49  48  47  46  45  44  43  42  41 
 40  39  38  37  36  35  34  33  32  31 
 30  29  28  27  26  25  24  23  22  21 
 20  19  18  17  16  15  14  13  12  11 
 10   9   8   7   6   5   4   3   2   1 
  0 

5. 0 1 2 3 4 5 6 7 8 9 
0 1 2 3 4 5 6 7 8 9 
0 1 2 3 4 5 6 7 8 9 


6. 10 9 8 7 6 5 4 3 2 1 
10 9 8 7 6 5 4 3 2 1 
10 9 8 7 6 5 4 3 2 1 

7.          7 
           77 
          777 
         7777 
        77777 
       777777 
      7777777 
     77777777 
    777777777 
   7777777777 
*/