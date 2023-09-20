package quiz;

public class A03_PersonalInfo {
	public static void main(String[] args) {
		String name = "홍길동";
		int age = 20;
		String tel = "010-1234-1234";
		float height = 178.5f;
		float weight = 75.0f;
		String bloodType = "O"; // A, B, O, AB
		
		System.out.println("========= 출력 결과 =========");
		System.out.println("이름\t: " + name);
		System.out.println("나이\t: " + age);
		System.out.println("Tel\t: " + tel);
		System.out.println("키\t: " + height);
		System.out.println("몸무게\t: " + weight);
		System.out.println("혈액형\t: " + bloodType);
	}
}

/*
========= 출력 결과 =========
이름	: 홍길동
나이	: 20
Tel	: 010-1234-1234
키	: 178.5
몸무게	: 75.0
혈액형	: O
*/