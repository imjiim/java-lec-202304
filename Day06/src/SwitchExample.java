import java.util.Scanner;


public class SwitchExample {
 
	public static void main (String[] args) {
	
		//1-7
		//1 월 2화 3 수 4 목 5 금 6 토 7 일
	
		Scanner scan= new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		int dayCode = scan.nextInt();
		
		switch(dayCode) {
		case 1 :
			System.out.println("월요일");
			break;
		case 2 :
			System.out.println("화요일");
			break;
		case 3 :
			System.out.println("수요일");
			break;
		case 4 :
			System.out.println("목요일");
			break;
		case 5 :
			System.out.println("금요일");
			break;
		case 6 :
			System.out.println("토요일");
			break;
		case 7 :
			System.out.println("일요일");
			break;
			default ://else 랑 같은의미 
				System.out.println("범위는 1~7입니다."); //case나 default 중간에 있으면 break가 있어야 한다
			
				// 위의 switch문을 if else if else로 바꿔보자 
				if ( !(dayCode >= 1 && dayCode <= 7)) {
					System.out.println("범위는 1~7 입니다");
				}
				if( dayCode == 1) {
					
				} else if (dayCode == 2) {
					System.out.println("월요일");
				} else if (dayCode == 3) {
					System.out.println("화요일");
				} 
					/* else{
				System.out.println("범위는 1~7 입니다");
		}*/
			
				//중첩 IF문
				if( dayCode >= 1 && dayCode <= 7) {
					if( dayCode == 1) {
						
					} else if (dayCode == 2) {
						System.out.println("월요일");
					} else if (dayCode == 3) {
						System.out.println("화요일");
					} 

	}
		System.out.println("종료");
	}	
}
}
