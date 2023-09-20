
public class B08_Break {
	/*
		# break
		  - switch-case문 내에서 사용해 해당 case를 탈출한다
		  - 반복문 내부에서 사용하면 반복문을 하나 탈출한다
		  - if문 내부에서 사용한다고 해서 if문을 탈출하지는 않는다
		  
		# continue
		  - 반복문 내부에서 만나면 다음번 반복으로 넘어간다
	*/

	public static void main(String[] args) {
		System.out.println("----------------------------------------");
		
		// ex1
		for (int i = 0; i < 100; i++) {
			System.out.println("hello" + i + "!");
			
			if (i == 2)
				break;
		}

		System.out.println("----------------------------------------");

		// ex2
		String str = "코즐로프 장관은 “두만강을 건너는 다리. " + 
				"북한 지도자를 만났다. 김정은이 공식 방문으로 " + 
				"러시아에 도착했다”고 밝혔다. ";
		
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			//System.out.printf("%d번째 문자는 '%c'입니다. \n", index, ch);
			System.out.print(ch);
			if (ch == '.')
				break;
		}
		
		System.out.println();
		
		System.out.println("----------------------------------------");
		
		// continue ex1
		/*
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			System.out.print(ch);
			
			if (ch == '.') {
				System.out.println();
			}
		}
		*/
		
		for (int i = 0; i < 10; i++) {
			// 짝수
			if (i % 2 == 0)
				continue;
			
			System.out.println(i);
		}
	}
}

/*
----------------------------------------
hello0!
hello1!
hello2!
----------------------------------------
코즐로프 장관은 “두만강을 건너는 다리.
----------------------------------------
1
3
5
7
9
*/