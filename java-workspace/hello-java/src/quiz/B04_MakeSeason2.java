package quiz;

import java.util.Scanner;

public class B04_MakeSeason2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("월을 입력하세요>");
		int month = sc.nextInt();

		switch (month) {
		
		case 12:
		case 1:
		case 2: //case 12, 1, 2:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5://case 3, 4, 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8://case 6, 7, 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11://case 9, 10, 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("그런 달은 없습니다");
			break;

		}
		
		if(month <1 || month >12) {
			System.out.println("그런 달은 없습니다");
		}else if (month <=2 || month >=11) {
			System.out.println("겨울입니다");
		}else if (month >= 9) {
			System.out.println("가을입니다");
		}else if (month >=6 ) {
			System.out.println("여름입니다 ");
		}else {
			System.out.println("봄입니다 ");
		}
	}
}
