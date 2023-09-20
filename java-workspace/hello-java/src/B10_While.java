
public class B10_While {
	/*
		# while
		  - for 문과 사용법이 약간 다른 반복문
		  - 초깃값과 증감값의 위치가 정해져 있지 않아 for 문보다 자유로움
		  - () 안의 내용이 true라면 {} 안의 내용을 계속 반복한다
		  - 증감값의 위치에 따라 결과가 달라지는 것에 주의해야 한다
	*/
	public static void main(String[] args) {
		int i = 0;
		
		// i -> 1 ~ 4
		while (i < 4) {
			i++;
			System.out.println("hi! " + i);
		}
		
		System.out.println("----------------------------------------");
		
		i = 0;
		// i -> 0 ~ 3
		while (i < 4) {
			System.out.println(i++);
		}

		System.out.println("----------------------------------------");
		
		i = 0;
		// i -> 1 ~ 4
		// i++ : 값 비교 후 증가를 하므로 4까지 출력됨
		while (i++ < 4) {
			System.out.println(i);
		}

		System.out.println("----------------------------------------");
		
		i = 0;
		// i -> 1 ~ 3
		// ++i : i값 먼저 증가 후 값 비교를 하므로 3까지만 출력됨
		while (++i < 4) {
			System.out.println(i);
		}
		
		System.out.println("----------------------------------------");
		
		// while 문으로 문자열 탐색해보기
		String str = "Microsoft Windows NT 4.0";
		int len = str.length();
		int idx = 0;
		
		while (idx < len) {
			char ch = str.charAt(idx++);
			System.out.printf("[%02d] %c \n", idx, ch);
		}
	}
}

/*
hi! 1
hi! 2
hi! 3
hi! 4
----------------------------------------
0
1
2
3
----------------------------------------
1
2
3
4
----------------------------------------
1
2
3
----------------------------------------
[01] M 
[02] i 
[03] c 
[04] r 
[05] o 
[06] s 
[07] o 
[08] f 
[09] t 
[10]   
[11] W 
[12] i 
[13] n 
[14] d 
[15] o 
[16] w 
[17] s 
[18]   
[19] N 
[20] T 
[21]   
[22] 4 
[23] . 
[24] 0 
*/