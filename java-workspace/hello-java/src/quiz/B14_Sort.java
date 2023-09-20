package quiz;

import java.util.Arrays;

public class B14_Sort {
	/*
		-100 ~ 100 사이의 랜덤 정수 값이 10개 들어있는 배열을 생성 후
		(1) 해당 배열의 내용을 작은 값부터 차례대로 저장한 새로운 배열을 생성하여 출력
		  (오름차순, ascending)
		(2) 해당 배열의 내용을 큰 값부터 차례대로 저장한 새로운 배열을 생성하여 출력
		  (내림차순, descending)
	*/
	public static void main(String[] args) {
		runMyCode();
		//runTutorCode();
	}
	
	//----------------------------------------------------------------------
	
	static int getRandomNumber(int min, int max) {
		return (int)((Math.random() * (max - min + 1)) + min);
	}

	static void swapValues(Integer[] arr, int idx1, int idx2) {
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}
	
	static void bubbleSort(Integer[] arr, boolean ascending){
	    for (int i = 0; i < arr.length - 1; i++){
	        for(int j = 1; j < arr.length; j++) {
	        	// 오름차순(ascending) 정렬
	        	if (ascending) {
	        		if (arr[j-1] > arr[j])
	        			swapValues(arr, j-1, j);
	        	}
	        	// 내림차순(descending) 정렬
	        	else {
	        		if (arr[j-1] < arr[j])
	        			swapValues(arr, j-1, j);
	        	}
	        }
	    }
	}
	
	static void printNums(Integer[] nums, String title) {
		System.out.printf("%s", title);
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			System.out.printf("%4d ", num);
			
			if (i % 10 == 9)
				System.out.printf("\n" + "    ");
		}
		System.out.println();
	}
	
	static void runMyCode() {
		Integer[] nums = new Integer[20];
		Integer[] newNumsAsc = new Integer[nums.length];
		Integer[] newNumsDesc = new Integer[nums.length];
		
		// 랜덥값 20개 생성
		for (int i = 0; i < nums.length; i++) {
			nums[i] = getRandomNumber(-100, 100);
		}
		
		// 오름차순(Ascending) 정렬
		newNumsAsc = Arrays.copyOf(nums, nums.length);
		//Arrays.sort(newNumsAsc);
		bubbleSort(newNumsAsc, true);
		
		// 내림차순(Descending) 정렬
		newNumsDesc = Arrays.copyOf(nums, nums.length);
		//Arrays.sort(newNumsDesc, (a, b) -> b - a); 
		bubbleSort(newNumsDesc, false);
		
		System.out.println("Sorting");
		
		// 정렬 전 번호 출력
		printNums(nums, "  - nums: \n    ");
				
		// 오름차순(Ascending) 번호 출력
		printNums(newNumsAsc, "  - newNumsAsc: \n    ");
		
		// 내림차순(Descending) 번호 출력
		printNums(newNumsDesc, "  - newNumsDesc: \n    ");
	}
	
	//----------------------------------------------------------------------
	
	static void runTutorCode() {
		int[] arr = new int[20];
		//int[] arr = { 4, 2, 1, 4 };
		
		for (int i = 0; i < arr.length; i++) {
			// -100 ~ 100 범위의 랜덤값 생성
			arr[i] = (int)(Math.random() * 201 - 100);
		}
		
		System.out.println("- 원본 -");
		System.out.println(Arrays.toString(arr));			
		
		//======================================================================
		// [내림차순]
		//======================================================================
		
		int step = 0;
		
		while (step < arr.length) {		
			// 가상 큰 것을 골라서 맨 앞에 놓는다
			// 0단계: 가장 큰 숫자를 골라서 0번 위치에 놓는다
			// 1단계: 0번 위치에 이미 가장 큰 숫자가 있으므로 1번부터 비교할 수 있다
			int biggestIdx = step;
			for (int i = step + 1; i < arr.length; i++) {
				// 내림차순(Descending)
				if (arr[biggestIdx] < arr[i]) {
					biggestIdx = i;
				}
			}
			
			int tmp = arr[step];
			arr[step] = arr[biggestIdx];
			arr[biggestIdx] = tmp;
			
			//System.out.printf("%d 단계 정렬 후 <\n", step);
			//System.out.println(Arrays.toString(arr));
			
			step++;
		}
		
		System.out.println("- 정렬 후 (내림차순) -");
		System.out.println(Arrays.toString(arr));			
		
		//======================================================================
		// [오름차순 1]
		//======================================================================
		
		step = 0;
		
		while (step < arr.length) {		
			int smallestIdx = step;
			
			for (int i = step + 1; i < arr.length; i++) {
				// 오름차순(Ascending)
				// => 가장 작은 숫자를 맨 앞에 놓는다
				if (arr[smallestIdx] > arr[i]) {
					smallestIdx = i;
				}
			}
			
			int tmp = arr[step];
			arr[step] = arr[smallestIdx];
			arr[smallestIdx] = tmp;
			
			step++;
		}
		
		System.out.println("- 정렬 후 (오름차순 1) -");
		System.out.println(Arrays.toString(arr));			
		
		//======================================================================
		// [오름차순 2]
		//======================================================================

		// => 가장 큰 숫자를 골라 맨 뒤에서부터 채우기

		step = 0;
		
		while (step < arr.length) {		
			int biggestIdx = arr.length - step - 1;
			
			for (int i = 0; i < arr.length - step - 1; i++) {
				// 오름차순(Ascending)
				if (arr[biggestIdx] < arr[i]) {
					biggestIdx = i;
				}
			}
			
			int tmp = arr[arr.length - 1 - step];
			arr[arr.length - 1 - step] = arr[biggestIdx];
			arr[biggestIdx] = tmp;
			
			step++;
		}
		
		System.out.println("- 정렬 후 (오름차순 2) -");
		System.out.println(Arrays.toString(arr));			
	}
}

/*
// runMyCode()
Sorting
- nums: 
     6  -11   12   35  -25    9  -83  -71   26   52 
   -16   20  -90   55  -38  -62   82    7  -19  -15 
  
- newNumsAsc: 
   -90  -83  -71  -62  -38  -25  -19  -16  -15  -11 
     6    7    9   12   20   26   35   52   55   82 
  
- newNumsDesc: 
    82   55   52   35   26   20   12    9    7    6 
   -11  -15  -16  -19  -25  -38  -62  -71  -83  -90 
*/

/*
// runTutorCode()
- 원본 -
[35, 26, 0, 86, -38, -31, -77, -90, 27, 77, 33, -95, 0, 4, -34, 0, -41, 79, -32, -22]
- 정렬 후 (내림차순) -
[86, 79, 77, 35, 33, 27, 26, 4, 0, 0, 0, -22, -31, -32, -34, -38, -41, -77, -90, -95]
- 정렬 후 (오름차순 1) -
[-95, -90, -77, -41, -38, -34, -32, -31, -22, 0, 0, 0, 4, 26, 27, 33, 35, 77, 79, 86]
- 정렬 후 (오름차순 2) -
[-95, -90, -77, -41, -38, -34, -32, -31, -22, 0, 0, 0, 4, 26, 27, 33, 35, 77, 79, 86]
*/