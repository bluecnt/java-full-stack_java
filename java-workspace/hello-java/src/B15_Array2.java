import java.util.Arrays;

public class B15_Array2 {
	/*
		배열 안의 요소로 배열을 넣을 수 있다
	*/
	
	public static void main(String[] args) {
		System.out.println("----------------------------------------");

		int[] arr1 = new int[5];
		int[] arr2 = new int[] { 40, 60, 80, 100, 120 };
		int[] arr3 = { 1, 3, 5, 7, 9, 11, 13, 15, 17 };
		
		// 2차원 배열
		int[][] arr4 = {
				arr1,
				arr2,
				arr3,
				{ 9, 9, 7, 9 },
				new int[] { 44, 55, 66, 11, 33, 22 }
		};
		
		// arr1
		System.out.println(Arrays.toString(arr4[0]));
		// 100
		System.out.println(arr4[1][3]);
		// 3
		System.out.println(arr4[2][1]);
		
		System.out.println("----------------------------------------");
		
		// 배열의 신기한점
		// => 얊은 복사(shallow copy)
		char[] name1 = { '김', '철', '수' };
		char[] name2 = name1;
		char[] name3 = name1;
		
		name3[1] = '영';
		name3[2] = '희';
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);

		System.out.println("----------------------------------------");
		
		char[][] fruites = new char[][] {
			{ 'a', 'p', 'p', 'l', 'e' },
			{ 'o', 'r', 'a', 'n', 'g', 'e' },
			{ 'p', 'i', 'n', 'e', 'a', 'p', 'p', 'l', 'e' },
			{ 'g', 'r', 'a', 'p', 'e' }
		};
		
		for (int i = 0; i < fruites.length; i++) {
			for (int j = 0; j < fruites[i].length; j++) {
				System.out.printf("fruites[%d][%d]: %c \n",
						i, j, fruites[i][j]);
			}
			
			System.out.println("--------------------");
		}
		
	}
}

/*
----------------------------------------
[0, 0, 0, 0, 0]
100
3
----------------------------------------
김영희
김영희
김영희
----------------------------------------
fruites[0][0]: a 
fruites[0][1]: p 
fruites[0][2]: p 
fruites[0][3]: l 
fruites[0][4]: e 
--------------------
fruites[1][0]: o 
fruites[1][1]: r 
fruites[1][2]: a 
fruites[1][3]: n 
fruites[1][4]: g 
fruites[1][5]: e 
--------------------
fruites[2][0]: p 
fruites[2][1]: i 
fruites[2][2]: n 
fruites[2][3]: e 
fruites[2][4]: a 
fruites[2][5]: p 
fruites[2][6]: p 
fruites[2][7]: l 
fruites[2][8]: e 
--------------------
fruites[3][0]: g 
fruites[3][1]: r 
fruites[3][2]: a 
fruites[3][3]: p 
fruites[3][4]: e 
--------------------
*/