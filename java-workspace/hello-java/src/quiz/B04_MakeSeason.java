package quiz;

import java.util.Scanner;

public class B04_MakeSeason {

	/*
	  사용자가 몇 월인지 입력하면 해당하는 계절이 무엇인지 출력해 보세요
	 	(switch-case 문으로 한번, if 문으로도 한번)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요>");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
			System.out.println("입력하신 계절은 겨울 입니다");
			break;
			
		case 2:
			System.out.println("입력하신 계절은 겨울 입니다");
			break;
		case 3:
			System.out.println("입력하신 계절은 봄 입니다");
			break;
		case 4:
			System.out.println("입력하신 계절은 봄 입니다");
			break;
		case 5:
			System.out.println("입력하신 계절은 봄 입니다");
			break;
		case 6:
			System.out.println("입력하신 계절은 여름 입니다");
			break;
		case 7:
			System.out.println("입력하신 계절은 여름 입니다");
			break;
		case 8:
			System.out.println("입력하신 계절은 여름 입니다");
			break;
		case 9:
			System.out.println("입력하신 계절은 가을 입니다");
			break;
		case 10:
			System.out.println("입력하신 계절은 가을 입니다");
			break;
		case 11:
			System.out.println("입력하신 계절은 가을 입니다");
			break;
		case 12:
			System.out.println("입력하신 계절은 겨울 입니다");
			break;
			
			default:
				System.out.println("잘못 입력하셨습니다");
				break;
		}
		
		System.out.print("(if문) 월을 입력하세요>");
		int month2 = sc.nextInt();
		if(month2>2 && month2<6) {
			System.out.println("입력하신 계절은 봄 입니다");
		}else if(month2>5 && month2<9) {
			System.out.println("입력하신 계절은 여름 입니다");
		}else if(month2>8 && month2<12) {
			System.out.println("입력하신 계절은 가을 입니다");
		}else if(month2<3 && month2 >0 || month2 ==12) {
			System.out.println("입력하신 계절은 겨울 입니다");
		}else {
			System.out.println("잘못 입력하셨습니다");
		}
		
	}
}
