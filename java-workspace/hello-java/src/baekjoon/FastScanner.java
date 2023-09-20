package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FastScanner {
	public static void main(String[] args) {
		BufferedReader in =
				new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("입력 해보세요 >> ");
			String line = in.readLine();
			
			System.out.println("입력된 문자열 => " + line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
